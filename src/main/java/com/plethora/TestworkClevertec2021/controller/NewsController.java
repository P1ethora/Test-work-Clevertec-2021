package com.plethora.TestworkClevertec2021.controller;

import com.plethora.TestworkClevertec2021.dto.NewsDto;
import com.plethora.TestworkClevertec2021.enumerated.ResponseType;
import com.plethora.TestworkClevertec2021.model.Comment;
import com.plethora.TestworkClevertec2021.model.News;
import com.plethora.TestworkClevertec2021.service.DtoNewsService;
import com.plethora.TestworkClevertec2021.service.NewsService;
import com.plethora.TestworkClevertec2021.service.PageableService;
import com.plethora.TestworkClevertec2021.util.ProtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Контроллер обрабатывающий запросы связанные с новостями
 */
@RestController
@RequestMapping(path = "/news")
@AllArgsConstructor
public class NewsController {

    private final NewsService newsService;
    private final PageableService pageableService;
    private final DtoNewsService dtoNewsService;

    /**
     * Получение новости по id и постраничное отображение комментариев
     * @param id новости из url запроса
     * @param pageable из запроса
     * @return произведенное действие и http статус
     */
    @GetMapping(path = "/{id}")
    public String getNews(@PathVariable int id, @PageableDefault(size = 1) Pageable pageable) {
        try {
            News news = newsService.getNews(id);
            List<Comment> commentList = news.getComments();
            NewsDto newsDto = dtoNewsService.toDto(news, pageableService.pageableList(commentList,pageable));
            return ProtoUtil.toJson(newsDto);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Позволяет получить заголовки новостей и число комментариев
     * @param pageable из запроса
     * @return json списка Dto оглавлений с числом комментариев
     */
    @GetMapping()
    public String getAllTitleNews(@PageableDefault(size = 5) Pageable pageable){
        List<News> newsList = newsService.getAllPageableNews(pageable);
        return ProtoUtil.toJson(dtoNewsService.getListNewsDtoTitle(newsList));
    }

    /**
     * Позволяет получать новости постранично, включая комментарии
     * @param pageable из запроса
     * @return постраничный список новостей со всеми комментариями
     */
    @GetMapping("/all")
    public List<News> getAllNews(@PageableDefault(size = 5) Pageable pageable) {
        return newsService.getAllPageableNews(pageable);
    }

    /**
     * Добавление новости
     * @param newsJson json тело
     * @return произведенное действие и http статус
     */
    @PostMapping()
    public ResponseEntity<?> addNews(@RequestBody String newsJson) {
        newsService.addNews(ProtoUtil.toProto(newsJson,NewsDto.getDefaultInstance()));
        return new ResponseEntity<>(ResponseType.ADDED, HttpStatus.CREATED);
    }

    /**
     * Обновление новости
     * @param newsJson json тело
     * @return произведенное действие и http статус
     */
    @PutMapping()
    public ResponseEntity<ResponseType> updateNews(@RequestBody String newsJson) {
        try {
            newsService.updateNews(ProtoUtil.toProto(newsJson,NewsDto.getDefaultInstance()));
            return new ResponseEntity<>(ResponseType.UPDATED, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Удаление новости
     * @param id новости
     * @return произведенное действие и http статус
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseType> deleteNews(@PathVariable int id) {
        newsService.deleteNews(id);
        return new ResponseEntity<>(ResponseType.DELETED, HttpStatus.OK);
    }

    /**
     * Поиск
     * @param keyword введенный текст
     * @param param параметр новости по которому производится поиск
     * @return найденные новости
     */
    @GetMapping("/search/{keyword}")
    public List<News> search(@PathVariable String keyword, @RequestParam String param) {
       return newsService.search(keyword);

    }
}
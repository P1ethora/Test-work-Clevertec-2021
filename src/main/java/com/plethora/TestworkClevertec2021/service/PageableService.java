package com.plethora.TestworkClevertec2021.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageableService<T> {

    /**
     * Позволяет делить на страницы любой список объектов
     * @param list Список для пагинации
     * @param numberPage номер страницы
     * @param size количество объектов в странице
     * @return содержимое страницы
     */
    public List<T> pageableList(List<T> list, int numberPage, int size) {

        Pageable pageable = PageRequest.of(numberPage, size);

        int start = (int) pageable.getOffset();
        int end = getEnd(start,pageable,list.size());

        Page<T> page
                = new PageImpl<>(list.subList(start, end), pageable, list.size());

        return page.getContent();
    }

    /**
     * Позволяет делить на страницы любой список объектов с pageable от request
     * @param list объектов
     * @param pageable от request
     * @return
     */
    public List<T> pageableList(List<T> list, Pageable pageable) {

        int start = getStart(pageable);
        int end = getEnd(start,pageable,list.size());

        Page<T> page //делим список на суб лист и заворачиваем в страницу
                = new PageImpl<>(list.subList(start, end), pageable, list.size());

        return page.getContent();
    }

    private int getStart(Pageable pageable){
        return (int) pageable.getOffset();
    }

    private int getEnd(int start, Pageable pageable, int listSize) {
        return Math.min((start + pageable.getPageSize()), listSize);
    }

//    public Pageable getPageable(int numberPage, int size) {
//        return PageRequest.of(numberPage, size);
//    }

}

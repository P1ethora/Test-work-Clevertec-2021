package com.plethora.TestworkClevertec2021.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.lucene.analysis.core.LowerCaseFilterFactory;
import org.apache.lucene.analysis.core.StopFilterFactory;
import org.apache.lucene.analysis.miscellaneous.ASCIIFoldingFilterFactory;
import org.apache.lucene.analysis.standard.StandardTokenizerFactory;
import org.hibernate.search.annotations.*;
import org.hibernate.search.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AnalyzerDef(name = "customAnalyzer",
        tokenizer = @TokenizerDef(factory = StandardTokenizerFactory.class),

        filters = {
                @TokenFilterDef(factory = LowerCaseFilterFactory.class),
                @TokenFilterDef(factory = ASCIIFoldingFilterFactory.class),
                @TokenFilterDef(factory = StopFilterFactory.class, params = {
                        @Parameter(name="ignoreCase", value="true")
                })
        })
@Indexed
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class News {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private long id;
   @Column(name = "date")
   private Date date;
   @Field
   @Analyzer(definition = "customAnalyzer")
   @Column(name = "title")
   private String title;
   @Field
   @Analyzer(definition = "customAnalyzer")
   @Column(name = "text")
   private String text;
   @OneToMany(cascade = CascadeType.ALL, targetEntity = Comment.class)//связь один ко многим
   @JoinColumn(name = "id_news") //присоединенная колонка комментария
   private List<Comment> comments;

}
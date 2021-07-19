package com.plethora.TestworkClevertec2021.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
   @Column(name = "title")
   private String title;
   @Column(name = "text")
   private String text;
   @OneToMany(cascade = CascadeType.ALL, targetEntity = Comment.class)
   @JoinColumn(name = "id_news")
   private List<Comment> comments;

}
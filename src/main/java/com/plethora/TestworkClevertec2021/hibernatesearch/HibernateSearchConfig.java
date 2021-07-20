//package com.plethora.TestworkClevertec2021.hibernatesearch;
//
//
//
//import org.hibernate.search.jpa.FullTextEntityManager;
//import org.hibernate.search.jpa.Search;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.*;
//
///**
// * Запуск Lucene для первоначального построения индекса
// */
//    @Configuration
//    @EnableTransactionManagement
//    public class HibernateSearchConfig {
//
//        @Autowired
//        private  EntityManagerFactory emf;
//
//        @Bean
//        EntityManager entityManager() {
//            return emf.createEntityManager();
//        }
//
//        @Bean
//        @PersistenceUnit
//        FullTextEntityManager fullTextEntityManager() throws InterruptedException {
//            FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager());
//            fullTextEntityManager.createIndexer().startAndWait();
//            return fullTextEntityManager;
//        }
//
//    }
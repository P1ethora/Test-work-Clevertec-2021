CREATE TABLE news
(
    id bigint NOT NULL AUTO_INCREMENT,
    date timestamp,
    text VARCHAR,
    title VARCHAR(500),
    CONSTRAINT news_pkey PRIMARY KEY (id)
);

CREATE TABLE comment
(
    id bigint NOT NULL AUTO_INCREMENT,
    date timestamp,
    id_news bigint,
    text VARCHAR,
    username VARCHAR(255),
    CONSTRAINT comment_pkey PRIMARY KEY (id),
    CONSTRAINT fkbptqmm7bn3alb6htitgfrlt95 FOREIGN KEY (id_news)
        REFERENCES news (id)
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
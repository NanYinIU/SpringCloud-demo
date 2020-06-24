--liquibase formatted sql

--changeset gaoguoxing:1592960251046-1
CREATE TABLE person (id INT NOT NULL, name VARCHAR(255) NULL, age INT NULL, note VARCHAR(255) NULL, CONSTRAINT PK_PERSON PRIMARY KEY (id));
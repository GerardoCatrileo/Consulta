/*
-- DROP DATABASE consulta;
CREATE DATABASE consulta
   ENCODING = 'UTF8'
   TABLESPACE = pg_default
   --LC_COLLATE = 'Spanish_Chile.1252'
   --LC_CTYPE = 'Spanish_Chile.1252'
   CONNECTION LIMIT = -1;
*/
       
-- DROP TABLE clt_user;
CREATE TABLE IF NOT EXISTS clt_user 
(
  user_id bigint NOT NULL,
  login varchar(45) NOT NULL,
  password varchar(45) DEFAULT NULL,
  last_password varchar(45) DEFAULT NULL,
  nick_name varchar(45) DEFAULT NULL,
--  registration_date timestamp,
--  last_activity timestamp,
  first_name varchar(45) DEFAULT NULL,
  second_name varchar(45) DEFAULT NULL,
  last_name varchar(45) DEFAULT NULL,
  second_surname varchar(45) DEFAULT NULL,
  email varchar(45) NOT NULL,
  birthdate date DEFAULT NULL,
  gender integer DEFAULT NULL,
  phone varchar(45) DEFAULT NULL,
  phone_work varchar(45) DEFAULT NULL,
  mobile_number varchar(45) DEFAULT NULL,
  address_id integer DEFAULT NULL,
  PRIMARY KEY (user_id)
);

-- DROP SEQUENCE seq_clt_user;
CREATE SEQUENCE seq_clt_user
  INCREMENT 1
  MINVALUE 1
  MAXVALUE 9223372036854775807
  START 1
  CACHE 1;

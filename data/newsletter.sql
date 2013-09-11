-- Database: newsletter

-- DROP DATABASE newsletter;

CREATE DATABASE newsletter
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'pt_BR.UTF-8'
       LC_CTYPE = 'pt_BR.UTF-8'
       CONNECTION LIMIT = -1;


-- Table: category

-- DROP TABLE category;

CREATE TABLE category
(
  id serial NOT NULL,
  title character varying(50),
  description text,
  CONSTRAINT category_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE category
  OWNER TO postgres;

-- Table: "group"

-- DROP TABLE "group";

CREATE TABLE "group"
(
  id serial NOT NULL,
  name character varying(50),
  CONSTRAINT group_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE "group"
  OWNER TO postgres;

-- Table: newsletter

-- DROP TABLE newsletter;

CREATE TABLE newsletter
(
  id serial NOT NULL,
  date date,
  enabled boolean,
  CONSTRAINT newsletter_pk PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE newsletter
  OWNER TO postgres;

  -- Table: section

-- DROP TABLE section;

CREATE TABLE section
(
  id serial NOT NULL,
  category_id integer,
  newsletter_id integer,
  title character varying(50),
  content text,
  CONSTRAINT section_pk PRIMARY KEY (id),
  CONSTRAINT category_fk FOREIGN KEY (category_id)
      REFERENCES category (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT newsletter_fk FOREIGN KEY (newsletter_id)
      REFERENCES newsletter (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE section
  OWNER TO postgres;

-- Table: section

-- DROP TABLE section;

CREATE TABLE section
(
  id serial NOT NULL,
  category_id integer,
  newsletter_id integer,
  title character varying(50),
  content text,
  CONSTRAINT section_pk PRIMARY KEY (id),
  CONSTRAINT category_fk FOREIGN KEY (category_id)
      REFERENCES category (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT newsletter_fk FOREIGN KEY (newsletter_id)
      REFERENCES newsletter (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);
ALTER TABLE section
  OWNER TO postgres;

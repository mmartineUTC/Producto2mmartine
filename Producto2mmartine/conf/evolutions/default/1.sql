# --- First database schema

# --- !Ups


create table comida (
  id                        serial not null,
  nombre                      varchar(255),
  sabor							varchar(255),
  tamanio							varchar(255),
  precio						bigint not null, 
  constraint pk_comida primary key (id))
;



create sequence comida_seq start with 1000;



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;


drop table if exists comida;

SET REFERENTIAL_INTEGRITY TRUE;


drop sequence if exists comida_seq;

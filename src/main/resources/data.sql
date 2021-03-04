
drop sequence if exists hibernate_sequence;
create sequence hibernate_sequence start with 100 increment by 1;

insert into country (id, name) values (1, 'España');
insert into country (id, name) values (2, 'Ecuador');
insert into country (id, name) values (3, 'Colombia');
insert into country (id, name) values (4, 'México');

insert into city (id, name, country_id) values (1, 'Sevilla', 1);
insert into city (id, name, country_id) values (2, 'Madrid', 1);
insert into city (id, name, country_id) values (3, 'Quito', 2);
insert into city (id, name, country_id) values (4, 'Guayaquil', 2);
insert into city (id, name, country_id) values (5, 'Bogotá', 3);
insert into city (id, name, country_id) values (6, 'Medellín', 3);
insert into city (id, name, country_id) values (7, 'city de México', 4);
insert into city (id, name, country_id) values (8, 'Mérida', 4);
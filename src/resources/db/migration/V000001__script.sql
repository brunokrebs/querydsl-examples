create table brand (
  id int not null auto_increment,
  name varchar(255)
);

create table model (
  id int not null auto_increment,
  name varchar(255),
  id_brand int not null
);

create table vehicle (
  id int not null auto_increment,
  plate varchar(255),
  id_model int not null
);

insert into brand (name) values
  ('Nissan'),
  ('Peugeot'),
  ('BMW');
create table rm_user(
  user_id  bigint primary key auto_increment,
  display_name varchar(64),
  email   varchar(64) unique not null,
  password varchar(64),
  mobile varchar(32),
  first_name varchar(64),
  last_name varchar(64),
  gender varchar(16),
  age int,
  role varchar(65),
  last_updated timestamp not null,
  updated_by varchar(64),
  created_by varchar(64),
  date_created timestamp not null
);


insert into rm_user values(1, "Venkatesh Kumar", "venkatesh.vangala@imaginea.com", "pramati123", "9642648488", "Venkatesh", "Kumar", "Male", 25, "admin", "2014-04-29 09:45:34", "venkatesh.vangala@imaginea.com", "venkatesh.vangala@imaginea.com", "2014-04-29 09:45:34");
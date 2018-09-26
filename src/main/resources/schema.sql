create table T_COMMANDS
(
   command_id integer not null AUTO_INCREMENT,
   command_name varchar(255) not null,
   command_owner varchar(255) not null,
   process_type varchar(255) not null,
   day_of_week varchar(255) not null,
   chase_group_id varchar(255),
   chase_time integer,
   primary key(command_id)
);

create table T_USERS
(
   user_id integer not null AUTO_INCREMENT,
   seasame_id varchar(255) not null,
   email varchar(255) not null,
   windows_id varchar(255) not null,
   indiana_id varchar(255) not null,
   primary key(user_id)
);

create table T_USERS_ALERTS
(
   seasame_id varchar(255) not null,
   chase_group_id varchar(255) not null,
   chase_time integer not null
);

create table T_COMMAND_ALERTS
(
   command_id integer ,
   user_id integer,
   type_alert varchar(255)
);

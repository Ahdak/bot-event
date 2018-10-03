-- Remplissage des commandes
insert into T_COMMANDS (command_name,command_owner,process_type,day_of_week,chase_group_id,chase_time)
values ('folder 1','ahmed.dammak','AR 1','1,2,3,4,5','g1',10) ;

insert into T_COMMANDS (command_name,command_owner,process_type,day_of_week,chase_group_id,chase_time)
values ('Folder 2','owner','VE','2','g2',10) ;

-- Remplissage des users
insert into T_USERS (seasame_id,email,windows_id,indiana_id)
values ('ahmed.dammak','ahmed.dammak@mon-mail.com','aaa','AAAAA') ;


-- Remplissage des alertes
insert into T_COMMAND_ALERTS (command_id,user_id,type_alert)
values (1,1,'ALL') ;

-- remplissage des users souhaitant s'enregistrer
insert into T_USERS_ALERTS (seasame_id,chase_group_id,chase_time)
values ('ahmed.dammak','AAAAA',1) ;


-- Remplissage des Chase group
--insert into T_CHASE_GROUP (command_id,group_name,chase_time)
--values (1,'AR_constat_Daily_chase_group',30) ;


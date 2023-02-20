use jspservletjdbc;

insert into role(code,name) values('ADMIN','ADMIN');
insert into role(code,name) values('USER','USER');

insert into user(userName,password,fullName,status, roleId) values('admin','123456','admin',1,1);
insert into user(userName,password,fullName,status, roleId) values('nguyenvana','123456','nguyen van a',1,2);
insert into user(userName,password,fullName,status, roleId) values('nguyenvanb','123456','nguyen van b',1,2);


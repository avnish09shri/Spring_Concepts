insert into passport(id, number)
values(101,'EFG102');

insert into passport(id, number)
values(102,'FGH103');


insert into student(id,name,passport_id)
values(1001,'Avnish',101);

insert into student(id,name,passport_id)
values(1002,'Shweta',101);



insert into course(id,name)
values(10,'Spring Framework');

insert into course(id,name)
values(11,'Spring Boot');

insert into course(id,name)
values(12,'Spring MVC');

insert into review(id,rating,description,course_id)
values(1,3,'Great',10);

insert into review(id,rating,description,course_id)
values(2,4,'Nice',10);

insert into review(id,rating,description,course_id)
values(3,3,'Great',11);

insert into review(id,rating,description,course_id)
values(4,5,'Excellent',12);

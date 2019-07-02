# Deals4you

New registrations will be stored in database.

MySQL queries:
Create database deals;

CREATE table `user`(`user_id` int not null auto_increment ,`firstname` varchar(50) not null,lastname varchar(50) not null,
`email` varchar(100) not null, `password` varchar(50) not null, `zipcode` varchar(50) not null, `state` varchar(50) not null, `country` varchar(50) not null, PRIMARY key (`user_id`));
Insert into users(firstname,lastname,email,password,zipcode,state,country) values(“pankti”,”chokshi”,”pankti@gmail.com”,”Pankti@”,”93612”,”CA”,”USA”);

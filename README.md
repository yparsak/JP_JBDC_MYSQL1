# JP_JBDC_MYSQL1
Java Project Spring JDBC Mysql 1


 CREATE TABLE `User` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `telephone` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
);


Modify /src/Beans.xml
<property name="url" value="jdbc:mysql://HOST:3306/DB"/>
<property name="username" value="user"/>
<property name="password" value="password"/>

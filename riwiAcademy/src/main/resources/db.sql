CREATE DATABASE riwiAcademy;
USE riwiAcademy;

CREATE TABLE student (
	id_student INT PRIMARY KEY,
    name varchar(100),
    email varchar(100),
    password varchar(100),
    status varchar(8)
);

CREATE TABLE course (
	id_course INT PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),
    id_student INT,
    FOREIGN KEY (id_student) REFERENCES student(id_student)
);

CREATE TABLE registration (
	id_registration INT PRIMARY KEY AUTO_INCREMENT,
    id_course INT,
    FOREIGN KEY (id_course) REFERENCES course(id_course),
	id_student INT,
    FOREIGN KEY (id_student) REFERENCES student(id_student)
);

CREATE TABLE ratings (
	id_ratings INT PRIMARY KEY AUTO_INCREMENT,
    rating INT,
    id_registration INT,
	FOREIGN KEY (id_registration) REFERENCES registration(id_registration)
);


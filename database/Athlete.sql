USE RoForbundet

create table IF NOT EXISTS Athlete
(
	AthleteID int(40) auto_increment,
	Name varchar(30) null,
	Last_Name varchar(30) null,
	PhoneNumber varchar(30) null,
# 	constraint athlete_pk
		primary key (AthleteID)
);
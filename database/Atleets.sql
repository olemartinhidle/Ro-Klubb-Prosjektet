USE RoForbundet

create table IF NOT EXISTS Atleets
(
	AtleetID int(40) auto_increment,
	Name varchar(30) null,
	Last_Name varchar(30) null,
	PhoneNumber varchar(30) null,
	constraint Atleets_pk
		primary key (AtleetID)
);
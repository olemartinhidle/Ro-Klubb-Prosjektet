create schema RoForbundet;

USE RoForbundet;

create table Tabell
(
    MedlemsID int(10) ,
    `String` varchar(20) ,

    constraint Tabell_pk
        primary key (MedlemsID)
);

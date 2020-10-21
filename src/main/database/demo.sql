create schema RoForbundet;

USE RoForbundet;

create table Felt
(
    MedlemsID int(10) ,
    `String` varchar(20) ,

    constraint Felt_pk
        primary key (MedlemsID)
);

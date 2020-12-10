USE RoFornundet;

/* Dette er skriptet på hvordan vi lagde brukere */

create table Brukere
(
    BrukerID    int auto_increment
        primary key,
    Epost       varchar(32) not null,
    Passord     varchar(20) not null,
    Rettigheter varchar(10) null,
    constraint Brukere_Epost_uindex
        unique (Epost),
    constraint Brukere_Passord_uindex
        unique (Passord)
);
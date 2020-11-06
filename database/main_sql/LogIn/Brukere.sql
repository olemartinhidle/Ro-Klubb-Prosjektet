create table Brukere
(
    BrukerID    int(32) auto_increment,
    Epost       varchar(32) not null,
    Passord     varchar(20) not null,
    Rettigheter varchar(10) not null,
    constraint Brukere_BrukerID_uindex
        unique (BrukerID),
    constraint Brukere_Epost_uindex
        unique (Epost),
    constraint Brukere_Passord_uindex
        unique (Passord),
    constraint Brukere_Tilganger_Type_fk
        foreign key (Rettigheter) references Tilganger (Type)
);

alter table Brukere
    add primary key (BrukerID);


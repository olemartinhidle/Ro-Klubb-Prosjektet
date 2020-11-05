create table Medlemmer
(
    MedlemsID     int(100)    not null
        primary key,
    Medlems_Rolle varchar(20) not null,
    Medlems_Navn  varchar(20) not null,
    Fødselsdato   varchar(20) not null,
    Kjønns_Gruppe varchar(20) not null,
    Alders_Gruppe varchar(20) not null,
    Vekt          int(100)    null,
    constraint Medlemmer_Klasser_Aldersgruppe_fk
        foreign key (Alders_Gruppe) references Klasser (Aldersgruppe),
    constraint Medlemmer_Klasser_Klasse_Kjønn_fk
        foreign key (Kjønns_Gruppe) references Klasser (Klasse_Kjønn)
);


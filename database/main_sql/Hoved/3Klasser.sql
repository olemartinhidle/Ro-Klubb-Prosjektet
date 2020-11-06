create table Klasser
(
    KlasseID          int(10)     not null
        primary key,
    Klasse_Kjønn      varchar(20) not null,
    Aldersgruppe      varchar(20) not null,
    Klubb_Tilhørighet varchar(30) not null,
    constraint Klasser_Klubb_KlubbNavn_fk
        foreign key (Klubb_Tilhørighet) references Klubber (KlubbNavn)
);

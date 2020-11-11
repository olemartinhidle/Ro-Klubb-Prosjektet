create table RoForbundDB.Medlemmer
(
    MedlemsID int auto_increment
        primary key,
    KlasseID  int         not null,
    KlubbID   int         not null,
    Fornavn   varchar(20) not null,
    Etternavn varchar(20) not null,
    År_Født   int(10)     not null,
    constraint Medlemmer_Klasser_KlasseID_fk
        foreign key (KlasseID) references RoForbundDB.Klasser (KlasseID),
    constraint Medlemmer_Klubber_KlubbID_fk
        foreign key (KlubbID) references RoForbundDB.Klubber (KlubbID)
);



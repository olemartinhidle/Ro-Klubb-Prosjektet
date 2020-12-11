create table RoForbundDB.Klasser
(
    KlasseID int(10)     not null
        primary key,
    KlubbID  int(10)     not null,
    Klasse   varchar(10) not null,
    constraint Klasser_Klubber_KlubbID_fk
        foreign key (KlubbID) references RoForbundDB.Klubber (KlubbID)
);


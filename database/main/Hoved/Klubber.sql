create table Klubber
(
    KlubbID   int(10)     not null,
    KlubbNavn varchar(20) not null,
    Underlagt varchar(30) not null,
    constraint Klubb_KlubbID_uindex
        unique (KlubbID),
    constraint Klubb_KlubbNavn_uindex
        unique (KlubbNavn),
    constraint Klubb_Forbund_Forbund_Navn_fk
        foreign key (Underlagt) references Forbund (Forbund_Navn)
);

alter table Klubber
    add primary key (KlubbID);


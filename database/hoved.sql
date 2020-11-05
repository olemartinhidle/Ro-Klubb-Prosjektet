create table Forbund
(
    ForbundID    int(10)     not null,
    Forbund_Navn varchar(30) not null,
    constraint Forbund_ForbundID_uindex
        unique (ForbundID),
    constraint Forbund_Forbund_Navn_uindex
        unique (Forbund_Navn)
);

alter table Forbund
    add primary key (ForbundID);

create table Klubb
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

alter table Klubb
    add primary key (KlubbID);
create table RoForbundDB.Klubber
(
    KlubbID    int auto_increment
        primary key,
    ForbundsID int         not null,
    Klubb_Navn varchar(40) not null,
    constraint Klubber_Forbund_ForbundsID_fk
        foreign key (ForbundsID) references RoForbundDB.Forbund (ForbundsID)
);


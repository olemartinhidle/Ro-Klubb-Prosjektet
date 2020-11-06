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

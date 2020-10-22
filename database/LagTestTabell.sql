USE RoForbundet;
create table Tester
(
    UtøverID int(32) auto_increment,
    `3000Ro` varchar(40) null,
    `1000Ro` varchar(40) null,
    LiggIRo varchar(40) null,
    constraint Tester_pk
        primary key (UtøverID)
);


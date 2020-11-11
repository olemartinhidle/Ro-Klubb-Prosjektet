create table RoForbundDB.DistanseTester
(
    TestID       int                     not null
        primary key,
    MedlemsID    int                     not null,
    `5000M_Tid`  varchar(10) default '0' null,
    `2000M_Watt` int(10)     default 0   null,
    `2000M_Tid`  varchar(10) default '0' null,
    `60M_Watt`   int(10)     default 0   null,
    `5000M_Watt` int(10)     default 0   null,
    constraint AvstandsTester_Tester_TestID_fk
        foreign key (TestID) references RoForbundDB.Dato_Tester (TestID),
    constraint DistanseTester_Medlemmer_MedlemsID_fk
        foreign key (MedlemsID) references RoForbundDB.Medlemmer (MedlemsID)
);


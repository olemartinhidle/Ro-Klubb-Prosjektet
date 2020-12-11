create table RoForbundDB.StyrkeTester
(
    TestID          int                      not null
        primary key,
    MedlemsID       int                      not null,
    Ligg_Ro_KG      int(10)     default 0    null,
    Knebøy_Prosent  varchar(10) default '0'  null,
    Knebøy_KG       int(10)     default 0    null,
    Antall_Beveg    int(10)     default 0    null,
    Ligg_Ro_Prosent varchar(10) default '0' null,
    constraint StyrkeTester_Medlemmer_MedlemsID_fk
        foreign key (MedlemsID) references RoForbundDB.Medlemmer (MedlemsID),
    constraint StyrkeTester_Tester_TestID_fk
        foreign key (TestID) references RoForbundDB.Tester (TestID)
);


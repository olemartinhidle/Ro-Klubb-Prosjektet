create table RoForbundDB.Tester
(
    TestID    int(10) auto_increment
        primary key,
    MedlemsID int(10) not null,
    Dato      date    null,
    constraint Tester_Medlemmer_MedlemsID_fk
        foreign key (MedlemsID) references RoForbundDB.Medlemmer (MedlemsID)
);


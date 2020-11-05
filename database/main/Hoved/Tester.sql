create table Tester
(
    TestID          int(10)     not null,
    Test_Taker      varchar(20) not null,
    `5000_Watt`     int(20)     null,
    `5000_Tid`      int(20)     null,
    `2000_Watt`     int(20)     null,
    `2000_Tid`      int(20)     null,
    `60_Watt`       int(20)     null,
    Prosent_Ligg_Ro int(20)     null,
    Kg_Ligg_Ro      int(20)     null,
    Prosent_Knebøy  int(20)     null,
    Kg_Knebøy       int(20)     null,
    Antall_Beveg    int(20)     null,
    Utøver_Vekt     int(10)     null,
    constraint Tester_TestID_uindex
        unique (TestID),
    constraint Tester_Medlemmer_Medlems_Navn_fk
        foreign key (Test_Taker) references Medlemmer (Medlems_Navn)
);

alter table Tester
    add primary key (TestID);

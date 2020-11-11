create table RoForbundDB.Stillinger
(
    Stillings_ID   int auto_increment
        primary key,
    Stillings_Type varchar(20) not null,
    constraint Stillinger_Medlemmer_MedlemsID_fk
        foreign key (Stillings_ID) references RoForbundDB.Medlemmer (MedlemsID)
);


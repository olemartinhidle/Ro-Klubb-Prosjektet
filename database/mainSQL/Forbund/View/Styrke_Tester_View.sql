create definer = root@`%` view StyrkeTestrer_View as
select `RoForbundDB`.`StyrkeTester`.`TestID`          AS `TestID`,
       `RoForbundDB`.`StyrkeTester`.`MedlemsID`       AS `MedlemsID`,
       `RoForbundDB`.`StyrkeTester`.`Ligg_Ro_Prosent` AS `Ligg_Ro_Prosent`,
       `RoForbundDB`.`StyrkeTester`.`Ligg_Ro_KG`      AS `Ligg_Ro_KG`,
       `RoForbundDB`.`StyrkeTester`.`Knebøy_Prosent`  AS `Knebøy_Prosent`,
       `RoForbundDB`.`StyrkeTester`.`Knebøy_KG`       AS `Knebøy_KG`,
       `RoForbundDB`.`StyrkeTester`.`Antall_Beveg`    AS `Antall_Beveg`
from `RoForbundDB`.`StyrkeTester`;


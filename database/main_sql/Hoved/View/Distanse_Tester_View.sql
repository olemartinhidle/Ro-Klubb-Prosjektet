create definer = root@`%` view Distanse_Tester_View as
select `RoForbundDB`.`DistanseTester`.`TestID`     AS `TestID`,
       `RoForbundDB`.`DistanseTester`.`MedlemsID`  AS `MedlemsID`,
       `RoForbundDB`.`DistanseTester`.`5000M_Watt` AS `5000M_Watt`,
       `RoForbundDB`.`DistanseTester`.`5000M_Tid`  AS `5000M_Tid`,
       `RoForbundDB`.`DistanseTester`.`2000M_Watt` AS `2000M_Watt`,
       `RoForbundDB`.`DistanseTester`.`2000M_Tid`  AS `2000M_Tid`,
       `RoForbundDB`.`DistanseTester`.`60M_Watt`   AS `60M_Watt`
from `RoForbundDB`.`DistanseTester`;


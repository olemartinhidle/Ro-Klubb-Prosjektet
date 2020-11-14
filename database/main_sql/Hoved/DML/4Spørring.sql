SELECT D.Dato,
       M.År_Født 'Født',
       M.Fornavn,
       M.Etternavn,
       M.Klubb,
       Dist.5000M_Watt '5000M i Watt',
       Dist.5000M_Tid '5000M i tid',
       Dist.2000M_Watt '2000M i Watt',
       Dist.2000M_Tid '2000M i tid',
       Dist.60M_Watt '60M i Watt',
       S.Ligg_Ro_Prosent 'Ligg ro i Prosent',
       S.Ligg_Ro_KG 'Ligg ro i KG',
       S.Knebøy_Prosent 'Knebøy i prosent',
       S.Knebøy_KG 'Knebøy i KG',
       S.Antall_Beveg
FROM Dato_Tester D
         JOIN Medlemmer M
              ON D.MedlemsID = M.MedlemsID
         JOIN DistanseTester Dist
              ON D.TestID = Dist.TestID AND M.MedlemsID = Dist.MedlemsID
         JOIN StyrkeTester S
              ON D.TestID = S.TestID AND M.MedlemsID = S.MedlemsID
WHERE D.MedlemsID = 1
ORDER BY Dato;
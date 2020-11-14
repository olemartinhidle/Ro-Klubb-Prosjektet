SELECT *
FROM Klubber, Klasser, Medlemmer, DistanseTester, StyrkeTester
WHERE Klubber.KlubbID = Klasser.KlubbID
  AND Klasser.KlasseID = Medlemmer.KlasseID
  AND Medlemmer.MedlemsID = DistanseTester.MedlemsID
  AND Medlemmer.MedlemsID = StyrkeTester.MedlemsID
GROUP BY Medlemmer.MedlemsID
LIMIT 10;

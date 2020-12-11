SELECT Etternavn, Fornavn, Klubb_Navn, Stillings_Type
FROM Medlemmer, Stillinger, Klubber
WHERE Stilling = Stillings_Type
  AND Klubb = Klubb_Navn
  And Stillings_Type = 'Trener'
ORDER BY Klubb_Navn, Etternavn;
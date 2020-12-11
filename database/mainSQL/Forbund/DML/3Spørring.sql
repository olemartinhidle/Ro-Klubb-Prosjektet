SELECT M.Fornavn,
       M.MedlemsID,
       K.Klasse
FROM Medlemmer M
         LEFT OUTER JOIN Klasser K
                         ON M.KlasseID = K.KlasseID
ORDER BY MedlemsID DESC, Klasse DESC;

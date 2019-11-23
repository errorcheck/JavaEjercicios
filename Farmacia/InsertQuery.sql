USE farmacia;
INSERT INTO Comuna (nombre,id) VALUES
('Comuna 1',1),
('Comuna 2',2),
('Comuna 3',3);

INSERT INTO Barrio (nombre,id,idComuna) VALUES
('Mataderos',1,1),
('Liniers',2,1),
('Flores',3,2),
('Caballito',4,2),
('Balvanera',5,3),
('Once',6,3);

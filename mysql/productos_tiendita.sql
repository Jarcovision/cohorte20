select * from productos;

INSERT INTO productos VALUES (1,'Refresco de Cola',10.00,'2016-01-01',1,10,'a'),
(2,'Refesco de limon',9.00,'2015-02-06',1,15,'a'),
(3,'Limonada',12.00,'2014-05-09',1,12,'a'),
(4,'Refresco de toronja',9.00,'2016-05-07',1,20,'a'),
(5,'Agua Mineral',15.00,'2016-02-15',1,8,'a'),
(6,'Aceite Natural 1 Litro',20.00,'2015-09-20',2,25,'a'),
(7,'Aceite de Coco 500 ml',15.00,'2016-03-24',2,20,'a'),
(8,'Jabon lavanda 1 kg',12.00,'2014-02-21',3,6,'a'),
(9,'Detergente en polvo 1 kg',18.50,'2014-11-17',3,9,'a'),
(10,'Jabon para manos 500 ml',26.50,'2016-01-10',3,7,'a'),
(11,'Detergente en polvo 2 kg',30.00,'2014-11-17',3,5,'a'),
(12,'Detergente en polvo para trastes 500 g',18.50,'2016-02-20',3,8,'a'),
(13,'Paleta de caramelo',5.00,'2013-01-01',4,50,'a'),
(14,'Paleta de chocolate',6.50,'2014-05-20',4,34,'a'),
(15,'Gomitas',12.50,'2016-03-30',4,16,'a'),
(16,'Bolsa de dulces variados',14.50,'2015-12-12',4,23,'a'),
(17,'Papas fritas',9.50,'2013-04-09',5,14,'a'),
(18,'Frituras de queso',8.00,'2014-10-09',5,12,'a'),
(19,'Papas fristas con limon',10.00,'2015-09-08',5,8,'a'),
(20,'Bolsa de chicharrones',15.00,'2016-05-20',5,19,'a'),
(21,'Palomitas de mantequilla',18.00,'2015-11-28',5,12,'a');

SELECT count (idProducto), idCategoria from productos GROUP BY idCategoria;

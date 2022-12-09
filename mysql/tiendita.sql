show columns from categoria;

INSERT INTO productos (nombre, precio, fecha_alta, idCategoria, existencia) 
VALUES ("Paleta", 2, curdate(), 11,100);

alter table productos add column marca varchar(20) not null;

select * from categoria;
select * from productos;

INSERT INTO categoria  VALUES (5, "Juegos");
INSERT INTO categoria (nombre) VALUES ("Refrescos");

INSERT INTO productos (nombre, precio, fecha_alta, idCategoria, existencia, marca)
VALUES ('Agua Mineral',15.00,'2016-02-15',1,8,'a'); 

UPDATE productos SET precio = REPLACE (precio, 45, 50)
WHERE idProducto = 35;

DELETE FROM categoria WHERE id = 6;

SET foreign_key_checks = 0;
TRUNCATE table productos;
SET foreign_key_checks = 1;

SELECT * from categoria where id > 9;

SELECT count (idProducto) AS cantidad, idCategoria from productos GROUP BY idCategoria;
SELECT * FROM productos WHERE idCategoria = 5;

SELECT INTO productos VALUES 
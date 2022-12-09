SELECT * FROM productos;
SELECT * FROM categoria;

/* subconsultas */
SELECT * FROM productos WHERE idCategoria = 2 AND precio > 10 AND existencia BETWEEN 5 AND 20
AND fecha_alta IS NOT NULL;
SELECT * FROM productos;

SELECT * FROM productos WHERE idCategoria IN (select id FROM categoria WHERE id > 2);
SELECT id FROM categoria WHERE id > 2;
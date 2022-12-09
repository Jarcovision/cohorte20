SELECT * FROM categoria;
SELECT * FROM productos;
SELECT nombre, precio, existencia, idCategoria FROM productos WHERE idCategoria > 4;
SELECT nombre, precio, existencia, idCategoria FROM productos WHERE idCategoria <= 2;

/* max(), min() */
SELECT min(existencia) as existencia_minima, max(existencia) as existencia_maxima FROM productos;

/* limit */
SELECT * FROM productos limit 6, 3; /* a partir del registro 6, muestra 3 resgistros */
SELECT * FROM productos limit 2, 8; /* a partir del registro 2, muestra 8 resgistros */

/* order by asc, desc */
SELECT * FROM productos ORDER BY nombre asc; /* ascendente */
SELECT * FROM productos ORDER BY existencia desc; /* descendente */


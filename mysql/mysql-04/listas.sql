/* listas */
SELECT * FROM productos;

/* in (búsquedas específicas, incluyente) */ 
SELECT * FROM productos WHERE precio IN (6.5, 12.5, 18.5, 26.5);
/* not in (búsquedas específicas, excluyente) */
SELECT * FROM productos WHERE precio NOT IN (6.5, 12.5, 18.5, 26.5);

/* fechas */
SELECT * FROM productos WHERE DATE(fecha_alta) BETWEEN "2015-01-01" AND "2016-07-24"; /* rango  */
 
 /* operadores aritméticos */
SELECT * FROM productos WHERE precio = 5 + 5;    /* 5 */
SELECT * FROM productos WHERE precio = 10 - 5;   /* 5 */
SELECT * FROM productos WHERE precio = 4 * 5;    /* 5 */
SELECT * FROM productos WHERE precio = 20 / 4;   /* 5 */

/* avg() */
SELECT nombre, avg(precio) as promedio_precios FROM productos WHERE idCategoria = 1 GROUP BY idCategoria;
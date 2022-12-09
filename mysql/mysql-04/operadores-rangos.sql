/* and */
SELECT * FROM productos;
SELECT * FROM productos WHERE idCategoria = 1 AND precio = 10; /* ambas instrucciones deben ser verdaderas */
SELECT * FROM productos WHERE existencia < 20 AND idCategoria > 3;
/* or */
SELECT * FROM productos WHERE existencia > 20 OR idCategoria > 3; /* una intrucción debe ser verdadera */

/* diferente */
SELECT * FROM productos WHERE idCategoria != 1 and idCategoria != 5; /* != diferente */
SELECT * FROM productos WHERE idCategoria <> 1 and idCategoria != 5; /* <> diferente */

/* null y not null */
SELECT * FROM productos WHERE precio IS NULL;
SELECT * FROM productos WHERE precio IS NOT NULL;

/* between and (rangos incluyentes) */
SELECT * FROM productos WHERE precio BETWEEN 5 AND 10;
/* not between and (rangos excluyentes) */
SELECT * FROM productos WHERE precio NOT BETWEEN 10 AND 20;

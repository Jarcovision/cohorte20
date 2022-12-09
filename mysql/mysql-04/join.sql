/* joins*/

SELECT * FROM productos;
SELECT * FROM categoria;
SELECT * FROM proveedores;

SELECT * FROM productos, categoria WHERE idCategoria = id;

SELECT p.nombre, p.precio, p.existencia, c.nombre FROM productos as p INNER JOIN categoria AS c ON p.idCategoria = c.id;

SELECT p.nombre, p.precio, p.existencia, t.nombre FROM productos AS p LEFT JOIN temporal as t ON p.idCategoria = t.id;
SELECT p.nombre, p.precio, p.existencia, t.nombre FROM productos AS p RIGHT JOIN temporal as t ON p.idCategoria = t.id;

SELECT * FROM categoria UNION SELECT * FROM proveedores;
SELECT * FROM categoria UNION SELECT nombre, precio FROM productos;

/* multi-consulta */
SELECT p.nombre, p.precio, p.existencia FROM productos AS p;

select p.nombre AS nom_producto, c.nombre AS nom_categoria FROM productos AS p RIGHT JOIN categoria AS c ON p.idCategoria = c.id;
select p.nombre AS nom_producto, c.nombre AS nom_categoria FROM productos AS p RIGHT JOIN categoria AS c ON p.idCategoria = c.id 
LEFT JOIN detalle_producto_proveedor AS det ON p.idProducto = det.idProducto;

select p.nombre AS nom_producto, c.nombre AS nom_categoria, pv.nombre AS nom_proveedor FROM productos AS p INNER JOIN categoria AS c 
ON p.idCategoria = c.id INNER JOIN detalle_producto_proveedor AS det ON p.idProducto = det.idProducto INNER JOIN proveedores AS pv ON det.idProveedor = pv.id 
WHERE p.existencia > 5;
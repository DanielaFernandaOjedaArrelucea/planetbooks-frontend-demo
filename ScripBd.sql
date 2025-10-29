-- 1️⃣ Crear base de datos (si aún no la tienes)
CREATE DATABASE IF NOT EXISTS books;
USE books;

-- 2️⃣ Crear la tabla
CREATE TABLE planet_books_inventario (
  id VARCHAR(50),
  examen VARCHAR(255),
  nivel VARCHAR(255),
  tipo_de_material VARCHAR(255),
  editorial VARCHAR(255),
  anio INT,
  formato VARCHAR(255),
  descripcion TEXT,
  precio VARCHAR(50)
);
CREATE TABLE clientes (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido_paterno VARCHAR(100),
    apellido_materno VARCHAR(100),
    edad INT,
    usuario VARCHAR(100),
    correo VARCHAR(150),
    pais VARCHAR(100),
    fecha_registro DATE,
    compras INT,
    sesiones INT,
    activo BOOLEAN DEFAULT TRUE
);

SELECT * FROM planet_books_inventario;
SHOW TABLES; 
-- 3️⃣ Insertar registros (ejemplos, reemplázalos con los tuyos reales)
INSERT INTO planet_books_inventario
(id, examen, nivel, tipo_de_material, editorial, anio, formato, descripcion, precio)
VALUES
('1', 'STARTERS', 'Pre A1', 'practice tests', 'Cambridge', 2017, 'PDF MP3', 'Starters Authentic Examination Papers 1 PDF, AK, MP3', 'S/ 10.00'),
('1', 'STARTERS', 'Pre A1', 'practice tests', 'Cambridge', 2017, 'PDF MP3', 'Starters Authentic Examination Papers 1 PDF, AK, MP3', 'S/ 10.00');

INSERT INTO clientes
(nombre, apellido_paterno, apellido_materno, edad, usuario, correo, pais, fecha_registro, compras, sesiones, activo)
VALUES
('Juan', 'Pérez', 'Gómez', 25, 'juanp', 'juanp@gmail.com', 'Perú', '2024-10-01', 3, 10, TRUE),
('María', 'López', 'Ramírez', 30, 'marial', 'maria@gmail.com', 'Chile', '2024-08-15', 5, 20, TRUE),
('Carlos', 'Torres', 'Fernández', 28, 'carlost', 'carlos@gmail.com', 'México', '2024-09-05', 2, 5, TRUE),
('Lucía', 'Martínez', 'Díaz', 22, 'luciam', 'lucia@gmail.com', 'Argentina', '2024-07-20', 1, 8, TRUE),
('Diego', 'Sánchez', 'Ruiz', 35, 'diegos', 'diego@gmail.com', 'Colombia', '2024-06-10', 7, 15, TRUE);


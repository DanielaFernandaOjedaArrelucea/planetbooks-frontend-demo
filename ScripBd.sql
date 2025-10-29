CREATE DATABASE IF NOT EXISTS books;
USE books;

CREATE TABLE planet_books_inventario (
  id VARCHAR(50),
  examen VARCHAR(255),
  nivel VARCHAR(255),
  tipo_de_material VARCHAR(255),
  editorial VARCHAR(255),
  anio INT,
  formato VARCHAR(255),
  titulo VARCHAR(500),
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

INSERT INTO planet_books_inventario
(id, examen, nivel, tipo_de_material, editorial, anio, formato, titulo, precio)
VALUES
('1', 'STARTERS', 'Pre A1', 'Practice tests', 'Cambridge', 2017, 'PDF,AK,MP3', 'Starters Authentic Examination Papers 1', 'S/ 10.00'),
('2', 'STARTERS', 'Pre A1', 'Practice tests', 'Cambridge', 2018, 'PDF,AK,MP3', 'Starters Authentic Examination Papers 2', 'S/ 10.00');
('3', 'MOVERS', 'A1', 'Practice tests', 'Cambridge', 2017, 'PDF,AK,MP3', 'Movers Authentic Examination Papers 1', 'S/ 12.00');
('4', 'MOVERS', 'A1', 'Practice tests', 'Cambridge', 2018, 'PDF,AK,MP3', 'Movers Authentic Examination Papers 2', 'S/ 12.00');
('5', 'FLYERS', 'A2', 'Practice tests', 'Cambridge', 2017, 'PDF,AK,MP3', 'Flyers Authentic Examination Papers 1', 'S/ 15.00');
('6', 'FLYERS', 'A2', 'Practice tests', 'Cambridge', 2018, 'PDF,AK,MP3', 'Flyers Authentic Examination Papers 2', 'S/ 15.00');
('7', 'KET', 'A2', 'Practice tests', 'Cambridge', 2024, 'SB,TB,AK,MP3', 'KEY for Schools Trainer 2 Six Practice Tests and Teachers Notes', 'S/ 18.00');
('8', 'KET', 'A2', 'Practice tests', 'Cambridge', 2019, 'PDF,AK,MP3', 'Succeed in A2 Key 8 Practice Tests', 'S/ 18.00');
('9', 'PET', 'B1', 'Practice tests', 'Cambridge', 2024, 'SB,TB,AK,MP3', 'PET for Schools Trainer 2 Six Practice Tests and Teachers Notes', 'S/ 18.00');
('10', 'PET', 'B1', 'Practice tests', 'Cambridge', 2019, 'PDF,AK,MP3', 'Succeed in B1 PET 8 Practice Tests', 'S/ 18.00');

INSERT INTO clientes
(nombre, apellido_paterno, apellido_materno, edad, usuario, correo, pais, fecha_registro, compras, sesiones, activo)
VALUES
('Juan', 'Pérez', 'Gómez', 25, 'juanp', 'juanp@gmail.com', 'Perú', '2024-10-01', 3, 10, TRUE),
('María', 'López', 'Ramírez', 30, 'marial', 'maria@gmail.com', 'Chile', '2024-08-15', 5, 20, TRUE),
('Carlos', 'Torres', 'Fernández', 28, 'carlost', 'carlos@gmail.com', 'México', '2024-09-05', 2, 5, TRUE),
('Lucía', 'Martínez', 'Díaz', 22, 'luciam', 'lucia@gmail.com', 'Argentina', '2024-07-20', 1, 8, TRUE),
('Diego', 'Sánchez', 'Ruiz', 35, 'diegos', 'diego@gmail.com', 'Colombia', '2024-06-10', 7, 15, TRUE);


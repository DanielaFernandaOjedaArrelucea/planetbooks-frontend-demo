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

SELECT * FROM planet_books_inventario;
SHOW TABLES; 
-- 3️⃣ Insertar registros (ejemplos, reemplázalos con los tuyos reales)
INSERT INTO planet_books_inventario
(id, examen, nivel, tipo_de_material, editorial, anio, formato, descripcion, precio)
VALUES
('1', 'STARTERS', 'Pre A1', 'practice tests', 'Cambridge', 2017, 'PDF MP3', 'Starters Authentic Examination Papers 1 PDF, AK, MP3', 'S/ 10.00'),
('1', 'STARTERS', 'Pre A1', 'practice tests', 'Cambridge', 2017, 'PDF MP3', 'Starters Authentic Examination Papers 1 PDF, AK, MP3', 'S/ 10.00')

CREATE SCHEMA `bd_almacen` ;
USE 'bd_almacen';
CREATE TABLE `bd_almacen`.`productos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `categoria` VARCHAR(45) NULL,
  `precio` DOUBLE NULL,
  `stock` INT NULL,
  PRIMARY KEY (`id`));
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('1', 'Movil', 'ELECTRONICA', '499.99', '30');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('2', 'Ordenador', 'ELECTRONICA', '1299.99', '15');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('3', 'Television', 'ELECTRONICA', '699.9', '10');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('4', 'Cuaderno', 'PAPELERIA', '3.5', '80');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('5', 'Boligrafo', 'PAPELERIA', '0.8', '250');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('6', 'Archivador', 'PAPELERIA', '5.5', '40');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('7', 'Galletas', 'ALIMENTACION', '1.75', '50');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('8', 'Magdalenas', 'ALIMENTACION', '2.15', '25');
INSERT INTO `bd_almacen`.`productos` (`id`, `nombre`, `categoria`, `precio`, `stock`) VALUES ('9', 'Patatas', 'ALIMENTACION', '0.60', '75');

CREATE SCHEMA `bd_ejercicioempresafinal` ;
USE `bd_ejercicioempresafinal`;
CREATE TABLE `bd_ejercicioempresafinal`.`empleados` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(15) NULL,
  `primerapellido` VARCHAR(45) NULL,
  `segundoapellido` VARCHAR(45) NULL,
  `fechanacimiento` DATE NULL,
  `salario` DOUBLE NULL,
  PRIMARY KEY (`id`));
  INSERT INTO `bd_ejercicioempresafinal`.`empleados` (`id`, `nombre`, `primerapellido`, `segundoapellido`, `fechanacimiento`, `salario`) VALUES ('1', 'Pepito', 'Grillo', 'Grillao', '1978-10-13', '18750');
INSERT INTO `bd_ejercicioempresafinal`.`empleados` (`id`, `nombre`, `primerapellido`, `segundoapellido`, `fechanacimiento`, `salario`) VALUES ('2', 'Blanca', 'Nieves', 'Princess', '1937-02-25', '32000');
INSERT INTO `bd_ejercicioempresafinal`.`empleados` (`id`, `nombre`, `primerapellido`, `segundoapellido`, `fechanacimiento`, `salario`) VALUES ('3', 'Poca', 'Hontas', 'Selva', '1993-05-03', '21250');
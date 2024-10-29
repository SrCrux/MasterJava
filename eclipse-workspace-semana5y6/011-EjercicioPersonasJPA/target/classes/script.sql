CREATE SCHEMA `bd_ejerciciopersonas` ;
USE `bd_ejerciciopersonas`
CREATE TABLE `bd_ejerciciopersonas`.`personas` (
  `telefono` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellido1` VARCHAR(45) NULL,
  `apellido2` VARCHAR(45) NULL,
  PRIMARY KEY (`telefono`));
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('633102030', 'Blanca', 'Nieves', 'Princess');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('655102030', 'Rapun', 'Zel', 'Princess');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('611102030', 'Mario', 'Bros', 'Fontanero');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('600102030', 'Luigi', 'Bros', 'Fontanero');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('622102030', 'Walter', 'White', 'Heisenberg');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('644102030', 'Skyler', 'White', 'Queen');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('666102030', 'Timoteo', 'Clamidias', 'Wonka');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('677102030', 'Florence', 'Pugh', 'Midsommar');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('688102030', 'Hayao', 'Miyazaki', 'Ghibli');
INSERT INTO `bd_ejerciciopersonas`.`personas` (`telefono`, `nombre`, `apellido1`, `apellido2`) VALUES ('699102030', 'Pedro', 'Almodovar', 'Deseo');



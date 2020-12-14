#lineClothes

#crear base
CREATE database lineclothes;

use LineClothes;

#tablas
CREATE TABLE `lineclothes`.`personas` (
  `idPersona` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `codigoPostal` INT NOT NULL,
  `calle` VARCHAR(60) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPersona`));
  
  INSERT INTO personas (nombre, codigoPostal, calle, estado)
  VALUES("Daniel Ramirez", 07130, "Av.Cien metros #120", "CDMX"); 
  
    INSERT INTO personas (nombre, codigoPostal, calle, estado)
  VALUES("Antonio Alfaro", 01503, "Av.poli #55", "CDMX"); 
  
    INSERT INTO personas (nombre, codigoPostal, calle, estado)
  VALUES("Pilar Garcia", 15420, "Av.Rio de los remedios #99", "CDMX"); 
  
    INSERT INTO personas (nombre, codigoPostal, calle, estado)
  VALUES("Ivan Asensio", 50006, "Tatanacho #15", "CDMX"); 
  
    INSERT INTO personas (nombre, codigoPostal, calle, estado)
  VALUES("Lilia Ortega", 15026, "Calle #8", "CDMX"); 
  
select * from personas;

select * from paquetes;
  
  CREATE TABLE `lineclothes`.`paquetes` (
  `idPaquete` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NULL,
  `peso` DOUBLE NOT NULL,
  `prioridad` VARCHAR(20) NOT NULL,
  `cantidadArticulos` INT NOT NULL,
  PRIMARY KEY (`idPaquete`));

INSERT INTO paquetes (codigo, peso, prioridad, cantidadArticulos, idPersona)
  VALUES("001", 10.300, "Normal", 2, 1);
  
  INSERT INTO paquetes (codigo, peso, prioridad, cantidadArticulos, idPersona)
  VALUES("002", 3.150, "Normal", 1, 1);
  
  INSERT INTO paquetes (codigo, peso, prioridad, cantidadArticulos, idPersona)
  VALUES("003", 2.450, "Normal", 1, 2);
  
  INSERT INTO paquetes (codigo, peso, prioridad, cantidadArticulos, idPersona)
  VALUES("004", 7.0, "Express", 3, 3);
  
  INSERT INTO paquetes (codigo, peso, prioridad, cantidadArticulos, idPersona)
  VALUES("005", 1.900, "Normal", 2, 4);
  
  INSERT INTO paquetes (codigo, peso, prioridad, cantidadArticulos, idPersona)
  VALUES("001", 5.0, "Normal", 4, 5);
  

update paquetes set codigo=1006 where idPaquete=6;
update paquetes set idPersona=2 where idPaquete=3;
update personas set estado="CDMX ($50 pesos extra)" where idPersona=1 or idPersona=2 or idPersona=3 or idPersona=4 or idPersona=5;

#relacion
ALTER TABLE `lineclothes`.`paquetes` 
ADD COLUMN `idPersona` INT NULL AFTER `cantidadArticulos`,
ADD INDEX `idPersona_fk_idx` (`idPersona` ASC);

ALTER TABLE `lineclothes`.`paquetes` 
ADD CONSTRAINT `idPersona_fk`
  FOREIGN KEY (`idPersona`)
  REFERENCES `lineclothes`.`personas` (`idPersona`)
  ON DELETE CASCADE
  ON UPDATE CASCADE;

ALTER TABLE `lineclothes`.`paquetes`
MODIFY `prioridad` VARCHAR(40) NOT NULL; 

select * from personas;

select * from paquetes;

delete from personas where idPersona = 11;



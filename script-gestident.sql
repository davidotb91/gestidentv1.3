SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `script-gestident` DEFAULT CHARACTER SET utf8 ;
USE `script-gestident` ;

-- -----------------------------------------------------
-- Table `script-gestident`.`administrador`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `script-gestident`.`administrador` (
  `ID_ADMINISTRADOR` INT(11) NOT NULL AUTO_INCREMENT ,
  `CI_ADMINISTRADOR` CHAR(10) NOT NULL ,
  `NOMBRE_ADIMINISTRADOR` CHAR(20) NOT NULL ,
  `PASSWORD_ADMINISTRADOR` CHAR(15) NOT NULL ,
  PRIMARY KEY (`ID_ADMINISTRADOR`) )
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `script-gestident`.`doctor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `script-gestident`.`doctor` (
  `ID_DOCTOR` INT(11) NOT NULL AUTO_INCREMENT ,
  `NOMBRES_DOCTOR` CHAR(20) NOT NULL ,
  `APELLIDOS_DOCTOR` CHAR(20) NOT NULL ,
  `CI_DOCTOR` CHAR(10) NOT NULL ,
  `ESPECIALIDAD_DOCTOR` CHAR(20) NOT NULL ,
  `NUM_CONSULTORIO_DOCTOR` INT(11) NOT NULL ,
  `EMAIL_DOCTOR` CHAR(30) NOT NULL ,
  `TELEFONO_FIJO_DOCTOR` INT(11) NOT NULL ,
  `CELULAR_DOCTOR` INT(11) NOT NULL ,
  `FECHA_NACIMIENTO_DOCTOR` DATE NOT NULL ,
  `PASSWORD_DOCTOR` CHAR(20) NOT NULL ,
  PRIMARY KEY (`ID_DOCTOR`) )
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `script-gestident`.`paciente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `script-gestident`.`paciente` (
  `ID_PACIENTE` INT(11) NOT NULL AUTO_INCREMENT ,
  `NOMBRES_PACIENTE` CHAR(20) NOT NULL ,
  `APELLIDOS_PACIENTE` CHAR(20) NOT NULL ,
  `CI_PACIENTE` CHAR(10) NOT NULL ,
  `EMAIL_PACIENTE` CHAR(30) NOT NULL ,
  `TELEFONO_FIJO_PACIENTE` INT(11) NOT NULL ,
  `CELULAR_PACIENTE` INT(11) NULL DEFAULT NULL ,
  `PASSWORD_PACIENTE` CHAR(20) NOT NULL ,
  `FECHA_NACIMIENTO` DATE NOT NULL ,
  PRIMARY KEY (`ID_PACIENTE`) )
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `script-gestident`.`cita`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `script-gestident`.`cita` (
  `ID_CITA` INT(11) NOT NULL AUTO_INCREMENT ,
  `FECHA_CITA` DATETIME NOT NULL ,
  `paciente_ID_PACIENTE` INT(11) NOT NULL ,
  `doctor_ID_DOCTOR` INT(11) NOT NULL ,
  `ESTADO_CITA` ENUM('DISPONIBLE','RESERVADO','ATENDIDO') NOT NULL DEFAULT 'DISPONIBLE' ,
  PRIMARY KEY (`ID_CITA`) ,
  INDEX `fk_CITA_paciente` (`paciente_ID_PACIENTE` ASC) ,
  INDEX `fk_CITA_doctor1` (`doctor_ID_DOCTOR` ASC) ,
  CONSTRAINT `fk_CITA_doctor1`
    FOREIGN KEY (`doctor_ID_DOCTOR` )
    REFERENCES `script-gestident`.`doctor` (`ID_DOCTOR` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CITA_paciente`
    FOREIGN KEY (`paciente_ID_PACIENTE` )
    REFERENCES `script-gestident`.`paciente` (`ID_PACIENTE` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

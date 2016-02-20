SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';


CREATE SCHEMA IF NOT EXISTS `kubdb` DEFAULT CHARACTER SET utf8 ;
USE `kubdb` ;

-- -----------------------------------------------------
-- Table `kubdb`.`users`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `kubdb`.`users` (
  `id` INT(8) NOT NULL AUTO_INCREMENT ,
  `fullname` VARCHAR(50) NOT NULL ,
  `address` VARCHAR(100) NULL DEFAULT NULL ,
  `email` VARCHAR(60) NULL DEFAULT NULL ,
  `mobile` VARCHAR(15) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `kubdb`.`address`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `kubdb`.`address` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `userid` INT(11) NOT NULL ,
  `street` VARCHAR(50) NULL DEFAULT NULL ,
  `city` VARCHAR(50) NULL DEFAULT NULL ,
  `county` VARCHAR(50) NULL DEFAULT NULL ,
  `postcode` INT(50) NULL DEFAULT NULL ,
  `users_id` INT(8) NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_user_address` (`userid` ASC) ,
  INDEX `fk_address_users1` (`users_id` ASC) ,
  CONSTRAINT `fk_address_users1`
    FOREIGN KEY (`users_id` )
    REFERENCES `kubdb`.`users` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `kubdb`.`modules`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `kubdb`.`modules` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `modulename` VARCHAR(50) NOT NULL ,
  `moduledescription` VARCHAR(100) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `kubdb`.`roles`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `kubdb`.`roles` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `rolename` VARCHAR(50) NOT NULL ,
  `roledescription` VARCHAR(100) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `kubdb`.`role_module`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `kubdb`.`role_module` (
  `id` INT(11) NOT NULL ,
  `roleid` INT(11) NOT NULL ,
  `moduleid` INT(11) NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_module` (`moduleid` ASC) ,
  INDEX `fk_role` (`roleid` ASC) ,
  CONSTRAINT `fk_role`
    FOREIGN KEY (`roleid` )
    REFERENCES `kubdb`.`roles` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_module`
    FOREIGN KEY (`moduleid` )
    REFERENCES `kubdb`.`modules` (`id` )
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

-- -----------------------------------------------------
-- Table `kubdb`.`user_role`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `kubdb`.`user_role` (
  `id` INT(11) NOT NULL ,
  `userid` INT(11) NOT NULL ,
  `roleid` INT(11) NOT NULL ,
  `users_id` INT(8) NOT NULL ,
  `roles_id` INT(11) NOT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `fk_user_role_users1` (`users_id` ASC) ,
  INDEX `fk_user_role_roles1` (`roles_id` ASC) ,
  CONSTRAINT `fk_user_role_users1`
    FOREIGN KEY (`users_id` )
    REFERENCES `kubdb`.`users` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_role_roles1`
    FOREIGN KEY (`roles_id` )
    REFERENCES `kubdb`.`roles` (`id` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
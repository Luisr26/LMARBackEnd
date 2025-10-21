-- db-init.sql
-- Script de inicialización para MySQL basado en la entidad Usuario y application.properties

-- 1) Crear base de datos y seleccionarla
CREATE DATABASE IF NOT EXISTS `JavaSpring`
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;
USE `JavaSpring`;

-- 2) Crear usuario y asignar permisos (ejecutar como root o superusuario)
CREATE USER IF NOT EXISTS 'springuser'@'localhost' IDENTIFIED BY '1234';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, ALTER ON `JavaSpring`.* TO 'springuser'@'localhost';
FLUSH PRIVILEGES;

-- 3) Crear la tabla usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(150) DEFAULT NULL,
  `email` VARCHAR(255) DEFAULT NULL,
  `username` VARCHAR(100) DEFAULT NULL,
  `telefono` VARCHAR(50) DEFAULT NULL,
  `contrasena` VARCHAR(255) DEFAULT NULL,
  `rol` VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_usuario_email` (`email`),
  UNIQUE KEY `uk_usuario_username` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


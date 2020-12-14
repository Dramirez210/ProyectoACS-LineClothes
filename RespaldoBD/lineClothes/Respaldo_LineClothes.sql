-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: lineclothes
-- ------------------------------------------------------
-- Server version	5.7.32-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `paquetes`
--

DROP TABLE IF EXISTS `paquetes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paquetes` (
  `idPaquete` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) DEFAULT NULL,
  `peso` double NOT NULL,
  `prioridad` varchar(40) NOT NULL,
  `cantidadArticulos` int(11) NOT NULL,
  `idPersona` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPaquete`),
  KEY `idPersona_fk_idx` (`idPersona`),
  CONSTRAINT `idPersona_fk` FOREIGN KEY (`idPersona`) REFERENCES `personas` (`idPersona`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paquetes`
--

LOCK TABLES `paquetes` WRITE;
/*!40000 ALTER TABLE `paquetes` DISABLE KEYS */;
INSERT INTO `paquetes` VALUES (1,'1001',10.3,'Normal',2,1),(2,'1002',3.15,'Normal',1,1),(3,'1003',3.15,'Normal',1,2),(4,'1004',7,'Express',3,3),(5,'1005',1.9,'Normal',2,4),(6,'1006',5,'Normal',4,5),(11,'1007',6.48,'Express ($100 pesos extra)',1,12),(12,'1008',9.458,'Normal',5,13),(13,'1009',12,'Express ($100 pesos extra)',3,14),(14,'1010',45.9,'Normal',7,15),(15,'1011',0.5,'Express ($100 pesos extra)',1,16),(16,'1012',0.4,'Normal',1,17),(17,'1013',1.09,'Express ($100 pesos extra)',2,18);
/*!40000 ALTER TABLE `paquetes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `codigoPostal` int(11) NOT NULL,
  `calle` varchar(60) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Daniel Ramirez',7130,'Av.Cien metros #120','CDMX ($50 pesos extra)'),(2,'Antonio Alfaro',1503,'Av.poli #55','CDMX ($50 pesos extra)'),(3,'Pilar Garcia',15420,'Av.Rio de los remedios #99','CDMX ($50 pesos extra)'),(4,'Ivan Asensio',50006,'Tatanacho #15','CDMX ($50 pesos extra)'),(5,'Lilia Ortega',15026,'Calle #8','CDMX ($50 pesos extra)'),(12,'Jesus Villanueva',65848,'Siempre viva #123','Baja California ($100 pesos extra)'),(13,'Guadalupe Ortega',12345,'Vallejo #21','CDMX ($50 pesos extra)'),(14,'Eduardo Luna',15498,'Mario Colin #12','Estado de México  ($50 pesos extra)'),(15,'Jorge Vazquez',45879,'La palma #20','CDMX ($50 pesos extra)'),(16,'Sofia Cruz',78456,'Cerrada de las tortugas #45','Estado de México  ($50 pesos extra)'),(17,'Dery Valenzuela ',45879,'Av. De los caracoles #10','Estado de México ($50 pesos extra)'),(18,'Fernanda Lara',4578,'Juan Gabriel #79','Express ($100 pesos extra)');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-13 15:02:32

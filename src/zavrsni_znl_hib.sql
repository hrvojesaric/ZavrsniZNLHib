-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: zavrsni_znl_hib
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dogadaj`
--

DROP TABLE IF EXISTS `dogadaj`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dogadaj` (
  `sifra` int(11) NOT NULL,
  `opis` varchar(255) DEFAULT NULL,
  `vrijeme` int(11) NOT NULL,
  `momcad_sifra` int(11) DEFAULT NULL,
  `utakmica_sifra` int(11) DEFAULT NULL,
  `vrsta_dogadaja_sifra` int(11) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKbcjrjktchl2uq9k0ef6in91ya` (`momcad_sifra`),
  KEY `FKcdq0inynl4b0u3eocq1uuwe4r` (`utakmica_sifra`),
  KEY `FKhdsyyd9r5vwfwl9jwtkmya4t4` (`vrsta_dogadaja_sifra`),
  CONSTRAINT `FKbcjrjktchl2uq9k0ef6in91ya` FOREIGN KEY (`momcad_sifra`) REFERENCES `momcad` (`sifra`),
  CONSTRAINT `FKcdq0inynl4b0u3eocq1uuwe4r` FOREIGN KEY (`utakmica_sifra`) REFERENCES `utakmica` (`sifra`),
  CONSTRAINT `FKhdsyyd9r5vwfwl9jwtkmya4t4` FOREIGN KEY (`vrsta_dogadaja_sifra`) REFERENCES `vrstadogadaja` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dogadaj`
--

LOCK TABLES `dogadaj` WRITE;
/*!40000 ALTER TABLE `dogadaj` DISABLE KEYS */;
INSERT INTO `dogadaj` VALUES (38,'Pogodak postigao igrač br. 3 \n(Ivan Kasalo)',33,3,25,28,'Pogodak '),(39,'dsadsa',12,4,37,29,'Autogol ');
/*!40000 ALTER TABLE `dogadaj` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (40),(40),(40),(40),(40),(40),(40);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `igrac`
--

DROP TABLE IF EXISTS `igrac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `igrac` (
  `sifra` int(11) NOT NULL,
  `broj_licence` varchar(255) DEFAULT NULL,
  `datumrodenja` date DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  `momcad_sifra` int(11) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKcpmortldta91ujwbn9n5nritu` (`momcad_sifra`),
  CONSTRAINT `FKcpmortldta91ujwbn9n5nritu` FOREIGN KEY (`momcad_sifra`) REFERENCES `momcad` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `igrac`
--

LOCK TABLES `igrac` WRITE;
/*!40000 ALTER TABLE `igrac` DISABLE KEYS */;
INSERT INTO `igrac` VALUES (5,'432242','2019-04-12','fsdfsfd','fdsdffdss',4),(6,'21','1995-01-01','asDD','Assd',3),(7,'423423','1995-01-13','DSADSAD','DASA',4),(8,'432242','2019-04-12','fsd','fdsdf',4),(9,'432242','2019-04-12','fsdfsfdycyxsy','fdsdffdsssacyx',4),(10,'423423','1995-01-13','DSADSADsddsf','DASAsadsda',4),(11,'423423','1995-01-13','DSADSADsddsf','DASAsadsdasdasad',4),(36,'2133213','1996-07-13','marioned','sadassd',2);
/*!40000 ALTER TABLE `igrac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `korisnickipodaci`
--

DROP TABLE IF EXISTS `korisnickipodaci`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `korisnickipodaci` (
  `sifra` int(11) NOT NULL,
  `korisnicko_ime` varchar(255) DEFAULT NULL,
  `lozinka` varchar(255) DEFAULT NULL,
  `uloga` int(11) NOT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `korisnickipodaci`
--

LOCK TABLES `korisnickipodaci` WRITE;
/*!40000 ALTER TABLE `korisnickipodaci` DISABLE KEYS */;
/*!40000 ALTER TABLE `korisnickipodaci` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `momcad`
--

DROP TABLE IF EXISTS `momcad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `momcad` (
  `sifra` int(11) NOT NULL,
  `fizioterapeut` varchar(255) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  `predstavnik_kluba` varchar(255) DEFAULT NULL,
  `stadion` varchar(255) DEFAULT NULL,
  `trener` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `momcad`
--

LOCK TABLES `momcad` WRITE;
/*!40000 ALTER TABLE `momcad` DISABLE KEYS */;
INSERT INTO `momcad` VALUES (2,'Fizio 3','Momčad 3','Predstavnik 3','Stadion 3','Trener 3'),(3,'Fizio 2','Momčad 2','Predstavnik 2','Stadion 2','Trener 2'),(4,'Fizio 1','Momčad 1','Predstavnik 1','Stadion 1','Trener 1');
/*!40000 ALTER TABLE `momcad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `operater`
--

DROP TABLE IF EXISTS `operater`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `operater` (
  `sifra` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `lozinka` char(60) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `operater`
--

LOCK TABLES `operater` WRITE;
/*!40000 ALTER TABLE `operater` DISABLE KEYS */;
INSERT INTO `operater` VALUES (1,'hrvoje.saric93@gmail.com','Hrvoje','$2a$10$xvjydYzH9nZTJyo5CSbfUe1S90oRyYa1G/OxmtZMZv.PCXBDyFMZq','Šarić'),(26,'monika.saric@gmail.com','Monika','$2a$10$0EcgDBn8R7GhwWh6GcIiW.DNBeKj1Gr2ZHbcP44sRBl4F5y7ttT7W','Šarić'),(34,'mario@gmail.com','Mario ','$2a$10$jwjn6.P8mTFa0pX/AROX4OjgQXmHJKfQjGLTf38LBlUACaeE5DzAy','Šarić');
/*!40000 ALTER TABLE `operater` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sudac`
--

DROP TABLE IF EXISTS `sudac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sudac` (
  `sifra` int(11) NOT NULL,
  `broj_licence` varchar(255) DEFAULT NULL,
  `datumrodenja` date DEFAULT NULL,
  `ime` varchar(255) DEFAULT NULL,
  `prezime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sudac`
--

LOCK TABLES `sudac` WRITE;
/*!40000 ALTER TABLE `sudac` DISABLE KEYS */;
INSERT INTO `sudac` VALUES (12,'321312','1993-11-10','Anahi','Wiza'),(13,'321312','1993-11-10','Adalberto','Funk'),(14,'321312','1993-11-10','Aletha','Cummerata'),(15,'321312','1993-11-10','Connie','VonRueden'),(16,'321312','1993-11-10','Deion','Mraz'),(17,'321312','1993-11-10','Marcelle','Jerde'),(18,'321312','1993-11-10','Hadley','Ruecker'),(19,'321312','1993-11-10','Deondre','Jast'),(20,'321312','1993-11-10','Ansel','Willms'),(21,'321312','1993-11-10','Lorna','Deckow');
/*!40000 ALTER TABLE `sudac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utakmica`
--

DROP TABLE IF EXISTS `utakmica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utakmica` (
  `sifra` int(11) NOT NULL,
  `pocetak` date DEFAULT NULL,
  `rezultat` varchar(255) DEFAULT NULL,
  `domaci_sifra` int(11) DEFAULT NULL,
  `drugi_pomocni_sifra` int(11) DEFAULT NULL,
  `glavni_sudac_sifra` int(11) DEFAULT NULL,
  `gosti_sifra` int(11) DEFAULT NULL,
  `prvi_pomocni_sifra` int(11) DEFAULT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`),
  KEY `FKaidyowdgns75agqjkbe17cnn0` (`domaci_sifra`),
  KEY `FKkivytsolkycbit541bj9w3hoa` (`drugi_pomocni_sifra`),
  KEY `FK90sujk6kcj42y781ck7dxetp4` (`glavni_sudac_sifra`),
  KEY `FKmpy8cpl25mmm392womovnpbiv` (`gosti_sifra`),
  KEY `FK88jbqjdyvy34fynksximw9omm` (`prvi_pomocni_sifra`),
  CONSTRAINT `FK88jbqjdyvy34fynksximw9omm` FOREIGN KEY (`prvi_pomocni_sifra`) REFERENCES `sudac` (`sifra`),
  CONSTRAINT `FK90sujk6kcj42y781ck7dxetp4` FOREIGN KEY (`glavni_sudac_sifra`) REFERENCES `sudac` (`sifra`),
  CONSTRAINT `FKaidyowdgns75agqjkbe17cnn0` FOREIGN KEY (`domaci_sifra`) REFERENCES `momcad` (`sifra`),
  CONSTRAINT `FKkivytsolkycbit541bj9w3hoa` FOREIGN KEY (`drugi_pomocni_sifra`) REFERENCES `sudac` (`sifra`),
  CONSTRAINT `FKmpy8cpl25mmm392womovnpbiv` FOREIGN KEY (`gosti_sifra`) REFERENCES `momcad` (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utakmica`
--

LOCK TABLES `utakmica` WRITE;
/*!40000 ALTER TABLE `utakmica` DISABLE KEYS */;
INSERT INTO `utakmica` VALUES (25,'2019-04-14','4 : 4',3,19,14,3,17,'Momčad 2 - Momčad 2 ( 4 : 4 )'),(27,'2019-03-10','5 : 0',3,18,17,4,19,'Momčad 2 - Momčad 1 ( 5 : 0 )'),(37,'2019-04-14','0:3',4,12,18,3,19,'Momčad 1 - Momčad 2 ( 0:3 )');
/*!40000 ALTER TABLE `utakmica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vrstadogadaja`
--

DROP TABLE IF EXISTS `vrstadogadaja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vrstadogadaja` (
  `sifra` int(11) NOT NULL,
  `naziv` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sifra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vrstadogadaja`
--

LOCK TABLES `vrstadogadaja` WRITE;
/*!40000 ALTER TABLE `vrstadogadaja` DISABLE KEYS */;
INSERT INTO `vrstadogadaja` VALUES (28,'Pogodak'),(29,'Autogol'),(30,'Izmjena'),(31,'Žuti karton'),(32,'Crveni karton'),(33,'Kazneni udarac');
/*!40000 ALTER TABLE `vrstadogadaja` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-15 16:14:53

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
  `naziv` varchar(255) DEFAULT NULL,
  `opis` varchar(255) DEFAULT NULL,
  `vrijeme` varchar(255) DEFAULT NULL,
  `momcad_sifra` int(11) DEFAULT NULL,
  `utakmica_sifra` int(11) DEFAULT NULL,
  `vrsta_dogadaja_sifra` int(11) DEFAULT NULL,
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
INSERT INTO `dogadaj` VALUES (25,'Min : 33. ; Žuti Karton','Mario Šarić, Prigovor sucu','33.',2,19,23),(65,'Min : 45 ; Pogodak','sSaaaa','45',2,27,21),(67,'Min : 3 ; Kazneni udarac','das','3',6,64,20),(69,'Min : 23 ; Autogol','dsa','23',3,26,22),(72,'Min : 23 ; Pogodak','dasd','23',3,64,21),(74,'Min : 53 ; Crveni Karton','Danijel Dražetić; udaranje igrača bez lopte','53',5,62,24),(77,'Min : 32 ; Autogol','blabla','32',2,27,22);
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
INSERT INTO `hibernate_sequence` VALUES (78),(78),(78),(78),(78),(78),(78);
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
INSERT INTO `igrac` VALUES (8,'12311','1995-01-05','Ivan','Prskalo',2),(35,'123','2019-04-12','dasd','dasda',3),(44,'3213','2019-04-18','fasfdfas','fasfsa',5),(45,'3123','2019-04-19','fdasd','sdadasd',2),(47,'2312','1995-01-12','sdasd','dsadsa',5),(55,'213312','2019-04-11','sdas','sddas',6);
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
INSERT INTO `momcad` VALUES (2,'Hrvoje Ribić','Sulkovci','Josip Šutić','Sulkovački stadion','Predrag Šarić'),(3,'Mali Madaj','Dinamo Rajsavac','Josip Glavaš','Kraj groblja',NULL),(5,'Pavo Nikolić','Hrvatski dragovoljac Drenovac','Marko Vidakušić','Hrvatskih vitezova',NULL),(6,'Josip Lulić','Graničar Zagrađe','Igor Ančurovski','Pod brdom','Josip Mijatović');
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
INSERT INTO `operater` VALUES (1,'hrvoje.saric93@gmail.com','Hrvoje','$2a$10$t6MFnMdgArVWo7ylCZ3ZsujWPdomA5fEmokiiM2dV16Vk3aEsou72','Šarić'),(46,'s','ss','$2a$10$0jiepYEEjWOZ6nufSw.PHeSwDfEXqaBZyFHonnucaLLAp3HgkL8.6','ss'),(50,'dsads','dsa','$2a$10$EKfYyHV9zUmA8uD4aDOui.hi5kWmIkJ7QRcjXuHpfYx9EJNf39csW','dsa'),(51,'As','sa','$2a$10$RYruDUp1Ltn1Ykl1ph551.q/QdL9TFFnv/DwBt5SIVE4ZN//SL2Tu','as'),(52,'dakle@gmail.com','d','$2a$10$Rn5UyBshpk.KMfT0M87mtuL5Y8qo0fQnxxv.fFCe5znD0mQg.dlCK','d');
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
INSERT INTO `sudac` VALUES (9,'321312','1993-11-10','Lizzie','Osinski'),(10,'321312','1993-11-10','Elliott','Stamm'),(11,'321312','1993-11-10','Darion','Lemke'),(12,'321312','1993-11-10','Nona','Ryan'),(13,'321312','1993-11-12','Alexandrea','Adams'),(14,'321312','1993-11-10','Emmett','Pacocha'),(15,'321312','1993-11-10','Gerhard','Kub'),(16,'321312','1993-11-10','Chaz','Ankunding'),(17,'321312','1993-11-10','Odie','Daugherty'),(18,'321312','1993-11-10','Janae','Collins'),(48,'123','2019-04-11','da','da'),(49,'1213','1995-01-01','sa','SAD');
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
  `naziv` varchar(255) DEFAULT NULL,
  `pocetak` date DEFAULT NULL,
  `rezultat` varchar(255) DEFAULT NULL,
  `domaci_sifra` int(11) DEFAULT NULL,
  `drugi_pomocni_sifra` int(11) DEFAULT NULL,
  `glavni_sudac_sifra` int(11) DEFAULT NULL,
  `gosti_sifra` int(11) DEFAULT NULL,
  `prvi_pomocni_sifra` int(11) DEFAULT NULL,
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
INSERT INTO `utakmica` VALUES (19,'Sulkovci - Dinamo Rajsavac ( 4:2 )','2019-04-11','4:2',2,15,10,3,14),(26,'Dinamo Rajsavac - Hrvatski dragovoljac Drenovac ( 2:2 )','2019-04-24','2:2',3,11,9,5,14),(27,'Graničar Zagrađe - Sulkovci ( 2:0 )','2019-04-16','2:0',6,10,12,2,12),(62,'Hrvatski dragovoljac Drenovac - Dinamo Rajsavac ( 0 : 0 )','2019-04-10','0 : 0',5,14,9,3,12),(64,'Graničar Zagrađe - Dinamo Rajsavac ( 2 : 0 )','2019-04-11','2 : 0',6,13,11,3,10);
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
INSERT INTO `vrstadogadaja` VALUES (20,'Kazneni udarac'),(21,'Pogodak'),(22,'Autogol'),(23,'Žuti Karton'),(24,'Crveni Karton');
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

-- Dump completed on 2019-04-24 16:01:24

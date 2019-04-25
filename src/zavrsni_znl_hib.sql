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
INSERT INTO `dogadaj` VALUES (106,'Min : 33 ; Pogodak','Pogodak postigao Marko Blašković','33.',81,102,21),(107,'Min : 65 ; Autogol','Autogol je postigao Ivan Filipović','65.',2,102,22),(108,'Min : 70. ; Žuti Karton','Marko Markanjević; povlačenje \nprotivničkog igrača za dres\n','70.',81,102,23),(109,'Min : 33 ; Žuti Karton','Ante Dražetić; Prigovor sucu','33.',5,103,23),(110,'Min : 43 ; Pogodak','Pogodak postigao Josip Ružičić','43.',6,103,21),(111,'Min : 32 ; Crveni Karton','Stjepan Majetić: udaranje igrača bez\nlopte.','32.',2,105,24);
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
INSERT INTO `hibernate_sequence` VALUES (112),(112),(112),(112),(112),(112),(112);
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
INSERT INTO `igrac` VALUES (8,'8540734','1993-06-01','Ivan','Prskalo',2),(84,'8502617','1996-12-02','Stjepan','Majetić',2),(85,'8502623','1997-04-17','Josip','Nović',2),(86,'8502611','1993-04-03','Ivan','Filipović',2),(87,'8500577','1993-04-29','Marko','Blašković',81),(88,'8503041','1996-09-19','Marko','Markanović',81),(89,'8503177','1995-02-04','Slavko','Mlinarić',81),(90,'8540217','1988-06-03','Ivan','Glavaš',3),(91,'8500294','1977-07-27','Ivica','Blašković',3),(92,'8501068','1979-09-05','Ante','Dražetić',5),(93,'8504158','2000-10-19','Josip','Ružičić',6);
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
INSERT INTO `momcad` VALUES (2,'Hrvoje Ribić','Sulkovci','Josip Šutić','Tribljavina','Predrag Šarić'),(3,'Mali Madaj','Dinamo Rajsavac','Josip Glavaš','Kraj groblja','Slavko Pavlović'),(5,'Pavo Nikolić','HD Drenovac','Marko Vidakušić','Hrvatskih vitezova','Željko Matijević'),(6,'Josip Lulić','Graničar Zagrađe','Igor Ančurovski','Pod brdom','Josip Mijatović'),(81,'Marijan Kovačević','Sloga Trenkovo','','Park','Jurica Bešlić'),(82,'','Slaven Gradac','Goran Pavlović','Klasije','Goran Vrgoč'),(83,'','Parasan Golobrdci','','Pod selom','Mihael Supan');
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
INSERT INTO `sudac` VALUES (94,'84804493432','1992-02-16','Marko','Abramović'),(95,'22166002600','1972-09-15','Josip','Baltić'),(96,'27114749334','1992-03-10','Domagoj','Jakovljević'),(97,'33283950872','1988-01-01','Nikola','Jurišić'),(98,'99964910891','1973-06-12','Milan','Matošević'),(99,'68026965721','1953-04-16','Josip','Podobnik'),(100,'90615987695','1998-05-03','Marko','Šubara'),(101,'33706605384','1985-11-16','Ivica','Vidović');
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
INSERT INTO `utakmica` VALUES (102,'Sulkovci - Sloga Trenkovo ( 4 : 2 )','2019-03-03','4:2',2,100,94,81,97),(103,'HD Drenovac - Graničar Zagrađe ( 1 : 2 )','2019-03-24','1:2',5,96,98,6,101),(104,'Parasan Golobrdci - Slaven Gradac ( 2:2 )','2019-04-07','2:2',83,99,97,82,95),(105,'HD Drenovac - Sulkovci ( 2 : 1 )','2019-04-22','2:1',5,100,96,2,97);
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

-- Dump completed on 2019-04-25 11:42:09

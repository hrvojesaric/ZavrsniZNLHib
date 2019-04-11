-- MySQL dump 10.16  Distrib 10.1.37-MariaDB, for Win32 (AMD64)
--
-- Host: localhost    Database: zavrsni_znl_hib
-- ------------------------------------------------------
-- Server version	10.1.37-MariaDB

# mysql -uedunova -pedunova --default_character_set=utf8 < "D:\TecajJava\skripte\zavrsni_znl_hib.sql"

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
INSERT INTO `hibernate_sequence` VALUES (405),(405),(405),(405),(405),(405),(405);
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
INSERT INTO `igrac` VALUES (103,'321312','1993-11-10','Noah','Sawayn',NULL),(104,'321312','1993-11-10','Colten','Haley',NULL),(105,'321312','1993-11-10','Pedro','Nicolas',NULL),(106,'321312','1993-11-10','Tobin','Waters',NULL),(107,'321312','1993-11-10','Margarette','Barton',NULL),(110,'321312','1993-11-10','Caitlyn','Okuneva',NULL),(111,'321312','1993-11-10','Chasity','Erdman',NULL),(112,'321312','1993-11-10','Ebba','Barton',NULL),(113,'321312','1993-11-10','Maxwell','Welch',NULL),(114,'321312','1993-11-10','Cornell','Hagenes',NULL),(115,'321312','1993-11-10','Cortez','Johnston',NULL),(116,'321312','1993-11-10','Mollie','Streich',NULL),(117,'321312','1993-11-10','Juliet','Fahey',NULL),(118,'321312','1993-11-10','Adrianna','Bergnaum',NULL),(119,'321312','1993-11-10','Tristin','Kris',NULL),(120,'321312','1993-11-10','Lurline','Gibson',NULL),(121,'321312','1993-11-10','Adela','Mosciski',NULL),(122,'321312','1993-11-10','Ebba','Powlowski',NULL),(123,'321312','1993-11-10','Ryder','Adams',NULL),(124,'321312','1993-11-10','Zelda','Fahey',NULL),(125,'321312','1993-11-10','Chandler','Ward',NULL),(126,'321312','1993-11-10','Antwon','Abernathy',NULL),(127,'321312','1993-11-10','Hortense','Rogahn',NULL),(128,'321312','1993-11-10','Winnifred','Kunde',NULL),(129,'321312','1993-11-10','Gwen','Gorczany',NULL),(130,'321312','1993-11-10','Orrin','Renner',NULL),(131,'321312','1993-11-10','Gabriella','Glover',NULL),(132,'321312','1993-11-10','Rudy','Nicolas',NULL),(133,'321312','1993-11-10','Jakayla','McGlynn',NULL),(134,'321312','1993-11-10','Evelyn','Pollich',NULL),(135,'321312','1993-11-10','Leon','Bernier',NULL),(136,'321312','1993-11-10','Taylor','Sanford',NULL),(137,'321312','1993-11-10','Trace','Wiza',NULL),(138,'321312','1993-11-10','Lewis','Cummings',NULL),(139,'321312','1993-11-10','Duncan','Yundt',NULL),(140,'321312','1993-11-10','Jaeden','Koelpin',NULL),(141,'321312','1993-11-10','Neva','Weimann',NULL),(142,'321312','1993-11-10','Lia','Auer',NULL),(143,'321312','1993-11-10','Abbie','Gottlieb',NULL),(144,'321312','1993-11-10','Kip','Predovic',NULL),(145,'321312','1993-11-10','Brannon','Kohler',NULL),(146,'321312','1993-11-10','Raegan','Hoppe',NULL),(147,'321312','1993-11-10','Buddy','Skiles',NULL),(148,'321312','1993-11-10','Demarco','Murray',NULL),(149,'321312','1993-11-10','Elvera','Borer',NULL),(150,'321312','1993-11-10','Bernard','Fisher',NULL),(151,'321312','1993-11-10','Lyda','Baumbach',NULL),(152,'321312','1993-11-10','Gabe','Eichmann',NULL),(153,'321312','1993-11-10','Kaleigh','Sporer',NULL),(154,'321312','1993-11-10','Barbara','Von',NULL),(155,'321312','1993-11-10','Nicholaus','Torp',NULL),(156,'321312','1993-11-10','Caleb','Dibbert',NULL),(157,'321312','1993-11-10','Adriel','Kreiger',NULL),(158,'321312','1993-11-10','Gavin','Hilll',NULL),(159,'321312','1993-11-10','Cory','Swift',NULL),(160,'321312','1993-11-10','Suzanne','Erdman',NULL),(161,'321312','1993-11-10','Alayna','Kemmer',NULL),(162,'321312','1993-11-10','Nash','Stamm',NULL),(163,'321312','1993-11-10','Nick','Abernathy',NULL),(164,'321312','1993-11-10','Bell','Baumbach',NULL),(165,'321312','1993-11-10','Liliana','Dicki',NULL),(166,'321312','1993-11-10','Daphne','Gleichner',NULL),(167,'321312','1993-11-10','Hilton','Hirthe',NULL),(168,'321312','1993-11-10','Marge','Lehner',NULL),(169,'321312','1993-11-10','Dwight','Langworth',NULL),(170,'321312','1993-11-10','Shea','Beer',NULL),(171,'321312','1993-11-10','Cicero','Schoen',NULL),(172,'321312','1993-11-10','Caesar','Gleichner',NULL),(173,'321312','1993-11-10','Derek','Haag',NULL),(174,'321312','1993-11-10','Axel','Bode',NULL),(175,'321312','1993-11-10','Godfrey','O\'Kon',NULL),(176,'321312','1993-11-10','Taylor','Bednar',NULL),(177,'321312','1993-11-10','Elena','Mills',NULL),(178,'321312','1993-11-10','Saige','King',NULL),(179,'321312','1993-11-10','Maybelle','Braun',NULL),(180,'321312','1993-11-10','Einar','Bogisich',NULL),(181,'321312','1993-11-10','Rex','Jenkins',NULL),(182,'321312','1993-11-10','Isobel','VonRueden',NULL),(183,'321312','1993-11-10','Mable','Wehner',NULL),(184,'321312','1993-11-10','Sandrine','Mitchell',NULL),(185,'321312','1993-11-10','Elinore','Prohaska',NULL),(186,'321312','1993-11-10','Prudence','Runolfsson',NULL),(187,'321312','1993-11-10','Dennis','Halvorson',NULL),(188,'321312','1993-11-10','Ervin','Gutmann',NULL),(189,'321312','1993-11-10','Brycen','Miller',NULL),(190,'321312','1993-11-10','Margret','Konopelski',NULL),(191,'321312','1993-11-10','Sadie','Johnston',NULL),(192,'321312','1993-11-10','Reagan','Feil',NULL),(193,'321312','1993-11-10','Roy','Wiza',NULL),(194,'321312','1993-11-10','Simeon','Crooks',NULL),(195,'321312','1993-11-10','Magdalen','Kutch',NULL),(196,'321312','1993-11-10','Ashton','Schmitt',NULL),(197,'321312','1993-11-10','Jany','Robel',NULL),(198,'321312','1993-11-10','Olen','Kub',NULL),(199,'321312','1993-11-10','Eliane','Weissnat',NULL),(200,'321312','1993-11-10','Joey','Upton',NULL),(201,'321312','1993-11-10','Michel','Schaden',NULL),(202,'321312','1993-11-10','Jerel','Hackett',NULL),(203,'321312','1993-11-10','Hailie','Conn',NULL),(204,'321312','1993-11-10','Ines','Hintz',NULL),(205,'321312','1993-11-10','Rylee','Conn',NULL),(206,'321312','1993-11-10','Kirsten','Williamson',NULL),(207,'321312','1993-11-10','Manley','Hegmann',NULL),(208,'321312','1993-11-10','Noemi','Boyer',NULL),(209,'321312','1993-11-10','Guy','Lowe',NULL),(210,'321312','1993-11-10','Jeramie','Cronin',NULL),(211,'321312','1993-11-10','Wilfredo','Streich',NULL),(212,'321312','1993-11-10','Kellie','Heathcote',NULL),(213,'321312','1993-11-10','Beau','D\'Amore',NULL),(214,'321312','1993-11-10','Stacy','Ward',NULL),(215,'321312','1993-11-10','Vicenta','Upton',NULL),(216,'321312','1993-11-10','Geovany','Johnson',NULL),(217,'321312','1993-11-10','Elmer','Orn',NULL),(218,'321312','1993-11-10','Tatum','Keeling',NULL),(219,'321312','1993-11-10','Adam','Gaylord',NULL),(220,'321312','1993-11-10','Vernie','Gottlieb',NULL),(221,'321312','1993-11-10','Karson','Cronin',NULL),(222,'321312','1993-11-10','Arnold','Lang',NULL),(223,'321312','1993-11-10','Fern','Hamill',NULL),(224,'321312','1993-11-10','Kaia','Carter',NULL),(225,'321312','1993-11-10','Lacey','Larson',NULL),(226,'321312','1993-11-10','Gideon','Schroeder',NULL),(227,'321312','1993-11-10','Sheldon','Larkin',NULL),(228,'321312','1993-11-10','Merritt','Legros',NULL),(229,'321312','1993-11-10','Fausto','Hilll',NULL),(230,'321312','1993-11-10','Trenton','Kunze',NULL),(231,'321312','1993-11-10','Kane','Hodkiewicz',NULL),(232,'321312','1993-11-10','Layne','Wiza',NULL),(233,'321312','1993-11-10','Lorena','Block',NULL),(234,'321312','1993-11-10','Isom','Predovic',NULL),(235,'321312','1993-11-10','Jeanie','Reinger',NULL),(236,'321312','1993-11-10','Branson','Ratke',NULL),(237,'321312','1993-11-10','Alba','Smith',NULL),(238,'321312','1993-11-10','Braxton','Hickle',NULL),(239,'321312','1993-11-10','Caterina','Pacocha',NULL),(240,'321312','1993-11-10','Jaylon','Hammes',NULL),(241,'321312','1993-11-10','Terrell','Farrell',NULL),(242,'321312','1993-11-10','Easter','Hegmann',NULL),(243,'321312','1993-11-10','Bette','Eichmann',NULL),(244,'321312','1993-11-10','Moshe','Johns',NULL),(245,'321312','1993-11-10','Shana','Monahan',NULL),(246,'321312','1993-11-10','Angela','Kuvalis',NULL),(247,'321312','1993-11-10','Garfield','Cronin',NULL),(248,'321312','1993-11-10','Matteo','Dickens',NULL),(249,'321312','1993-11-10','Vivien','Kuhic',NULL),(250,'321312','1993-11-10','Daphney','Schiller',NULL),(251,'321312','1993-11-10','Dahlia','Streich',NULL),(252,'321312','1993-11-10','Lauretta','Carroll',NULL),(253,'321312','1993-11-10','River','Stark',NULL),(254,'321312','1993-11-10','Sandrine','Wunsch',NULL),(255,'321312','1993-11-10','Madalyn','Nader',NULL),(256,'321312','1993-11-10','Coleman','Cronin',NULL),(257,'321312','1993-11-10','Clifford','Greenfelder',NULL),(258,'321312','1993-11-10','Hollie','Reichel',NULL),(259,'321312','1993-11-10','Louie','Daniel',NULL),(260,'321312','1993-11-10','Hollis','Wehner',NULL),(261,'321312','1993-11-10','Brenna','Greenholt',NULL),(262,'321312','1993-11-10','Myrna','Bogan',NULL),(263,'321312','1993-11-10','Nathanial','Schumm',NULL),(264,'321312','1993-11-10','Abel','Stanton',NULL),(265,'321312','1993-11-10','Sonya','Reinger',NULL),(266,'321312','1993-11-10','Justus','Kunde',NULL),(267,'321312','1993-11-10','Pauline','Connelly',NULL),(268,'321312','1993-11-10','Catalina','Schumm',NULL),(269,'321312','1993-11-10','Elroy','Beatty',NULL),(270,'321312','1993-11-10','Johnnie','Kris',NULL),(271,'321312','1993-11-10','Lonny','Franecki',NULL),(272,'321312','1993-11-10','Dallin','Lynch',NULL),(273,'321312','1993-11-10','Adeline','Johnson',NULL),(274,'321312','1993-11-10','Reanna','Mitchell',NULL),(275,'321312','1993-11-10','Lafayette','Gerlach',NULL),(276,'321312','1993-11-10','Ezequiel','Eichmann',NULL),(277,'321312','1993-11-10','Daniela','Kuhic',NULL),(278,'321312','1993-11-10','Ian','Gottlieb',NULL),(279,'321312','1993-11-10','Carlotta','Wilkinson',NULL),(280,'321312','1993-11-10','Asa','Reinger',NULL),(281,'321312','1993-11-10','Gwen','Tromp',NULL),(282,'321312','1993-11-10','Casper','Hackett',NULL),(283,'321312','1993-11-10','Ola','Feil',NULL),(284,'321312','1993-11-10','Armand','Mueller',NULL),(285,'321312','1993-11-10','Constantin','Bergstrom',NULL),(286,'321312','1993-11-10','Quinten','Kutch',NULL),(287,'321312','1993-11-10','Antonia','Crooks',NULL),(288,'321312','1993-11-10','Lonie','Grant',NULL),(289,'321312','1993-11-10','Steve','Harris',NULL),(290,'321312','1993-11-10','Myriam','Gibson',NULL),(291,'321312','1993-11-10','Brent','Bode',NULL),(292,'321312','1993-11-10','Berry','Hills',NULL),(293,'321312','1993-11-10','Jeramy','Hudson',NULL),(294,'321312','1993-11-10','Elwin','Ratke',NULL),(295,'321312','1993-11-10','Thalia','Okuneva',NULL),(296,'321312','1993-11-10','Gilberto','Thompson',NULL),(297,'321312','1993-11-10','Annalise','Kreiger',NULL),(298,'321312','1993-11-10','Tristin','Hand',NULL),(299,'321312','1993-11-10','Gregg','Pollich',NULL),(300,'321312','1993-11-10','Cindy','Gislason',NULL),(301,'321312','1993-11-10','Frederic','Mohr',NULL),(302,'321312','1993-11-10','Cody','Daniel',NULL),(303,'321312','1993-11-10','Audra','Balistreri',NULL),(304,'321312','1993-11-10','Audreanne','Krajcik',NULL),(305,'321312','1993-11-10','Syble','Purdy',NULL),(306,'321312','1993-11-10','Nayeli','Green',NULL),(307,'321312','1993-11-10','Hiram','Rippin',NULL),(308,'321312','1993-11-10','August','Walter',NULL),(309,'321312','1993-11-10','Jacinthe','D\'Amore',NULL),(310,'321312','1993-11-10','Laurence','Ward',NULL),(311,'321312','1993-11-10','Gerson','Towne',NULL),(312,'321312','1993-11-10','Lester','Mitchell',NULL),(313,'321312','1993-11-10','Don','Wiza',NULL),(314,'321312','1993-11-10','Marty','Schuster',NULL),(315,'321312','1993-11-10','Conner','Miller',NULL),(316,'321312','1993-11-10','Tressa','Goldner',NULL),(317,'321312','1993-11-10','Osbaldo','Bahringer',NULL),(318,'321312','1993-11-10','Jaylan','Kihn',NULL),(319,'321312','1993-11-10','Berenice','Harvey',NULL),(320,'321312','1993-11-10','Pete','Kertzmann',NULL),(321,'321312','1993-11-10','Rosalind','Wiza',NULL),(322,'321312','1993-11-10','Rosario','Kozey',NULL),(323,'321312','1993-11-10','Ivah','Runte',NULL),(324,'321312','1993-11-10','Garry','Funk',NULL),(325,'321312','1993-11-10','Anderson','Bashirian',NULL),(326,'321312','1993-11-10','Nico','Barrows',NULL),(327,'321312','1993-11-10','Osbaldo','Hackett',NULL),(328,'321312','1993-11-10','Coty','Jacobson',NULL),(329,'321312','1993-11-10','Wyatt','Ward',NULL),(330,'321312','1993-11-10','Alessandra','Barrows',NULL),(331,'321312','1993-11-10','Jonas','Connelly',NULL),(332,'321312','1993-11-10','Javon','Jakubowski',NULL),(333,'321312','1993-11-10','Tina','Wisoky',NULL),(334,'321312','1993-11-10','Oswald','Lockman',NULL),(335,'321312','1993-11-10','Ewald','Bergnaum',NULL),(336,'321312','1993-11-10','Natasha','Stracke',NULL),(337,'321312','1993-11-10','Alvena','Smitham',NULL),(338,'321312','1993-11-10','Leopoldo','Tillman',NULL),(339,'321312','1993-11-10','Myron','Ondricka',NULL),(340,'321312','1993-11-10','Charlene','Hettinger',NULL),(341,'321312','1993-11-10','Elenor','Auer',NULL),(342,'321312','1993-11-10','Adaline','Corkery',NULL),(343,'321312','1993-11-10','Erick','Corwin',NULL),(344,'321312','1993-11-10','Saige','O\'Connell',NULL),(345,'321312','1993-11-10','Delpha','Mills',NULL),(346,'321312','1993-11-10','Patrick','Hudson',NULL),(347,'321312','1993-11-10','Angelo','Hermiston',NULL),(348,'321312','1993-11-10','Frederique','Mayert',NULL),(349,'321312','1993-11-10','Idell','Reilly',NULL),(350,'321312','1993-11-10','Osbaldo','Conroy',NULL),(351,'321312','1993-11-10','Fabiola','Nienow',NULL),(352,'321312','1993-11-10','Alvera','Heaney',NULL),(353,'321312','1993-11-10','Adell','Lang',NULL),(354,'321312','1993-11-10','Mollie','Schumm',NULL),(355,'321312','1993-11-10','Marques','Altenwerth',NULL),(356,'321312','1993-11-10','Destini','Lesch',NULL),(357,'321312','1993-11-10','Jessie','Harber',NULL),(358,'321312','1993-11-10','Delfina','Crona',NULL),(359,'321312','1993-11-10','Mikel','Wiegand',NULL),(360,'321312','1993-11-10','Adrienne','Abbott',NULL),(361,'321312','1993-11-10','Jaren','Romaguera',NULL),(362,'321312','1993-11-10','Dena','Jenkins',NULL),(363,'321312','1993-11-10','Conor','Streich',NULL),(364,'321312','1993-11-10','Jerrold','Shanahan',NULL),(365,'321312','1993-11-10','Joseph','Prohaska',NULL),(366,'321312','1993-11-10','Gail','Huels',NULL),(367,'321312','1993-11-10','Eugenia','Boehm',NULL),(368,'321312','1993-11-10','Irma','McDermott',NULL),(369,'321312','1993-11-10','Diana','Fisher',NULL),(370,'321312','1993-11-10','Allen','Little',NULL),(371,'321312','1993-11-10','Adeline','Windler',NULL),(372,'321312','1993-11-10','Viviane','Lind',NULL),(373,'321312','1993-11-10','Heloise','Buckridge',NULL),(374,'321312','1993-11-10','Alena','Wilkinson',NULL),(375,'321312','1993-11-10','Xavier','Volkman',NULL),(376,'321312','1993-11-10','Margarete','Bogan',NULL),(377,'321312','1993-11-10','Ida','Wisozk',NULL),(378,'321312','1993-11-10','Garett','Conn',NULL),(379,'321312','1993-11-10','Retha','Murray',NULL),(380,'321312','1993-11-10','Maximo','Leffler',NULL),(381,'321312','1993-11-10','Kaia','Carter',NULL),(382,'321312','1993-11-10','Virgie','Hyatt',NULL),(383,'321312','1993-11-10','Tierra','Parker',NULL),(384,'321312','1993-11-10','Peggie','Metz',NULL),(385,'321312','1993-11-10','Tyree','Fay',NULL),(386,'321312','1993-11-10','Vincenza','Schuppe',NULL),(387,'321312','1993-11-10','Darion','Smitham',NULL),(388,'321312','1993-11-10','Ezequiel','Carter',NULL),(389,'321312','1993-11-10','Joaquin','Berge',NULL),(390,'321312','1993-11-10','Joyce','Rosenbaum',NULL),(391,'321312','1993-11-10','Paige','Hegmann',NULL),(392,'321312','1993-11-10','Janie','Kuvalis',NULL),(393,'321312','1993-11-10','Martine','Hilll',NULL),(394,'321312','1993-11-10','Aubrey','Klein',NULL),(395,'321312','1993-11-10','Lorna','Hane',NULL),(396,'321312','1993-11-10','Tanner','Bogisich',NULL),(397,'321312','1993-11-10','Andreane','Bechtelar',NULL),(398,'321312','1993-11-10','Melisa','Reichel',NULL),(399,'321312','1993-11-10','Madisen','McGlynn',NULL),(400,'321312','1993-11-10','Tiara','Jacobi',NULL),(401,'321312','1993-11-10','Isabelle','Hilpert',NULL),(402,'321312','1993-11-10','Freddie','Kshlerin',NULL),(403,'2131','1993-04-10','aaa','aaa',NULL),(404,'3213123','1995-05-16','Mirko ','Marić',NULL);
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
INSERT INTO `operater` VALUES (1,'hrvoje.saric93@gmail.com','Hrvoje','$2a$10$FNnmQmoXueVyb0qJ1eEvWux/MAYs0.cn0q8dCr3O1rhrqzkk8OCPm','Šarić');
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
INSERT INTO `sudac` VALUES (3,'321312','1993-11-10','Karelle','Kautzer'),(4,'321312','1993-11-10','Hulda','Rohan'),(5,'321312','1993-11-10','Aric','Mosciski'),(6,'321312','1993-11-10','Cesar','Bauch'),(7,'321312','1993-11-10','Carolanne','Beer'),(8,'321312','1993-11-10','Brenna','Rau'),(9,'321312','1993-11-10','Freida','Hansen'),(10,'321312','1993-11-10','Candelario','Shields'),(11,'321312','1993-11-10','Rachael','O\'Keefe'),(12,'321312','1993-11-10','Camilla','Bode'),(13,'321312','1993-11-10','Kaci','Schoen'),(14,'321312','1993-11-10','Favian','Lynch'),(15,'321312','1993-11-10','Eldon','Wyman'),(16,'321312','1993-11-10','Lizeth','Windler'),(17,'321312','1993-11-10','Dan','Fisher'),(18,'321312','1993-11-10','Kailee','Welch'),(19,'321312','1993-11-10','Colleen','Rutherford'),(20,'321312','1993-11-10','Alvis','Stokes'),(21,'321312','1993-11-10','Madisyn','Stiedemann'),(22,'321312','1993-11-10','Lambert','Purdy'),(23,'321312','1993-11-10','Korbin','Rodriguez'),(24,'321312','1993-11-10','Kaycee','Adams'),(25,'321312','1993-11-10','Gayle','Kshlerin'),(26,'321312','1993-11-10','Kieran','Kilback'),(27,'321312','1993-11-10','Theresia','Kuhn'),(28,'321312','1993-11-10','Ryann','Kunde'),(29,'321312','1993-11-10','Roel','Daniel'),(30,'321312','1993-11-10','Lonny','Stiedemann'),(31,'321312','1993-11-10','Erick','Ondricka'),(32,'321312','1993-11-10','Margarette','Sipes'),(33,'321312','1993-11-10','Nikko','Swift'),(34,'321312','1993-11-10','Faye','Swift'),(35,'321312','1993-11-10','Jacklyn','Douglas'),(36,'321312','1993-11-10','Kennith','Donnelly'),(37,'321312','1993-11-10','Yesenia','Beier'),(38,'321312','1993-11-10','Gaetano','Roob'),(39,'321312','1993-11-10','Braulio','Corwin'),(40,'321312','1993-11-10','Chelsie','Schneider'),(41,'321312','1993-11-10','Hertha','Roberts'),(42,'321312','1993-11-10','Simone','Mills'),(43,'321312','1993-11-10','Adrianna','Ondricka'),(44,'321312','1993-11-10','Kyla','Lind'),(45,'321312','1993-11-10','Else','Dibbert'),(46,'321312','1993-11-10','Prince','Metz'),(47,'321312','1993-11-10','Ethelyn','Kuhn'),(48,'321312','1993-11-10','Marc','Kunze'),(49,'321312','1993-11-10','Bart','Miller'),(50,'321312','1993-11-10','Kamron','White'),(51,'321312','1993-11-10','Cortney','Schulist'),(52,'321312','1993-11-10','Calista','McLaughlin'),(53,'321312','1993-11-10','Korey','Torphy'),(54,'321312','1993-11-10','Adeline','Hessel'),(55,'321312','1993-11-10','Unique','Wiegand'),(56,'321312','1993-11-10','Dane','Hartmann'),(57,'321312','1993-11-10','Katherine','Blick'),(58,'321312','1993-11-10','Crystel','Barrows'),(59,'321312','1993-11-10','Luisa','Grimes'),(60,'321312','1993-11-10','Golden','Miller'),(61,'321312','1993-11-10','Laurianne','Kutch'),(62,'321312','1993-11-10','Alexandra','Crooks'),(63,'321312','1993-11-10','Adrienne','Bailey'),(64,'321312','1993-11-10','Ethyl','Beatty'),(65,'321312','1993-11-10','Julian','Greenholt'),(66,'321312','1993-11-10','Destany','Goyette'),(67,'321312','1993-11-10','Pierce','Schroeder'),(68,'321312','1993-11-10','Charlie','Casper'),(69,'321312','1993-11-10','Mya','Kessler'),(70,'321312','1993-11-10','Corbin','Stanton'),(71,'321312','1993-11-10','Mandy','Pagac'),(72,'321312','1993-11-10','Harley','Feeney'),(73,'321312','1993-11-10','Pinkie','Stamm'),(74,'321312','1993-11-10','Danielle','Graham'),(75,'321312','1993-11-10','Helen','Hane'),(76,'321312','1993-11-10','Preston','Dare'),(77,'321312','1993-11-10','Shana','Legros'),(78,'321312','1993-11-10','Emmanuel','Schowalter'),(79,'321312','1993-11-10','Valentine','Veum'),(80,'321312','1993-11-10','Roxanne','Thiel'),(81,'321312','1993-11-10','Paige','Monahan'),(82,'321312','1993-11-10','Leonel','Johns'),(83,'321312','1993-11-10','Cordell','Ondricka'),(84,'321312','1993-11-10','Shemar','Schulist'),(85,'321312','1993-11-10','Janessa','Treutel'),(86,'321312','1993-11-10','Friedrich','O\'Keefe'),(87,'321312','1993-11-10','Rosemary','Batz'),(88,'321312','1993-11-10','Mitchell','Roberts'),(89,'321312','1993-11-10','Westley','Lesch'),(90,'321312','1993-11-10','Erwin','Senger'),(91,'321312','1993-11-10','Ignatius','Tillman'),(92,'321312','1993-11-10','Imelda','Larkin'),(93,'321312','1993-11-10','Jonatan','Yost'),(94,'321312','1993-11-10','Sabina','Kilback'),(95,'321312','1993-11-10','Candido','Schowalter'),(96,'321312','1993-11-10','Emmitt','Roob'),(97,'321312','1993-11-10','Skye','Rosenbaum'),(98,'321312','1993-11-10','Terrell','Hintz'),(99,'321312','1993-11-10','Abraham','Waelchi'),(100,'321312','1993-11-10','Isobel','Shanahan'),(101,'321312','1993-11-10','Shakira','Schuppe'),(102,'321312','1993-11-10','Furman','Hagenes');
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

-- Dump completed on 2019-04-09  9:17:39

CREATE DATABASE  IF NOT EXISTS `helix` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `helix`;
-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: localhost    Database: helix
-- ------------------------------------------------------
-- Server version	9.7.0

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
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '59321d30-5e06-11f1-956e-345a606b4ef8:1-4031';

--
-- Table structure for table `behaviors`
--

DROP TABLE IF EXISTS `behaviors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `behaviors` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organism_id` int DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `organism_id` (`organism_id`),
  CONSTRAINT `behaviors_ibfk_1` FOREIGN KEY (`organism_id`) REFERENCES `organisms` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `behaviors`
--

LOCK TABLES `behaviors` WRITE;
/*!40000 ALTER TABLE `behaviors` DISABLE KEYS */;
INSERT INTO `behaviors` VALUES (1,1,'Aggression Targeting'),(2,1,'Territorial'),(3,2,'Aggressive'),(4,2,'Pack Hunter'),(5,3,'Obedience Conditioned'),(6,3,'Aggression Targeting'),(7,4,'Non-Aggressive'),(8,4,'Foraging'),(9,5,'Task Focused'),(10,5,'Low Aggression'),(11,6,'Non-Aggressive'),(12,6,'Task Focused'),(13,7,'Territorial'),(14,7,'Alert Posture'),(15,8,'Hunting Focus'),(16,8,'Non-Aggressive to Handlers'),(17,9,'Task Focused'),(18,9,'Low Aggression');
/*!40000 ALTER TABLE `behaviors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `defensive_adaptations`
--

DROP TABLE IF EXISTS `defensive_adaptations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `defensive_adaptations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organism_id` int DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `cost` double NOT NULL,
  `is_extra` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `organism_id` (`organism_id`),
  CONSTRAINT `defensive_adaptations_ibfk_1` FOREIGN KEY (`organism_id`) REFERENCES `organisms` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defensive_adaptations`
--

LOCK TABLES `defensive_adaptations` WRITE;
/*!40000 ALTER TABLE `defensive_adaptations` DISABLE KEYS */;
INSERT INTO `defensive_adaptations` VALUES (1,1,'Toxin Immunity',500,0),(2,1,'Rapid Clotting Tissue',500,0),(3,1,'Severe Cold Hide',500,0),(4,2,'Ballistic Hide',500,0),(5,2,'Regenerative Tissue',500,0),(6,2,'Thermal Resistance',500,0),(7,3,'Toxin Immunity',500,0),(8,3,'Rapid Clotting Tissue',500,0),(9,4,'Thick Hide',500,0),(10,5,'Pressure Resistant Shell',500,0),(11,5,'Impcat Dampening Hide',500,0),(12,6,'Heat Resistant Hide',500,0),(13,6,'Pressure Tolerance',500,0),(14,7,'Ballistic Hide',500,0),(15,7,'Toxin Immunity',500,0),(16,8,'Toxin Immunity',500,0),(17,9,'Impact Dampening Hide',500,0);
/*!40000 ALTER TABLE `defensive_adaptations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offensive_adaptations`
--

DROP TABLE IF EXISTS `offensive_adaptations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `offensive_adaptations` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organism_id` int DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  `cost` double NOT NULL,
  `is_extra` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `organism_id` (`organism_id`),
  CONSTRAINT `offensive_adaptations_ibfk_1` FOREIGN KEY (`organism_id`) REFERENCES `organisms` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offensive_adaptations`
--

LOCK TABLES `offensive_adaptations` WRITE;
/*!40000 ALTER TABLE `offensive_adaptations` DISABLE KEYS */;
INSERT INTO `offensive_adaptations` VALUES (1,1,'Venom Glands',500,0),(2,1,'Razor bone spurs',500,0),(3,1,'Active Camouflage',500,0),(4,2,'Crushing Jaw',500,0),(5,2,'Bone Spike Launch',500,0),(6,2,'Venom Spit',500,0),(7,3,'Paralytic Venom',500,0),(8,3,'Razor Tail',500,0),(9,4,'Burrowing Claws',500,0),(10,5,'Excavation Claws',500,0),(11,6,'Seismic Stomp',500,0),(12,6,'Dimond Claw Tips',500,0),(13,7,'Concussive Tail Strike',500,0),(14,7,'Immobilizing Bite',500,0),(15,8,'Venom Glands',500,0),(16,8,'Constriction',500,0),(17,9,'Blade Crest',500,0),(18,9,'Tree Shear Jaw',500,0);
/*!40000 ALTER TABLE `offensive_adaptations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organisms`
--

DROP TABLE IF EXISTS `organisms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organisms` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `genome` varchar(50) NOT NULL,
  `scale` varchar(50) NOT NULL,
  `acceleratedGrowth` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organisms`
--

LOCK TABLES `organisms` WRITE;
/*!40000 ALTER TABLE `organisms` DISABLE KEYS */;
INSERT INTO `organisms` VALUES (1,'Phantom','REPTILIAN','CLASS_II',0),(2,'Ironclad','REPTILIAN','CLASS_III',0),(3,'Reaper','REPTILIAN','CLASS_II',0),(4,'Tillback','REPTILIAN','CLASS_I',0),(5,'Stoneback','REPTILIAN','CLASS_III',0),(6,'Delver','REPTILIAN','CLASS_II',0),(7,'Sentry','REPTILIAN','CLASS_II',0),(8,'Culler','REPTILIAN','CLASS_I',0),(9,'Razorback','REPTILIAN','CLASS_II',0);
/*!40000 ALTER TABLE `organisms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `standard_mods`
--

DROP TABLE IF EXISTS `standard_mods`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `standard_mods` (
  `id` int NOT NULL AUTO_INCREMENT,
  `organism_id` int DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `organism_id` (`organism_id`),
  CONSTRAINT `standard_mods_ibfk_1` FOREIGN KEY (`organism_id`) REFERENCES `organisms` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `standard_mods`
--

LOCK TABLES `standard_mods` WRITE;
/*!40000 ALTER TABLE `standard_mods` DISABLE KEYS */;
INSERT INTO `standard_mods` VALUES (1,1,'Pack Tactics'),(2,1,'Neural Compliance'),(3,1,'Infrared Vision'),(4,1,'Aggression tuning'),(5,1,'Enhanced Smell'),(6,2,'Target Lock'),(7,2,'Aggression Tuning'),(8,2,'Neural Compliance'),(9,3,'Enhanced Smell'),(10,3,'Infrared Vision'),(11,3,'Sprint Burst'),(12,4,'Docility Tuning'),(13,4,'Enhanced Smell'),(14,5,'Endurance Tuning'),(15,5,'Neural Compliance'),(16,6,'Low Light Vision'),(17,6,'Endurance Tuning'),(18,7,'Aggression Tuning'),(19,7,'Infrared Vision'),(20,7,'Enhanced Smell'),(21,8,'Burrow Instinct'),(22,8,'Enhanced Smell'),(23,9,'Endurance Tuning'),(24,9,'Docility Tuning');
/*!40000 ALTER TABLE `standard_mods` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-07-04  3:36:02

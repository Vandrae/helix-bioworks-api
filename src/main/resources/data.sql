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

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '59321d30-5e06-11f1-956e-345a606b4ef8:1-4036';

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
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `behaviors`
--

LOCK TABLES `behaviors` WRITE;
/*!40000 ALTER TABLE `behaviors` DISABLE KEYS */;
INSERT INTO `behaviors` VALUES (1,1,'Aggression Targeting'),(2,1,'Territorial'),(3,2,'Aggressive'),(4,2,'Pack Hunter'),(5,3,'Obedience Conditioned'),(6,3,'Aggression Targeting'),(7,4,'Non-Aggressive'),(8,4,'Foraging'),(9,5,'Task Focused'),(10,5,'Low Aggression'),(11,6,'Non-Aggressive'),(12,6,'Task Focused'),(13,7,'Territorial'),(14,7,'Alert Posture'),(15,8,'Hunting Focus'),(16,8,'Non-Aggressive to Handlers'),(17,9,'Task Focused'),(18,9,'Low Aggression'),(19,10,'Handler Bonded'),(20,10,'Aggressive on Command'),(21,11,'Route Focused'),(22,11,'Non-Aggressive'),(23,12,'Foraging'),(24,12,'Non-Aggressive'),(25,13,'Handler Bonded'),(26,13,'Non-Aggressive'),(27,14,'Calm Disposition'),(28,14,'Handler Bonded'),(29,15,'Territorial'),(30,15,'Alert Posture'),(31,16,'Handler Bonded'),(32,16,'Non-Aggressive'),(33,17,'Handler Bonded'),(34,17,'Aggression Targeting'),(35,18,'Task Focused'),(36,18,'Non-Aggressive'),(37,19,'Herding Instinct'),(38,19,'Non-Aggressive to Handlers'),(39,20,'Pack Hunter'),(40,20,'Aggressive'),(41,21,'Task Focused'),(42,21,'Low Aggression'),(43,22,'Handler Bonded'),(44,22,'Non-Aggressive'),(45,23,'Obedience Conditioned'),(46,23,'Aggression Targeting'),(47,24,'Task Focused'),(48,24,'Non-Aggressive'),(49,25,'Non-Aggressive'),(50,25,'Handler Bonded'),(51,26,'Aggression Targeting'),(52,26,'Territorial'),(53,27,'Foraging'),(54,27,'Non-Aggressive'),(55,28,'Calm Disposition'),(56,28,'Handler Bonded'),(57,29,'Territorial'),(58,29,'Alert Posture'),(59,30,'Aggressive'),(60,30,'Pack Hunter'),(61,31,'Herding Instinct'),(62,31,'Non-Aggressive'),(63,32,'Task Focused'),(64,32,'Non-Aggressive'),(65,33,'Handler Bonded'),(66,33,'Non-Aggressive'),(67,34,'Territorial'),(68,34,'Alert Posture'),(69,35,'Non-Aggressive'),(70,35,'Foraging'),(71,36,'Aggression Targeting'),(72,36,'Handler Bonded'),(73,37,'Task Focused'),(74,37,'Non-Aggressive'),(75,38,'Non-Aggressive'),(76,38,'Foraging'),(77,39,'Calm Disposition'),(78,39,'Handler Bonded'),(79,40,'Foraging'),(80,40,'Non-Aggressive'),(81,41,'Swarm Behavior'),(82,41,'Aggressive'),(83,42,'Task Focused'),(84,42,'Non-Aggressive'),(85,43,'Non-Aggressive'),(86,43,'Handler Bonded'),(87,44,'Aggression Targeting'),(88,44,'Handler Bonded'),(89,45,'Foraging'),(90,45,'Non-Aggressive'),(91,46,'Task Focused'),(92,46,'Non-Aggressive'),(93,47,'Non-Aggressive'),(94,47,'Handler Bonded'),(95,48,'Hunting Focus'),(96,48,'Non-Aggressive to Handlers'),(97,49,'Task Focused'),(98,49,'Non-Aggressive'),(99,50,'Aggressive'),(100,50,'Aggression Targeting'),(101,51,'Aggression Targeting'),(102,51,'Handler Bonded'),(103,52,'Territorial'),(104,52,'Handler Bonded'),(105,53,'Aggressive'),(106,53,'Territorial'),(107,54,'Aggression Targeting'),(108,54,'Handler Bonded'),(109,55,'Territorial'),(110,55,'Aggressive'),(111,56,'Handler Bonded'),(112,56,'Non-Aggressive'),(113,57,'Aggressive'),(114,57,'Territorial'),(115,58,'Handler Bonded'),(116,58,'Aggression Targeting'),(117,59,'Task Focused'),(118,59,'Handler Bonded');
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
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defensive_adaptations`
--

LOCK TABLES `defensive_adaptations` WRITE;
/*!40000 ALTER TABLE `defensive_adaptations` DISABLE KEYS */;
INSERT INTO `defensive_adaptations` VALUES (1,1,'Toxin Immunity',500,0),(2,1,'Rapid Clotting Tissue',500,0),(3,1,'Severe Cold Hide',500,0),(4,2,'Ballistic Hide',500,0),(5,2,'Regenerative Tissue',500,0),(6,2,'Thermal Resistance',500,0),(7,3,'Toxin Immunity',500,0),(8,3,'Rapid Clotting Tissue',500,0),(9,4,'Thick Hide',500,0),(10,5,'Pressure Resistant Shell',500,0),(11,5,'Impcat Dampening Hide',500,0),(12,6,'Heat Resistant Hide',500,0),(13,6,'Pressure Tolerance',500,0),(14,7,'Ballistic Hide',500,0),(15,7,'Toxin Immunity',500,0),(16,8,'Toxin Immunity',500,0),(17,9,'Impact Dampening Hide',500,0),(18,10,'Radar Absorbent Plumage',600,0),(19,10,'G-Force Tolerance',500,0),(20,11,'Wind Shear Resistance',400,0),(21,13,'Storm Resistance',400,0),(22,15,'G-Force Tolerance',500,0),(23,15,'Toxin Immunity',500,0),(24,16,'Heat Resistant Plumage',500,0),(25,16,'Smoke Filter Lungs',500,0),(26,17,'Radar Absorbent Plumage',600,0),(27,17,'Silent Flight Feathers',500,0),(28,18,'Electrostatic Insulation',500,0),(29,18,'Wind Shear Resistance',400,0),(30,19,'Storm Resistance',400,0),(31,20,'Ballistic Hide',500,0),(32,20,'Rapid Clotting Tissue',500,0),(33,20,'Toxin Immunity',500,0),(34,21,'Impact Dampening Hide',500,0),(35,21,'Pressure Resistant Frame',500,0),(36,22,'Toxin Immunity',500,0),(37,23,'Toxin Immunity',500,0),(38,23,'Rapid Clotting Tissue',500,0),(39,24,'Pressure Tolerance',500,0),(40,24,'Dust Filter Lungs',400,0),(41,26,'Toxin Immunity',500,0),(42,26,'Silent Movement Pads',400,0),(43,27,'Thick Hide',300,0),(44,29,'Ballistic Hide',500,0),(45,29,'Toxin Immunity',500,0),(46,30,'Pressure Tolerance',500,0),(47,30,'Toxin Immunity',500,0),(48,30,'Rapid Clotting Tissue',500,0),(49,32,'Pressure Tolerance',500,0),(50,32,'Cold Water Resistance',500,0),(51,33,'Pressure Tolerance',500,0),(52,34,'Toxin Immunity',500,0),(53,34,'Rapid Clotting Tissue',500,0),(54,35,'Toxin Immunity',500,0),(55,36,'Pressure Tolerance',500,0),(56,36,'Toxin Immunity',500,0),(57,37,'Pressure Tolerance',500,0),(58,37,'Impact Dampening Hide',500,0),(59,38,'Pressure Tolerance',500,0),(60,38,'Cold Water Resistance',500,0),(61,41,'Toxin Immunity',500,0),(62,41,'Rapid Clotting Tissue',500,0),(63,43,'Toxin Immunity',500,0),(64,44,'Active Camouflage',600,0),(65,44,'Toxin Immunity',500,0),(66,45,'Toxin Immunity',500,0),(67,46,'Pressure Tolerance',500,0),(68,47,'Active Camouflage',600,0),(69,48,'Toxin Immunity',500,0),(70,50,'Ballistic Hide',700,0),(71,50,'Rapid Clotting Tissue',700,0),(72,50,'Toxin Immunity',700,0),(73,50,'Neural Dampening Field',800,0),(74,51,'Active Camouflage',700,0),(75,51,'Toxin Immunity',700,0),(76,51,'Silent Movement',600,0),(77,52,'Ballistic Hide',700,0),(78,52,'Toxin Immunity',700,0),(79,52,'Rapid Clotting Tissue',700,0),(80,53,'Ballistic Hide',700,0),(81,53,'Toxin Immunity',700,0),(82,54,'Active Camouflage',700,0),(83,54,'Toxin Immunity',700,0),(84,54,'Rapid Clotting Tissue',700,0),(85,54,'Neural Dampening Field',800,0),(86,55,'Pressure Tolerance',700,0),(87,55,'Cold Water Resistance',700,0),(88,55,'Rapid Clotting Tissue',700,0),(89,56,'Toxin Immunity',700,0),(90,56,'Heat Resistant Hide',700,0),(91,56,'Pressure Tolerance',700,0),(92,56,'Rapid Clotting Tissue',700,0),(93,57,'Rapid Clotting Tissue',700,0),(94,57,'Ballistic Hide',700,0),(95,57,'Toxin Immunity',700,0),(96,58,'Active Camouflage',700,0),(97,58,'Toxin Immunity',700,0),(98,58,'Neural Dampening Field',800,0),(99,58,'Rapid Clotting Tissue',700,0),(100,59,'Radiation Resistant Hide',800,0),(101,59,'Pressure Tolerance',700,0),(102,59,'Cold Resistance',700,0),(103,59,'Toxin Immunity',700,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=82 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offensive_adaptations`
--

LOCK TABLES `offensive_adaptations` WRITE;
/*!40000 ALTER TABLE `offensive_adaptations` DISABLE KEYS */;
INSERT INTO `offensive_adaptations` VALUES (1,1,'Venom Glands',500,0),(2,1,'Razor bone spurs',500,0),(3,1,'Active Camouflage',500,0),(4,2,'Crushing Jaw',500,0),(5,2,'Bone Spike Launch',500,0),(6,2,'Venom Spit',500,0),(7,3,'Paralytic Venom',500,0),(8,3,'Razor Tail',500,0),(9,4,'Burrowing Claws',500,0),(10,5,'Excavation Claws',500,0),(11,6,'Seismic Stomp',500,0),(12,6,'Dimond Claw Tips',500,0),(13,7,'Concussive Tail Strike',500,0),(14,7,'Immobilizing Bite',500,0),(15,8,'Venom Glands',500,0),(16,8,'Constriction',500,0),(17,9,'Blade Crest',500,0),(18,9,'Tree Shear Jaw',500,0),(19,10,'Talon Strike',500,0),(20,10,'Dive Bomb Impact',500,0),(21,10,'Sonic Screech',500,0),(22,15,'Talon Strike',500,0),(23,15,'Dive Bomb Impact',500,0),(24,17,'Talon Strike',500,0),(25,17,'Blinding Flash Plumage',500,0),(26,19,'Sonic Screech',500,0),(27,19,'Dive Bomb Impact',500,0),(28,20,'Crushing Jaw',600,0),(29,20,'Bone Spike Charge',600,0),(30,20,'Paralytic Bite',600,0),(31,23,'Immobilizing Bite',500,0),(32,23,'Concussive Charge',500,0),(33,24,'Seismic Stomp',500,0),(34,24,'Excavation Claws',500,0),(35,26,'Paralytic Bite',500,0),(36,26,'Bone Claw Strike',500,0),(37,29,'Crushing Jaw',600,0),(38,29,'Concussive Charge',500,0),(39,30,'Hydro Jet Strike',600,0),(40,30,'Armor Piercing Beak',600,0),(41,30,'Paralytic Ink',500,0),(42,34,'Immobilizing Bite',500,0),(43,34,'Tail Slam',400,0),(44,36,'Paralytic Ink',500,0),(45,36,'Crushing Jaw',600,0),(46,36,'Hydro Jet Strike',600,0),(47,37,'Armor Piercing Beak',600,0),(48,41,'Venom Sting',500,0),(49,41,'Swarm Coordination',500,0),(50,41,'Corrosive Spray',500,0),(51,44,'Neurotoxin Sting',600,0),(52,44,'Corrosive Spray',500,0),(53,46,'Excavation Mandibles',400,0),(54,48,'Venom Sting',500,0),(55,48,'Crushing Mandibles',400,0),(56,50,'Bone Lance Charge',800,0),(57,50,'Paralytic Bite',700,0),(58,50,'Concussive Roar',700,0),(59,50,'Venom Glands',700,0),(60,51,'Neurotoxin Bite',800,0),(61,51,'Bone Claw Strike',700,0),(62,51,'Paralytic Glands',700,0),(63,52,'Immobilizing Bite',700,0),(64,52,'Concussive Charge',700,0),(65,53,'Concussive Roar',700,0),(66,53,'Bone Spike Launch',700,0),(67,53,'Paralytic Venom',700,0),(68,54,'Neurotoxin Bite',800,0),(69,54,'Corrosive Spray',700,0),(70,54,'Bone Claw Strike',700,0),(71,54,'Paralytic Glands',700,0),(72,55,'Hydro Jet Strike',800,0),(73,55,'Armor Piercing Beak',800,0),(74,55,'Crushing Jaw',700,0),(75,57,'Crushing Jaw',700,0),(76,57,'Bone Spike Charge',700,0),(77,57,'Concussive Roar',700,0),(78,57,'Razor Tail',700,0),(79,58,'Paralytic Bite',800,0),(80,58,'Neurotoxin Glands',800,0),(81,58,'Bone Claw Strike',700,0);
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
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organisms`
--

LOCK TABLES `organisms` WRITE;
/*!40000 ALTER TABLE `organisms` DISABLE KEYS */;
INSERT INTO `organisms` VALUES (1,'Phantom','REPTILIAN','CLASS_II',0),(2,'Ironclad','REPTILIAN','CLASS_III',0),(3,'Reaper','REPTILIAN','CLASS_II',0),(4,'Tillback','REPTILIAN','CLASS_I',0),(5,'Stoneback','REPTILIAN','CLASS_III',0),(6,'Delver','REPTILIAN','CLASS_II',0),(7,'Sentry','REPTILIAN','CLASS_II',0),(8,'Culler','REPTILIAN','CLASS_I',0),(9,'Razorback','REPTILIAN','CLASS_II',0),(10,'Spectre','AVIAN','CLASS_III',0),(11,'Swiftwing','AVIAN','CLASS_I',0),(12,'Seedsower','AVIAN','CLASS_I',0),(13,'Skywatcher','AVIAN','CLASS_II',0),(14,'Lensbird','AVIAN','CLASS_I',0),(15,'Harrier','AVIAN','CLASS_II',0),(16,'Ashwing','AVIAN','CLASS_II',0),(17,'Dusktalon','AVIAN','CLASS_II',0),(18,'Linker','AVIAN','CLASS_I',0),(19,'Rangewing','AVIAN','CLASS_II',0),(20,'Warfang','PRIMATE','CLASS_III',0),(21,'Boulderback','PRIMATE','CLASS_III',0),(22,'Bloodhound Prime','PRIMATE','CLASS_II',0),(23,'Lockjaw','PRIMATE','CLASS_II',0),(24,'Groundshaker','PRIMATE','CLASS_III',0),(25,'Calmpaw','PRIMATE','CLASS_I',0),(26,'Nightstalker','PRIMATE','CLASS_II',0),(27,'Plowhide','PRIMATE','CLASS_II',0),(28,'Showmane','PRIMATE','CLASS_II',0),(29,'Rampart','PRIMATE','CLASS_III',0),(30,'Abyssal','AQUATIC','CLASS_III',0),(31,'Netherider','AQUATIC','CLASS_II',0),(32,'Deepdiver','AQUATIC','CLASS_II',0),(33,'Tidepuller','AQUATIC','CLASS_II',0),(34,'Shallowbreach','AQUATIC','CLASS_II',0),(35,'Tidewatcher','AQUATIC','CLASS_I',0),(36,'Undertow','AQUATIC','CLASS_II',0),(37,'Wrecker','AQUATIC','CLASS_III',0),(38,'Pelagic','AQUATIC','CLASS_II',0),(39,'Wavecrown','AQUATIC','CLASS_I',0),(40,'Pollenspread','INSECTOID','CLASS_I',0),(41,'Swarmstrike','INSECTOID','CLASS_II',0),(42,'Weaveback','INSECTOID','CLASS_II',0),(43,'Larvaderm','INSECTOID','CLASS_I',0),(44,'Hollowsting','INSECTOID','CLASS_II',0),(45,'Decomposer','INSECTOID','CLASS_I',0),(46,'Tunnelweave','INSECTOID','CLASS_II',0),(47,'Mirroreye','INSECTOID','CLASS_I',0),(48,'Predathorax','INSECTOID','CLASS_II',0),(49,'Silkweaver','INSECTOID','CLASS_I',0),(50,'Godspear','APEX','CLASS_IV',0),(51,'Wraith','APEX','CLASS_IV',0),(52,'Sovereign','APEX','CLASS_IV',0),(53,'Dreadmaw','APEX','CLASS_IV',0),(54,'Oblivion','APEX','CLASS_IV',0),(55,'Leviathan','APEX','CLASS_IV',0),(56,'Colossus','APEX','CLASS_IV',0),(57,'Crimsonmaw','APEX','CLASS_IV',0),(58,'Specter Prime','APEX','CLASS_IV',0),(59,'Voidback','APEX','CLASS_IV',0);
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
) ENGINE=InnoDB AUTO_INCREMENT=179 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `standard_mods`
--

LOCK TABLES `standard_mods` WRITE;
/*!40000 ALTER TABLE `standard_mods` DISABLE KEYS */;
INSERT INTO `standard_mods` VALUES (1,1,'Pack Tactics'),(2,1,'Neural Compliance'),(3,1,'Infrared Vision'),(4,1,'Aggression tuning'),(5,1,'Enhanced Smell'),(6,2,'Target Lock'),(7,2,'Aggression Tuning'),(8,2,'Neural Compliance'),(9,3,'Enhanced Smell'),(10,3,'Infrared Vision'),(11,3,'Sprint Burst'),(12,4,'Docility Tuning'),(13,4,'Enhanced Smell'),(14,5,'Endurance Tuning'),(15,5,'Neural Compliance'),(16,6,'Low Light Vision'),(17,6,'Endurance Tuning'),(18,7,'Aggression Tuning'),(19,7,'Infrared Vision'),(20,7,'Enhanced Smell'),(21,8,'Burrow Instinct'),(22,8,'Enhanced Smell'),(23,9,'Endurance Tuning'),(24,9,'Docility Tuning'),(25,10,'Target Lock'),(26,10,'Infrared Vision'),(27,10,'Neural Compliance'),(28,11,'Navigation Imprint'),(29,11,'Endurance Tuning'),(30,11,'Weather Tolerance'),(31,12,'Docility Tuning'),(32,12,'Flock Coordination'),(33,12,'Navigation Imprint'),(34,13,'Infrared Vision'),(35,13,'Enhanced Sight'),(36,13,'Sonar Pulse'),(37,14,'Stabilized Flight'),(38,14,'Neural Compliance'),(39,14,'Enhanced Sight'),(40,15,'Infrared Vision'),(41,15,'Target Lock'),(42,16,'Infrared Vision'),(43,16,'Enhanced Sight'),(44,17,'Infrared Vision'),(45,17,'Neural Compliance'),(46,17,'Target Lock'),(47,18,'Enhanced Sight'),(48,18,'Navigation Imprint'),(49,18,'Endurance Tuning'),(50,19,'Flock Coordination'),(51,19,'Enhanced Sight'),(52,20,'Pack Tactics'),(53,20,'Aggression Tuning'),(54,20,'Neural Compliance'),(55,21,'Endurance Tuning'),(56,21,'Docility Tuning'),(57,21,'Neural Compliance'),(58,22,'Enhanced Smell'),(59,22,'Infrared Vision'),(60,22,'Cold Weather Adaptation'),(61,23,'Enhanced Smell'),(62,23,'Sprint Burst'),(63,23,'Neural Compliance'),(64,24,'Low Light Vision'),(65,24,'Endurance Tuning'),(66,25,'Docility Tuning'),(67,25,'Pheromone Calm Emission'),(68,25,'Neural Compliance'),(69,26,'Enhanced Smell'),(70,26,'Infrared Vision'),(71,26,'Neural Compliance'),(72,27,'Endurance Tuning'),(73,27,'Docility Tuning'),(74,27,'Flock Coordination'),(75,28,'Docility Tuning'),(76,28,'Pheromone Calm Emission'),(77,28,'Aggression Dampening'),(78,29,'Infrared Vision'),(79,29,'Enhanced Smell'),(80,29,'Aggression Tuning'),(81,30,'Sonar Pulse'),(82,30,'Target Lock'),(83,30,'Neural Compliance'),(84,31,'Sonar Pulse'),(85,31,'Flock Coordination'),(86,31,'Docility Tuning'),(87,32,'Sonar Pulse'),(88,32,'Enhanced Sight'),(89,32,'Endurance Tuning'),(90,33,'Sonar Pulse'),(91,33,'Enhanced Sight'),(92,33,'Sprint Burst'),(93,34,'Sonar Pulse'),(94,34,'Infrared Vision'),(95,35,'Enhanced Smell'),(96,35,'Sonar Pulse'),(97,35,'Navigation Imprint'),(98,36,'Sonar Pulse'),(99,36,'Neural Compliance'),(100,36,'Infrared Vision'),(101,37,'Sonar Pulse'),(102,37,'Endurance Tuning'),(103,38,'Sonar Pulse'),(104,38,'Enhanced Sight'),(105,38,'Navigation Imprint'),(106,39,'Docility Tuning'),(107,39,'Pheromone Calm Emission'),(108,39,'Aggression Dampening'),(109,40,'Flock Coordination'),(110,40,'Navigation Imprint'),(111,40,'Docility Tuning'),(112,41,'Pack Tactics'),(113,41,'Aggression Tuning'),(114,41,'Neural Compliance'),(115,42,'Flock Coordination'),(116,42,'Endurance Tuning'),(117,42,'Neural Compliance'),(118,43,'Docility Tuning'),(119,43,'Pheromone Calm Emission'),(120,44,'Neural Compliance'),(121,44,'Swarm Coordination'),(122,44,'Infrared Vision'),(123,45,'Enhanced Smell'),(124,45,'Endurance Tuning'),(125,45,'Flock Coordination'),(126,46,'Flock Coordination'),(127,46,'Low Light Vision'),(128,46,'Endurance Tuning'),(129,47,'Enhanced Sight'),(130,47,'Neural Compliance'),(131,47,'Flock Coordination'),(132,48,'Enhanced Smell'),(133,48,'Pack Tactics'),(134,49,'Docility Tuning'),(135,49,'Endurance Tuning'),(136,49,'Flock Coordination'),(137,50,'Target Lock'),(138,50,'Pack Tactics'),(139,50,'Aggression Tuning'),(140,50,'Neural Compliance'),(141,50,'Infrared Vision'),(142,51,'Infrared Vision'),(143,51,'Neural Compliance'),(144,51,'Enhanced Smell'),(145,51,'Pack Tactics'),(146,52,'Infrared Vision'),(147,52,'Enhanced Smell'),(148,52,'Aggression Tuning'),(149,52,'Neural Compliance'),(150,53,'Aggression Tuning'),(151,53,'Pack Tactics'),(152,53,'Neural Compliance'),(153,54,'Enhanced Smell'),(154,54,'Infrared Vision'),(155,54,'Neural Compliance'),(156,54,'Pack Tactics'),(157,54,'Target Lock'),(158,55,'Sonar Pulse'),(159,55,'Endurance Tuning'),(160,55,'Neural Compliance'),(161,55,'Target Lock'),(162,56,'Infrared Vision'),(163,56,'Enhanced Smell'),(164,56,'Sonar Pulse'),(165,56,'Endurance Tuning'),(166,56,'Neural Compliance'),(167,57,'Aggression Tuning'),(168,57,'Target Lock'),(169,57,'Endurance Tuning'),(170,58,'Infrared Vision'),(171,58,'Enhanced Smell'),(172,58,'Sonar Pulse'),(173,58,'Neural Compliance'),(174,58,'Target Lock'),(175,59,'Endurance Tuning'),(176,59,'Neural Compliance'),(177,59,'Navigation Imprint'),(178,59,'Enhanced Sight');
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

-- Dump completed on 2026-07-20 19:00:05

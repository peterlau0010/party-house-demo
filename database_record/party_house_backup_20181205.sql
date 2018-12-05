-- --------------------------------------------------------
-- Host:                         partyhouse.cdgl7si6ftwl.ap-southeast-1.rds.amazonaws.com
-- Server version:               10.1.34-MariaDB - MariaDB Server
-- Server OS:                    Linux
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for party_house
DROP DATABASE IF EXISTS `party_house`;
CREATE DATABASE IF NOT EXISTS `party_house` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `party_house`;

-- Dumping structure for table party_house.category
DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `category_chinese` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `category_english` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table party_house.category: 4 rows
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` (`category_id`, `category_chinese`, `category_english`) VALUES
	(1, '簡約', 'Simple'),
	(2, '婚禮', 'Wedding'),
	(3, '商務', 'Business'),
	(4, '卡通', 'Cartoon');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;

-- Dumping structure for table party_house.location
DROP TABLE IF EXISTS `location`;
CREATE TABLE IF NOT EXISTS `location` (
  `location_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `location_chinese` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location_english` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`location_id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table party_house.location: 18 rows
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` (`location_id`, `location_chinese`, `location_english`) VALUES
	(17, '油尖旺', 'Yau Tsim Mong'),
	(16, '黃大仙', 'Wong Tai Sin'),
	(15, '灣仔', 'Wan Chai'),
	(14, '屯門', 'Tuen Mun'),
	(13, '荃灣', 'Tsuen Wan'),
	(12, '大埔', 'Tai Po'),
	(11, '南區', 'Southern'),
	(10, '深水埗', 'Sham Shui Po'),
	(9, '沙田', 'Sha Tin'),
	(8, '西貢', 'Sai Kung'),
	(7, '北區', 'North'),
	(6, '觀塘', 'Kwun Tong'),
	(5, '葵青', 'Kwai Tsing'),
	(4, '九龍城', 'Kowloon City'),
	(1, '中西區', 'Central and Western'),
	(2, '東區', 'Eastern'),
	(3, '離島', 'Islands'),
	(18, '元朗', 'Yuen Long');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;

-- Dumping structure for table party_house.party_house
DROP TABLE IF EXISTS `party_house`;
CREATE TABLE IF NOT EXISTS `party_house` (
  `party_house_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address_chinese` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address_english` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `opening_hour` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `party_house_name_chinese` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `party_house_name_english` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `location_id` bigint(20) NOT NULL,
  PRIMARY KEY (`party_house_id`),
  KEY `FK5h2kca2ahfq786f5m77mlqwm9` (`location_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table party_house.party_house: 2 rows
/*!40000 ALTER TABLE `party_house` DISABLE KEYS */;
INSERT INTO `party_house` (`party_house_id`, `address_chinese`, `address_english`, `opening_hour`, `party_house_name_chinese`, `party_house_name_english`, `location_id`) VALUES
	(1, '青衣', 'Tsing Yi', '18:00~04:00', '青衣派對屋1', 'Tsing Yi Party House 1', 5),
	(2, '大窩口', 'Tai wo hau', '18:00~04:00', '大窩口派對屋1', 'Tai wo hau party house 1', 13);
/*!40000 ALTER TABLE `party_house` ENABLE KEYS */;

-- Dumping structure for table party_house.party_house_category
DROP TABLE IF EXISTS `party_house_category`;
CREATE TABLE IF NOT EXISTS `party_house_category` (
  `category_id` bigint(20) NOT NULL,
  `party_house_id` bigint(20) NOT NULL,
  KEY `FKb601ejchxilnxi9avtbl847xa` (`party_house_id`),
  KEY `FKl2iv9uuq4jf1l55axbrfkc6wa` (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- Dumping data for table party_house.party_house_category: 4 rows
/*!40000 ALTER TABLE `party_house_category` DISABLE KEYS */;
INSERT INTO `party_house_category` (`category_id`, `party_house_id`) VALUES
	(1, 1),
	(2, 1),
	(3, 2),
	(2, 2);
/*!40000 ALTER TABLE `party_house_category` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

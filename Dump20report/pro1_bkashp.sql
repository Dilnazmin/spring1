CREATE DATABASE  IF NOT EXISTS `pro1` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pro1`;

DROP TABLE IF EXISTS `bkash`;

CREATE TABLE `bkash` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `mobileno` varchar(45) DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cid`)
);

INSERT INTO `bkash` VALUES (12,'0178912345','1000'),(13,'019785487410','1000'),(14,'01789641258','7000'),(15,'01789456447','1000');

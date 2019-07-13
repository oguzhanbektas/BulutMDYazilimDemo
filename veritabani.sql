CREATE DATABASE IF NOT EXISTS `customer_shema`;

USE `customer_shema`;

CREATE TABLE `customer` (
 `id` int(11) NOT NULL AUTO_INCREMENT,
 `fullname` varchar(45) DEFAULT NULL,
 `tc` varchar(11) DEFAULT NULL,
 `address` varchar(50) DEFAULT NULL,
 `phone` varchar(11) DEFAULT NULL,
 `email` varchar(25) DEFAULT NULL,
 `date_of_birth` date DEFAULT NULL,
 `retail_trade` varchar(11) DEFAULT NULL,
 `lokumcu_baba_to_choose` varchar(500) DEFAULT NULL,
 `lokumcu_baba_location` varchar(40) DEFAULT NULL,
  `investment_amount` int(11) DEFAULT NULL,
  `want_to_add` varchar(500) DEFAULT NULL,
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=latin5;
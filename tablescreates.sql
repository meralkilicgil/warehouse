CREATE DATABASE  IF NOT EXISTS `warehouse_directory`;
USE `warehouse_directory`;

DROP TABLE IF EXISTS `warehouse`;
--
-- WareHouse
--

DROP TABLE IF EXISTS `warehouse`;

CREATE TABLE `warehouse` (
  `id` int NOT NULL AUTO_INCREMENT,
  `warehouse_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `warehouse` VALUES 
	(1,'Los Angeles'),
    (2,'California');
    
--
-- Inventory
--

DROP TABLE IF EXISTS `inventory`;

CREATE TABLE `inventory` (
  `id` int NOT NULL AUTO_INCREMENT,
  `quantity_available` int DEFAULT 0,
  `product_id` int NOT NULL,
  `warehouse_id` int NOT NULL,
  FOREIGN KEY (`product_id`) references product(id),
  FOREIGN KEY (`warehouse_id`) references warehouse(id),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `inventory` VALUES 
	(1,500,2,1),
    (2,3,1,1);

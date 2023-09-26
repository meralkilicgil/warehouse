CREATE DATABASE  IF NOT EXISTS `warehouse_directory`;
USE `warehouse_directory`;

--
-- Product
--

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) DEFAULT NULL,
  `price` int DEFAULT 0,
  `quantity` int DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `product` VALUES 
	(1,'Catnip',10, 200),
    (2,'Cat Toys',40, 500),
    (3,'Bed',100, 150);
	
    
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
  FOREIGN KEY (`product_id`) references product(id),
  FOREIGN KEY (`warehouse_id`) references warehouse(id),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


INSERT INTO `inventory` VALUES 
	(1,500,2,1),
    (2,3,1,1);

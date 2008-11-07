-- MySQL dump 10.10
--
-- Host: localhost    Database: sysguard
-- ------------------------------------------------------
-- Server version	5.0.18

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
-- Table structure for table `applog`
--

DROP TABLE IF EXISTS `applog`;
CREATE TABLE `applog` (
  `applog_id` bigint(20) NOT NULL auto_increment,
  `user_id` int(11) NOT NULL,
  `host_id` int(11) NOT NULL,
  `level` varchar(20) default NULL,
  `uptime` int(10) unsigned default NULL,
  `class_name` varchar(45) default NULL,
  `thread_name` varchar(45) default NULL,
  `log_time` datetime default NULL,
  `log_line` varchar(255) default NULL,
  `log_content` varchar(255) default NULL,
  `log_status` tinyint(3) unsigned NOT NULL default '0',
  `solve_time` datetime default NULL,
  `solve_result` varchar(255) default NULL,
  `solve_desc` varchar(255) default NULL,
  `input_time` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`applog_id`),
  KEY `host_id` (`host_id`),
  KEY `user_id` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

--
-- Dumping data for table `applog`
--


/*!40000 ALTER TABLE `applog` DISABLE KEYS */;
LOCK TABLES `applog` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `applog` ENABLE KEYS */;

--
-- Table structure for table `data_info`
--

DROP TABLE IF EXISTS `data_info`;
CREATE TABLE `data_info` (
  `host_id` int(11) NOT NULL,
  `type_id` int(10) unsigned NOT NULL,
  `value1` varchar(50) default NULL,
  `value2` varchar(50) default NULL,
  `value3` varchar(50) default NULL,
  `input_time` timestamp NOT NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`type_id`,`host_id`),
  KEY `idx_host_id` (`host_id`),
  KEY `idx_type_id` (`type_id`),
  CONSTRAINT `fk_host_id` FOREIGN KEY (`host_id`) REFERENCES `host` (`host_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_type_id` FOREIGN KEY (`type_id`) REFERENCES `data_info_type` (`type_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `data_info`
--


/*!40000 ALTER TABLE `data_info` DISABLE KEYS */;
LOCK TABLES `data_info` WRITE;
INSERT INTO `data_info` VALUES (1,1,'0',NULL,NULL,'2006-11-01 08:27:49'),(3,1,'3',NULL,NULL,'2006-11-01 08:27:48'),(1,2,'0',NULL,NULL,'2006-11-01 08:27:49'),(3,2,'1',NULL,NULL,'2006-11-01 08:27:48'),(1,3,'29',NULL,NULL,'2006-11-01 08:27:48'),(3,3,'57',NULL,NULL,'2006-11-01 08:27:47'),(1,5,'36',NULL,NULL,'2006-11-01 08:27:50'),(3,5,'10',NULL,NULL,'2006-11-01 08:27:48');
UNLOCK TABLES;
/*!40000 ALTER TABLE `data_info` ENABLE KEYS */;

--
-- Table structure for table `data_info_type`
--

DROP TABLE IF EXISTS `data_info_type`;
CREATE TABLE `data_info_type` (
  `type_id` int(10) unsigned NOT NULL,
  `type_name` varchar(20) NOT NULL,
  `warn_value` int(10) unsigned NOT NULL,
  `error_value` int(10) unsigned NOT NULL,
  `data_command` varchar(255) NOT NULL,
  `input_time` timestamp NOT NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `data_info_type`
--


/*!40000 ALTER TABLE `data_info_type` DISABLE KEYS */;
LOCK TABLES `data_info_type` WRITE;
INSERT INTO `data_info_type` VALUES (1,'cpu',1,1,'hello','2006-10-31 05:47:44'),(2,'load',1,1,'hello','2006-10-31 05:47:44'),(3,'mem',1,1,'hello','2006-10-31 05:47:44'),(4,'response',1,1,'hello','2006-10-31 05:47:44'),(5,'disk',1,1,'hello','2006-10-31 05:47:45');
UNLOCK TABLES;
/*!40000 ALTER TABLE `data_info_type` ENABLE KEYS */;

--
-- Table structure for table `host`
--

DROP TABLE IF EXISTS `host`;
CREATE TABLE `host` (
  `host_id` int(11) NOT NULL auto_increment,
  `group_id` int(11) NOT NULL,
  `host_name` varchar(255) NOT NULL,
  `host_ip` varchar(20) NOT NULL,
  `login_name` varchar(20) NOT NULL,
  `login_pwd` varchar(20) NOT NULL,
  `diskPartition` varchar(45) NOT NULL,
  `uptime` varchar(45) default NULL,
  `description` varchar(50) default NULL,
  `validate` tinyint(3) unsigned NOT NULL default '1',
  `input_time` datetime default NULL,
  `update_time` timestamp NULL default NULL,
  `rrd_status` tinyint(3) unsigned NOT NULL default '0',
  PRIMARY KEY  (`host_id`),
  KEY `idx_group_id` (`group_id`),
  CONSTRAINT `fk_group_id` FOREIGN KEY (`group_id`) REFERENCES `host_group` (`group_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `host`
--


/*!40000 ALTER TABLE `host` DISABLE KEYS */;
LOCK TABLES `host` WRITE;
INSERT INTO `host` VALUES (1,1,'112','10.5.1.112','root','livedoor','/var',NULL,'owe0wqe',0,'2006-10-31 13:52:40','2006-10-31 05:52:40',0),(3,1,'116','10.5.1.116','root','livedoor','/var',NULL,'werwq',0,'2006-10-31 16:53:50','2006-10-31 08:53:50',0);
UNLOCK TABLES;
/*!40000 ALTER TABLE `host` ENABLE KEYS */;

--
-- Table structure for table `host_group`
--

DROP TABLE IF EXISTS `host_group`;
CREATE TABLE `host_group` (
  `group_id` int(11) NOT NULL auto_increment,
  `os_id` int(11) NOT NULL,
  `group_name` varchar(20) NOT NULL,
  `description` varchar(255) default NULL,
  `input_time` timestamp NULL default NULL,
  PRIMARY KEY  (`group_id`),
  KEY `idx_os_id` (`os_id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

--
-- Dumping data for table `host_group`
--


/*!40000 ALTER TABLE `host_group` DISABLE KEYS */;
LOCK TABLES `host_group` WRITE;
INSERT INTO `host_group` VALUES (1,1,'monitor','wew','2006-10-31 05:50:18');
UNLOCK TABLES;
/*!40000 ALTER TABLE `host_group` ENABLE KEYS */;

--
-- Table structure for table `operation`
--

DROP TABLE IF EXISTS `operation`;
CREATE TABLE `operation` (
  `oper_id` int(11) NOT NULL auto_increment,
  `user_id` int(11) NOT NULL,
  `error_desp` text NOT NULL,
  `oper_content` text NOT NULL,
  `input_time` timestamp NOT NULL default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
  PRIMARY KEY  (`oper_id`),
  KEY `user_id` (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

--
-- Dumping data for table `operation`
--


/*!40000 ALTER TABLE `operation` DISABLE KEYS */;
LOCK TABLES `operation` WRITE;
INSERT INTO `operation` VALUES (1,1,'数据库死锁','AAA','2006-10-30 07:25:06'),(2,1,'系统无响应','BBBB','2006-10-30 07:26:00'),(3,1,'#￥%……*','ＷＥＯＲ','2006-10-30 07:26:55');
UNLOCK TABLES;
/*!40000 ALTER TABLE `operation` ENABLE KEYS */;

--
-- Table structure for table `os_type`
--

DROP TABLE IF EXISTS `os_type`;
CREATE TABLE `os_type` (
  `os_id` int(11) NOT NULL auto_increment,
  `os_name` varchar(20) NOT NULL,
  `description` varchar(255) default NULL,
  `input_time` timestamp NULL default NULL,
  PRIMARY KEY  (`os_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

--
-- Dumping data for table `os_type`
--


/*!40000 ALTER TABLE `os_type` DISABLE KEYS */;
LOCK TABLES `os_type` WRITE;
INSERT INTO `os_type` VALUES (1,'Linux',NULL,NULL),(19,'Windows',NULL,NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `os_type` ENABLE KEYS */;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `description` varchar(255) default NULL,
  `input_time` timestamp NULL default CURRENT_TIMESTAMP,
  PRIMARY KEY  (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

--
-- Dumping data for table `role`
--


/*!40000 ALTER TABLE `role` DISABLE KEYS */;
LOCK TABLES `role` WRITE;
INSERT INTO `role` VALUES (0,'role0',NULL,NULL),(1,'role1',NULL,NULL),(2,'role2',NULL,NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `role` ENABLE KEYS */;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` int(11) default NULL
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

--
-- Dumping data for table `test`
--


/*!40000 ALTER TABLE `test` DISABLE KEYS */;
LOCK TABLES `test` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `test` ENABLE KEYS */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL auto_increment,
  `role_id` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `real_name` varchar(20) NOT NULL,
  `passwd` varchar(20) NOT NULL,
  `mail` varchar(255) default NULL,
  `msn` varchar(255) default NULL,
  `skype` varchar(255) default NULL,
  `last_login_time` timestamp NULL default CURRENT_TIMESTAMP,
  `online` tinyint(3) unsigned default NULL,
  `validate` tinyint(3) unsigned NOT NULL default '1',
  `input_time` datetime default NULL,
  `update_time` timestamp NULL default NULL,
  PRIMARY KEY  (`user_id`),
  KEY `Index_2` (`role_id`)
) ENGINE=MyISAM DEFAULT CHARSET=gbk;

--
-- Dumping data for table `user`
--


/*!40000 ALTER TABLE `user` DISABLE KEYS */;
LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (1,0,'info','admin','livedoor','lds_sys@livedoor.cn','','','2006-11-01 06:34:04',0,0,'2006-10-25 00:00:00','2006-10-25 08:00:00'),(2,0,'sysguard','','livedoor','lds_sys@livedoor.cn','','','2006-10-30 07:15:44',0,0,'2006-10-30 15:15:44',NULL),(3,1,'CCCC','','cccccc','aa@livedoor.cn','','','2006-10-30 07:21:26',0,0,'2006-10-30 15:16:57',NULL),(5,0,'FFFF','','ffffff','ff@lieono.cnowa','','','2006-10-30 07:22:01',0,0,'2006-10-30 15:22:01',NULL),(6,0,'rty4','rtyrujytkuyli;oi;po\'','111111','4214@jweorj.cn','','','2006-11-01 03:32:11',0,0,'2006-11-01 11:32:11',NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;


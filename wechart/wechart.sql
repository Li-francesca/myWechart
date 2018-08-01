/*
Navicat MySQL Data Transfer

Source Server         : mysql57
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : wechart

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-08-01 17:45:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `blog_title` varchar(255) DEFAULT NULL,
  `blog_content` varchar(255) DEFAULT NULL,
  `blog_edit` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `blog_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('1', '1', 'Hello,My_Blog', '你好吗？我的第一篇博客sssssssssssssss！', '2018-06-12');
INSERT INTO `blog` VALUES ('2', '4', 'Hello,MyBlog', '你好吗？我的第一篇博客！', '2018-06-12');

-- ----------------------------
-- Table structure for friend
-- ----------------------------
DROP TABLE IF EXISTS `friend`;
CREATE TABLE `friend` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `blog_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `friend_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of friend
-- ----------------------------
INSERT INTO `friend` VALUES ('2', '1', '1');

-- ----------------------------
-- Table structure for likenum
-- ----------------------------
DROP TABLE IF EXISTS `likenum`;
CREATE TABLE `likenum` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `blog_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `blog_id` (`blog_id`),
  CONSTRAINT `blog_id` FOREIGN KEY (`blog_id`) REFERENCES `blog` (`id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of likenum
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) NOT NULL COMMENT '用户名称',
  `user_password` varchar(255) NOT NULL,
  `user_age` date DEFAULT NULL COMMENT '生日',
  `user_sex` char(1) DEFAULT NULL COMMENT '性别',
  `user_location` varchar(256) DEFAULT NULL COMMENT '地址',
  `user_pic` varchar(64) DEFAULT NULL COMMENT '图片',
  `user_haveLanguage` varchar(256) DEFAULT NULL COMMENT '掌握语言',
  `user_wantLanguage` varchar(256) DEFAULT NULL COMMENT 'want语言',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '123', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('2', '小名', '123321', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('3', '小名', '123321', null, null, null, null, null, null);
INSERT INTO `user` VALUES ('4', 'chifan', '8520', '2018-06-12', null, null, null, null, null);

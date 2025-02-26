/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80034 (8.0.34)
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80034 (8.0.34)
 File Encoding         : 65001

 Date: 23/02/2025 19:38:44
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_account
-- ----------------------------
DROP TABLE IF EXISTS `t_account`;
CREATE TABLE `t_account`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `money` decimal(10, 2) UNSIGNED NULL DEFAULT 0.00,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of t_account
-- ----------------------------
INSERT INTO `t_account` VALUES (1, '1001', 1000.00);

-- ----------------------------
-- Table structure for t_order
-- ----------------------------
DROP TABLE IF EXISTS `t_order`;
CREATE TABLE `t_order`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL,
  `count` int NULL DEFAULT 0,
  `money` decimal(10, 2) NULL DEFAULT 0.00,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of t_order
-- ----------------------------

-- ----------------------------
-- Table structure for t_storage
-- ----------------------------
DROP TABLE IF EXISTS `t_storage`;
CREATE TABLE `t_storage`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `count` int UNSIGNED NULL DEFAULT 0,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of t_storage
-- ----------------------------
INSERT INTO `t_storage` VALUES (1, 10, 100.00);

SET FOREIGN_KEY_CHECKS = 1;

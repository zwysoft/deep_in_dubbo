/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 100137
 Source Host           : localhost:3306
 Source Schema         : db_pay

 Target Server Type    : MySQL
 Target Server Version : 100137
 File Encoding         : 65001

 Date: 23/10/2020 13:17:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for p_user_amount
-- ----------------------------
DROP TABLE IF EXISTS `p_user_amount`;
CREATE TABLE `p_user_amount`  (
  `id` bigint(20) NOT NULL COMMENT '主键',
  `user_id` bigint(20) NULL DEFAULT NULL,
  `amount` decimal(10, 2) NULL DEFAULT NULL,
  `create_user_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_user_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_user_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_user_name` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `status` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of p_user_amount
-- ----------------------------
INSERT INTO `p_user_amount` VALUES (1, 1318522433099145218, 1200.00, NULL, NULL, NULL, NULL, NULL, NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;

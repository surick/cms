/*
 Navicat Premium Data Transfer

 Source Server         : tx
 Source Server Type    : MySQL
 Source Server Version : 50721
 Source Host           : 111.231.93.42:3306
 Source Schema         : cms

 Target Server Type    : MySQL
 Target Server Version : 50721
 File Encoding         : 65001

 Date: 29/11/2018 17:12:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_element
-- ----------------------------
DROP TABLE IF EXISTS `base_element`;
CREATE TABLE `base_element` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL DEFAULT '',
  `type` varchar(255) NOT NULL DEFAULT '',
  `element_name` varchar(255) NOT NULL DEFAULT '',
  `uri` varchar(255) NOT NULL DEFAULT '',
  `menu_id` int(11) NOT NULL DEFAULT '-1',
  `parent_id` int(11) NOT NULL DEFAULT '-1',
  `path` varchar(2000) NOT NULL DEFAULT '',
  `method` varchar(10) NOT NULL DEFAULT '',
  `description` varchar(255) NOT NULL DEFAULT '',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `udpd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT '',
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  `attr6` varchar(255) DEFAULT NULL,
  `attr7` varchar(255) DEFAULT NULL,
  `attr8` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of base_element
-- ----------------------------
BEGIN;
INSERT INTO `base_element` VALUES (5, 'SYS_USER_SAVE', 'button', '用户新增', '', 2, -1, '/sys/user/saveUser', 'POST', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (6, 'SYS_USER_REMOVE', 'button', '删除用户', '', 2, -1, '/sys/user/deleteUser', 'DELETE', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (7, 'SYS_USER_ROLE', 'button', '配置角色', '', 2, -1, 'sys/user/updateRoleUser', 'PUT', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (8, 'SYS_ROLE_SAVE', 'button', '角色新增', '', 3, -1, 'sys/role/updateRole', 'PUT', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (9, 'SYS_ROLE_REMOVR', 'button', '角色删除', '', 3, -1, 'sys/role/removeRole', 'DELETE', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (10, 'SYS_ROLE_AUTH', 'button', '配置权限', '', 3, -1, 'sys/role/updateAuthority/{id}', 'PUT', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (11, 'SYS_ROLE_UPDATE', 'button', '角色修改', '', 3, -1, 'sys/role/updateRole', 'PUT', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (12, 'SYS_USER_GET', 'uri', '用户显示', '', 2, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (13, 'SYS_ROLE_GET', 'uri', '角色显示', '', 3, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (14, 'SYS_USER_UPDATE', 'button', '用户编辑', '', 2, -1, '/sys/user/updateUser', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (15, 'SYS_INS_SALE', 'button', '经销商文件', '', 9, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (16, 'SYS_INS_MAKE', 'button', '生产商文件', '', 9, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (17, 'SYS_INS_OTHER', 'button', '其他文件', '', 9, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (18, 'SYS_INS_PAY', 'button', '设备销售', '', 7, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (19, 'SYS_INS_PASS', 'button', '设备审批', '', 8, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (21, 'SYS_INS_ADD', 'button', '设备新增', '', 7, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (22, 'SYS_INS_MOVE', 'button', '删除设备', '', 7, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (23, 'SYS_INS_TYPE', 'uri', '按钮权限', '', 10, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (24, 'SYS_INS_HOME', 'uri', '按钮权限', '', 11, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (25, 'SYS_INS_INFO', 'uri', '按钮权限', '', 12, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (26, 'SYS_INS_USERPRPDUCT', 'uri', '按钮权限', '', 13, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (27, 'SYS_INS_USERS', 'uri', '显示权限', '', 14, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (28, 'SYS_INS_MESSAGE', 'uri', '按钮权限', '', 15, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_element` VALUES (29, 'SYS_INS_MATERIAL', 'uri', '按钮权限', '', 16, -1, '', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for base_group
-- ----------------------------
DROP TABLE IF EXISTS `base_group`;
CREATE TABLE `base_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_name` varchar(255) NOT NULL DEFAULT '',
  `order_num` int(11) NOT NULL DEFAULT '0',
  `description` varchar(255) NOT NULL DEFAULT '',
  `enabled` int(1) NOT NULL DEFAULT '1',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for base_group_user
-- ----------------------------
DROP TABLE IF EXISTS `base_group_user`;
CREATE TABLE `base_group_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `group_id` int(11) NOT NULL DEFAULT '-1',
  `user_id` int(11) NOT NULL DEFAULT '-1',
  `description` varchar(255) NOT NULL DEFAULT '',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  `attr6` varchar(255) DEFAULT NULL,
  `attr7` varchar(255) DEFAULT NULL,
  `attr8` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for base_log
-- ----------------------------
DROP TABLE IF EXISTS `base_log`;
CREATE TABLE `base_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu` varchar(255) NOT NULL DEFAULT '',
  `opt` varchar(255) NOT NULL DEFAULT '' COMMENT '操作',
  `uri` varchar(255) NOT NULL DEFAULT '',
  `action_time` varchar(20) NOT NULL DEFAULT '',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for base_menu
-- ----------------------------
DROP TABLE IF EXISTS `base_menu`;
CREATE TABLE `base_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL DEFAULT '' COMMENT '路径编码',
  `title` varchar(255) NOT NULL DEFAULT '' COMMENT '标题',
  `parent_id` int(11) NOT NULL DEFAULT '-1' COMMENT '父级节点',
  `href` varchar(255) NOT NULL DEFAULT '' COMMENT '资源路径',
  `icon` varchar(255) NOT NULL DEFAULT '' COMMENT '图标',
  `type` char(10) NOT NULL DEFAULT '',
  `order_num` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `description` varchar(255) NOT NULL DEFAULT '' COMMENT '描述',
  `path` varchar(500) NOT NULL DEFAULT '' COMMENT '菜单上下级关系',
  `enabled` int(1) NOT NULL DEFAULT '1' COMMENT '启用禁用',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  `attr6` varchar(255) DEFAULT NULL,
  `attr7` varchar(255) DEFAULT NULL,
  `attr8` varchar(255) DEFAULT NULL,
  `element_id` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of base_menu
-- ----------------------------
BEGIN;
INSERT INTO `base_menu` VALUES (1, 'AUTH', '权限设置', -1, '', '', 'DICT', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (2, 'AUTH_USER', '用户管理', 1, '111', '', 'PAGE', 0, '', '111', 1, '', '', '', '', '1509679570298', '-1', '未知', '0:0:0:0:0:0:0:1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (3, 'AUTH_ROLE', '角色管理', 1, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (6, 'AUTH_NONE', '英索纳管理', -1, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (7, 'AUTH_PRODUCT', '设备列表', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (8, 'AUTH_SALEPRODUCT', '设备销售', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (9, 'AUTH_DOCUMENT', '文件服务', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (10, 'AUTH_TYPE', '设备类型', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (11, 'AUTH_HOME', '家庭背景', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (12, 'AUTH_INFO', '信息管理', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (13, 'AUTH_USERPRODUCT', '设备绑定', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (14, 'AUTH_USERS', '终端用户管理', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (15, 'AUTH_MESSAGE', '通知管理', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
INSERT INTO `base_menu` VALUES (16, 'AUTH_MATERIAL', '资料管理', 6, '', '', 'PAGE', 0, '', '', 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);
COMMIT;

-- ----------------------------
-- Table structure for base_role
-- ----------------------------
DROP TABLE IF EXISTS `base_role`;
CREATE TABLE `base_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) NOT NULL DEFAULT '',
  `role_code` varchar(255) NOT NULL DEFAULT '',
  `parent_id` int(11) NOT NULL DEFAULT '-1',
  `description` varchar(255) NOT NULL DEFAULT '',
  `order_num` int(11) NOT NULL DEFAULT '0',
  `enabled` int(1) NOT NULL DEFAULT '1',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of base_role
-- ----------------------------
BEGIN;
INSERT INTO `base_role` VALUES (1, '超级管理员', 'admin', -1, '超级管理员', 0, 1, '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role` VALUES (16, '管理员', '管理员', -1, '', 1, 1, '1511402332266', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role` VALUES (17, '生产商', '生产商', -1, '', 2, 1, '1511402472425', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role` VALUES (18, '经销商', '经销商', -1, '', 0, 1, '1511402739168', '1', 'admin', '127.0.0.1', '1511417412642', '1', 'admin', '127.0.0.1', NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for base_role_authority
-- ----------------------------
DROP TABLE IF EXISTS `base_role_authority`;
CREATE TABLE `base_role_authority` (
  `role_id` int(11) NOT NULL,
  `resource_id` int(11) NOT NULL,
  `resource_type` varchar(10) NOT NULL DEFAULT '' COMMENT 'button,uri',
  `description` varchar(255) NOT NULL DEFAULT '',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=456 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of base_role_authority
-- ----------------------------
BEGIN;
INSERT INTO `base_role_authority` VALUES (1, 1, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 7);
INSERT INTO `base_role_authority` VALUES (1, 1, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 8);
INSERT INTO `base_role_authority` VALUES (1, 15, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 179);
INSERT INTO `base_role_authority` VALUES (1, 16, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 180);
INSERT INTO `base_role_authority` VALUES (1, 17, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 181);
INSERT INTO `base_role_authority` VALUES (1, 2, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 216);
INSERT INTO `base_role_authority` VALUES (1, 3, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 217);
INSERT INTO `base_role_authority` VALUES (1, 18, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 235);
INSERT INTO `base_role_authority` VALUES (1, 19, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 236);
INSERT INTO `base_role_authority` VALUES (1, 20, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 237);
INSERT INTO `base_role_authority` VALUES (1, 21, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 238);
INSERT INTO `base_role_authority` VALUES (1, 22, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 239);
INSERT INTO `base_role_authority` VALUES (1, 10, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 265);
INSERT INTO `base_role_authority` VALUES (1, 11, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 266);
INSERT INTO `base_role_authority` VALUES (1, 12, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 267);
INSERT INTO `base_role_authority` VALUES (1, 13, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 268);
INSERT INTO `base_role_authority` VALUES (1, 14, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 269);
INSERT INTO `base_role_authority` VALUES (1, 15, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 270);
INSERT INTO `base_role_authority` VALUES (1, 16, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 271);
INSERT INTO `base_role_authority` VALUES (1, 9, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 272);
INSERT INTO `base_role_authority` VALUES (16, 2, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 342);
INSERT INTO `base_role_authority` VALUES (16, 1, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 343);
INSERT INTO `base_role_authority` VALUES (16, 5, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 344);
INSERT INTO `base_role_authority` VALUES (16, 6, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 345);
INSERT INTO `base_role_authority` VALUES (16, 7, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 346);
INSERT INTO `base_role_authority` VALUES (16, 12, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 347);
INSERT INTO `base_role_authority` VALUES (16, 3, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 348);
INSERT INTO `base_role_authority` VALUES (16, 8, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 349);
INSERT INTO `base_role_authority` VALUES (16, 9, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 350);
INSERT INTO `base_role_authority` VALUES (16, 10, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 351);
INSERT INTO `base_role_authority` VALUES (16, 11, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 352);
INSERT INTO `base_role_authority` VALUES (16, 13, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 353);
INSERT INTO `base_role_authority` VALUES (16, 7, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 354);
INSERT INTO `base_role_authority` VALUES (16, 6, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 355);
INSERT INTO `base_role_authority` VALUES (16, 18, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 356);
INSERT INTO `base_role_authority` VALUES (16, 21, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 357);
INSERT INTO `base_role_authority` VALUES (16, 22, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 358);
INSERT INTO `base_role_authority` VALUES (16, 9, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 359);
INSERT INTO `base_role_authority` VALUES (16, 15, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 360);
INSERT INTO `base_role_authority` VALUES (16, 16, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 361);
INSERT INTO `base_role_authority` VALUES (16, 17, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 362);
INSERT INTO `base_role_authority` VALUES (16, 10, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 363);
INSERT INTO `base_role_authority` VALUES (16, 23, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 364);
INSERT INTO `base_role_authority` VALUES (16, 11, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 365);
INSERT INTO `base_role_authority` VALUES (16, 24, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 366);
INSERT INTO `base_role_authority` VALUES (16, 12, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 367);
INSERT INTO `base_role_authority` VALUES (16, 25, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 368);
INSERT INTO `base_role_authority` VALUES (16, 13, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 369);
INSERT INTO `base_role_authority` VALUES (16, 26, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 370);
INSERT INTO `base_role_authority` VALUES (16, 14, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 371);
INSERT INTO `base_role_authority` VALUES (16, 27, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 372);
INSERT INTO `base_role_authority` VALUES (16, 15, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 373);
INSERT INTO `base_role_authority` VALUES (16, 28, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 374);
INSERT INTO `base_role_authority` VALUES (16, 16, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 375);
INSERT INTO `base_role_authority` VALUES (16, 29, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 376);
INSERT INTO `base_role_authority` VALUES (17, 2, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 377);
INSERT INTO `base_role_authority` VALUES (17, 1, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 378);
INSERT INTO `base_role_authority` VALUES (17, 5, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 379);
INSERT INTO `base_role_authority` VALUES (17, 6, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 380);
INSERT INTO `base_role_authority` VALUES (17, 12, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 381);
INSERT INTO `base_role_authority` VALUES (17, 14, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 382);
INSERT INTO `base_role_authority` VALUES (17, 7, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 383);
INSERT INTO `base_role_authority` VALUES (17, 6, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 384);
INSERT INTO `base_role_authority` VALUES (17, 18, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 385);
INSERT INTO `base_role_authority` VALUES (17, 21, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 386);
INSERT INTO `base_role_authority` VALUES (17, 22, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 387);
INSERT INTO `base_role_authority` VALUES (17, 9, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 388);
INSERT INTO `base_role_authority` VALUES (17, 16, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 389);
INSERT INTO `base_role_authority` VALUES (17, 10, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 390);
INSERT INTO `base_role_authority` VALUES (17, 23, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 391);
INSERT INTO `base_role_authority` VALUES (17, 13, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 392);
INSERT INTO `base_role_authority` VALUES (17, 26, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 393);
INSERT INTO `base_role_authority` VALUES (18, 8, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 427);
INSERT INTO `base_role_authority` VALUES (18, 6, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 428);
INSERT INTO `base_role_authority` VALUES (18, 19, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 429);
INSERT INTO `base_role_authority` VALUES (18, 10, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 430);
INSERT INTO `base_role_authority` VALUES (18, 23, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 431);
INSERT INTO `base_role_authority` VALUES (18, 13, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 432);
INSERT INTO `base_role_authority` VALUES (18, 26, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 433);
INSERT INTO `base_role_authority` VALUES (18, 14, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 434);
INSERT INTO `base_role_authority` VALUES (18, 27, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 435);
INSERT INTO `base_role_authority` VALUES (1, 9, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 436);
INSERT INTO `base_role_authority` VALUES (1, 10, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 437);
INSERT INTO `base_role_authority` VALUES (1, 11, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 438);
INSERT INTO `base_role_authority` VALUES (1, 12, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 439);
INSERT INTO `base_role_authority` VALUES (1, 13, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 440);
INSERT INTO `base_role_authority` VALUES (1, 14, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 441);
INSERT INTO `base_role_authority` VALUES (1, 15, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 442);
INSERT INTO `base_role_authority` VALUES (1, 16, 'MENU', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 443);
INSERT INTO `base_role_authority` VALUES (1, 17, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 444);
INSERT INTO `base_role_authority` VALUES (1, 18, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 445);
INSERT INTO `base_role_authority` VALUES (1, 19, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 446);
INSERT INTO `base_role_authority` VALUES (1, 20, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 447);
INSERT INTO `base_role_authority` VALUES (1, 21, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 448);
INSERT INTO `base_role_authority` VALUES (1, 23, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 449);
INSERT INTO `base_role_authority` VALUES (1, 24, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 450);
INSERT INTO `base_role_authority` VALUES (1, 25, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 451);
INSERT INTO `base_role_authority` VALUES (1, 26, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 452);
INSERT INTO `base_role_authority` VALUES (1, 27, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 453);
INSERT INTO `base_role_authority` VALUES (1, 28, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 454);
INSERT INTO `base_role_authority` VALUES (1, 29, 'ELEMENT', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, 455);
COMMIT;

-- ----------------------------
-- Table structure for base_role_user
-- ----------------------------
DROP TABLE IF EXISTS `base_role_user`;
CREATE TABLE `base_role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL DEFAULT '-1',
  `role_id` int(11) NOT NULL DEFAULT '-1',
  `description` varchar(255) NOT NULL DEFAULT '',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT NULL,
  `attr2` varchar(255) DEFAULT NULL,
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of base_role_user
-- ----------------------------
BEGIN;
INSERT INTO `base_role_user` VALUES (5, 1, 1, '超级管理员', '1509419063349', '-1', '未知', '0:0:0:0:0:0:0:1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (26, 39, 18, '', '1511420969768', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (75, 36, 16, '', '1515392493066', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (76, 37, 17, '', '1515392601345', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (77, 38, 18, '', '1515392662846', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (78, 44, 18, '', '1515392843069', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (79, 45, 18, '', '1515392873771', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (80, 46, 18, '', '1515392963650', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (82, 47, 18, '', '1515394078925', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `base_role_user` VALUES (84, 48, 18, '', '1515400986862', '1', 'admin', '127.0.0.1', '', '', '', '', NULL, NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for base_user
-- ----------------------------
DROP TABLE IF EXISTS `base_user`;
CREATE TABLE `base_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) NOT NULL DEFAULT '',
  `password` varchar(255) NOT NULL DEFAULT '',
  `salt` varchar(40) NOT NULL DEFAULT '',
  `name` varchar(255) NOT NULL DEFAULT '',
  `birthday` varchar(255) NOT NULL DEFAULT '',
  `address` varchar(255) NOT NULL DEFAULT '',
  `mobile_phone` varchar(255) NOT NULL DEFAULT '',
  `email` varchar(255) NOT NULL DEFAULT '',
  `sex` int(1) NOT NULL DEFAULT '0',
  `status` int(1) NOT NULL DEFAULT '0',
  `head_img_url` varchar(255) NOT NULL DEFAULT '',
  `description` varchar(255) NOT NULL DEFAULT '',
  `crt_time` varchar(20) NOT NULL DEFAULT '',
  `crt_user` varchar(255) NOT NULL DEFAULT '',
  `crt_name` varchar(255) NOT NULL DEFAULT '',
  `crt_host` varchar(255) NOT NULL DEFAULT '',
  `upd_time` varchar(20) NOT NULL DEFAULT '',
  `upd_user` varchar(255) NOT NULL DEFAULT '',
  `upd_name` varchar(255) NOT NULL DEFAULT '',
  `upd_host` varchar(255) NOT NULL DEFAULT '',
  `attr1` varchar(255) DEFAULT '',
  `attr2` varchar(255) DEFAULT '',
  `attr3` varchar(255) DEFAULT NULL,
  `attr4` varchar(255) DEFAULT NULL,
  `attr5` varchar(255) DEFAULT NULL,
  `attr6` varchar(255) DEFAULT NULL,
  `attr7` varchar(255) DEFAULT NULL,
  `attr8` varchar(255) DEFAULT NULL,
  `attr9` varchar(255) DEFAULT NULL,
  `attr10` varchar(255) DEFAULT NULL,
  `isDelete` int(1) NOT NULL DEFAULT '0',
  `label` varchar(255) NOT NULL DEFAULT '',
  `isFirst` tinyint(1) NOT NULL DEFAULT '0',
  `type` varchar(255) NOT NULL DEFAULT '',
  `qq` varchar(255) DEFAULT '',
  `wechat` varchar(255) NOT NULL DEFAULT '',
  `phone` varchar(255) NOT NULL DEFAULT '',
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of base_user
-- ----------------------------
BEGIN;
INSERT INTO `base_user` VALUES (1, 'admin', '5b9537449135000e635c26439322c343', '3616aaed319138a2415c1d78844aea32', 'admin', '', '', '', '', 0, 0, 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=3448484253,3685836170&fm=27&gp=0.jpg', '', '', '', '', '', '', '', '', '', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '0', 1, '', '', '', '', NULL);
INSERT INTO `base_user` VALUES (36, 'a123456', '5b9537449135000e635c26439322c343', '3616aaed319138a2415c1d78844aea32', '用户A', '2017-11-08', '测试地址A', '13145030711', '962615727@qq.com', 1, 1, '', '', '1511402175025', '1', 'admin', '127.0.0.1', '1515392490648', '1', 'admin', '127.0.0.1', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '001', 0, '管理员', '123456789', 'wechat', 'wechat', 1);
INSERT INTO `base_user` VALUES (37, 'b123456', '82b37a7bf9367ed76959462134a4d7d4', 'fe8ce3d06286497fbaf1449c93f74425', '用户B', '2017-11-03', '测试地址B', '13145030711', '962615727@qq.com', 1, 1, '', '', '1511402791655', '1', 'admin', '127.0.0.1', '1515400050773', '1', 'admin', '127.0.0.1', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '0010001', 0, '生产商', '1', '1', '1', 36);
INSERT INTO `base_user` VALUES (38, 'c123456', '848f81df85831156eb16b0554714b292', '64ad313a5a914bd9abf7082143a16195', '用户C', '2017-11-02', '测试地址C', '13145030711', '962615727@qq.com', 1, 1, '', '', '1511402830357', '1', 'admin', '127.0.0.1', '1515392662824', '1', 'admin', '127.0.0.1', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '00100010001', 1, '经销商', '', '', '', 36);
INSERT INTO `base_user` VALUES (44, 'd123456', '5b9537449135000e635c26439322c343', '3616aaed319138a2415c1d78844aea32', '用户D', '2017-11-04', '测试地址D', '13145030711', '9626@qq.com', 1, 1, '', '', '1511423927112', '36', 'a123456', '127.0.0.1', '1515392843009', '1', 'admin', '127.0.0.1', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '00100010001', 1, '经销商', '', '', '', 37);
INSERT INTO `base_user` VALUES (45, 'e123456', '5b9537449135000e635c26439322c343', '3616aaed319138a2415c1d78844aea32', '用户E', '2017-11-16', '测试地址E', '13145030711', '146@qq.com', 1, 1, '', '', '1511424063080', '36', 'a123456', '127.0.0.1', '1515392873748', '1', 'admin', '127.0.0.1', '', '', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0, '00100010001', 0, '经销商', '', '', '', 37);
COMMIT;

-- ----------------------------
-- Table structure for cms_about
-- ----------------------------
DROP TABLE IF EXISTS `cms_about`;
CREATE TABLE `cms_about` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `title` varchar(30) DEFAULT NULL COMMENT '标题',
  `content` varchar(2000) DEFAULT NULL COMMENT '内容',
  `cn_title` varchar(30) DEFAULT NULL COMMENT '标题cn',
  `cn_content` varchar(2000) DEFAULT NULL COMMENT '内容cn',
  `type` int(2) NOT NULL COMMENT ' 1:company profile 2:culture 3:honors 4:technology',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for cms_child_type
-- ----------------------------
DROP TABLE IF EXISTS `cms_child_type`;
CREATE TABLE `cms_child_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `parent_id` int(11) NOT NULL COMMENT '父类别id，关联父类别表',
  `child_name` varchar(30) DEFAULT NULL COMMENT '子类别名',
  `deleted` smallint(2) DEFAULT '0' COMMENT '是否删除',
  `cn_child_name` varchar(30) DEFAULT NULL COMMENT 'cn子类别名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of cms_child_type
-- ----------------------------
BEGIN;
INSERT INTO `cms_child_type` VALUES (1, 1, 'testChild2', 0, NULL);
COMMIT;

-- ----------------------------
-- Table structure for cms_contact
-- ----------------------------
DROP TABLE IF EXISTS `cms_contact`;
CREATE TABLE `cms_contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `content` varchar(2000) DEFAULT NULL COMMENT '内容',
  `cn_content` varchar(2000) DEFAULT NULL COMMENT 'cn内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for cms_feedback
-- ----------------------------
DROP TABLE IF EXISTS `cms_feedback`;
CREATE TABLE `cms_feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `title` varchar(30) DEFAULT NULL COMMENT '标题',
  `contact` varchar(30) DEFAULT NULL COMMENT '联系方式',
  `company_name` varchar(30) DEFAULT NULL COMMENT '公司名',
  `content` varchar(500) DEFAULT NULL COMMENT '内容',
  `area` varchar(20) DEFAULT NULL COMMENT '区域',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for cms_parent_type
-- ----------------------------
DROP TABLE IF EXISTS `cms_parent_type`;
CREATE TABLE `cms_parent_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `parent_name` varchar(20) DEFAULT NULL COMMENT '父类别名',
  `deleted` smallint(2) DEFAULT '0' COMMENT '是否删除',
  `cn_parent_name` varchar(20) DEFAULT NULL COMMENT 'cn父类别名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of cms_parent_type
-- ----------------------------
BEGIN;
INSERT INTO `cms_parent_type` VALUES (1, 'test2', 0, '哈哈');
INSERT INTO `cms_parent_type` VALUES (2, 'test', 0, '测试');
INSERT INTO `cms_parent_type` VALUES (3, 'test', 0, '测试');
INSERT INTO `cms_parent_type` VALUES (4, '123', 1, 'cncnccncnncnc');
INSERT INTO `cms_parent_type` VALUES (5, 'sjsjsj', 0, '中文中文');
INSERT INTO `cms_parent_type` VALUES (6, 'enenenenn', 0, '中文中文中文');
COMMIT;

-- ----------------------------
-- Table structure for cms_products
-- ----------------------------
DROP TABLE IF EXISTS `cms_products`;
CREATE TABLE `cms_products` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增',
  `name` varchar(30) DEFAULT NULL COMMENT '产品名',
  `child_type_id` int(11) DEFAULT NULL COMMENT '子类别id，关联子类别表',
  `img_url` varchar(200) DEFAULT NULL COMMENT '图片路径',
  `content` varchar(500) DEFAULT NULL COMMENT '内容',
  `deleted` smallint(2) DEFAULT '0' COMMENT '是否删除',
  `cn_name` varchar(30) DEFAULT NULL COMMENT 'cn产品名',
  `cn_content` varchar(500) DEFAULT NULL COMMENT 'cn内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of cms_products
-- ----------------------------
BEGIN;
INSERT INTO `cms_products` VALUES (1, 'test', 1, '/Users/jin/Downloads/static/uploads/products/3a86f18e-46ae-476d-ae01-50d1729a8ca2机器人.jpg.jpg', 'sssss', 0, NULL, NULL);
INSERT INTO `cms_products` VALUES (2, 'test', 1, '/Users/jin/Downloads/static/uploads/products/e952ce39-45aa-4228-bda5-473f956558b3.jpg', 'sssss', 0, NULL, NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;

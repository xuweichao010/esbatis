/*Navicat MySQL Data TransferSource Server         : 00_本地Source Server Version : 50722Source Host           : 127.0.0.1:3306Source Database       : testTarget Server Type    : MYSQLTarget Server Version : 50722File Encoding         : 65001Date: 2019-09-09 15:11:33*/SET FOREIGN_KEY_CHECKS=0;-- ------------------------------ Table structure for t_org-- ----------------------------DROP TABLE IF EXISTS `t_org`;CREATE TABLE `t_org` (	`code` varchar(32) NOT NULL COMMENT '机构编码',	`name` varchar(32) DEFAULT NULL COMMENT '机构名称',	`parent_code` varchar(32) DEFAULT NULL COMMENT '上级机构编码',	`parent_name` varchar(32) DEFAULT NULL COMMENT '上级机构名称',	`address` varchar(32) DEFAULT NULL COMMENT '机构地址',	PRIMARY KEY (`code`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='组织表';-- ------------------------------ Records of t_org-- ----------------------------INSERT INTO `t_org` VALUES ('200', '总公司', '', 'EasyBatis', '中国区域');INSERT INTO `t_org` VALUES ('200001', '北京分公司', '200', '总公司', '北京');INSERT INTO `t_org` VALUES ('200002', '上海分公司', '200', '总公司', '上海');INSERT INTO `t_org` VALUES ('200003', '广州分公司', '200', '总公司', '广州');INSERT INTO `t_org` VALUES ('200004', '武汉分公司', '200', '总公司', '武汉');INSERT INTO `t_org` VALUES ('200004001', '事业部', '200004', '武汉分公司', '武汉');INSERT INTO `t_org` VALUES ('200004002', '研发部', '200004', '武汉分公司', '武汉');INSERT INTO `t_org` VALUES ('200004003', '售后部', '200004', '武汉分公司', '武汉');INSERT INTO `t_org` VALUES ('200004004', '商务部', '200004', '武汉分公司', '武汉');INSERT INTO `t_org` VALUES ('200005', '武汉二公司', '200', '总公司', '武汉江汉区');INSERT INTO `t_org` VALUES ('200006', '武汉三公司', '200', '总公司', '武汉江汉区');INSERT INTO `t_org` VALUES ('200007', '武汉四公司', '200', '总公司', '武汉江汉区');-- ------------------------------ Table structure for t_user-- ----------------------------DROP TABLE IF EXISTS `t_user`;CREATE TABLE `t_user` (	`id` varchar(32) NOT NULL COMMENT '用户ID',	`org_code` varchar(32) DEFAULT NULL COMMENT '机构编码',	`org_name` varchar(32) DEFAULT NULL COMMENT '机构名称',	`name` varchar(32) DEFAULT NULL COMMENT '用户名',	`age` int(3) DEFAULT NULL COMMENT '用户年龄',	`job` int(1) DEFAULT NULL COMMENT '职位 1-总监 2-经理 1-主管 3-销售 4-行政 5-技术员 6-财务',	`valid` int(1) DEFAULT NULL COMMENT '是否有效 0:有效  1:无效',	`create_time` date DEFAULT NULL COMMENT '创建时间',	`create_id` varchar(32) DEFAULT NULL COMMENT '创建用户ID',	`create_name` varchar(32) DEFAULT NULL COMMENT '创建用户名',	`update_time` date DEFAULT NULL COMMENT '创建时间',	`update_id` varchar(32) DEFAULT NULL COMMENT '更新用户ID',	`update_name` varchar(32) DEFAULT NULL COMMENT '更新用户名',	PRIMARY KEY (`id`)) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';-- ------------------------------ Records of t_user-- ----------------------------INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8a001', '200', '总公司', '曹操', '50', '1', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8a002', '200', '总公司', '小乔', '25', '4', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8a003', '200', '总公司', '曹植', '27', '2', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8a004', '200', '总公司', '吕布', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8a005', '200', '总公司', '荀攸', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b001', '200001', '北京分公司', '杨修', '45', '2', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b002', '200001', '北京分公司', '陈琳', '25', '4', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b003', '200001', '北京分公司', '毛玠', '27', '2', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b004', '200001', '北京分公司', '桓玠', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b005', '200001', '北京分公司', '郗虑', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b006', '200001', '北京分公司', '郭嘉', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b007', '200001', '北京分公司', '司马朗', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b008', '200001', '北京分公司', '韩暨', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b009', '200001', '北京分公司', '韦康', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db744aac8dee8b010', '200001', '北京分公司', '邴原', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db745aac8dee8b001', '200001', '北京分公司', '赵俨', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db745aac8dee8b002', '200001', '北京分公司', '娄圭', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('37bd0225cc94400db745aac8dee8b003', '200001', '北京分公司', '蒯越', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b001', '200002', '上海分公司', '诸葛亮', '45', '2', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b002', '200002', '上海分公司', '糜芳', '25', '4', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b003', '200002', '上海分公司', '庞统', '27', '2', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b004', '200002', '上海分公司', '法正', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b005', '200002', '上海分公司', '许靖', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b006', '200002', '上海分公司', '马良', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b007', '200002', '上海分公司', '关羽', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b008', '200002', '上海分公司', '张飞', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b009', '200002', '上海分公司', '马超', '30', '5', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db744aac8dee8b010', '200002', '上海分公司', '魏延', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db745aac8dee8b001', '200002', '上海分公司', '关平', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db745aac8dee8b002', '200002', '上海分公司', '周仓', '30', '3', '1', null, null, null, null, null, null);INSERT INTO `t_user` VALUES ('47bd0225cc94400db745aac8dee8b003', '200002', '上海分公司', '李严', '30', '3', '1', null, null, null, null, null, null);
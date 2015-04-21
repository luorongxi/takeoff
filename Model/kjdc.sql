# MySQL-Front 5.1  (Build 4.13)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;


# Host: localhost    Database: kjdc
# ------------------------------------------------------
# Server version 5.5.38

#
# Source for table gw_sysmenu
#

DROP TABLE IF EXISTS `gw_sysmenu`;
CREATE TABLE `gw_sysmenu` (
  `id` varchar(64) NOT NULL DEFAULT '' COMMENT '主键id',
  `pId` varchar(64) NOT NULL COMMENT '父id',
  `name` varchar(127) NOT NULL COMMENT '菜单名',
  `url` varchar(255) NOT NULL COMMENT '链接路径',
  `target` varchar(127) NOT NULL COMMENT '打开方式',
  `rel` varchar(127) NOT NULL COMMENT '刷新路径',
  `open` varchar(8) NOT NULL DEFAULT '' COMMENT '是否展开(true:是,false:否)',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '状态(0:可用,1:不可用)',
  `creater` varchar(127) NOT NULL COMMENT '创建人',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统菜单树';

#
# Dumping data for table gw_sysmenu
#

LOCK TABLES `gw_sysmenu` WRITE;
/*!40000 ALTER TABLE `gw_sysmenu` DISABLE KEYS */;
/*!40000 ALTER TABLE `gw_sysmenu` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_attentions
#

DROP TABLE IF EXISTS `tb_attentions`;
CREATE TABLE `tb_attentions` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `guestId` int(11) NOT NULL COMMENT '客户id',
  `toId` int(11) NOT NULL COMMENT '菜品或套餐或店铺id',
  `type` tinyint(1) NOT NULL COMMENT '类型(0:收藏菜品,1:关注店铺)',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户关注收藏表';

#
# Dumping data for table tb_attentions
#

LOCK TABLES `tb_attentions` WRITE;
/*!40000 ALTER TABLE `tb_attentions` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_attentions` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_canteens
#

DROP TABLE IF EXISTS `tb_canteens`;
CREATE TABLE `tb_canteens` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `loginName` varchar(36) NOT NULL COMMENT '账号',
  `loginPwd` varchar(36) NOT NULL COMMENT '密码',
  `name` varchar(128) NOT NULL COMMENT '商家名称',
  `picPath` varchar(128) NOT NULL COMMENT '头像地址',
  `address` varchar(128) NOT NULL COMMENT '联系地址',
  `locationX` float NOT NULL COMMENT '经度',
  `locationY` float NOT NULL COMMENT '纬度',
  `introduction` varchar(512) NOT NULL COMMENT '简介',
  `description` longtext NOT NULL COMMENT '描述信息，可用附文本',
  `inschoolId` int(11) NOT NULL COMMENT '所属学校ID',
  `phone` varchar(20) NOT NULL COMMENT '手机号码',
  `linkManName` varchar(64) NOT NULL COMMENT '联系人',
  `score` tinyint(3) NOT NULL DEFAULT '80' COMMENT '评分(0-100分)',
  `goodNum` int(11) NOT NULL DEFAULT '0' COMMENT '点赞数',
  `badNum` int(11) NOT NULL DEFAULT '0' COMMENT '踩数',
  `clickCount` int(11) NOT NULL COMMENT '点击数',
  `status` tinyint(1) NOT NULL DEFAULT '0' COMMENT '状态(0:停用,1:启用,2:待审核,3:审核退回)',
  `addTime` datetime DEFAULT NULL COMMENT '创建时间',
  `checkInfo` varchar(1024) DEFAULT NULL COMMENT '审核说明',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家信息表';

#
# Dumping data for table tb_canteens
#

LOCK TABLES `tb_canteens` WRITE;
/*!40000 ALTER TABLE `tb_canteens` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_canteens` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_city_info
#

DROP TABLE IF EXISTS `tb_city_info`;
CREATE TABLE `tb_city_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `provinceId` int(11) NOT NULL COMMENT '省份id',
  `cityName` varchar(128) NOT NULL COMMENT '城市名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='城市信息表';

#
# Dumping data for table tb_city_info
#

LOCK TABLES `tb_city_info` WRITE;
/*!40000 ALTER TABLE `tb_city_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_city_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_comments
#

DROP TABLE IF EXISTS `tb_comments`;
CREATE TABLE `tb_comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `dishOrMealId` int(4) NOT NULL COMMENT '菜品或套餐，对商家的评论则为-1',
  `type` tinyint(1) NOT NULL DEFAULT '0' COMMENT '类别(0: 对菜品,1:对套餐,2: 对商家)',
  `guestId` int(11) NOT NULL COMMENT '评论人id',
  `score` tinyint(3) NOT NULL COMMENT '评分(0-100分)',
  `emotion` tinyint(1) NOT NULL COMMENT '表情',
  `title` varchar(128) NOT NULL COMMENT '评论标题',
  `contents` varchar(1024) NOT NULL COMMENT '评论内容',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用)',
  `isGood` int(11) DEFAULT NULL COMMENT '点赞',
  `isBad` int(11) DEFAULT NULL COMMENT '踩',
  `canteensId` int(11) NOT NULL DEFAULT '0' COMMENT '商家ID，如果是对菜品和套餐的评论，即为菜品或套餐的所在商家ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家菜品评论表';

#
# Dumping data for table tb_comments
#

LOCK TABLES `tb_comments` WRITE;
/*!40000 ALTER TABLE `tb_comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_comments` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_dishs
#

DROP TABLE IF EXISTS `tb_dishs`;
CREATE TABLE `tb_dishs` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `dishName` varchar(128) NOT NULL COMMENT '菜名',
  `description` varchar(512) NOT NULL COMMENT '描述',
  `canteenId` int(11) NOT NULL COMMENT '商家id',
  `picPath` varchar(128) DEFAULT NULL COMMENT '图片路径',
  `price` decimal(11,2) NOT NULL COMMENT '价格',
  `disCount` tinyint(1) NOT NULL DEFAULT '100' COMMENT '折扣(0--100%)',
  `isSpecialPrice` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否特价(0:是,1:否)',
  `isSpecialRecommend` bit(1) NOT NULL DEFAULT b'0' COMMENT '是否是特色菜(0:是,1:否)',
  `clickCount` int(11) NOT NULL COMMENT '点击数',
  `score` tinyint(3) NOT NULL DEFAULT '80' COMMENT '评分(0-100分)',
  `goodNum` int(11) NOT NULL DEFAULT '0' COMMENT '点赞次数',
  `badNum` int(11) NOT NULL DEFAULT '0' COMMENT '踩次数',
  `type` tinyint(2) NOT NULL DEFAULT '0' COMMENT '菜色类别 (0: 荤菜,1: 素菜, 2: 主食,3: 汤 ,4: 甜点, 5: 小炒 ,6: 清真,20:综合，套餐使用)',
  `isMeal` bit(1) NOT NULL COMMENT '是否套餐(0:是,1:否)',
  `dishsInMeal` varchar(200) DEFAULT NULL COMMENT '套餐中的菜品id信息，用，隔开',
  `isBreakfast` bit(1) NOT NULL COMMENT '是否早餐(0:是,1:否)',
  `isLunch` bit(1) NOT NULL COMMENT '是否午餐(0:是,1:否)',
  `isDinner` bit(1) NOT NULL COMMENT '是否晚餐(0:是,1:否)',
  `collectionTime` int(11) NOT NULL DEFAULT '0' COMMENT '收藏次数',
  `cuisine` tinyint(1) NOT NULL DEFAULT '0' COMMENT '菜系分类(菜系，0 家常 1 闽菜 2 鲁菜 3 川菜 4 徽菜 5 粤菜 6 苏菜 7 浙菜 8 湘菜 9 东北菜 1',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用)',
  `addTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜品套餐信息表';

#
# Dumping data for table tb_dishs
#

LOCK TABLES `tb_dishs` WRITE;
/*!40000 ALTER TABLE `tb_dishs` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_dishs` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_guests
#

DROP TABLE IF EXISTS `tb_guests`;
CREATE TABLE `tb_guests` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `guestName` varchar(64) NOT NULL COMMENT '用户昵称',
  `guestPhone` varchar(32) DEFAULT NULL COMMENT '验证通过后的手机号码（是本人手机）',
  `userPwd` varchar(32) NOT NULL COMMENT '密码',
  `inSchoolId` int(11) NOT NULL COMMENT '所在学校ID',
  `gtId` varchar(20) DEFAULT NULL COMMENT '个推ID',
  `memo` varchar(1024) DEFAULT NULL COMMENT '备注',
  `address` varchar(128) DEFAULT NULL COMMENT '联系地址',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用用户,2:启用送餐)',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `guestLevel` int(11) DEFAULT NULL COMMENT '客户等级，初始0级',
  `treatTimes` int(11) NOT NULL DEFAULT '0' COMMENT '完成交易次数',
  `lostTimes` int(11) NOT NULL DEFAULT '0' COMMENT '爽约次数',
  `TotalPay` decimal(11,2) NOT NULL DEFAULT '0.00' COMMENT '总成交金额',
  `goldNum` int(11) DEFAULT NULL COMMENT ' 预留，金币数，备用，可考虑后期用于兑换奖品或餐劵',
  `config` varchar(100) DEFAULT NULL COMMENT '配置，预留',
  `accessToken` varchar(100) DEFAULT NULL COMMENT '返回的令牌数据',
  `longtitude` float DEFAULT NULL COMMENT '最后上传位置经度',
  `lantitude` float DEFAULT NULL COMMENT '最后上传纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='客户信息表';

#
# Dumping data for table tb_guests
#

LOCK TABLES `tb_guests` WRITE;
/*!40000 ALTER TABLE `tb_guests` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_guests` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_imgrool
#

DROP TABLE IF EXISTS `tb_imgrool`;
CREATE TABLE `tb_imgrool` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `canteenId` int(11) NOT NULL COMMENT '商家ID',
  `picPath` varchar(128) NOT NULL COMMENT '图片地址',
  `dishId` int(11) NOT NULL DEFAULT '0' COMMENT '图片类型 (>0菜品ID、套餐ID，<0该商家优惠劵ID)',
  `memo` varchar(1024) NOT NULL DEFAULT '' COMMENT '描述信息，可用于图片+文字显示',
  `orderNum` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家滚动图片表';

#
# Dumping data for table tb_imgrool
#

LOCK TABLES `tb_imgrool` WRITE;
/*!40000 ALTER TABLE `tb_imgrool` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_imgrool` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_key_words
#

DROP TABLE IF EXISTS `tb_key_words`;
CREATE TABLE `tb_key_words` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `keyWord` varchar(128) NOT NULL COMMENT '关键字',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='关键字过滤';

#
# Dumping data for table tb_key_words
#

LOCK TABLES `tb_key_words` WRITE;
/*!40000 ALTER TABLE `tb_key_words` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_key_words` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_logs
#

DROP TABLE IF EXISTS `tb_logs`;
CREATE TABLE `tb_logs` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `logInfo` varchar(1024) NOT NULL COMMENT '日志内容',
  `operaterId` int(11) NOT NULL COMMENT '操作员id',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志表';

#
# Dumping data for table tb_logs
#

LOCK TABLES `tb_logs` WRITE;
/*!40000 ALTER TABLE `tb_logs` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_logs` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_notice
#

DROP TABLE IF EXISTS `tb_notice`;
CREATE TABLE `tb_notice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(126) NOT NULL COMMENT '标题',
  `content` varchar(1024) NOT NULL COMMENT '内容',
  `operatorId` int(11) NOT NULL COMMENT '操作者',
  `status` int(4) NOT NULL DEFAULT '0' COMMENT '状态',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `updTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统信息';

#
# Dumping data for table tb_notice
#

LOCK TABLES `tb_notice` WRITE;
/*!40000 ALTER TABLE `tb_notice` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_notice` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_orderdetails
#

DROP TABLE IF EXISTS `tb_orderdetails`;
CREATE TABLE `tb_orderdetails` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `num` int(11) NOT NULL COMMENT '数量',
  `orderId` int(11) NOT NULL COMMENT '订单ID',
  `dishsId` int(11) NOT NULL COMMENT '菜品ID',
  `totalPrice` decimal(11,2) NOT NULL COMMENT '总价',
  `ptice` decimal(11,2) NOT NULL COMMENT '单价',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单详情表';

#
# Dumping data for table tb_orderdetails
#

LOCK TABLES `tb_orderdetails` WRITE;
/*!40000 ALTER TABLE `tb_orderdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_orderdetails` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_orders
#

DROP TABLE IF EXISTS `tb_orders`;
CREATE TABLE `tb_orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `guestId` int(11) DEFAULT NULL COMMENT '下单用户id',
  `canteensId` int(11) DEFAULT NULL COMMENT '商家id',
  `totalPrice` decimal(11,2) DEFAULT NULL COMMENT '总价',
  `addTime` datetime DEFAULT NULL COMMENT ' 添加时间',
  `beginTime` datetime DEFAULT NULL COMMENT '开始时间，时分为日送餐时段开始',
  `endTime` datetime DEFAULT NULL COMMENT '结束时间，时分为日送餐时段结束',
  `weekInfo` int(11) DEFAULT NULL COMMENT '周几可送，多个用，隔开，如1,2,4，如果为-1则只送一天',
  `address` varchar(128) DEFAULT NULL COMMENT '收货地址',
  `phone` varchar(32) DEFAULT NULL COMMENT '联系电话',
  `linkMan` varchar(64) DEFAULT NULL COMMENT '联系人',
  `status` bit(1) DEFAULT NULL COMMENT ' 状态(0:下单,1:接受2:拒绝,3:送货中,4:收款5:完成)',
  `finishTime` int(11) DEFAULT '0' COMMENT '成交次数，默认0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='订单信息表';

#
# Dumping data for table tb_orders
#

LOCK TABLES `tb_orders` WRITE;
/*!40000 ALTER TABLE `tb_orders` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_orders` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_province_info
#

DROP TABLE IF EXISTS `tb_province_info`;
CREATE TABLE `tb_province_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `provinceName` varchar(64) NOT NULL COMMENT '省份名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省份信息表';

#
# Dumping data for table tb_province_info
#

LOCK TABLES `tb_province_info` WRITE;
/*!40000 ALTER TABLE `tb_province_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_province_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_push_info
#

DROP TABLE IF EXISTS `tb_push_info`;
CREATE TABLE `tb_push_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `canteensId` int(11) NOT NULL COMMENT '商家ID',
  `pushNum` int(11) NOT NULL COMMENT '推送次数',
  `title` varchar(128) NOT NULL COMMENT '推送标题',
  `pushInfo` varchar(1024) NOT NULL COMMENT '推送内容',
  `pushTime` datetime NOT NULL COMMENT '推送时间',
  `onTime` datetime DEFAULT NULL COMMENT '每天推送区间(每天的次时间发送，轮询间隔5分钟，比如设置11:00发送，实际发送时间在11:00-11:05之间)',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用,2:待审核)',
  `pay` decimal(11,2) NOT NULL COMMENT '收费',
  `leftPushNum` int(11) NOT NULL COMMENT '余下多少未发送',
  `schoolId` int(11) DEFAULT NULL COMMENT '学校ID',
  `cityId` int(11) DEFAULT NULL COMMENT ' 城市ID',
  `provinvceId` int(11) DEFAULT NULL COMMENT '省份ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商家定时推送数据';

#
# Dumping data for table tb_push_info
#

LOCK TABLES `tb_push_info` WRITE;
/*!40000 ALTER TABLE `tb_push_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_push_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_registrationinfo
#

DROP TABLE IF EXISTS `tb_registrationinfo`;
CREATE TABLE `tb_registrationinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `initiatedGuestId` int(11) NOT NULL COMMENT ' 发起者ID，如发帖人，或发出请求的人',
  `accessGuestId` int(11) NOT NULL COMMENT '接受者ID，如回帖人，接受请客要求者，接受AA请求者等',
  `status` tinyint(1) NOT NULL COMMENT '状态(-1:过期,0:待确认,1:已确认,2:已拒绝)',
  `treatId` int(11) NOT NULL COMMENT '请客ID，如果是请好友，则生成多条此信息分别发送',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `endTime` datetime DEFAULT NULL COMMENT '过期时间，过期后自动更改为无效',
  `memo` varchar(1024) DEFAULT NULL COMMENT '备注说明，如回复等使用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拼团贴响应信息';

#
# Dumping data for table tb_registrationinfo
#

LOCK TABLES `tb_registrationinfo` WRITE;
/*!40000 ALTER TABLE `tb_registrationinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_registrationinfo` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_role_info
#

DROP TABLE IF EXISTS `tb_role_info`;
CREATE TABLE `tb_role_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roleName` varchar(32) NOT NULL COMMENT '权限名',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态(0:不可用,1:可用)',
  `memo` varchar(1024) DEFAULT NULL COMMENT '备注',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `upTime` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='权限信息表';

#
# Dumping data for table tb_role_info
#

LOCK TABLES `tb_role_info` WRITE;
/*!40000 ALTER TABLE `tb_role_info` DISABLE KEYS */;
INSERT INTO `tb_role_info` VALUES (1,'系统管理员',1,NULL,'2014-09-13 17:29:22',NULL);
INSERT INTO `tb_role_info` VALUES (2,'普通用户',1,NULL,'2014-09-14 17:29:22',NULL);
/*!40000 ALTER TABLE `tb_role_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_role_right
#

DROP TABLE IF EXISTS `tb_role_right`;
CREATE TABLE `tb_role_right` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `roleId` int(11) NOT NULL COMMENT '权限id',
  `menuId` int(11) NOT NULL COMMENT '菜单id',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 COMMENT='菜单权限关系表';

#
# Dumping data for table tb_role_right
#

LOCK TABLES `tb_role_right` WRITE;
/*!40000 ALTER TABLE `tb_role_right` DISABLE KEYS */;
INSERT INTO `tb_role_right` VALUES (1,1,1,'2014-09-13 17:29:22');
INSERT INTO `tb_role_right` VALUES (2,1,2,'2014-09-14 17:29:22');
INSERT INTO `tb_role_right` VALUES (3,1,3,'2014-09-15 17:29:22');
/*!40000 ALTER TABLE `tb_role_right` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_school_info
#

DROP TABLE IF EXISTS `tb_school_info`;
CREATE TABLE `tb_school_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `cityId` int(11) NOT NULL COMMENT '城市id',
  `schoolName` varchar(64) NOT NULL COMMENT '学校名称',
  `schoolAddtess` varchar(128) NOT NULL COMMENT '学校地址',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用)',
  `memo` varchar(1024) DEFAULT NULL COMMENT '备注',
  `stopicCount` int(11) NOT NULL DEFAULT '0' COMMENT '拼团论坛发帖数',
  `masterId` int(11) DEFAULT NULL COMMENT '版主ID，备用',
  `clickCount` int(11) NOT NULL DEFAULT '0' COMMENT '点击率',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学校信息表';

#
# Dumping data for table tb_school_info
#

LOCK TABLES `tb_school_info` WRITE;
/*!40000 ALTER TABLE `tb_school_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_school_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_suggestions
#

DROP TABLE IF EXISTS `tb_suggestions`;
CREATE TABLE `tb_suggestions` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `suggestionInfo` varchar(512) NOT NULL COMMENT '建议内容',
  `sendGuestId` int(11) NOT NULL COMMENT '发送者ID',
  `toCanteenId` int(11) NOT NULL COMMENT '对象商家Id',
  `addTiem` datetime NOT NULL COMMENT '创建时间',
  `responseTime` datetime DEFAULT NULL COMMENT '回复时间',
  `responseInfo` varchar(512) DEFAULT NULL COMMENT '反馈信息',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='建议信息表';

#
# Dumping data for table tb_suggestions
#

LOCK TABLES `tb_suggestions` WRITE;
/*!40000 ALTER TABLE `tb_suggestions` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_suggestions` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_sysmenu
#

DROP TABLE IF EXISTS `tb_sysmenu`;
CREATE TABLE `tb_sysmenu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `pId` varchar(64) NOT NULL COMMENT '父id',
  `name` varchar(127) NOT NULL COMMENT '菜单名',
  `url` varchar(255) NOT NULL COMMENT '链接路径',
  `target` varchar(127) NOT NULL COMMENT '打开方式',
  `rel` varchar(127) NOT NULL COMMENT '刷新路径',
  `open` varchar(8) NOT NULL DEFAULT '' COMMENT '是否展开(true:是,false:否)',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `status` varchar(8) NOT NULL COMMENT '状态(0:可用,1:不可用)',
  `creater` varchar(127) NOT NULL COMMENT '创建人',
  `createTime` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='系统菜单树';

#
# Dumping data for table tb_sysmenu
#

LOCK TABLES `tb_sysmenu` WRITE;
/*!40000 ALTER TABLE `tb_sysmenu` DISABLE KEYS */;
INSERT INTO `tb_sysmenu` VALUES (1,'0','系统菜单','','null','xtcd','true',0,'0','admin','2014-09-13 17:28:22');
INSERT INTO `tb_sysmenu` VALUES (2,'1','系统管理','','null','xtgl','false',2,'0','admin','2014-09-13 17:30:22');
INSERT INTO `tb_sysmenu` VALUES (3,'2','员工管理','','null','yggl','true',4,'0','admin','2014-09-13 17:31:22');
INSERT INTO `tb_sysmenu` VALUES (4,'2','角色管理','role_list','navTab','jsgl','true',7,'0','admin','2014-09-13 17:37:22');
INSERT INTO `tb_sysmenu` VALUES (5,'2','菜单管理','menu_list','navTab','cdgl','true',6,'0','admin','2014-09-13 17:32:22');
/*!40000 ALTER TABLE `tb_sysmenu` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_treat_comment_info
#

DROP TABLE IF EXISTS `tb_treat_comment_info`;
CREATE TABLE `tb_treat_comment_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `guestId` int(11) NOT NULL COMMENT '评论者id',
  `treatId` int(11) NOT NULL COMMENT '请客信息id',
  `treatCommentMessage` varchar(1024) NOT NULL COMMENT '请客评论',
  `type` tinyint(1) NOT NULL COMMENT '类型(0:一般,1:踩,2:点赞)',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `score` tinyint(3) NOT NULL COMMENT '评分(0--100分)',
  `isPraise` bit(1) DEFAULT NULL COMMENT '是否点赞(0:是,1:否)',
  `isStep` bit(1) DEFAULT NULL COMMENT '是否踩(0:是,1:否)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拼团评论信息表';

#
# Dumping data for table tb_treat_comment_info
#

LOCK TABLES `tb_treat_comment_info` WRITE;
/*!40000 ALTER TABLE `tb_treat_comment_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_treat_comment_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_treat_info
#

DROP TABLE IF EXISTS `tb_treat_info`;
CREATE TABLE `tb_treat_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `schoolId` int(11) NOT NULL COMMENT ' 学校ID，请客在某学校附近',
  `guestId` int(11) NOT NULL COMMENT '发起者ID',
  `beginTime` datetime NOT NULL COMMENT '开始时间',
  `endTime` datetime NOT NULL COMMENT '结束时间',
  `maxNum` int(11) NOT NULL COMMENT '人数上限',
  `nowNum` int(11) NOT NULL DEFAULT '0' COMMENT '现有报名人数',
  `treatMessage` varchar(1024) NOT NULL COMMENT '拼团信息',
  `lookTimes` int(11) NOT NULL DEFAULT '0' COMMENT '浏览次数',
  `address` varchar(512) NOT NULL COMMENT '地址信息',
  `addTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime DEFAULT NULL COMMENT '最后更新时间',
  `status` tinyint(1) NOT NULL COMMENT '状态(0:停用,1:启用)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='拼团信息表';

#
# Dumping data for table tb_treat_info
#

LOCK TABLES `tb_treat_info` WRITE;
/*!40000 ALTER TABLE `tb_treat_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `tb_treat_info` ENABLE KEYS */;
UNLOCK TABLES;

#
# Source for table tb_user_info
#

DROP TABLE IF EXISTS `tb_user_info`;
CREATE TABLE `tb_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `loginName` varchar(64) NOT NULL DEFAULT '' COMMENT '登陆名',
  `loginPass` varchar(64) NOT NULL COMMENT '密码',
  `userName` varchar(64) NOT NULL COMMENT '姓名',
  `sex` varchar(2) DEFAULT NULL COMMENT '性别',
  `roleId` int(11) NOT NULL DEFAULT '0' COMMENT '权限id',
  `tel` varchar(32) DEFAULT NULL COMMENT '电话',
  `email` varchar(128) DEFAULT NULL COMMENT '邮箱',
  `deptId` varchar(36) DEFAULT NULL COMMENT '如果是商家管理员，为商家ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='管理员信息表';

#
# Dumping data for table tb_user_info
#

LOCK TABLES `tb_user_info` WRITE;
/*!40000 ALTER TABLE `tb_user_info` DISABLE KEYS */;
INSERT INTO `tb_user_info` VALUES (1,'admin','21232f297a57a5a743894a0e4a801fc3','袁至真','1',1,'13800138000','yuan@qq.com',NULL);
INSERT INTO `tb_user_info` VALUES (2,'ceshi','21232f297a57a5a743894a0e4a801fc3','测试','0',2,'13800138001','ceshi@qq.com',NULL);
/*!40000 ALTER TABLE `tb_user_info` ENABLE KEYS */;
UNLOCK TABLES;

/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;

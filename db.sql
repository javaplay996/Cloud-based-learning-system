/*
SQLyog Ultimate v11.3 (64 bit)
MySQL - 5.7.32-log : Database - yuunduanxuexixitong
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`yuunduanxuexixitong` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `yuunduanxuexixitong`;

/*Table structure for table `config` */

DROP TABLE IF EXISTS `config`;

CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';

/*Data for the table `config` */

insert  into `config`(`id`,`name`,`value`) values (2,'picture2','http://localhost:8080/yuunduanxuexixitong/upload/1620007625956.jpg'),(3,'picture3','http://localhost:8080/yuunduanxuexixitong/upload/1620007632218.jpg'),(6,'homepage','http://localhost:8080/yuunduanxuexixitong/upload/1620007637608.jpg');

/*Table structure for table `dictionary` */

DROP TABLE IF EXISTS `dictionary`;

CREATE TABLE `dictionary` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dic_code` varchar(200) DEFAULT NULL COMMENT '字段',
  `dic_name` varchar(200) DEFAULT NULL COMMENT '字段名',
  `code_index` tinyint(4) DEFAULT NULL COMMENT '编码',
  `index_name` varchar(200) DEFAULT NULL COMMENT '编码名字',
  `super_types` int(11) DEFAULT NULL COMMENT '父字段id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COMMENT='字典表';

/*Data for the table `dictionary` */

insert  into `dictionary`(`id`,`dic_code`,`dic_name`,`code_index`,`index_name`,`super_types`,`create_time`) values (1,'sex_types','性别',1,'男',NULL,'2021-05-03 09:42:50'),(2,'sex_types','性别',2,'女',NULL,'2021-05-03 09:42:50'),(3,'news_types','新闻类型名称',1,'新闻类型1',NULL,'2021-05-03 09:42:50'),(4,'news_types','新闻类型名称',2,'新闻类型2',NULL,'2021-05-03 09:42:50'),(5,'kecheng_types','课程信息类型名称',1,'课程信息类型1',NULL,'2021-05-03 09:42:50'),(6,'kecheng_types','课程信息类型名称',2,'课程信息类型2',NULL,'2021-05-03 09:42:50'),(7,'kecheng_types','课程信息类型名称',3,'课程信息类型3',NULL,'2021-05-03 09:42:50'),(8,'shipin_types','视频类型名称',1,'视频类型1',NULL,'2021-05-03 09:42:50'),(9,'shipin_types','视频类型名称',2,'视频类型2',NULL,'2021-05-03 09:42:50'),(10,'shipin_types','视频类型名称',3,'视频类型3',NULL,'2021-05-03 09:42:50'),(11,'kejian_types','课件类型名称',1,'课件类型名称1',NULL,'2021-05-03 09:42:50'),(12,'kejian_types','课件类型名称',2,'课件类型名称2',NULL,'2021-05-03 09:42:50'),(13,'kejian_types','课件类型名称',3,'课件类型名称3',NULL,'2021-05-03 09:42:50');

/*Table structure for table `forum` */

DROP TABLE IF EXISTS `forum`;

CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1620010910662 DEFAULT CHARSET=utf8 COMMENT='论坛信息';

/*Data for the table `forum` */

insert  into `forum`(`id`,`addtime`,`title`,`content`,`parentid`,`userid`,`username`,`isdone`) values (101,'2021-03-18 17:31:37','帖子标题1','帖子内容1',1,1,'用户名1','开放'),(102,'2021-03-18 17:31:37','帖子标题2','帖子内容2',2,2,'用户名2','开放'),(103,'2021-03-18 17:31:37','帖子标题3','帖子内容3',3,3,'用户名3','开放'),(104,'2021-03-18 17:31:37','帖子标题4','帖子内容4',4,4,'用户名4','开放'),(105,'2021-03-18 17:31:37','帖子标题5','帖子内容5',5,5,'用户名5','开放'),(106,'2021-03-18 17:31:37','帖子标题6','帖子内容6',6,6,'用户名6','开放'),(1620010903524,'2021-05-03 11:01:42','1111111','<p>请输入内容111111111111111</p>',0,1,'111','开放');

/*Table structure for table `kecheng` */

DROP TABLE IF EXISTS `kecheng`;

CREATE TABLE `kecheng` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kecheng_name` varchar(200) DEFAULT NULL COMMENT '课程名称 Search111',
  `kecheng_types` int(255) DEFAULT NULL COMMENT '课程类型 Search111',
  `kecheng_photo` varchar(200) DEFAULT NULL COMMENT '课程图片',
  `kecheng_jiaoshi` varchar(200) DEFAULT NULL COMMENT '负责教师',
  `kecheng_shijian` varchar(200) DEFAULT NULL COMMENT '课程时间',
  `kecheng_content` text COMMENT '课程信息介绍',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '录入时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='课程信息';

/*Data for the table `kecheng` */

insert  into `kecheng`(`id`,`kecheng_name`,`kecheng_types`,`kecheng_photo`,`kecheng_jiaoshi`,`kecheng_shijian`,`kecheng_content`,`insert_time`,`create_time`) values (1,'课程名称1',1,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620006864485.jpg','负责教师1','9:30  -> 11:00','课程信息介绍1\r\n','2021-05-03 09:54:53','2021-05-03 09:54:53'),(2,'课程名称2',2,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620009907620.jpg','负责教师2','11:30  -> 13:00','课程信息介绍2\r\n\r\n\r\n','2021-05-03 10:45:28','2021-05-03 10:45:28'),(3,'课程名称3',3,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620010744579.jpg','负责教师3','14:30  -> 16:00','课程信息介绍3\r\n','2021-05-03 10:59:21','2021-05-03 10:59:21');

/*Table structure for table `kecheng_collection` */

DROP TABLE IF EXISTS `kecheng_collection`;

CREATE TABLE `kecheng_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kecheng_id` int(11) DEFAULT NULL COMMENT '课程信息',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '收藏时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show3 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='课程信息收藏';

/*Data for the table `kecheng_collection` */

/*Table structure for table `kecheng_liuyan` */

DROP TABLE IF EXISTS `kecheng_liuyan`;

CREATE TABLE `kecheng_liuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kecheng_id` int(11) DEFAULT NULL COMMENT '课程信息id',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户id',
  `kecheng_liuyan_content` text COMMENT '留言内容',
  `reply_content` text COMMENT '回复内容',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '讨论时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='课程信息留言';

/*Data for the table `kecheng_liuyan` */

insert  into `kecheng_liuyan`(`id`,`kecheng_id`,`yonghu_id`,`kecheng_liuyan_content`,`reply_content`,`insert_time`,`create_time`) values (1,3,1,'1331213231231232321213213',NULL,'2021-05-03 11:01:34','2021-05-03 11:01:34');

/*Table structure for table `kejian` */

DROP TABLE IF EXISTS `kejian`;

CREATE TABLE `kejian` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kejian_name` varchar(200) DEFAULT NULL COMMENT '视频标题 Search111',
  `kejian_types` int(255) DEFAULT NULL COMMENT '课件类型 Search111',
  `kejian_photo` varchar(200) DEFAULT NULL COMMENT '封面',
  `kejian_file` varchar(200) DEFAULT NULL COMMENT '课件',
  `kejian_content` text COMMENT '详情信息',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '录入时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='学习课件';

/*Data for the table `kejian` */

insert  into `kejian`(`id`,`kejian_name`,`kejian_types`,`kejian_photo`,`kejian_file`,`kejian_content`,`insert_time`,`create_time`) values (1,'课件标题1',2,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620007593704.JPG','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620007589399.xls','详情信息1\r\n','2021-05-03 10:06:41','2021-05-03 10:06:41'),(2,'视频标题2',2,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620009947585.jpg','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620009952241.doc','详情信息2\r\n\r\n','2021-05-03 10:45:57','2021-05-03 10:45:57');

/*Table structure for table `kejian_collection` */

DROP TABLE IF EXISTS `kejian_collection`;

CREATE TABLE `kejian_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kejian_id` int(11) DEFAULT NULL COMMENT '学习课件',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '收藏时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show3 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='学习课件收藏';

/*Data for the table `kejian_collection` */

/*Table structure for table `kejian_liuyan` */

DROP TABLE IF EXISTS `kejian_liuyan`;

CREATE TABLE `kejian_liuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `kejian_id` int(11) DEFAULT NULL COMMENT '学习课件id',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户id',
  `kejian_liuyan_content` text COMMENT '留言内容',
  `reply_content` text COMMENT '回复内容',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '讨论时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='学习课件留言';

/*Data for the table `kejian_liuyan` */

insert  into `kejian_liuyan`(`id`,`kejian_id`,`yonghu_id`,`kejian_liuyan_content`,`reply_content`,`insert_time`,`create_time`) values (1,2,1,'123231312',NULL,'2021-05-03 11:00:59','2021-05-03 11:00:59');

/*Table structure for table `news` */

DROP TABLE IF EXISTS `news`;

CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `news_name` varchar(200) DEFAULT NULL COMMENT '新闻名称  Search111 ',
  `news_types` int(11) DEFAULT NULL COMMENT '新闻类型  Search111 ',
  `news_photo` varchar(200) DEFAULT NULL COMMENT '新闻图片',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '新闻时间',
  `news_content` text COMMENT '新闻详情',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show2 show1 nameShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='新闻';

/*Data for the table `news` */

insert  into `news`(`id`,`news_name`,`news_types`,`news_photo`,`insert_time`,`news_content`,`create_time`) values (1,'新闻1',1,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620007654933.jpg','2021-05-03 10:07:39','新闻详情1\r\n','2021-05-03 10:07:39'),(2,'新闻2',2,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620007666791.jpg','2021-05-03 10:07:49','新闻详情2\r\n','2021-05-03 10:07:49');

/*Table structure for table `shipin` */

DROP TABLE IF EXISTS `shipin`;

CREATE TABLE `shipin` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `shipin_name` varchar(200) DEFAULT NULL COMMENT '视频标题 Search111',
  `shipin_types` int(255) DEFAULT NULL COMMENT '视频类型 Search111',
  `shipin_photo` varchar(200) DEFAULT NULL COMMENT '封面',
  `shipin_video` varchar(200) DEFAULT NULL COMMENT '视频',
  `shipin_content` text COMMENT '详情信息',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '录入时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show1 show2 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='学习视频';

/*Data for the table `shipin` */

insert  into `shipin`(`id`,`shipin_name`,`shipin_types`,`shipin_photo`,`shipin_video`,`shipin_content`,`insert_time`,`create_time`) values (1,'视频标题1',1,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620006914941.jpg','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620006920540.mp4','详情信息1\r\n','2021-05-03 09:55:25','2021-05-03 09:55:25'),(2,'视频标题2',2,'http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620009991049.jpg','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620009985479.mp4','详情信息2\r\n','2021-05-03 10:46:35','2021-05-03 10:46:35');

/*Table structure for table `shipin_collection` */

DROP TABLE IF EXISTS `shipin_collection`;

CREATE TABLE `shipin_collection` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `shipin_id` int(11) DEFAULT NULL COMMENT '学习视频',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '收藏时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 show3 photoShow',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='学习视频收藏';

/*Data for the table `shipin_collection` */

/*Table structure for table `shipin_liuyan` */

DROP TABLE IF EXISTS `shipin_liuyan`;

CREATE TABLE `shipin_liuyan` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `shipin_id` int(11) DEFAULT NULL COMMENT '学习视频id',
  `yonghu_id` int(11) DEFAULT NULL COMMENT '用户id',
  `shipin_liuyan_content` text COMMENT '留言内容',
  `reply_content` text COMMENT '回复内容',
  `insert_time` timestamp NULL DEFAULT NULL COMMENT '讨论时间',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='学习视频留言';

/*Data for the table `shipin_liuyan` */

insert  into `shipin_liuyan`(`id`,`shipin_id`,`yonghu_id`,`shipin_liuyan_content`,`reply_content`,`insert_time`,`create_time`) values (1,2,1,'1111111\r\n','11111111111111111111111111111111111\r\n','2021-05-03 11:01:19','2021-05-03 11:01:19');

/*Table structure for table `token` */

DROP TABLE IF EXISTS `token`;

CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';

/*Data for the table `token` */

insert  into `token`(`id`,`userid`,`username`,`tablename`,`role`,`token`,`addtime`,`expiratedtime`) values (1,1,'admin','users','管理员','ld5wh378i8yuh69lczaql6jvtq35u9mi','2021-05-03 09:53:08','2021-05-03 11:56:49'),(2,1,'111','yonghu','用户','g03cz0q3shgd7szfdm3cbnnr7yyhj5t7','2021-05-03 10:08:12','2021-05-03 12:02:30');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `users` */

insert  into `users`(`id`,`username`,`password`,`role`,`addtime`) values (1,'admin','admin','管理员','2021-02-25 15:59:12');

/*Table structure for table `yonghu` */

DROP TABLE IF EXISTS `yonghu`;

CREATE TABLE `yonghu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(200) DEFAULT NULL COMMENT '账户',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `yonghu_name` varchar(200) DEFAULT NULL COMMENT '用户姓名  Search111',
  `sex_types` int(11) DEFAULT NULL COMMENT '性别',
  `yonghu_id_number` varchar(200) DEFAULT NULL COMMENT '身份证号',
  `yonghu_phone` varchar(200) DEFAULT NULL COMMENT '手机号',
  `yonghu_photo` varchar(200) DEFAULT NULL COMMENT '照片',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间 ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户';

/*Data for the table `yonghu` */

insert  into `yonghu`(`id`,`username`,`password`,`yonghu_name`,`sex_types`,`yonghu_id_number`,`yonghu_phone`,`yonghu_photo`,`create_time`) values (1,'111','123456','用户1',2,'410882200111111111','17711111131','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620006846249.jpg','2021-05-03 09:54:07'),(2,'222','123456','用户2',1,'410882200111111112','17711111112','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620009836775.jpg','2021-05-03 10:43:58'),(3,'333','123456','用户3',1,'410882200111111113','17711111113','http://localhost:8080/yuunduanxuexixitong/file/download?fileName=1620010665721.jpg','2021-05-03 10:57:47');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

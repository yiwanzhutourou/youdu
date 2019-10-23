DROP DATABASE IF EXISTS youdu;
CREATE DATABASE youdu CHARACTER SET utf8mb4 COLLATE utf8mb4_bin;
USE youdu;

--
-- `config` 表
--

CREATE TABLE `config` (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `config_name` varchar(30) NOT NULL DEFAULT '' COMMENT '配置名',
  `config_value` varchar(160) NOT NULL DEFAULT '' COMMENT '配置值',
  `created_time` int(10) UNSIGNED NOT NULL DEFAULT '0' COMMENT '创建时间',
  `modified_time` int(10) UNSIGNED NOT NULL DEFAULT '0' COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uniq_cnfn` (`config_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='配置表';

--
-- `config` 表初始化数据
--

INSERT INTO `config` (`id`, `config_name`, `config_value`, `created_time`, `modified_time`) VALUES
(1, 'whosyourdaddy', '有读书房', 1571732314, 1571732314);

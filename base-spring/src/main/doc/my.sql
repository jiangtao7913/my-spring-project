-- 创建用户表
DROP TABLE USER;
CREATE TABLE USER
(
    id       INT(11) PRIMARY KEY AUTO_INCREMENT,
    NAME           INT(11) COMMENT '名称',
    age            INT(11) COMMENT '年龄',
    sex                   INT(11) COMMENT '性别',
    location          VARCHAR(128) COMMENT '地址',
    CREATE_DATE          DATETIME COMMENT '创建时间',
    CREATE_USER          INT(11) COMMENT '创建人',
    UPDATE_DATE          DATETIME COMMENT '修改时间',
     UPDATE_USER          INT(11) COMMENT '修改人'
)ENGINE=INNODB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='用户表';



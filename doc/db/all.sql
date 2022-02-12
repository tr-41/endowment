drop table if exists `test`;
create table `test`(
    `id` bigint not null comment 'id',
    `name` varchar(50) comment '名称',
    primary key(`id`)
) engine=innodb default charset=utf8mb4 comment='测试';
#参保人员表
drop table if exists `euser`;
create table `euser`(
    `id` bigint not null comment '参保人员编号',
    `name` varchar(50) comment '姓名',
    `idNumber` varchar(200) comment '身份证号',
    `address` varchar(200) comment '参保地',
    `account` varchar(200) comment '保费账户',
    `disability` varchar(50) comment '是否残疾',
    `familyPlanning` varchar(50) comment '是否计生困难人员',
    `poverty` varchar(50) comment '是否贫困人员',
    primary key(`id`)
) engine=innodb default charset=utf8mb4 comment='参保人员';

insert into `euser` (id, name, idNumber, address, account, disability, familyPlanning, poverty) values (1,'张三','120100195004010488','天津','1234567810121314151','no','no','no');
insert into `euser` (id, name, idNumber, address, account, disability, familyPlanning, poverty) values (2,'李四','120100196004010488','天津','1234567810121314555','no','no','no');

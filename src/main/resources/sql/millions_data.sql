CREATE TABLE millions_data
(
    id         int AUTO_INCREMENT COMMENT '主键'
        PRIMARY KEY,
    staff_no   bigint         NULL COMMENT '员工号',
    salary     decimal(10, 2) NULL COMMENT '薪水',
    start_time datetime       NULL COMMENT '开始时间',
    end_time   datetime       NULL COMMENT '结束时间'
)
    COMMENT '百万数据导入导出测试';
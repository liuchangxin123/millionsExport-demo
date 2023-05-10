# millionsExport
百万数据导入导出示例

JDK 11

ORM框架使用的是`jooq`,可以自动根据数据库结构映射对象的java实体。

pom.xml里面配置了jooq逆向工程文件路径。

在JooqConfig.xml里面配置了数据源，生成文件路径以及相关的一些配置, 可以根据自身需要修改数据源以及生成路径。

jooq基于数据库模型生成java文件需要使用命令：`mvn jooq-codegen:generate`

注意：使用jooq生成java文件，默认生成数据库全部文件，会覆盖掉之前的文件，如果只需要生成部分模型的话需要特别注意。

使用前可以先在自己的数据库执行示例sql文件,文件路径在`src/main/resources/sql`,然后再执行jooq命令，






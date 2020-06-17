package com.sqq.generator.utils;

/**
 * @ClassName: GeneratorConfig
 * @Description: 代码生成配置类
 * @Author maihaixian
 * @Date 2019-05-21 16:04
 */
public class GeneratorConstants {

    /**
     * 项目路径
     **/
    public static final String PROJECT_DIR = "D://spring-cloud-demo-worker/sqq-spring-cloud/sqq-activity";
    /**
     * java类目录
     **/
    public static final String JAVA_DIR = "/src/main/java";
    /**
     * 作者
     **/
    public static final String AUTOR = "sqq";
    /**
     * 数据库配置
     **/
    public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/spring_cloud_user?characterEncoding=utf8&serverTimezone=Asia/Shanghai";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "123456";
    /**
     * 指定生成的表 ， 用 ","分割
     **/
    public static final String TABLES = "t_activity";
    /**
     * 模块名称
     **/
    public static final String MODULE = "activity";
    /**
     * 父级包名
     **/
    public static final String PARENT_PACKAGE = "com.sqq";

}



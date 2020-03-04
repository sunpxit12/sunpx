package top.sunpx.edu.teacher.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author :sunpx
 * @date :created in 2020/3/4 15:28
 * @desc :
 */
@Configuration
@EnableTransactionManagement
@MapperScan("top.sunpx.edu.teacher.mapper")
public class MyBatisPlusConfig {
}

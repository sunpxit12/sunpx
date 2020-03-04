package top.sunpx.edu.teacher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :sunpx
 * @date :created in 2020/3/4 14:30
 * @desc :老师启动类
 */
@SpringBootApplication
@ComponentScan(basePackages = {"top.sunpx.*"})
public class TeacherApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class, args);
    }

}

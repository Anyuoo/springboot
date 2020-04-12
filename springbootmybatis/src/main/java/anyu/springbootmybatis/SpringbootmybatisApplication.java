package anyu.springbootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("anyu.springbootmybatis.mapper")//指定扫描接口与mapper配置文件
public class SpringbootmybatisApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootmybatisApplication.class, args);
	}

}

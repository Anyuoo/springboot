package anyu.springbootcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
@MapperScan(value = "anyu.springbootcache.mapper")
public class SpringbootcacheApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootcacheApplication.class, args);
	}

}

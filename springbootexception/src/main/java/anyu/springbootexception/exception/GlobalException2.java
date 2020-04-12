package anyu.springbootexception.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * 统一异常处理2，使用SimpleMappingExceptionHandler
 */
@Configuration
public class GlobalException2 {
    /**
     * 返回值必须是SimpleMappingExceptionResolver
     * @return
     */
    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver=new SimpleMappingExceptionResolver();
        //使用properties键值对，key=异常对象全限定名，value=异常页面
        Properties properties=new Properties();
        properties.put("java.lang.ArithmeticException","error3");
        properties.put("java.lang.NullPointerException","error4");

        resolver.setExceptionMappings(properties);
        return resolver;
    }
}

package anyu.springbootshiro.config.shiroconfig;

import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {


    //ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultSecurityManager securityManager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        //关联securitymanager
        bean.setSecurityManager(securityManager);
        /*
         * shiro过滤器
         *   anon:无需认证即可访问
         *   authc：需要认证才能访问
         *   user：使用rememberMe功能直接访问
         *   perms：该资源需要权限才能访问
         *   role：该资源需要得到角色才能访问
         * */
        Map<String, String> map = new LinkedHashMap<>();

        map.put("/user/index", "anon");
        map.put("/user/add", "perms[user:add]");
        map.put("/user/*", "authc");

        bean.setFilterChainDefinitionMap(map);
        bean.setLoginUrl("/user/login");
        return bean;
    }

    //DefaultSecurityManager
    @Bean("securityManager")
    public DefaultWebSecurityManager getSecurityManager(@Qualifier("userRealm") UserRealm realm) {
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        //关联realm
        manager.setRealm(realm);
        return manager;
    }

    @Bean("userRealm")
    public UserRealm getUserRealm() {
        return new UserRealm();
    }

}
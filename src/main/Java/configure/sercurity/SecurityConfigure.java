package configure.sercurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import persistence.UserDao;
import service.UserService;

/**
 * Created by hzlaojiaqi on 2016/9/9.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

   @Autowired
   UserService userService;

    protected  void configure(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.authorizeRequests()
                    .antMatchers("/home").authenticated()
                    .and()
                .formLogin();
    }

    protected void configure(AuthenticationManagerBuilder managerBuilder) throws Exception {

        managerBuilder.userDetailsService(userService);//由于使用了mybatis，不能直接new一个service对象，不然会报null
    }
}

package configure.sercurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by hzlaojiaqi on 2016/9/9.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

    private static final Logger THIRDPARTY_LOG = LoggerFactory.getLogger("THIRDPARTY_LOGGER");

   @Autowired
   UserService userService;

    protected  void configure(HttpSecurity httpSecurity) throws Exception {
        CsrfTokenResponseHeaderBindingFilter csrfTokenFilter = new CsrfTokenResponseHeaderBindingFilter();
        CustomAccessDeniedHandler accessDeniedHandler=new CustomAccessDeniedHandler();
        httpSecurity.addFilterAfter(csrfTokenFilter,CsrfFilter.class)
                .exceptionHandling().accessDeniedHandler(accessDeniedHandler);

//        .csrf().csrfTokenRepository(csrfTokenRepository())
//                .and()
//                .and()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/home").authenticated()
//                .and()
//                .formLogin();
    }
//
    protected void configure(AuthenticationManagerBuilder managerBuilder) throws Exception {

        managerBuilder.userDetailsService(userService);//由于使用了mybatis，不能直接new一个service对象，不然会报null
    }

    /**
     * 创建 csrf Token 仓库
     * @return
     */
    private CsrfTokenRepository csrfTokenRepository()
    {
        HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
        repository.setSessionAttributeName("_csrf");
        THIRDPARTY_LOG.info("add _csrf value");
        return repository;
    }

    /**
     * 自定义 csrf Token失效时的处理
     */
    static class CustomAccessDeniedHandler implements AccessDeniedHandler {
        public void handle(HttpServletRequest request,
                           HttpServletResponse response,
                           AccessDeniedException accessDeniedException)
                throws IOException, ServletException {
            response.getWriter().write("access deny");
        }
    }
}

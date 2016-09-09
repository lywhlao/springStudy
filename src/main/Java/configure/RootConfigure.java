package configure;

import configure.sercurity.SecurityConfigure;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

//配置非web方面的bean
@Configuration
@MapperScan("persistence")
@Import({CacheConfigure.class,ThreadPoolConfigure.class,SecurityConfigure.class})
@PropertySource("classpath:db.properties")
@ComponentScan("service")
public class RootConfigure {

	@Autowired
	Environment environment;


	// JDBC数据源
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(environment.getProperty("url"));
		ds.setUsername(environment.getProperty("name"));
		ds.setPassword(environment.getProperty("password"));
		return ds;
	}

    //配置事务
	@Bean
	public DataSourceTransactionManager transactionManager() {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
		transactionManager.setDataSource(getDataSource());
		return transactionManager;
	}


	//配置mybatis session
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
			SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
			sessionFactory.setDataSource(getDataSource());
			sessionFactory.setTypeAliasesPackage("bean");
			return sessionFactory.getObject();
	}
}

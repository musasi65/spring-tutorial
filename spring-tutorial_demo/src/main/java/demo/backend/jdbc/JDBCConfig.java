package demo.backend.jdbc;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JDBCConfig {

	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
                ds.setDriverClassName("net.sourceforge.jtds.jdbc.Driver");
		//ds.setUrl("jdbc:mysql://127.0.0.1:3306/smarthome");
//              ds.setUrl("jdbc:mysql://localhost:3306/test");
//		ds.setUsername("root");
//		ds.setPassword("");
//		ds.setInitialSize(5);
//		ds.setMaxActive(10);
                ds.setUrl("jdbc:jtds:sqlserver://localhost:1433;databaseName=test1");
		ds.setUsername("sa");
		ds.setPassword("123456");
//		ds.setInitialSize(5);
//		ds.setMaxActive(10);
                
		return ds;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public GlobalRepository globalRepository(JdbcTemplate jdbcTemplate) {
		return new JdbcGlobalRepository(jdbcTemplate);

	}
}

package in.vayam.resource;

import java.sql.DriverManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig 
{

    private final JdbcTemplate myTemplate;

    private final DriverManagerDataSource myDataSource;

    SpringConfig(DriverManagerDataSource myDataSource, JdbcTemplate myTemplate) {
        this.myDataSource = myDataSource;
        this.myTemplate = myTemplate;
        System.out.println("-------");
    }
	@Bean
public DriverManagerDataSource  myDataSource()
{
	DriverManagerDataSource data = new DriverManagerDataSource();
	data.setDriverClassName("com.mysql.cj.jdbc.Driver");
	data.setUrl("jdbc:mysql://localhost:3306/SpringJDBC");
	data.setUsername("root");
	data.setPassword("Shoiab@123");
	System.out.println(" ------------"+data);
	return data;
}
	@Bean
	public JdbcTemplate myTemplate()
	{
		JdbcTemplate jd= new JdbcTemplate();
		jd.setDataSource(myDataSource());
		System.out.println("-------"+jd);
		return jd;
	}
	
}

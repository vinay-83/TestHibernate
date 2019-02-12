package com.spring.annotation.HibernateTemplate;

import java.util.ArrayList;
import java.util.Properties;

import javax.transaction.Transactional;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

@Configuration
public class OurConfiguration {

	@Bean
	public DAO dao() {

		return new DAO();
	}

	@Bean
	public Service service() {
		return new Service();
	}

	@Bean
	public Controller controller() {
		return new Controller();
	}

	@Bean

	public BasicDataSource basicDataSource() {

		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("com.mysql.jdbc.Driver");
		bds.setUrl("jdbc:mysql://localhost:3309/student_info");
		bds.setUsername("root");
		bds.setPassword("root");

		return bds;
	}

	@Bean

	public LocalSessionFactoryBean localSessionFactoryBean() {

		LocalSessionFactoryBean lb = new LocalSessionFactoryBean();
		lb.setDataSource(basicDataSource());
		lb.setAnnotatedClasses(StudentPojo.class);
		Properties props = new Properties();
		props.setProperty("hibernate.show_sql", "true");
		
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		lb.setHibernateProperties(props);
		return lb;
	}

	@Bean
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate ht = new HibernateTemplate();
		
		ht.setSessionFactory(localSessionFactoryBean().getObject());
		ht.setCheckWriteOperations(false);
		return ht;
	}
	
}

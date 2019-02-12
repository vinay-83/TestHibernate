package com.spring.annotation.JdbcTemplate;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class TestBean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,
InitializingBean,DisposableBean,BeanPostProcessor{

	// private String name;
	//
	// public void setBean(String arg) {
	// this.name=arg;
	// }
	//
	private String beanname;
	private BeanFactory beanFactory;
	
	public TestBean() {
		System.out.println(" 1 Constructer Injection ");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("bean name aware"+arg0);
		this.beanname=arg0;

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	
		this.beanFactory=beanFactory;
		System.out.println("beanFactory"+beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("applivcation "+arg0);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("properties");
		
	}
	@PostConstruct
	public void init() {
		System.out.println("post construct");
	}

	

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessAfterInitialization"+arg0);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("postProcessBeforeInitialization"+arg0);
		return arg0;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}
	
}

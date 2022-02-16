package com.te.emailapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
public class Config {

	/*
	 * @Bean public LocalEntityManagerFactoryBean entityManagerFactory() {
	 * LocalEntityManagerFactoryBean factoryBean = new
	 * LocalEntityManagerFactoryBean(); factoryBean.setPersistenceUnitName("mail");
	 * return factoryBean; }
	 */
	
	@Autowired
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory()
	{
	    LocalContainerEntityManagerFactoryBean lEMF =  new LocalContainerEntityManagerFactoryBean();
	    lEMF.setPersistenceUnitName("mail");
	    lEMF.setPersistenceXmlLocation("persistence.xml");
	    return lEMF;
	}

}

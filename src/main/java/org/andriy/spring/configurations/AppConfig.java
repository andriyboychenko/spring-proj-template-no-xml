package org.andriy.spring.configurations;

import org.andriy.spring.db.DatabaseMessageSourceBase;
import org.andriy.spring.ejb.TestDiBean;
import org.andriy.spring.ejb.TestDiBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * This class replaces application-servlet.xml. </br>
 * Reference: http://www.luckyryan.com/2013/02/07/migrate-spring-mvc-servlet-xml-to-java-config/
 */
@EnableWebMvc // Equivalent to <mvc:annotation-driven/>. This tag registers the DefaultAnnotationHandlerMapping and AnnotationMethodHandlerAdapter beans that are required for Spring MVC 
@ComponentScan(basePackages = {"org.andriy.spring"}) // Equivalent to <context:component-scan base-package="org.andriy.spring"/>. Scan for spring annotated components for more details see http://stackoverflow.com/questions/7414794
@Configuration
public class AppConfig extends WebMvcConfigurerAdapter {

	@Bean // Equivalent to <bean id="viewResolver">
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Bean(name="testDiBean") // Dependency injection test 
    public TestDiBean getTestDiBean() {
		TestDiBean di = new TestDiBeanImpl();
        return di;
    }
	
	@Bean(name="messageSource") // Equivalent to <bean id="messageSource" class="org.andriy.spring.db.DatabaseMessageSourceBase"> 
    public DatabaseMessageSourceBase getMessageSource() {
		DatabaseMessageSourceBase dmsb = new DatabaseMessageSourceBase();
        return dmsb;
    }
		
}

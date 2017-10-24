package com.endava.springMvcToDoApp.webContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationManagerFactoryBean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

@Configuration
@EnableWebMvc
@ComponentScan("com.endava.springMvcToDoApp.webContext.controllers")
public class WebConfig {

    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

// --- Implementation using ContentNegotiatingViewResolver ---

//    @Bean
//    public ContentNegotiationManagerFactoryBean contentNegotiationManager(){
//        ContentNegotiationManagerFactoryBean factoryBean = new ContentNegotiationManagerFactoryBean();
//        factoryBean.setDefaultContentType(MediaType.APPLICATION_JSON);
//        return factoryBean;
//    }
//
//    @Bean
//    public ViewResolver contentNegotiatingViewResolver(ContentNegotiationManager contentNegotiationManager){
//        ContentNegotiatingViewResolver viewResolver = new ContentNegotiatingViewResolver();
//        return viewResolver;
//    }
//
//    @Bean
//    public ViewResolver beanNameViewResolver(){
//        return new BeanNameViewResolver();
//    }
//
//    @Bean
//    public View allRecords(){
//        return new MappingJackson2JsonView();
//    }

// --- End of implementation using ContentNegotiatingViewResolver ---

}

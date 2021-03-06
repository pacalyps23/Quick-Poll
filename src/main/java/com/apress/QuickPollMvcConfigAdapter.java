package com.apress;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.awt.print.Pageable;
import java.util.List;

/**
 * Created by luisgarcia on 6/21/17.
 */

@Configuration
public class QuickPollMvcConfigAdapter extends WebMvcConfigurerAdapter
{
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers)
    {
        PageableHandlerMethodArgumentResolver phmar = new PageableHandlerMethodArgumentResolver();
        //set size to 5
        phmar.setFallbackPageable(new PageRequest(0, 5));
        argumentResolvers.add(phmar);
        super.addArgumentResolvers(argumentResolvers);
    }

}

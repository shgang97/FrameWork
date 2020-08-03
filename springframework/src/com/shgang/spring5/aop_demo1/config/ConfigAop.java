package com.shgang.spring5.aop_demo1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.shgang.spring5.aop_demo1.config"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {


}

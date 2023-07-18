package com.springdemo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanProcessor implements BeanPostProcessor{
		
		public Object postProcessorAfterInitilization(Object bean, String beanName) {
			System.out.println("Before : "+beanName);
			return bean;
		}
		
		
		public Object postProcessorBeforeInitilization(Object bean, String beanName) {
			System.out.println("After : "+beanName);
			return bean;
		}
}

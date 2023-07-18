package com.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean, DisposableBean {
	private int x;
	private int y;
	private static int count = 0;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		count++;
		//System.out.println("This is point class "+count);
	}
	public void destroy() {
		
		//System.out.println("Destroying Point "+count);
		count--;
	}
	
	
}

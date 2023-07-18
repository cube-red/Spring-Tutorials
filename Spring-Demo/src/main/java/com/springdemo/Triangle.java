package com.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean {
	private Point p1;
	private Point p2;
	private Point p3;
	
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	public Point getP2() {
		return p2;
	}
	public void setP2(Point p2) {
		this.p2 = p2;
	}
	public Point getP3() {
		return p3;
	}
	public void setP3(Point p3) {
		this.p3 = p3;
	}
	
	public void draw() {
		System.out.println("X=" + p1.getX() + " Y="+p1.getY());
		System.out.println("X=" + p2.getX() + " Y="+p2.getY());
		System.out.println("X=" + p3.getX() + " Y="+p3.getY());
	}
	
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Destroying Bean!!");
	}
	
	
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println("Initializing Bean!!");
	}
	
	
	
}

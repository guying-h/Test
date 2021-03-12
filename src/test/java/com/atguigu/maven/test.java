package com.atguigu.maven;

import org.junit.Test;

public class test {
	@Test
	public void testHello(){
		Hello hello=new Hello();
		String maven=hello.sayHello("maven");
		System.out.println(maven);
	}
}

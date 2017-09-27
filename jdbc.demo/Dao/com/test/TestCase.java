package com.test;

import java.util.List;

import com.service.InitService;

public class TestCase {
	
	public static void main(String[] args) {
		
		
		InitService service = new InitService();
		
		List result = service.mergeData();
		
		for (Object object : result) {
			System.out.println(object);
		}
		
	}

}

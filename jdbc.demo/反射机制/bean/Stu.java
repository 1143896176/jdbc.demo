package bean;

import support.A;
import support.ABS;
import support.B;

public class Stu extends ABS implements A,B{
	
	private Integer id;
	public String name;
	public int age;
	
	public Integer getId() {
		return this.id;
	}
	
	
	public void play(String username) {
		System.out.println(username + " ÔÚ´òÓÎÏ·........");
	}

}

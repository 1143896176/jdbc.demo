package jdbc.model;

import java.sql.Timestamp;

public class Stu {

	private int sid;
	private String sname;
	private int age;
	private Timestamp hire;

	public Stu() {

	}

	public Stu(int sid, String sname, int age, Timestamp hire) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.hire = hire;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Timestamp getHire() {
		return hire;
	}

	public void setHire(Timestamp hire) {
		this.hire = hire;
	}

	@Override
	public String toString() {
		return "Stu [sid=" + sid + ", sname=" + sname + ", age=" + age + ", hire=" + hire + "]";
	}
	
	
	

}

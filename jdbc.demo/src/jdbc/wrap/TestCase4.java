package jdbc.wrap;

import java.util.List;

import jdbc.model.Stu;
import utils.JDBCUtils;

public class TestCase4 {

	public static void main(String[] args) {

		JDBCUtils utils = new JDBCUtils();
		
		List stus = utils.findByType("select * from STU WHERE SID < ? ", Stu.class, 5);
		
		for (Object object : stus) {
			System.out.println(object);
		}

	}

}

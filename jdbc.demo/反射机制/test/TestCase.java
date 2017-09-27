package test;

import java.lang.reflect.Method;

import bean.Stu;

public class TestCase {


	public static void main(String[] args) throws Exception {

		Stu stu = new Stu();

		// 反射就是镜子

		Class s = Stu.class;
		// Class s = stu.getClass();
		// Class s = Class.forName("bean.Stu");

		// 实例化
		 Stu ss = (Stu)s.newInstance();
//		 Stu ss2 = (Stu)s.newInstance();
		// ss.play();

		// 获取类路径或完整名称;
		// System.out.println("完整的包+类名 : " + s.getName());
		// System.out.println("完整的包+类名 : " + s.getSimpleName());

		// 属性...
		// Field[] fields = s.getFields();
		// for (Field f : fields) {
		// System.out.println(f.getName());
		//
		// }
//		Field[] fields = s.getDeclaredFields(); //本类中的成员 , 
//		for (Field f : fields) {
//			System.out.println(f.getName()  + " , " + f.getModifiers());
//
//		}
		
		//先拿到属性 , 然后通过反射 为 某一个实例中的当前变量赋值
//		Field f = s.getField("name");
//		f.set(ss, "tom");
//		f.set(ss2,"jack");
//		System.out.println(ss2.name);
		 
		 //私有属性
//		 Field f = s.getDeclaredField("id");
//		 f.setAccessible(true);
//		 f.set(ss, 1);
//		 System.out.println(ss.getId());
		 
		 //方法
//		 Method[] methods = s.getMethods();
		 Method[] methods = s.getDeclaredMethods();
//		 for (Method m : methods) {
//			System.out.println(m.getName());
//	
//		}
		 //获取某个方法
		 Method method = s.getDeclaredMethod("play" ,String.class ); //可以精准的调到 重载的具体方法
		 method.invoke(ss, "tom");

//		 
		 //构造函数
//		 s.getConstructors();
		 
		 //我的实现和继承
		Class cls = s.getSuperclass();
		Class[] inter = s.getInterfaces();
		System.out.println(inter.length);
		 
	}

}

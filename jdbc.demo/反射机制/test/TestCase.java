package test;

import java.lang.reflect.Method;

import bean.Stu;

public class TestCase {


	public static void main(String[] args) throws Exception {

		Stu stu = new Stu();

		// ������Ǿ���

		Class s = Stu.class;
		// Class s = stu.getClass();
		// Class s = Class.forName("bean.Stu");

		// ʵ����
		 Stu ss = (Stu)s.newInstance();
//		 Stu ss2 = (Stu)s.newInstance();
		// ss.play();

		// ��ȡ��·������������;
		// System.out.println("�����İ�+���� : " + s.getName());
		// System.out.println("�����İ�+���� : " + s.getSimpleName());

		// ����...
		// Field[] fields = s.getFields();
		// for (Field f : fields) {
		// System.out.println(f.getName());
		//
		// }
//		Field[] fields = s.getDeclaredFields(); //�����еĳ�Ա , 
//		for (Field f : fields) {
//			System.out.println(f.getName()  + " , " + f.getModifiers());
//
//		}
		
		//���õ����� , Ȼ��ͨ������ Ϊ ĳһ��ʵ���еĵ�ǰ������ֵ
//		Field f = s.getField("name");
//		f.set(ss, "tom");
//		f.set(ss2,"jack");
//		System.out.println(ss2.name);
		 
		 //˽������
//		 Field f = s.getDeclaredField("id");
//		 f.setAccessible(true);
//		 f.set(ss, 1);
//		 System.out.println(ss.getId());
		 
		 //����
//		 Method[] methods = s.getMethods();
		 Method[] methods = s.getDeclaredMethods();
//		 for (Method m : methods) {
//			System.out.println(m.getName());
//	
//		}
		 //��ȡĳ������
		 Method method = s.getDeclaredMethod("play" ,String.class ); //���Ծ�׼�ĵ��� ���صľ��巽��
		 method.invoke(ss, "tom");

//		 
		 //���캯��
//		 s.getConstructors();
		 
		 //�ҵ�ʵ�ֺͼ̳�
		Class cls = s.getSuperclass();
		Class[] inter = s.getInterfaces();
		System.out.println(inter.length);
		 
	}

}

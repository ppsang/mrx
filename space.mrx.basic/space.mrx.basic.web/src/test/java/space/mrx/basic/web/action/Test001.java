package space.mrx.basic.web.action;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test001 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Class<Student> clazz = Student.class;
//		Constructor<Student> constructor = clazz.getConstructor();
		Constructor<Student> constructor = clazz.getDeclaredConstructor();
		constructor.setAccessible(true);
		Student student = constructor.newInstance();
//		Student student = clazz.newInstance();
		student.study();
//		Class clazz = Test002.class;
//		Constructor constructor = clazz.getConstructor();
//		Test002 test002 = (Test002) constructor.newInstance();
//		test002.study();
	}
}

class Student{
//	public Student() {
//	
//	}
	void study(){
		System.out.println("好好学习，天天向上！！");
	}
}
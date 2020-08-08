package practise1;

import java.util.*;
public class Student1{
	Map<String,Student> student=new HashMap<>();
	Set<Student> set1=new HashSet<>();
	Set<Student> set2=new HashSet<>();
	List<String> list=new ArrayList<>();
	public static void main(String args[]) {
		Student1 demo=new Student1();
		demo.runApp();
	}

	private void runApp() {
		Student student1=new Student("one",20);
		student.put("one",student1);
		Student student2=new Student("two",21);
		student.put("two",student2);
		Student student3=new Student("three",24);
		student.put("three",student3);
		Student student4=new Student("four",23);
		student.put("four",student4);
		Set<String> keys = student.keySet();
		for(String k:keys) {
			Student evenodd= student.get(k);
			if(evenodd.getAge()%2==0) {
				set1.add(evenodd);
			}
			
			else {
				set2.add(evenodd);
			}
			list.add(evenodd.getRollno());
		}
		displayAll();
		
	}

	private void displayAll() {
		for(Student student:set1) {
			System.out.println("rollno"+student.getRollno()+"age"+student.getAge());
		}
		for(Student student:set2) {
			System.out.println("roll no"+student.getRollno()+"age"+student.getAge());
		}
		for(String tarinee:list) {
			System.out.println(tarinee);
	}	
		
	}

}

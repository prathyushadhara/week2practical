package practise1;

import java.util.*;

public class StudentMain {
	public static void main(String args[]) {
		StudentMain demo = new StudentMain();
		demo.run();
	}

	Map<String, Student> map = new HashMap<>();

	public void run() {
		Student student1 = new Student("one", 18);
		Student student2 = new Student("two", 23);
		Student student3 = new Student("three", 24);
		Student student4 = new Student("four", 25);

		map.put("one", student1);
		map.put("two", student2);
		map.put("three", student3);
		map.put("four", student4);
		List<Student> list=toList(map);
		boolean isEquals = student1.equals(student2);
		boolean isEquals1 = student2.equals(student3);
		System.out.println("is equal=" + isEquals);
		System.out.println("is equal=" + isEquals1);
	
		
	}
		public List<Student> toList(Map<String,Student> map){
			List <Student>list =new ArrayList();
			
		for (Student students : list) {
			list.add(students);
		}
		for(Student students:list) { 
			System.out.println("age is "+students.getAge() +  " rollno is " + students.getRollno()); 
		}
		
		System.out.println("****even ages are****");
		Set<String> keys = map.keySet();
		for (String k : keys) {
			Student fetched = map.get(k);
			int a = fetched.getAge();
			if (a % 2 == 0)
				System.out.println("age is " + fetched.getAge() + " rollno is " + fetched.getRollno());
		}
		System.out.println("****odd ages are****");
		Set<String> nos = map.keySet();
		for (String k : nos) {
			Student fetched = map.get(k);
			int a = fetched.getAge();
			if (a % 2 == 1)
				System.out.println("age is " + fetched.getAge() + " rollno is " + fetched.getRollno());

		}
		return list;
		
		

	}
		
	
	

}

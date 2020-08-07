package week2;

import java.util.*;



public class StudentMain {
	Set<Student> set = new HashSet<Student>();

	public static void main(String args[]) {
		StudentMain demo = new StudentMain();
		demo.run();
	}

	public void run() {
		// List list = new ArrayList();
		Student student1 = new Student("one", 22);
		set.add(student1);
		Student student2 = new Student("two", 23);
		set.add(student2);
		Student student3 = new Student("three", 21);
		set.add(student3);
		Student student4 = new Student("four", 18);
		set.add(student4);
		Student student5 = new Student("five", 25);
		set.add(student5);

		boolean isEquals = student1.equals(student2);
		for (Object obj : set) {
			Student student = (Student) obj;
			List list = new ArrayList();
			if (student.getAge() > 21) {
				list.add(student);

			}
			for (int i = 0; i < list.size(); i++) {

				System.out.println(student.getRollno() + " " + student.getAge());

			}

		}

		System.out.println("is same=" + isEquals);

	}
}

package student;


import java.util.*;
public class StudentMain {	
	public static void main(String[] args) {
			StudentMain demo = new StudentMain();
			demo.runApp();
		}
	Set<Student> set=new HashSet<>();
	public void runApp() {
		//Set<Student> set=new LinkedHashSet<>();
		set.add(new Student("one",22));
		set.add(new Student("two",22));
		set.add(new Student("three",21));
		set.add(new Student("four",23));
		set.add(new Student("five",21));
		List<Student> list=toList(set);
	}
		public List<Student> toList(Set<Student> set){
			List <Student>list =new ArrayList();
			for(Student students:set) {	
			if(students.getAge()>21)
			{
				list.add(students);
			}
			}
			for(Student student:list) { 
				System.out.println("age is "+student.getAge() +  " rollno is " + student.getRollno()); 
			}
			
			return list;
	
		}
}
	



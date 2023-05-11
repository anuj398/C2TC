package day15.userDefinedFunction;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		
		Student s1 = new Student(16, "Anuj", 55);
		Student s2 = new Student(17, "Raj", 59);
		Student s3 = new Student(18, "Shukla", 68);
		Student s4 = new Student(19, "Aryan", 79);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		 System.out.println("Student Details:"+list);

	}

}
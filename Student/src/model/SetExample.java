package model;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Student s1 = new Student("Ê", "Ë", "123", 5);
		Student s2 = new Student("À", "Á", "143", 5);
		Student s3 = new Student("Å", "Ö", "133", 5);
		Student s4 = new Student("Ï", "À", "125", 5);
		Student s5 = new Student("Â", "Î", "555", 5);
		Student s6 = new Student("Ø", "Á", "111", 5);
		
		SortedSet<Student> set = new TreeSet<Student>();
		//Set<Student> set = new LinkedHashSet<Student>();
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		for(Student s : set) {
			System.out.println(s.getName() + " " + s.getFamily() + " " + s.getfNumber() + " " + s.getMark());
		}

//		int a = 5;
//		int b = a;
//		b = 6;
//		System.out.println(a + " " + b);
//		
//		Student s1 = new Student("A", "B", "123", 5);
//		Student s2 = s1;
//		s2 = new Student("D", "D", "111", 5);
//		s1.setName("Q");
//		s2.setName("C");
//		System.out.println(s1.getName() + " " + s2.getName());
	}
}
<<<<<<< HEAD
package qulz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
	//속성으로 name, id, department, grade double 를 가진다.
	//getter/setter 둘다만들기
	//모든 속성을 매개 변수로 가지는 생성자 만들기
	private String name,id,department;
	private double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Student(String name, String id, String department, double grade) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}


}

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("장성호","11","JVAV",3.8));
		studentList.add(new Student("주윤희","22","JVAVSCRIPT",4.2));
		studentList.add(new Student("정진영","33","ORACLE",4.1));
		studentList.add(new Student("장하경","44","Spring",3.9));
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.print(student.getName());
			System.out.print(student.getId());
			System.out.print(student.getDepartment());
			System.out.print(student.getGrade());
			System.out.println("====================");
		}
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("학생이름을 입력하세여.");
			String name = scanner.next();
			if(name.equals("exit")) break;
			for(int i=0;i<studentList.size();i++) {
				Student student = studentList.get(i);
				if(student.getName().equals(name)) {
					System.out.print(student.getName()+"/");
					System.out.print(student.getId()+"/");
					System.out.print(student.getDepartment()+"/");
					System.out.print(student.getGrade()+"/");
				}
			}
		}
	}
		
		//1.4명의 학생을 생성해서 studentList에 넣기
		//2.모든 학생의 정보를 축혁해보기 iterator를 이용해보기.
		//3.while 문 돌려서 이름을 입력받아 정보 출력 해보기.
	
}
=======
package qulz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
	//속성으로 name, id, department, grade double 를 가진다.
	//getter/setter 둘다만들기
	//모든 속성을 매개 변수로 가지는 생성자 만들기
	private String name,id,department;
	private double grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public Student(String name, String id, String department, double grade) {
		this.name = name;
		this.id = id;
		this.department = department;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", department=" + department + ", grade=" + grade + "]";
	}


}

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("장성호","11","JVAV",3.8));
		studentList.add(new Student("주윤희","22","JVAVSCRIPT",4.2));
		studentList.add(new Student("정진영","33","ORACLE",4.1));
		studentList.add(new Student("장하경","44","Spring",3.9));
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student student = it.next();
			System.out.print(student.getName());
			System.out.print(student.getId());
			System.out.print(student.getDepartment());
			System.out.print(student.getGrade());
			System.out.println("====================");
		}
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("학생이름을 입력하세여.");
			String name = scanner.next();
			if(name.equals("exit")) break;
			for(int i=0;i<studentList.size();i++) {
				Student student = studentList.get(i);
				if(student.getName().equals(name)) {
					System.out.print(student.getName()+"/");
					System.out.print(student.getId()+"/");
					System.out.print(student.getDepartment()+"/");
					System.out.print(student.getGrade()+"/");
				}
			}
		}
	}
		
		//1.4명의 학생을 생성해서 studentList에 넣기
		//2.모든 학생의 정보를 축혁해보기 iterator를 이용해보기.
		//3.while 문 돌려서 이름을 입력받아 정보 출력 해보기.
	
}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4

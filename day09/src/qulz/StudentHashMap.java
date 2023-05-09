<<<<<<< HEAD
package qulz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student02{
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
	public Student02(String name, String id, String department, double grade) {
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
public class StudentHashMap {
	public static void main(String[] args) {
		HashMap<String,Student02> studentMap = new HashMap<>();
		studentMap.put("장성호",new Student02("장성호","11","JVAV",3.8));
		studentMap.put("주윤희",new Student02("주윤희","22","JVAVSCRIPT",4.2));
		studentMap.put("정진영",new Student02("정진영","33","ORACLE",4.1));
		studentMap.put("장하경",new Student02("장하경","44","Spring",3.9));	
		
		//iterator 통해서 반복문 만들어 보기.
		//이름을 입력했을때 출력해보기.
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Student02 student = studentMap.get(name);
			System.out.println(student);
		}
		for(Map.Entry<String, Student02> item:studentMap.entrySet()) {
			System.out.println(item.getKey() + "**" + item.getValue());
		}//이런 방법도 있다
		
			
//			System.out.println("이름을 입력해주세요");
//			String name= scanner.next();
//			if(name.equals("종료")) break;
//			Student02 student = studentMap.get(name);
//			System.out.println("이름:"+name+"/"+student.getId()+"/"+student.getDepartment()+"/"+student.getGrade());
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력해 주세요. exit 쓰면 종료합니다");
			String name = scanner.next();
			if(name.equals("exit"))
				break;
			Student02 student = studentMap.get(name);
			System.out.print(student.getName()+"/");
			System.out.print(student.getId()+"/");
			System.out.print(student.getDepartment()+"/");
			System.out.print(student.getGrade()+"/");
		}
	}
}
=======
package qulz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Student02{
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
	public Student02(String name, String id, String department, double grade) {
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
public class StudentHashMap {
	public static void main(String[] args) {
		HashMap<String,Student02> studentMap = new HashMap<>();
		studentMap.put("장성호",new Student02("장성호","11","JVAV",3.8));
		studentMap.put("주윤희",new Student02("주윤희","22","JVAVSCRIPT",4.2));
		studentMap.put("정진영",new Student02("정진영","33","ORACLE",4.1));
		studentMap.put("장하경",new Student02("장하경","44","Spring",3.9));	
		
		//iterator 통해서 반복문 만들어 보기.
		//이름을 입력했을때 출력해보기.
		Set<String> keys = studentMap.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			Student02 student = studentMap.get(name);
			System.out.println(student);
		}
		for(Map.Entry<String, Student02> item:studentMap.entrySet()) {
			System.out.println(item.getKey() + "**" + item.getValue());
		}//이런 방법도 있다
		
			
//			System.out.println("이름을 입력해주세요");
//			String name= scanner.next();
//			if(name.equals("종료")) break;
//			Student02 student = studentMap.get(name);
//			System.out.println("이름:"+name+"/"+student.getId()+"/"+student.getDepartment()+"/"+student.getGrade());
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("이름을 입력해 주세요. exit 쓰면 종료합니다");
			String name = scanner.next();
			if(name.equals("exit"))
				break;
			Student02 student = studentMap.get(name);
			System.out.print(student.getName()+"/");
			System.out.print(student.getId()+"/");
			System.out.print(student.getDepartment()+"/");
			System.out.print(student.getGrade()+"/");
		}
	}
}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4

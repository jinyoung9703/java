package instance;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}
class StudenrWorker extends Student {}


// 생성자 오버로드 (간단하게 똑같은거 여러개...메서드도 오버로드 가능)
// 메서드 오버로드
// 메서드 오버라이드 덮어쓰기하는거


public class InstanceTest {
	
	static void print(Person person) {
		if(person instanceof Person) System.out.println("Person입니다.");
		if(person instanceof Student) System.out.println("Student입니다.");
		if(person instanceof Researcher) System.out.println("Researcher입니다.");
		if(person instanceof Professor) System.out.println("Professor입니다.");
		if(person instanceof StudenrWorker) System.out.println("StudenrWorker입니다.");
	}
	
	public static void main(String[] args) {
		print(new StudenrWorker());
		
	}
}

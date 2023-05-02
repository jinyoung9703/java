package day06;

public class Book {
	//제목,작자
	public String title;
	public String author;
	
					// 아무것도 없는 상황일땐 java 빈생성자를 만든다
	public Book() {// 생성자 함수,리턴타입을쓰지않음
		this("untitled","nonamed");// 아무것도 없는 빈 생성자 함수라도 있어야한다.
					//생선자도 함수이다 new로 한번만 만들수 있는 함수
	}
	public Book(String title) {
		this.title = title; // 나 자신을 가리키는 함수 this
		this.author = "작자미상";
	}
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}
	public void showInfo() {
		System.out.println("제목 : "+ title+","+"작가는"+author);
	}
}
<<<<<<< HEAD
package day08;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
	
		sb.append(" is pencil ");
		System.out.println(sb);
		System.out.println("-------------1");
		sb.insert(7," my");//문자에 포합시키는것
		System.out.println(sb);
		System.out.println("-------------2");
		sb.replace(8, 10, "your");//문자 포함
		System.out.println(sb);
		System.out.println("-------------3");
		sb.delete(8, 13);
		System.out.println(sb);
		System.out.println("-------------4");
		sb.setLength(4);//길이 제한
		System.out.println(sb);
		
		//String str = sb.toString();
	}
=======
package day08;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
	
		sb.append(" is pencil ");
		System.out.println(sb);
		System.out.println("-------------1");
		sb.insert(7," my");//문자에 포합시키는것
		System.out.println(sb);
		System.out.println("-------------2");
		sb.replace(8, 10, "your");//문자 포함
		System.out.println(sb);
		System.out.println("-------------3");
		sb.delete(8, 13);
		System.out.println(sb);
		System.out.println("-------------4");
		sb.setLength(4);//길이 제한
		System.out.println(sb);
		
		//String str = sb.toString();
	}
>>>>>>> d5872b956ceaa1f3765a9b2c4a998bd09ad4e7b4
}
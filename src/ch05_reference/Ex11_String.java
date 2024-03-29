package src.ch05_reference;

public class Ex11_String {

	public static void main(String[] args) {
		// 생성
		String str1 = new String("문자열");
		String str2 = "문자열";
		
		byte[] bytes = {72,101,108,111,32,74,97,118,97};
		String str3 = new String(bytes);
		System.out.printf("%s,%s,%s%n",str1, str2, str3);
		
		String str4 = "문자열";
		System.out.println(str2 == str4); 	//str2와 str4가 가리키는 곳이 동일함
		
		ch05_reference.Person james = new ch05_reference.Person("제임스", 29, "프로그래머");
		ch05_reference.Person maria = new ch05_reference.Person("마리아", 23, "학생");
		System.out.println(james + " - 123");		//Person class의 toString() method 적용
		System.out.println(maria + " - 456");
	}

}

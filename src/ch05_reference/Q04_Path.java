package ch05_reference;

public class Q04_Path {

	public static void main(String[] args) {
		String path = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
		String [] pathArr = path.split("\\\\");
		String filename = pathArr[pathArr.length - 1];
		System.out.println(filename);	
	}

}

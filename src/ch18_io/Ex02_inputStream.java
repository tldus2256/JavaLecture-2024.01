package src.ch18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02_inputStream {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("c:/Temp/sample.txt");

        // 읽는 방법
        while (true) {
            int data = is.read();               // 1바이트를 읽어서 정수형으로 반환
            if (data == -1)                     // 마지막
                break;
            System.out.println(data);
        }
        is.close();

        // 읽는 방법2
        is = new FileInputStream(new File("c:/Temp/README.txt"));
        byte[] arr = new byte[512];
        while (true) {
            int num = is.read(arr);
            System.out.println("읽은 바이트 수: " + num);
            if (num == -1)
                break;
        }
        System.out.println(new String(arr));
        is.close();
    }
}

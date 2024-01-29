package src.ch18_io;

import java.io.FileWriter;
import java.io.Writer;

public class Ex06_Writer {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("c:/Temp/output.txt");

        // 1문자씩 출력
        char a = 'A', b = 'B';
        writer.write(a); writer.write(b);

        // char 배열 쓰기
        char[] arr = {'C','D','E'};
        writer.write(arr);

        // 문자열 쓰기
        writer.write("FG\n");
        writer.write(" 한글도 잘 써짐");

        writer.flush(); writer.close();
    }
}

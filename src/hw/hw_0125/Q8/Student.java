package src.hw.hw_0125.Q8;

import java.util.Objects;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    @Override
    public int hashCode() {
//        return studentNum;
        return Objects.hash(studentNum);
    }

    @Override
    public boolean equals(Object obj){
//        if(obj instanceof Student){
//            Student st = (Student) obj;
//            return this.studentNum == st.studentNum;
//        }
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentNum == student.studentNum;
    }
}

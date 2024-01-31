package src.hw.hw_0125;

import java.time.LocalDate;

public class Member {
    private int mid;
    private String name;
    private int birthYear;
    private String tel;

    public Member() {}

    public Member(int mid, String name, int birthYear, String tel) {
        this.mid = mid;
        this.name = name;
        this.birthYear = birthYear;
        this.tel = tel;
    }

    @Override
    public String toString() {
        LocalDate currentDate = LocalDate.now();

        int currentYear = currentDate.getYear();

        return "Member{" +
                "ID=" + mid +
                ", 이름='" + name + '\'' +
                ", 나이=" + (currentYear - birthYear) +
                ", 전화번호='" + tel + '\'' +
                '}';
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getMid() {
        return mid;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getTel() {
        return tel;
    }
}

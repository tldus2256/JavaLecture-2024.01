package src.hw.hw_0125.Q31;


import java.util.ArrayList;

//2) james, maria 두 객체를 ArrayList로 만들어 반환하는 메소드 getMemberList() 를 만드세요.[20]
//3) 2)에서 만든 객체의 전화번호를 변경한 후 두 객체를 출력하세요.[10]

public class MemberMain {
    public static void main(String[] args) {
    ArrayList<Member> members = getMemberList();

    for (Member member : members){
        if (member.getName().equals("maria")){
            member.setTel("010-1111-1111");
        } else {
            member.setTel("010-2222-2222");
        }
    }
    for (Member member : members) {
        System.out.println("ID: " + member.getMid());
        System.out.println("Name: " + member.getName());
        System.out.println("Birth Year: " + member.getBirthYear());
        System.out.println("Phone Number: " + member.getTel());
        System.out.println();
    }

    }
    public static ArrayList<Member> getMemberList() {
        ArrayList<Member> memberList = new ArrayList<>();

        Member james = new Member(1,"james",1996,"010-1234-5678");
        Member maria = new Member(2,"maria",1995,"010-9876-5432");

        memberList.add(james);
        memberList.add(maria);

        return memberList;
    }

}

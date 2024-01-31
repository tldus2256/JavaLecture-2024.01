package src.hw.hw_0125.Q31;

import java.util.ArrayList;

public class Q2_2 {
    public static void main(String[] args) {
        ArrayList<Member> members = getMemberList();

        for (Member member : members) {
            if(member.getName().equals("maria")){
                member.setTel("010-1111-1111");
            }else{
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

        Member james = new Member(1, "james", 1996, "010-1234-5678");
        Member maria = new Member(2, "maria", 1995, "010-9876-5432");

        memberList.add(james);
        memberList.add(maria);

        return memberList;
    }


}

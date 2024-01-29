package src.ch18_io.sec11_message;

import java.util.List;
import java.util.Scanner;

public class MessageMain {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceListImpl();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("+=============+=================+==========+==========+==========+========+");
            System.out.println("| 1. 전체목록 | 2.Writer별 목록 | 3.글쓰기 | 4.글수정 | 5.글삭제 | 6.종료 |");
            System.out.println("+=============+=================+==========+==========+==========+========+");
            System.out.print("선택> ");
            int select = Integer.parseInt(scanner.nextLine());

        switch (select){
            case 1:
                List<Message> messageList = messageService.getMessageListAll();
                if(messageService.getMessageListAll().isEmpty()){
                    System.out.println("목록이 존재하지 않습니다.");
                    break;
                }
                for (Message m: messageService.getMessageListAll()){
                    System.out.println(m);
                }
                break;
              //  ---------------------------------------------------------------
//                list = messageService.getMessageListAll();
//                list.forEach(x-> System.out.println(x));


            case 2:
                System.out.println("글쓴이");
                String writer = scanner.nextLine();

                List<Message>writerList = messageService.getMessageListByWriter(writer);
                System.out.println(writerList);
                break;

            case 3:
                System.out.println("새로등록하기");
                System.out.print("글쓴이 : ");
                String newWriter = scanner.nextLine();
                System.out.println("내용 입력: ");
                String newContent = scanner.nextLine();

                Message newMessage = new Message(newWriter,newContent);
                messageService.insertMessage(newMessage);
                break;

            case 4:
                System.out.println("수정할 글 ID조회: ");
                int mid = Integer.parseInt(scanner.nextLine());
                messageService.updateMessage(messageService.findByMid(mid));
                break;

            case 5:
                System.out.println("삭제할 글 ID조회");
                int mid2 = Integer.parseInt(scanner.nextLine());
                messageService.deleteMessage(mid2);
                break;

            case 6:
                run = false;
                messageService.close();
                break;
            default:
                System.out.println("Warning: 1 ~ 6 사이의 숫자만 입력하세요");
            }
        }
        System.out.println("프로그램 종료");
    }

}
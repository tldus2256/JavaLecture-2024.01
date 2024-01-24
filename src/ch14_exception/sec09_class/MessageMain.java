//package src.ch14_exception.sec09_class;
//
//
//import java.util.Scanner;
//
//public class MessageMain {
//
//    private static Scanner scanner = new Scanner(System.in);
//    private static MessageService messageService = new MessageServiceArrayImpl();
//
//    public static void main(String[] args) {
//        boolean run = true;
//        while (run) {
//            System.out.println("+============+============+========+=========+====================+");
//            System.out.println("| 1.전체목록 | 2.Writer별목록 | 3.글쓰기 | 4. 글수정 | 5. 글삭제 | 6.종료 |");
//            System.out.println("+============+============+========+=========+=====================+");
//            System.out.print("선택> ");
//
//            int selectNo = Integer.parseInt(scanner.nextLine());
//            switch (selectNo) {
//                case 1:
//                    messageService.messageList();
//                    break;
//
//                case 2:
//                    Scanner scanner1 = new Scanner(System.in);
//                    System.out.print("글쓴이를 입력하세요. ");
//                    String writer = scanner1.nextLine();
//                    messageService.messageListByWriter(writer);
//                    break;
//
//                case 3:
//                    //    mid, content, writer, genTime, isDeleted
//                    int mid = 1000+MessageServiceArrayImpl.getIndex();
//
//                    Scanner scanner2 = new Scanner(System.in);
//                    System.out.print("내용을 입력하세요. ");
//                    String content = scanner2.nextLine();
//
//                    Scanner scanner3 = new Scanner(System.in);
//                    System.out.print("글쓴이를 입력하세요. ");
//                    String  = scanner3.nextLine();
//
//                    messageService.insertMessage(message);
//                    break;
//
//                case 4:
//                    messageService.updateMessage();
//                    break;
//
//                case 5:
//                    messageService.deleteMessage();
//                    break;
//
//                case 6:
//                    run = false;
//                    break;
//                default:
//                    System.out.println("다시입력해주세요.");
//            }
//            System.out.println("종료");
//        }
//    }
//
//
//}
//
//

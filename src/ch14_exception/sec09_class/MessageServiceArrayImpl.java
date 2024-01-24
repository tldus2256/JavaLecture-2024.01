package src.ch14_exception.sec09_class;

import java.lang.reflect.GenericArrayType;
import java.time.LocalDateTime;
import java.util.Scanner;

public class MessageServiceArrayImpl implements MessageService {
    private static Message[] messageArray = new Message[100];
    private static Scanner scan = new Scanner(System.in);
    private static int index = 5;

    public static int getIndex() {
        return index;
    }

    public MessageServiceArrayImpl() {
        messageArray[0] = new Message(101,"자바 세계에 오신걸 환영합니다.","제임스",LocalDateTime.now(),0);
        messageArray[1] = new Message(102,"안녕하세요? 반갑습니다.","마리아",LocalDateTime.now(),0);
        messageArray[2] = new Message(103,"좋은 하루 되세요.","브라이언",LocalDateTime.now(),0);
        messageArray[3] = new Message(104,"휴먼교육센터에서 강의를 들어보세요.","엠마",LocalDateTime.now(),0);
        messageArray[4] = new Message(105,"스프링부트도 함께 배워요.","제임스",LocalDateTime.now(),0);
    }

    @Override
    public Message findByMid(int mid) {
        for (Message msg : messageArray) {
            if (msg == null)
                return null;
            if (msg.equals(msg.getMid()) && msg.getIsDeleted() != DELETED) {
                return msg;
            }
        }
        return null;
    }


    @Override
    public void messageList() {
        for (int i = 0; i < index; i++) {
            Message msg = messageArray[i];
            if (msg.getIsDeleted() == MessageService.DELETED)
                continue;
            System.out.printf("%d %-6s\t%,10d%n", msg.getMid(), msg.getContent(), msg.getGenTime(), msg.getWriter(), msg.getIsDeleted());
        }
    }

    @Override
    public void messageListByWriter(String writer) {
        for (int i = 0; i < index; i++) {
            Message msg = messageArray[i];
            if (msg.getWriter().equals(writer) && msg.getIsDeleted() == MessageService.DELETED)
                continue;
            System.out.printf("%d %-6s\t%,10d%n", msg.getMid(), msg.getContent(), msg.getGenTime(), msg.getWriter(), msg.getIsDeleted());
        }
    }

    @Override
    public void insertMessage(Message message) {
        int mid = (1000 + index);        // index : 현재 빈 곳을 가리킴

        System.out.print("내용");
        String content = scan.nextLine();

        System.out.print("글쓴이");
        String writer = scan.nextLine();

        LocalDateTime genTime = LocalDateTime.now();

        System.out.print("삭제여부");
        int isDeleted = scan.nextInt();

        Message msg = new Message(mid, content, writer, genTime, isDeleted);
        messageArray[index++] = msg;
    }

    @Override
    public void updateMessage(Message message) {

    }

    @Override
    public void deleteMessage(int mid) {
        int isDeleted = scan.nextInt();
        Message msg = findByMid(mid);
        if(msg!=null)
        msg.setIsDeleted(MessageService.DELETED);

    }
}

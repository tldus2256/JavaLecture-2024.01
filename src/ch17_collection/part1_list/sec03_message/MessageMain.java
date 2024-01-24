package src.ch17_collection.part1_list.sec03_message;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageMain {
    private static List<Message> list = new ArrayList<>();
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceListImpl();
        Message msg1 = new Message(1, "내용 1", "작성자 1", LocalDateTime.now(), 0);
        Message msg2 = new Message(2, "내용 2", "작성자 2", LocalDateTime.now(), 0);
        Message msg3 = new Message(3, "내용 3", "작성자 3", LocalDateTime.now(), 0);
        messageService.insertMessage(msg1);
        messageService.insertMessage(msg2);
        messageService.insertMessage(msg3);
        for (Message msg : list){
            System.out.println(msg);
        }
        messageService.getMessageListAll();
    }


}

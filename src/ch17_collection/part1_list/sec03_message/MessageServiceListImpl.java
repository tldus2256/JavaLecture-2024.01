package src.ch17_collection.part1_list.sec03_message;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceListImpl implements MessageService{
    private static List<Message> list = new ArrayList<>();
    private int index = 0;

    @Override
    public Message findByMid(int mid) {
        for (Message msg: list) {
            if (msg == null)
                break;
            if (mid == msg.getMid())
                return msg;
        }
        return null;
    }

    @Override
    public List<Message> getMessageListAll() {
        for (Message msg: list) {
            if (msg == null)
                break;
            if (msg.getIsDeleted() != MessageService.DELETED)
                System.out.println(msg);
        }
        return null;
    }

    @Override
    public List<Message> getMessageListByWriter(String writer) {
        for (Message msg: list) {
            if (msg == null)
                break;
            if (msg.getWriter().equals(writer) && msg.getIsDeleted() != MessageService.DELETED)
                System.out.println(msg);
        }
        return null;
    }

    @Override
    public void insertMessage(Message message) {
        int mid = 101 + index++;
        message.setMid(mid);
        message.setModTime(LocalDateTime.now());
        list.add(message);


    }

    @Override
    public void updateMessage(Message message) {
        Message msg = findByMid(message.getMid());
        msg.setModTime(message.getModTime());
        msg.setContent(message.getContent());
        msg.setWriter(message.getWriter());
        msg.setIsDeleted(message.getIsDeleted());
    }

    @Override
    public void deleteMessage(int mid) {
        Message msg = findByMid(mid);
        if (msg != null) {
            msg.setIsDeleted(MessageService.DELETED);
        }

    }
}

package src.ch18_io.sec11_message;

import src.ch17_collection.part1_list.sec03_message.MessageServiceListImpl;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MessageServiceFileImpl implements MessageService{
    private List<Message>list = new ArrayList<>();
    private int index = 101;
    private String saveFilename = "c:/Temp/message.ser";

    public MessageServiceFileImpl() {
        File saveFile = new File(saveFilename);
        if (saveFile.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFile));
                list = (List<Message>) ois.readObject();
                index += list.size();
                Message msg = list.get(list.size() - 1);
                index = msg.getMid() + 1;
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            list.add(new Message(index++,"자바 세계에 오신걸 환영합니다.", "제임스", LocalDateTime.now()));
            list.add(new Message(index++,"안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now()));
            list.add(new Message(index++,"좋은 하루 되세요.", "브라이언", LocalDateTime.now()));
            list.add(new Message(index++,"휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now()));
            list.add(new Message(index++,"스프링부트도 함께 배워요.", "제임스", LocalDateTime.now()));
        }
    }
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
        Message newMessage = new Message(mid,message.getContent(),message.getWriter(),LocalDateTime.now(),message.getIsDeleted());
//        message.setMid(index++);
//        message.setModTime(LocalDateTime.now());
        list.add(newMessage);
    }

    @Override
    public void updateMessage(Message message) {
        Message msg = findByMid(message.getMid());
        msg.setModTime(message.getModTime());
        msg.setContent(message.getContent());
        msg.setWriter(message.getWriter());
        msg.setIsDeleted(message.getIsDeleted());
//        int index = 0;
//        for(Message msg:list) {
//            if (msg.getMid() == message.getMid()){
//                index = list.indexOf(msg);
//                break;
//            }
//        }
//        message.setModTime(LocalDateTime.now());
//        list.set(index,message);
    }

    @Override
    public void deleteMessage(int mid) {
        Message msg = findByMid(mid);
        if (msg != null) {
            msg.setIsDeleted(MessageService.DELETED);
        }
    }

    @Override
    public void close() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(saveFilename));
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

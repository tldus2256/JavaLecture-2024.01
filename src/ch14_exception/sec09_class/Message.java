package src.ch14_exception.sec09_class;

import java.time.LocalDateTime;

public class Message {
    private int mid;
    private String content;
    private String writer;
    private LocalDateTime genTime;
    private int isDeleted;

    public Message() { }

    public Message(int mid, String content, String writer, LocalDateTime genTime, int isDeleted) {
        this.mid = mid;
        this.content = content;
        this.writer = writer;
        this.genTime = genTime;
        this.isDeleted = isDeleted;
    }
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDateTime getGenTime() {
        return genTime;
    }

    public void setGenTime(LocalDateTime genTime) {
        this.genTime = genTime;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

}


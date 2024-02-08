package src.mysql.sec07_bbs.dao;

import src.mysql.sec07_bbs.entitty.Reply;

import java.util.List;
public class ReplyDaoTest {
    public static void main(String[] args) {
        ReplyDao rDao = new ReplyDao();
        BoardDao bDao = new BoardDao();
        String sessionUid = "james";
        int bid = 11;

        Reply r = new Reply();
        r.setComment("댓글3"); r.setUid(sessionUid); r.setBid(bid);
        rDao.insertReply(r);
        bDao.increaseCount("reply",bid);

        List<Reply> list = rDao.getReplyList(bid);
        list.forEach(x -> System.out.println(x));

        bDao.close(); rDao.close();
    }
}
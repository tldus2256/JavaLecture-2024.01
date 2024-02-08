package src.mysql.sec07_bbs.dao;

import src.mysql.sec07_bbs.entitty.Board;

import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao bDao = new BoardDao();
//        String sessionUid = "james";            // 제임스가 로그인한 것으로 가정

        Board b = bDao.getBoard(10);
//        if (!b.getUid().equals(sessionUid))     // 제임스가 작성한 글이 아니면
//             bDao.increaseCount("view",10);
//        System.out.println(b);

        b = new Board("제목11","본문 11","james");
        bDao.insertBoard(b);
        b = new Board("제목 12","본문 12","james");
        bDao.insertBoard(b);
        b = new Board("제목13","본문 13","maria");
        bDao.insertBoard(b);
        b = new Board("제목 14","본문 14","sarah");
        bDao.insertBoard(b);
        b = new Board("제목 15","본문 15","brian");
        bDao.insertBoard(b);

        List<Board> list = bDao.getBoardList("title","%",10,0);
        list.forEach(x-> System.out.println(x.listForm()));

        bDao.close();
    }
}

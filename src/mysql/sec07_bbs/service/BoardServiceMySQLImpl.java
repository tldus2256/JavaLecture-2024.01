package src.mysql.sec07_bbs.service;

import src.mysql.sec07_bbs.dao.BoardDao;
import src.mysql.sec07_bbs.dao.ReplyDao;
import src.mysql.sec07_bbs.entitty.Board;
import src.mysql.sec07_bbs.entitty.Reply;

import java.util.List;

public class BoardServiceMySQLImpl implements BoardService{
    private String sessionUid = "james";             // james로 로그인했다고 가정
    private BoardDao bDao = new BoardDao();
    private ReplyDao rDao = new ReplyDao();

    @Override
    public List<Board> getBoardList(int page, String field, String query) {
        int offset = (page - 1) * COUNT_PER_PAGE;
        if (field == null || field.equals("")) {
            field = "title"; query = "%";
        }
        List<Board> list = bDao.getBoardList(field,query,COUNT_PER_PAGE,offset);
        return list;
    }

    @Override
    public Board getBoard(int bid) {
        Board board = bDao.getBoard(bid);
        if (!board.getUid().equals(sessionUid)) {
            bDao.increaseCount("view", bid);
            board.setViewCount(board.getViewCount() + 1);
        }
        List<Reply> list = rDao.getReplyList(bid);
        if (list.size() > 0 )
            board.setReplyList(list);
        return board;
    }

    @Override
    public void insertBoard(Board board) {

    }

    @Override
    public void updateBoard(Board board) {

    }

    @Override
    public void deleteBoard(int bid) {

    }

    @Override
    public void close() {
        bDao.close();
        rDao.close();
    }
}

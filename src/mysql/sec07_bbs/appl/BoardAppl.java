package src.mysql.sec07_bbs.appl;

import src.mysql.sec07_bbs.entitty.Board;
import src.mysql.sec07_bbs.service.BoardService;
import src.mysql.sec07_bbs.service.BoardServiceMySQLImpl;

import java.util.List;

public class BoardAppl {
    public static void main(String[] args) {
        BoardService bSvc = new BoardServiceMySQLImpl();

        List<Board> list = bSvc.getBoardList(1,"","");
        list.forEach(x-> System.out.println(x.listForm()));
        System.out.println("================================================================");

        Board board = bSvc.getBoard(15);
        System.out.println(board);
        if (board.getReplyList() != null)
            board.getReplyList().forEach(x-> System.out.println(x));

        bSvc.close();
    }
}

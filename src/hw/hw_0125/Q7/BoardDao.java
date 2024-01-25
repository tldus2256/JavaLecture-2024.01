package src.hw.hw_0125.Q7;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    Board board1 = new Board("제목1", "내용1");
    Board board2 = new Board("제목2", "내용2");
    Board board3 = new Board("제목3", "내용3");


    public List<Board> getBoardList() {
        List<Board> boardList = new ArrayList<>();
        boardList.add(board1);
        boardList.add(board2);
        boardList.add(board3);

        return boardList;
    }

}

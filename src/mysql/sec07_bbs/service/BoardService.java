package src.mysql.sec07_bbs.service;

import src.mysql.sec07_bbs.entitty.Board;

import java.util.List;

public interface BoardService {
    public static final int COUNT_PER_PAGE = 10;
    List<Board> getBoardList(int page, String field, String query);

    Board getBoard(int bid);

    void insertBoard(Board board);
    void updateBoard(Board board);
    void deleteBoard(int bid);
    void close();
}

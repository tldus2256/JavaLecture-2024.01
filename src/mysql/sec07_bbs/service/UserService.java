package src.mysql.sec07_bbs.service;

import src.mysql.sec07_bbs.entitty.User;

import java.util.List;

public interface UserService {
    public static final int CORRECT_LOGIN = 0;
    public static final int WRONG_PASSWORD = 1;
    public static final int USER_NOT_EXIST = 2;
    public static final int COUNT_PER_PAGE = 5;

    User getUserByUid(String uid);

    List<User> getUserList(int page);
    void registerUser(User user);
    void updateUser(User user);
    void deleteUser(String uid);
    int login(String uid,String pwd);
    void close();
}

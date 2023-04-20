package skypro.withmockito.dao;

import skypro.withmockito.model.User;

import java.util.List;

public interface UserDao {

    User getUserByName(String name);

    List<User> findAllUsers();
}

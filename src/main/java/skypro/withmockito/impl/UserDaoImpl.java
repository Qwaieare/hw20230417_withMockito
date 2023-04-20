package skypro.withmockito.impl;

import skypro.withmockito.dao.UserDao;
import skypro.withmockito.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserDaoImpl implements UserDao {
    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
       this.users.add(new User("John", "[email protected]"));
        this.users.add(new User("Susan", "[email protected]"));
        this.users.add(new User("Vadim", "[email protected]"));
    }

    @Override
    public User getUserByName(String name) {  // принимает имя и возвращает юзера по этому имени
        if (!users.isEmpty()) {
            Optional<User> user =  users.stream()   // используется для переноса объектов и обеспечения обработки ссылок на null
                    .filter(v -> v.getName().equals(name))
                    .findFirst();  // извлекает из потока первый элемент
            if (user.isPresent()){  // проверяет наличие значения внутри объекта Optional
                return user.get();
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }


}

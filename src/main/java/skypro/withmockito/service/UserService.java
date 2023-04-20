package skypro.withmockito.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import skypro.withmockito.dao.UserDao;
import skypro.withmockito.model.User;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public boolean checkUserExists(User user){
        return userDao.getUserByName(user.getName()) != null;
    }


}

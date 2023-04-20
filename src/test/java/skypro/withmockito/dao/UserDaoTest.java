package skypro.withmockito.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import skypro.withmockito.impl.UserDaoImpl;
import skypro.withmockito.model.User;

import static org.junit.jupiter.api.Assertions.*;


public class UserDaoTest {
    private static String NO_USER = "Иван";
    private final UserDaoImpl userImplDao = new UserDaoImpl();


    @Test
    void findNotNullUserByNameIfExist() {
        assertNotNull(userImplDao.getUserByName("John"));
        assertEquals(new User("Susan", "[email protected]"),
                userImplDao.getUserByName("Susan"));
    }

    @Test
    void findUserByNameIfExistNotNull() {
        assertNull(userImplDao.getUserByName("Иван"));
    }

}

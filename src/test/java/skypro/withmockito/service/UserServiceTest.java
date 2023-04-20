package skypro.withmockito.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import skypro.withmockito.dao.UserDao;
import skypro.withmockito.impl.UserDaoImpl;
import skypro.withmockito.model.User;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    User VADIM = new User("Vadim", "[email protected]");
    User IVAN = new User("Иван", "[email protected]");
    @Mock
    private UserService userService;
    @InjectMocks
    private UserDaoImpl userDaoImpl;

    @Test
    public void shouldCheckIfUserExistTrue() {
        when(userService.checkUserExists(VADIM)).thenReturn(true);
        assertTrue(userService.checkUserExists(VADIM));
    }

    @Test
    public void shouldCheckIfUserExistFalse() {
        when(userService.checkUserExists(IVAN)).thenReturn(false);
        assertFalse(userService.checkUserExists(IVAN));
    }

}

package jdbcdemo;
import com.mysql.cj.jdbc.ConnectionImpl;
import jdbcdemo.dao.DataValidationException;
import jdbcdemo.dao.UserDao;
import jdbcdemo.dao.UserDaoImpl;
import jdbcdemo.model.User;
import jdbcdemo.service.UserService;
import jdbcdemo.service.UserServiceImpl;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserServiceTest {
    private UserService userService;
    Connection connection;
    private List<User> userList;

    @Before
    public void setUp() throws Exception {
        userService = new UserServiceImpl(Mockito.mock(UserDao.class));

        userList = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
        userList.clear();
    }

    @Test
    public void testGetAllUpperCase() {
        String nameOne = "nameOne";
        String nameTwo = "nameTwo";

        User userOne = new User();
        userOne.setName(nameOne);
        User userTwo = new User();
        userTwo.setName(nameTwo);

        userList.add(userOne);
        userList.add(userTwo);

        //UserDao userDao = new UserDaoImpl(connection);
        UserDao userDao = Mockito.mock(UserDao.class);
        Mockito.when(userDao.findAll()).thenReturn(userList);

        userService = new UserServiceImpl(userDao);

        List<String> actualAllNames = null;
        try {
            actualAllNames = userService.getUpperCaseLogin();
        } catch (DataValidationException e) {
            e.printStackTrace();
        }
        List<String> expectedAllNames = Arrays.asList("NAMEONE", "NAMETWO");

        Assert.assertEquals(expectedAllNames, actualAllNames);
    }

    @Test
    public void someTest() {
        String nameOne = null;
        String nameTwo = "nameTwo";
        String nameThree = "nameThree";

        User userOne = new User();
        userOne.setName(nameOne);
        User userTwo = new User();
        userTwo.setName(nameTwo);
        User userThree = new User();
        userThree.setName(nameThree);

        userList.add(userOne);
        userList.add(userTwo);
        userList.add(null);

        UserDao userDao = Mockito.mock(UserDao.class);
        Mockito.when(userDao.findAll()).thenReturn(userList);

        userService = new UserServiceImpl(userDao);

        List<String> actualAllNames = null;
        String ex = "User list size should not be greater then 2";
        try {
            actualAllNames = userService.getUpperCaseLogin();
        } catch (DataValidationException e) {
            Assert.assertEquals(ex, e.getMessage());
            return;
        }

        Assert.fail("DataValidationException should be thrown");
    }
}

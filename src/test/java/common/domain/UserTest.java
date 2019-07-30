package common.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {
    private static final String TEST_FIRST_NAME = "John";
    private static final String TEST_LAST_NAME = "Doe";
    private static final String TEST_EMAIL_ADDRESS = "John.Doe@test.com";
    private static final int TEST_AGE = 99;


    @Test
    public void testUserIDInitialisation() {
        User user = new User();

        assertTrue("UserID shouldn't be uninitialised", user.getUserID() != null);
    }

    @Test
    public void testInstantiateNewUserWithNoArgConstrAndSetValues() {
        User user = new User();
        user.setFirstName(TEST_FIRST_NAME);
        user.setLastName(TEST_LAST_NAME);
        user.setEmailAddress(TEST_EMAIL_ADDRESS);
        user.setAge(TEST_AGE);

        assertEquals(user.getFirstName(), TEST_FIRST_NAME);
        assertEquals(user.getLastName(), TEST_LAST_NAME);
        assertEquals(user.getEmailAddress(), TEST_EMAIL_ADDRESS);
        assertEquals(user.getAge(), TEST_AGE);
    }

    @Test
    public void testInstantiateUserWithParameters() {
        User user = new User(TEST_FIRST_NAME, TEST_LAST_NAME, TEST_EMAIL_ADDRESS, TEST_AGE);

        assertEquals(user.getFirstName(), TEST_FIRST_NAME);
        assertEquals(user.getLastName(), TEST_LAST_NAME);
        assertEquals(user.getEmailAddress(), TEST_EMAIL_ADDRESS);
        assertEquals(user.getAge(), TEST_AGE);
    }

}
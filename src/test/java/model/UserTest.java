package model;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by tab.her on 2/8/2017.
 */
public class UserTest
{
    User user = new User("Tabb", "Her", "1007 Reaney Ave");
    List<User> enlistedUsers = new ArrayList<User>();

    @Test
    public void testGetUserName()
    {
        //assert Username will be string "Tab"
        assertEquals("Tab", user.getFirstName());
    }

    @Test
    public void testGetUserArray()
    {

        //assert will return array of 2 people
        assertEquals(2, enlistedUsers.size());
    }

}
package model;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tab.her on 2/8/2017.
 */
public class UserTest
{
    User user = new User("Tab", "Her", "1007 Reaney Ave");

    @Test
    public void testGetUserName()
    {
        //assert Username will be string "Tab"
        assertEquals("Tab", user.getFirstName());
    }

}
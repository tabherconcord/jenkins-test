package model;

/**
 * Created by tab.her on 2/8/2017.
 */
public class User
{
    //Constructor
    public User(String fn, String ln, String add)
    {
        this.firstName = fn;
        this.lastName = ln;
        this.address = add;
    }
    //User fields
    private String firstName, lastName, address;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

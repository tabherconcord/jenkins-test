import model.User;

/**
 * Created by tab.her on 2/8/2017.
 */
public class Application
{
    public static void main(String[] args)
    {
        User user = new User("Tab", "Her", "1007 Reaney Ave");

        System.out.println(user.getFirstName() + " " + user.getLastName());
    }
}

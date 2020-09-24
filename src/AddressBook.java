import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook()
    {
        buddies = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy)
    {
        buddies.add(buddy);
    }
    public void removeBuddy()
    {
        if (!buddies.isEmpty())
        {
            buddies.remove(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}

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
    public void removeBuddy(BuddyInfo buddy)
    {
        if (!buddies.isEmpty())
        {
            buddies.remove(buddy);
        }
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Bud", "123 Fake Street", 12);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}

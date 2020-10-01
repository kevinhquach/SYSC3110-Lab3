import java.util.List;
import java.util.ArrayList;

public class AddressBook {
    private List<BuddyInfo> buddies;

    public AddressBook()
    {
        buddies = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy)
    {
        if (buddy != null)
            buddies.add(buddy);
    }
    public BuddyInfo removeBuddy(int index)
    {
        if (index >= 0 && index < buddies.size())
            return buddies.remove(index);

        return null;
    }

    public static void main(String[] args) {
        System.out.println("test");
        BuddyInfo buddy = new BuddyInfo("Bud", "123 Fake Street", 12);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}

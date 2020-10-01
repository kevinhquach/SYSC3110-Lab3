public class BuddyInfo {

    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber)
    {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
        //BuddyInfo bud = new BuddyInfo();
        //bud.name = "Buddy";

        //System.out.println("Hello " + bud.getName());
    }
}

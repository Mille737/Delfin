public class Svømmer {

    public String name;
    public int age;
    protected String sejt;
    public boolean activeMember;
    public String membershipType;

    public void setInfo() {
        name = "Christian";
        age = 23;
        activeMember = true;
        membershipType = "Motionist";
        System.out.println("Svømmer navn: " + name);
        System.out.println("Svømmer alder: " + age);
        System.out.println("Svømmer type: " + membershipType);
        System.out.println("Svømmer aktivt: " + activeMember);
    }
}

import java.util.Scanner;

public class Members {

    private String name;
    private int age;
    private boolean aktivitetsStatus;
    private String engagement;
    private int cpr;
    private int price;
    private boolean isPaid;

    Scanner sc = new Scanner(System.in);


    public Members(String name, int age, boolean aktivitetsStatus, String engagement, int cpr, int price, boolean isPaid)
    {
        this.name = name;
        this.age = age;
        this.aktivitetsStatus = aktivitetsStatus;
        this.engagement = engagement;
        this.cpr = cpr;
        this.price = price;
        this.isPaid = isPaid;
    }
    public Members()
    {

    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
        age = sc.nextInt();
    }

    public boolean isAktivitetsStatus()
    {
        return aktivitetsStatus;
    }

    public void setAktivitetsStatus(boolean aktivitetsStatus)
    {
        this.aktivitetsStatus = aktivitetsStatus;
    }

    public String getEngagement()
    {
        return engagement;
    }

    public void setEngagement(String engagement)
    {
        this.engagement = engagement;
    }

    public int getCpr()
    {
        return cpr;
    }

    public void setCpr(int cpr)
    {
        this.cpr = cpr;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public boolean isPaid()
    {
        return isPaid;
    }

    public void setPaid(boolean paid)
    {
        isPaid = paid;
    }
}

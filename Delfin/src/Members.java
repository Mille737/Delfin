
public class Members {

    private String name;
    private int age;
    private String aktivitetsStatus;
    private String engagement;
    private String cpr;
    private String price;
    private String isPaid;

    public Members(String name, int age, String aktivitetsStatus, String engagement, String cpr, String price, String isPaid)
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
    }

    public String isAktivitetsStatus()
    {
        return aktivitetsStatus;
    }

    public void setAktivitetsStatus(String aktivitetsStatus)
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

    public String getCpr()
    {
        return cpr;
    }

    public void setCpr(String cpr)
    {
        this.cpr = cpr;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String isPaid()
    {
        return isPaid;
    }

    public void setPaid(String paid)
    {
        isPaid = paid;
    }

    public String toString(){
        return name + "\t" + age + "\t" + aktivitetsStatus + "\t" + engagement + "\t" + cpr + "\t"+ price + "\t" + isPaid;
    }
}

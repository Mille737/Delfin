import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIn
{
    private static final String filepath = "/Users/robinzernickov/Documents/GitHub/Delfin/Delfin/src/Members.txt";

    public void createSwimmer()
    {
        try
        {

            Scanner sc = new Scanner(System.in);
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Navn:");
            String name = sc.nextLine();

            System.out.println("Alder:");
            int age = sc.nextInt();

            System.out.println("Aktivitets Status:");
            boolean aktivitetsStatus = sc.nextBoolean();

            System.out.println("Engagement:");
            String engagement = sc.next();

            System.out.println("CPR-Nummer:");
            int cpr = sc.nextInt();

            System.out.println("Pris:");
            int price = sc.nextInt();

            System.out.println("Er det betalt?");
            boolean isPaid = sc.nextBoolean();

            bw.write(name + "\t" + age + "\t" + aktivitetsStatus + "\t" + engagement + "\t" + cpr + "\t" + price + "\t" + isPaid + "\n");

            Members members = new Members(name, age, aktivitetsStatus, engagement, cpr, price, isPaid);

            ArrayList<Members> membersArrayList = new ArrayList<>();
            membersArrayList.add(members);

            bw.close();


        }catch(Exception e){System.out.println(e);}

        System.out.println("Success...");

    }

    public void updateSwimmer()
    {

    }

    public void deleteSwimmer()
    {

    }
}

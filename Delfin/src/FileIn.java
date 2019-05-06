import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileIn
{
    private static final String filepath = "C:\\Users\\mille\\Documents\\GitHub\\Delfin\\Delfin\\src\\Members.txt";
    Scanner sc = new Scanner(System.in);

    public void createSwimmer()
    {
        try
        {

            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Navn:");
            String name = sc.next();

            System.out.println("Alder:");
            String age = sc.next();

            System.out.println("Aktivitets Status:");
            String aktivitetsStatus = sc.next();

            System.out.println("Engagement:");
            String engagement = sc.next();

            System.out.println("CPR-Nummer:");
            String cpr = sc.next();

            System.out.println("Pris:");
            String price = sc.next();

            System.out.println("Er det betalt?");
            String isPaid = sc.next();

            bw.write(name + "\t" + age + "\t" + aktivitetsStatus + "\t" + engagement + "\t" + cpr + "\t" + price + "\t" + isPaid + "\n");

            Members members = new Members(name, age, aktivitetsStatus, engagement, cpr, price, isPaid);

            ArrayList<Members> membersArrayList = new ArrayList<>();
            membersArrayList.add(members);

            bw.close();


        }catch(Exception e){System.out.println(e);}

        System.out.println("Success...");

    }

    public void viewSwimmer()
    {
        try {
            List<Members> members = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;


            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                Members m = new Members(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
                members.add(m);
            }
            reader.close();

            for(Members member: members) {
                System.out.println(member);
            }

            String søgning = sc.next();

            for(Members member: members){
                if(member.getName().equalsIgnoreCase(søgning)){
                    System.out.println(member);
                }
            }

        } catch(Exception e){System.out.println(e);}


    }

    public void updateSwimmer()
    {

    }

    public void deleteSwimmer()
    {

    }
}

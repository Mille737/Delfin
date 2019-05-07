import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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

            System.out.println("Aktiv/passiv:");
            String aktivitetsStatus = sc.next();

            System.out.println("Junior/Senior:");
            String engagement = sc.next();

            System.out.println("CPR-Nummer:");
            String cpr = sc.next();

            String price = "";
            if (engagement.equalsIgnoreCase("Senior"))
            {
                price = "1600kr";
                int result = Integer.parseInt(age);
                if (result >= 60)
                {
                    price = "1200kr";
                }
                if (aktivitetsStatus.equalsIgnoreCase("Passiv"))
                {
                    price = "500kr";
                }

            }
            else if (engagement.equalsIgnoreCase("Junior"))
            {
                price = "1000kr";
                if (aktivitetsStatus.equalsIgnoreCase("Passiv"))
                {
                    price = "500kr";
                }
            }
            /*
            System.out.println("Pris:");
            String price = sc.next();
            */
            System.out.println("Betalt/Ikke betalt:");
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
            CopyOnWriteArrayList<Members> members = new CopyOnWriteArrayList<>();
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

            for(Members member: members)
            {
                if (member.getName().equalsIgnoreCase(søgning))
                {
                    System.out.println(member);
                    System.out.println("Redigér  [Tast: 1]");
                    System.out.println("Slet     [Tast: 2]");
                    int valg = sc.nextInt();
                    if (valg == 1)
                    {
                        System.out.println("Hvad vil du redigere:");
                        System.out.println("[Tast: 1] - Navn");
                        System.out.println("[Tast: 2] - Alder");
                        System.out.println("[Tast: 3] - Aktiv/Passiv");
                        System.out.println("[Tast: 4] - Junior/Senior");
                        System.out.println("[Tast: 5] - CPR-Nummer");
                        System.out.println("[Tast: 6] - Pris");
                        int valg2 = sc.nextInt();

                        switch(valg2)
                        {
                            case 1:
                                System.out.println("Indtast ny navn:");
                                member.setName(sc.next());
                                break;
                            case 2:
                                System.out.println("Indtast ny alder:");
                                member.setAge(sc.next());
                                break;
                            case 3:
                                System.out.println("(Aktiv/Passiv):");
                                member.setAktivitetsStatus(sc.next());
                                break;
                            case 4:
                                System.out.println("(Junior/Senior):");
                                member.setEngagement(sc.next());
                            case 5:
                                System.out.println("Indtast nyt CPR-Nummer:");
                                member.setCpr(sc.next());
                                break;
                            case 6:
                                System.out.println("(Betalt/Ikke Betalt)");
                                member.setPaid(sc.next());
                                break;
                            default:
                                System.out.println("404 - FEJL");
                                break;
                        }
                    }
                    else if (valg == 2)
                    {
                       if (member.getName().equalsIgnoreCase(søgning)) {
                           System.out.println(member);
                           System.out.println(members.indexOf(member));
                           int sletValg = sc.nextInt();
                           members.remove(sletValg);
                       }

                    }

                }

            }
            //String str = members;
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filepath)));

            for(Members member: members)
            {
                writer.write(member.toString());
            }
            writer.close();


        } catch(Exception e){System.out.println(e);}


    }


    public void updateSwimmer()
    {

    }

    public void deleteSwimmer()
    {

    }
}

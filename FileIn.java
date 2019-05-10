import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class FileIn
{
    Scanner sc = new Scanner(System.in);
    ArrayList<CompetitionMembers> competitionMembersArrayList = new ArrayList<>();
    public String disciplines;

    public void createSwimmer()
    {
        try
        {
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\Members.txt";

            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Navn:");
            String name = sc.next();

            System.out.println("Alder:");
            String age = sc.next();

            System.out.println("Aktiv/passiv:");
            String aktivitetsStatus = sc.next();

            String engagement;
            int result = Integer.parseInt(age);
            if (result >= 18)
            {
                engagement = "Senior";
            }
            else
            {
                engagement = "Junior";
            }

            System.out.println("CPR-Nummer:");
            String cpr = sc.next();

            String price = "";
            if (engagement.equalsIgnoreCase("Senior"))
            {
                price = "1600kr";
                int result2 = Integer.parseInt(age);
                if (result2 >= 60)
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
            System.out.println("Betalt: (Ja/Nej)");
            String isPaid = sc.next();


            bw.write(name + "\t" + age + "\t" + aktivitetsStatus + "\t" + engagement + "\t" + cpr + "\t" + price + "\t" + isPaid + "\n");

            Members members = new Members(name, age, aktivitetsStatus, engagement, cpr, price, isPaid);

            ArrayList<Members> membersArrayList = new ArrayList<>();
            membersArrayList.add(members);

            bw.close();


        }catch(Exception e){System.out.println(e);}

        System.out.println("Success...");

    }

    public void createCompetitionSwimmer()
    {
        try
        {
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\CompetitionMember.txt";

            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Navn:");
            String name = sc.next();

            System.out.println("Alder:");
            String age = sc.next();

            System.out.println("Aktiv/passiv:");
            String aktivitetsStatus = sc.next();

            String engagement;
            int result = Integer.parseInt(age);
            if (result >= 18)
            {
                engagement = "Hold: Senior";
            }
            else
            {
                engagement = "Hold: Junior";
            }

            System.out.println("CPR-Nummer:");
            String cpr = sc.next();

            String price = "";
            if (engagement.equalsIgnoreCase("Hold: Senior"))
            {
                price = "1600kr";
                int result2 = Integer.parseInt(age);
                if (result2 >= 60)
                {
                    price = "1200kr";
                }
                if (aktivitetsStatus.equalsIgnoreCase("Passiv"))
                {
                    price = "500kr";
                }

            }
            else if (engagement.equalsIgnoreCase("Hold: Junior"))
            {
                price = "1000kr";
                if (aktivitetsStatus.equalsIgnoreCase("Passiv"))
                {
                    price = "500kr";
                }
            }

            System.out.println("Betalt: (Ja/Nej)");
            String isPaid = sc.next();

            System.out.println("Discipliner:");
            System.out.println("[Tast 1] - Freestyle");
            System.out.println("[Tast 2] - Brystsvømning");
            System.out.println("[Tast 3] - Rygcrawl");
            System.out.println("[Tast 4] - Butterfly");
            System.out.println("[Tast 5] - Medley");


            int valg = sc.nextInt();
            switch(valg)
            {
                case 1:
                    disciplines = "Freestyle";
                    break;

                case 2:
                    disciplines = "Brystsvømning";
                    break;

                case 3:
                    disciplines = "Rygcrawl";
                    break;

                case 4:
                    disciplines = "Butterfly";
                    break;

                case 5:
                    disciplines = "Medley";
                    break;

                default:
                    disciplines = "ingen";
                    break;
            }

            System.out.println("Bedste træningstid: (00:00:00)");
            String bestPracticeTime = sc.next();

            System.out.println("Bedste konkurrencetid: (00:00:00)");
            String bestCompetitionTime = sc.next();

            String coach;
            int result3 = Integer.parseInt(age);
            if (result3 >= 18)
            {
                coach = "Tim Madsen";
            }
            else
            {
                coach = "Kim Hansen";
            }

            bw.write(name + "\t" + age + "\t" + aktivitetsStatus + "\t" + engagement + "\t" + cpr + "\t" + price + "\t" + isPaid+ "\t" + disciplines+ "\t" + bestPracticeTime+ "\t" + bestCompetitionTime+ "\t" + coach + "\n");

            CompetitionMembers CM = new CompetitionMembers(name, age, aktivitetsStatus, engagement, cpr, price, isPaid, disciplines, bestPracticeTime, bestCompetitionTime, coach);


            competitionMembersArrayList.add(CM);

            bw.close();


        }catch(Exception e){System.out.println(e);}

        System.out.println("Success...");

    }

    public void viewSwimmer()
    {

        try {
            CopyOnWriteArrayList<Members> members = new CopyOnWriteArrayList<>();
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\Members.txt";
            //List<Members> members = new ArrayList<>();
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
                        System.out.println("[Tast: 4] - CPR-Nummer");
                        System.out.println("[Tast: 5] - Kontingent");
                        int valg2 = sc.nextInt();

                        switch(valg2)
                        {
                            case 1:
                                System.out.println("Indtast ny navn:");
                                member.setName(sc.next());
                                break;
                            case 2:
                                System.out.println("Indtast ny alder:");
                                String nyalder = sc.next();
                                member.setAge(nyalder);
                                int result = Integer.parseInt(nyalder);
                                if (result >= 18)
                                {
                                    member.setEngagement("Senior");
                                    member.setPrice("1600kr");
                                    if (result >= 60)
                                    {
                                        member.setPrice("1200kr");
                                    }
                                }
                                else
                                {
                                    member.setEngagement("Junior");
                                    member.setPrice("1000kr");
                                }
                                break;
                            case 3:
                                System.out.println("(Aktiv/Passiv):");
                                member.setAktivitetsStatus(sc.next());
                                break;
                            case 4:
                                System.out.println("Indtast nyt CPR-Nummer:");
                                member.setCpr(sc.next());
                                break;
                            case 5:
                                System.out.println("Kontingent betalt (Ja/Nej):");
                                member.setIsPaid(sc.next());
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
                            int sletValg = members.indexOf(member);
                            members.remove(sletValg);
                        }
                        System.out.println("Medlemmet er nu slettet!");
                    }

                }

            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filepath)));

            for(Members member: members)
            {
                writer.write(member.toString());
            }
            writer.close();

        } catch(Exception e){System.out.println(e);}


    }

    public void viewCompetitionSwimmer()
    {
        try {
            CopyOnWriteArrayList<CompetitionMembers> CM = new CopyOnWriteArrayList<>();
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\CompetitionMember.txt";
            //List<CompetitionMembers> CM = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                CompetitionMembers m = new CompetitionMembers(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10]);
                CM.add(m);
            }

            reader.close();

            for(CompetitionMembers competitionmember: CM) {
                System.out.println(competitionmember);
            }

            String søgning = sc.next();

            for(CompetitionMembers competitionmembers: CM)
            {
                if (competitionmembers.getName().equalsIgnoreCase(søgning))
                {
                    System.out.println(competitionmembers);
                    System.out.println("Redigér  [Tast: 1]");
                    System.out.println("Slet     [Tast: 2]");
                    int valg = sc.nextInt();
                    if (valg == 1)
                    {
                        System.out.println("Hvad vil du redigere:");
                        System.out.println("[Tast: 1] - Navn");
                        System.out.println("[Tast: 2] - Alder");
                        System.out.println("[Tast: 3] - Aktiv/Passiv");
                        System.out.println("[Tast: 4] - CPR-Nummer");
                        System.out.println("[Tast: 5] - Træningstid");
                        System.out.println("[Tast: 6] - Konkurrencetid");
                        System.out.println("[Tast: 7] - Kontingent");
                        int valg2 = sc.nextInt();

                        switch(valg2)
                        {
                            case 1:
                                System.out.println("Indtast ny navn:");
                                competitionmembers.setName(sc.next());
                                break;
                            case 2:
                                System.out.println("Indtast ny alder:");
                                String nyalder = sc.next();
                                competitionmembers.setAge(nyalder);
                                int result = Integer.parseInt(nyalder);
                                if (result >= 18)
                                {
                                    competitionmembers.setEngagement("Hold: Senior");
                                    competitionmembers.setPrice("1600kr");
                                    competitionmembers.setCoach("Tim Madsen");
                                    if (result >= 60)
                                    {
                                        competitionmembers.setPrice("1200kr");
                                    }
                                }
                                else
                                {
                                    competitionmembers.setEngagement("Hold: Junior");
                                    competitionmembers.setPrice("1000kr");
                                    competitionmembers.setCoach("Kim Hansen");
                                }

                                break;
                            case 3:
                                System.out.println("(Aktiv/Passiv):");
                                competitionmembers.setAktivitetsStatus(sc.next());
                                break;
                            case 4:
                                System.out.println("Indtast nyt CPR-Nummer:");
                                competitionmembers.setCpr(sc.next());
                                break;
                            case 5:
                                System.out.println("Indtast ny bedre træningstid:");
                                competitionmembers.setBestPracticeTime(sc.next());
                                break;
                            case 6:
                                System.out.println("Indtast ny bedste konkurrencetid:");
                                competitionmembers.setBestCompetitionTime(sc.next());
                                break;
                            case 7:
                                System.out.println("Kontingent betalt (Ja/Nej):");
                                competitionmembers.setIsPaid(sc.next());
                                break;
                            default:
                                System.out.println("404 - FEJL");
                                break;
                        }
                    }
                    else if (valg == 2)
                    {
                        if (competitionmembers.getName().equalsIgnoreCase(søgning)) {
                            System.out.println(competitionmembers);
                            int sletValg = CM.indexOf(competitionmembers);
                            CM.remove(sletValg);
                        }
                        System.out.println("Medlemmet er nu slettet!");
                    }

                }

            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(filepath)));

            for(CompetitionMembers competitionmembers: CM)
            {
                writer.write(competitionmembers.toString());
            }
            writer.close();

        } catch(Exception e){System.out.println(e);}
    }

    public void topFemListe()
    {
        try {
            CopyOnWriteArrayList<CompetitionMembers> CM = new CopyOnWriteArrayList<>();
            String filepath = "/Users/robinzernickov/Desktop/Delfin 2/Delfin/src/CompetitionMember.txt";
            //List<CompetitionMembers> CM = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                CompetitionMembers m = new CompetitionMembers(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10]);
                CM.add(m);
            }

            reader.close();

            int lowest = Integer.MAX_VALUE;

            /*
            for (int i = 0; i < CM.size(); i++)
            {
                if ()
                System.out.println(CM.get(i));
            }*/

            for (CompetitionMembers competitionmembers : CM)
            {
                String træningstid = competitionmembers.getBestPracticeTime();
                int result = Integer.parseInt(træningstid);
                if (result == lowest)
                {
                    System.out.println(lowest);
                }
            }


        }catch(Exception e){System.out.println(e);}
    }

    public void coachEdit()
    {
        try {
            CopyOnWriteArrayList<CompetitionMembers> CM = new CopyOnWriteArrayList<>();
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\CompetitionMember.txt";
            //List<CompetitionMembers> CM = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                CompetitionMembers m = new CompetitionMembers(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10]);
                CM.add(m);
            }

            reader.close();

            String søgning = sc.next();

            for (CompetitionMembers competitionmembers : CM) {
                if (competitionmembers.getName().equalsIgnoreCase(søgning)) {
                    System.out.println(competitionmembers);
                    int valg = sc.nextInt();
                    System.out.println("Hvad vil du redigere:");
                    System.out.println("[Tast: 1] - Træningstid");
                    System.out.println("[Tast: 2] - Konkurrencetid");
                    switch (valg) {
                        case 1:
                            System.out.println("Indtast ny bedre træningstid:");
                            competitionmembers.setBestPracticeTime(sc.next());
                            break;
                        case 2:
                            System.out.println("Indtast ny bedste konkurrencetid:");
                            competitionmembers.setBestCompetitionTime(sc.next());
                            break;
                    }
                }
            }
        }catch(Exception e){System.out.println(e);}
    }

    public void almRestanceListe()
    {
        try {
            CopyOnWriteArrayList<Members> members = new CopyOnWriteArrayList<>();
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\Members.txt";
            //List<Members> members = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                Members m = new Members(data[0], data[1], data[2], data[3], data[4], data[5], data[6]);
                members.add(m);
            }

            reader.close();

            System.out.println("Motionist Medlem:");
            for(Members member: members) {
                if (member.getIsPaid().equalsIgnoreCase("Nej")) {
                    System.out.println(member);
                }
            }

        }catch(Exception e){System.out.println(e);}
    }

    public void konkurrenceRestanceListe()
    {
        try {
            CopyOnWriteArrayList<CompetitionMembers> CM = new CopyOnWriteArrayList<>();
            String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\CompetitionMember.txt";
            //List<CompetitionMembers> CM = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                CompetitionMembers m = new CompetitionMembers(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10]);
                CM.add(m);
            }

            reader.close();

            System.out.println("Konkurrence Medlem:");
            for(CompetitionMembers competitionmember: CM)
            {
                if(competitionmember.getIsPaid().equalsIgnoreCase("Nej")) {
                    System.out.println(competitionmember);
                }
            }

        }catch(Exception e){System.out.println(e);}
    }


}

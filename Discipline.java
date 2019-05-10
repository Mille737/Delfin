import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Discipline
{

    FileIn access = new FileIn();
    public ArrayList<CompetitionMembers> competitionmembers = new ArrayList<>();



    public void getTopFive ()
    {
        try {
            final String filepath = "C:\\Users\\mille\\Desktop\\Delfin 2\\Delfin\\src\\CompetitionMember.txt";

            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\t");
                CompetitionMembers m = new CompetitionMembers(data[0], data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[8], data[9], data[10]);
                if (data[7].equals("Freestyle"))
                {
                    competitionmembers.add(m);

                    CompetitionComparator comparator = new CompetitionComparator();

                    competitionmembers.sort(comparator);

                    System.out.println(competitionmembers);
                }




            }

            reader.close();

        }
        catch (Exception e)
        {
            System.out.println("...");
        }
    }


}
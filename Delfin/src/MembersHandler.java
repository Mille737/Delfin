import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MembersHandler implements Comparator<Members>
{
    public int compare(Members a, Members b){
        return a.getAge() - b.getAge();
    }
    ArrayList<Members> memberslist = new ArrayList<>();

    public void addMember(){
        memberslist.add(members);
        System.out.println("uden");
        for (int i=0; i <memberslist.size();i++)
            System.out.println(memberslist.get(i));

        Collections.sort(memberslist, new MembersHandler());

        System.out.println("med");
        for (int i=0; i<memberslist.size();i++)
            System.out.println(memberslist.get(i));
    }
}

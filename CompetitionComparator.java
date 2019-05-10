import java.util.Comparator;

public class CompetitionComparator implements Comparator<CompetitionMembers>
{
 public int compare(CompetitionMembers cm1, CompetitionMembers cm2)
 {
     return cm1.bestCompetitionTime.compareTo(cm2.bestCompetitionTime);
 }
 public String toString()
 {
     return "CompetitionComparator";
 }
}

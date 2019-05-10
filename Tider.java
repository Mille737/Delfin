import java.util.Date;

public class Tider
{
    private Date date;
    private String swimmer;
    private int time;
    private String discipline;
    private String competition;
    private int rank;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSwimmer() {
        return swimmer;
    }

    public void setSwimmer(String swimmer) {
        this.swimmer = swimmer;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getCompetition() {
        return competition;
    }

    public void setCompetition(String competition) {
        this.competition = competition;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}

public class CompetitionMembers extends Members
{
    private String team;
    private String disciplines;
    private int bestPracticeTime;
    private int bestCompetitionTime;
    private String coach;

    public String getTeam()
    {
        return team;
    }

    public void setTeam(String team)
    {
        this.team = team;
    }

    public String getDisciplines()
    {
        return disciplines;
    }

    public void setDisciplines(String disciplines)
    {
        this.disciplines = disciplines;
    }

    public int getBestPracticeTime()
    {
        return bestPracticeTime;
    }

    public void setBestPracticeTime(int bestPracticeTime)
    {
        this.bestPracticeTime = bestPracticeTime;
    }

    public int getBestCompetitionTime()
    {
        return bestCompetitionTime;
    }

    public void setBestCompetitionTime(int bestCompetitionTime)
    {
        this.bestCompetitionTime = bestCompetitionTime;
    }

    public String getCoach()
    {
        return coach;
    }

    public void setCoach(String coach)
    {
        this.coach = coach;
    }
}

public class CompetitionMembers extends Members
{
    private String disciplines;
    private String bestPracticeTime;
    public String bestCompetitionTime;
    private String coach;

    public CompetitionMembers (String name, String age, String aktivitetsStatus,
                               String engagement, String cpr, String price,
                               String isPaid, String disciplines,
                               String bestPracticeTime, String bestCompetitionTime, String coach)
    {
        super(name, age, aktivitetsStatus, engagement, cpr, price, isPaid);
        this.disciplines = disciplines;
        this.bestPracticeTime = bestPracticeTime;
        this.bestCompetitionTime = bestCompetitionTime;
        this.coach = coach;
    }

    public CompetitionMembers (String name, String bestCompetitionTime, String disciplines)
    {
        super(name);
        this.bestCompetitionTime = bestCompetitionTime;
        this.disciplines = disciplines;
    }

    public String toString1()
    {
        return super.getName() + " " + this.bestCompetitionTime + " " + this.disciplines;
    }

    public String getDisciplines()
    {
        return disciplines;
    }

    public void setDisciplines(String disciplines)
    {
        this.disciplines = disciplines;
    }

    public String getBestPracticeTime()
    {
        return bestPracticeTime;
    }

    public void setBestPracticeTime(String bestPracticeTime)
    {
        this.bestPracticeTime = bestPracticeTime;
    }

    public String getBestCompetitionTime()
    {
        return bestCompetitionTime;
    }

    public void setBestCompetitionTime(String bestCompetitionTime)
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

    public String toString(){
        return super.getName() + "\t" + super.getAge() + "\t" + super.getAktivitetsStatus() + "\t" + super.getEngagement()
                + "\t" + super.getCpr() + "\t"+ super.getPrice() + "\t" + super.getIsPaid()+ "\t"+ disciplines+ "\t"
                + bestPracticeTime+ "\t"+ bestCompetitionTime+ "\t"+ coach + "\n";
    }
}

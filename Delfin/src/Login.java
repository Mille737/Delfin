import java.util.Scanner;
public class Login implements ILogin
{
    private String coachName = "Træner";
    private String presidentName = "Formand";
    private String accountantName = "Kassere";
    private String username;

    public void chooseLogIn()
    {
        Scanner sc = new Scanner(System.in);
        username = sc.nextLine();
        System.out.println("Indtast brugernavn: " + username);
        if(username.equals(coachName))
        {
            coachLogIn();
        }
        else if(username.equals(presidentName))
        {
            presidentLogIn();
        }
        else if(username.equals(accountantName))
        {
            accountantLogIn();
        }
        else
        {
            System.out.println("Username doesn't exist.");
        }
    }

    public void coachLogIn ()
    {

    }

    public void presidentLogIn ()
    {

    }

    public void accountantLogIn ()
    {

    }
}


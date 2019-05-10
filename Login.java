import java.util.Scanner;
public class Login implements ILogin
{
    private String coachName = "vandhund";
    private String passwordCoach = "****";
    private String presidentName = "bossman";
    private String passwordPresident = "*****";
    private String accountantName = "moneyman";
    private String passwordAccountant = "******";
    private String password;
    private String username;

    Scanner sc = new Scanner(System.in);
    FileIn access = new FileIn();

    public void chooseLogIn()
    {
        System.out.println("       __|\\\n" +
                "    .-'    '-.\n" +
                "   / .--, _ a L\n" +
                " .J (  '-' \"'--'\n" +
                "'-'-.)  .~~~~~~~~~~~~~~~~~~~~.\n" +
                "        |    DELFIN LOGIN:   |     __\n" +
                "        | [Tast 1] - Formand | ,.-'e ''-'7\n" +
                "        | [Tast 2] - Træner  |  '--.    (\n" +
                "        | [Tast 3] - Kassér  |      ),   \\\n" +
                "        '~~~~~~~~~~~~~~~~~~~~'      ` )  :\n" +
                "                                 ,__.'_.'\n" +
                "                                 '-, (\n" +
                "                                   '--'");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        int valg = sc.nextInt();

        switch (valg)
        {
            case 1:
                System.out.println("Formand: ");
                System.out.print("Indtast brugernavn: ");
                username = sc.next();
                System.out.print("Indtast kodeord: ");
                password = sc.next();
                if(username.equalsIgnoreCase(presidentName) && password.equalsIgnoreCase(passwordPresident))
                {
                    presidentLogIn();
                }
                break;

            case 2:
                System.out.println("Træner: ");
                System.out.print("Indtast brugernavn: ");
                username = sc.next();
                System.out.print("Indtast kodeord: ");
                password = sc.next();
                if(username.equalsIgnoreCase(coachName) && password.equalsIgnoreCase(passwordCoach))
                {
                    coachLogIn();
                }
                break;

            case 3:
                System.out.println("Kassér: ");
                System.out.print("Indtast brugernavn: ");
                username = sc.next();
                System.out.print("Indtast kodeord: ");
                password = sc.next();
                if(username.equalsIgnoreCase(accountantName) && password.equalsIgnoreCase(passwordAccountant))
                {
                    accountantLogIn();
                }
                break;
            default:
                System.out.println("INTRUDER ALERT!!!");
        }

    }

    public void coachLogIn ()
    {
        int choice = sc.nextInt();
        System.out.println("[Tast 1] - Redigér tider");
        System.out.println("[Tast 2] - Vis Top 5 Lister");

        if ( choice == 1)
        {
            access.coachEdit();
        }
        else if (choice == 2)
        {
            access.viewSwimmer();
        }
    }

    public void presidentLogIn ()
    {
        System.out.println("[Tast 1] - Opret Medlem");
        System.out.println("[Tast 2] - Vis, Redigér eller Slet");

        int choice = sc.nextInt();

        if ( choice == 1)
        {
            System.out.println("[Tast 1] - Opret Motionist Medlem");
            System.out.println("[Tast 2] - Opret Konkurrence Medlem");

            int choice1 = sc.nextInt();
            if (choice1 == 1)
            {
                access.createSwimmer();
            }
            else if (choice1 == 2)
            {
                access.createCompetitionSwimmer();
            }

        }
        else if (choice == 2)
        {
            System.out.println("[Tast 1] - Vis, Redigér, Slet - Motionist Medlem");
            System.out.println("[Tast 2] - Vis, Redigér, Slet - Konkurrence Medlem");
            int choice1 = sc.nextInt();
            if (choice1 == 1)
            {
                access.viewSwimmer();
            }
            else if (choice1 == 2)
            {
                access.viewCompetitionSwimmer();
            }
        }
    }

    public void accountantLogIn ()
    {
        access.almRestanceListe();
        access.konkurrenceRestanceListe();
    }

}

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Velkommen");

        Main main = new Main();
        main.Run();
    }

    public void Run()
    {
        FileIn filein = new FileIn();

        filein.createSwimmer();
    }
}

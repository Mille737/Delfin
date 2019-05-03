
public class Main
{

    public static void main(String[] args)
    {
        System.out.println("Hej og velkommen");

        Main main = new Main();
        main.Run();
    }

    public void Run()
    {
        FileIn filein = new FileIn();

        filein.createSwimmer();
    }
}

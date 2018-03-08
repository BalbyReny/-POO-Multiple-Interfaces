package prueba;

public class MyBand extends Class1
{
    public MyBand()
    {
        System.out.println("Yes I have a band!\n");
    }
    
    public static void main(String[] xd)
    {
        System.out.println("Let's play something cool here.");
        MyBand AwesomeName = new MyBand(); //¿Conseguir músicos? ok
        AwesomeName.backgroundMusic();
        AwesomeName.leadingMelody();
        //Lets spice things up
        System.out.println("\nAnd we can play even coolest things like: \n");
        AwesomeName.percussionSolo();
        AwesomeName.bassSolo();
        AwesomeName.pianoSolo();
        AwesomeName.guitarSolo();
        System.out.println("\nWow!");
        //You like their music? no?
    }
}

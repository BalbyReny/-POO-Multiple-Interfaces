package prueba;

public class Class2 implements Interface2_1, Interface2_2 
{
   @Override
   public void playPercussion()
   {
       System.out.println(" Drums are playing...");
   }
   @Override
   public void playBass()
   {
       System.out.println(" Bass is playing...");
   }
   
   @Override
   public void percussionSolo()
   {
       System.out.println(" Drum solo! like in Whiplash!");
   }
   
   @Override
   public void bassSolo()
   {
       System.out.println(" Move to my bassline!");
   }
   
   public void backgroundMusic()
   {
       playPercussion();
       playBass();
   }
}

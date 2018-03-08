package prueba;

abstract class Class1 extends Class2 implements Interface1 
{
    @Override
   public void playPiano()
   {
       System.out.println(" Piano is playing...");
   }
   @Override
   public void playGuitar()
   {
       System.out.println(" Guitar is playing...");
   }
   
   @Override
   public void pianoSolo()
   {
       System.out.println(" Everytime is Jazz Time!");
   }
   
   @Override
   public void guitarSolo()
   {
       System.out.println(" Guitar skills here!");
   }
   
   //Leading part of the music
   @Override
   public void leadingMelody()
   {
       playPiano();
       playGuitar();
   }
}

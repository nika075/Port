import java.util.Random;

public class Pasazer extends Thread{
    Random rand=new Random();

    public void run() {
        System.out.println("Pasażer za burtą");
        try {
            sleep(rand.nextInt(800));
            if(rand.nextInt(2)==0)
            {
                System.out.println("Udało się. Pasażer uratowany.");
            }
            else
            {
                System.out.println("Pasażer utonął.");
            }
        }
        catch (Exception e){}
    }

}

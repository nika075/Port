import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Glowna {
    static int ILOSC_STATKOW =10;
    static int ILOSC_PORTOW =5;
    static List<Port> p=new ArrayList<Port>();

    public static void main(String[] args) {
        p.add(new Port1(ILOSC_PORTOW, ILOSC_STATKOW));
        p.add(new Port2(ILOSC_PORTOW, ILOSC_STATKOW));
        Random r = new Random();
        int pn;

        for(int i = 0; i< ILOSC_STATKOW; i++) {
            pn=r.nextInt(2);
            new Statek1(i, 2000, p.get(pn)).start();
            new Statek2(i, 2000, p.get(pn)).start();
        }
        }
}

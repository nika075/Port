public abstract class Port {
    static int PORT =1;
    static int START=2;
    static int REJS =3;
    static int KONIEC_REJSU =4;
    static int KATASTROFA=5;
    int iloscPortow;
    int iloscZajetych;
    int iloscStatkow;

    abstract int start(int numer);
    abstract  int laduj();
    synchronized void zmniejsz(){
        iloscStatkow--;
        System.out.println("ZABILEM");
        if(iloscStatkow == iloscPortow) System.out.println("Ilość statków taka sama jak portów");
    }
}

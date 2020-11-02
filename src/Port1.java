public class Port1 extends Port {

    Port1(int ilosc_portow, int ilosc_statkow){
        this.iloscPortow = ilosc_portow;
        this.iloscStatkow = ilosc_statkow;
        this.iloscZajetych =0;
    }

    synchronized int start(int numer){
        iloscZajetych--;
        System.out.println("Pozwolenie na start z Portu1 statkowi "+numer);
        return START;
    }
    synchronized int laduj(){
        try{
            Thread.currentThread().sleep(1000);
        }
        catch(Exception ie){
        }
        if(iloscZajetych < iloscPortow){
            iloscZajetych++;
            System.out.println("Port1. Pozwolenie na na zawinięcie do portu"+ iloscZajetych);
            return PORT;
        }
        else
        {return KONIEC_REJSU;}
    }
}
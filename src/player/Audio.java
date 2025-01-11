package player;

public class Audio extends Elemento_Multimediale implements GestioneVolume {

    private double durata;
    private int volume;

    public Audio(String titolo, double durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;

    }

    @Override
     public void play() {
        System.out.println("Riproduzione audio " + titolo + " durata: " +  durata) ;
        String puntoEsclamativo ="!";

            for(int i=0;i<=durata;i++){
                System.out.println(titolo + puntoEsclamativo.repeat(volume) );
            }
    }


    @Override
    public void  abbassaVolume() {
        volume--;
        System.out.println("volume: " + volume);
    }

    @Override
    public void alzaVolume() {
       volume++;
        System.out.println("volume: " + volume);
    }
}


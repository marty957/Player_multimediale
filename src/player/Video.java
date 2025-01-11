package player;

public class Video extends Elemento_Multimediale implements GestioneVolume, GestioneLuminosita {


    public double durata;
    public int volume;
    public int luminosita;

    public Video(String titolo, double durata, int volume, int luminosita){
        super(titolo);
        this.durata=durata;
        this.volume=volume;
        this.luminosita=luminosita;

    }


    @Override
    public void play() {
        String puntoEsclamativo ="!";
        String asterisco ="*";
        for(int i=1;i<=durata;i++){
            System.out.println( titolo + " "  + puntoEsclamativo.repeat(volume));
            System.out.println(asterisco.repeat(luminosita));


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

    @Override
    public void aumentaLuminosita() {
        luminosita++;
        System.out.println("luminosità: " + luminosita);
    }

    @Override
    public void diminuisciLuminosità() {

        luminosita--;

        System.out.println("luminosità: " +  luminosita);


    }
}

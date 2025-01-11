package player;

public class Immagine extends Elemento_Multimediale implements GestioneLuminosita {
    public int luminosita;

    public Immagine(String titolo, int luminosita){
        super(titolo);
         this.luminosita=luminosita;
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

    public void show(){
        String asterisco ="*";
        for(int i=1; i<=luminosita;i++){
            System.out.println("immagine: " + titolo +" " +  asterisco.repeat(luminosita) );
        }
    }
}

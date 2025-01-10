package player;

public class Video extends Elemento_Multimediale implements AudioRiproducibile,Luminosita{
    @Override
    public boolean play() {
        return false;
    }

    @Override
    public int abbassaVolume() {
        return 0;
    }

    @Override
    public int alzaVolume() {
        return 0;
    }

    @Override
    public int aumentaLuminosita() {
        return 0;
    }

    @Override
    public int diminuisciLuminosità() {
        return 0;
    }
}

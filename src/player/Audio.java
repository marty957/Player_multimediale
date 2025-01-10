package player;

public class Audio extends Elemento_Multimediale implements AudioRiproducibile{
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
}

package player;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Audio a1= new Audio("Sara",3.41,5);
        a1.play();
        a1.abbassaVolume();
        /*a1.alzaVolume();*/
        a1.play();
        Video v1= new Video("Certe Notti", 5.12,2,10);

        v1.play();

    }
}
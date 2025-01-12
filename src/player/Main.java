package player;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Audio a1 = new Audio("Sara", 3.41, 5);
        a1.play();
        a1.abbassaVolume();
        /*a1.alzaVolume();*/
        a1.play();


        Video v1 = new Video("Certe Notti", 5.12, 2, 10);
        v1.play();


        Immagine img1 = new Immagine("Tokio's Skyline", 5);

        img1.show();
        Elemento_Multimediale[] arrayElementi = new Elemento_Multimediale[5];
        String richiesta = "";

        do {
            System.out.println("Vuoi ascolatare della musica? scrivi Audio o Video. Oppure scrivi Immagini per rilassarti con dei Bei panorami ");
            richiesta = sc.nextLine().toLowerCase();

            if (richiesta.equals("audio")) {

                Elemento_Multimediale trc1 = new Audio("We will rock you", 4.23, 5);
                Elemento_Multimediale trc2 = new Audio("I want you break free", 4.02, 4);
                Elemento_Multimediale trc3 = new Audio("Don't stop me now", 3.53, 6);
                Elemento_Multimediale trc4 = new Audio("Love of my Life", 5.02, 3);
                Elemento_Multimediale trc5 = new Audio("The show must go on", 3.14, 2);


                arrayElementi[0] = trc1;
                arrayElementi[1] = trc2;
                arrayElementi[2] = trc3;
                arrayElementi[3] = trc4;
                arrayElementi[4] = trc5;

            } else if (richiesta.equals("video")) {
                Elemento_Multimediale vd1 = new Video("Urlando contro il cielo", 4.23, 5, 4);
                Elemento_Multimediale vd2 = new Video("Balliamo sul mondo", 4.02, 4, 2);
                Elemento_Multimediale vd3 = new Video("Questa è la mia vita", 3.53, 3, 9);
                Elemento_Multimediale vd4 = new Video("Non è tempo per noi", 5.02, 3, 8);
                Elemento_Multimediale vd5 = new Video("Piccola stella senza cielo", 3.14, 2, 7);


                arrayElementi[0] = vd1;
                arrayElementi[1] = vd2;
                arrayElementi[2] = vd3;
                arrayElementi[3] = vd4;
                arrayElementi[4] = vd5;
            } else if (richiesta.equals("immagini")) {
                Elemento_Multimediale im1 = new Immagine("Barriera corallina", 15);
                Elemento_Multimediale im2 = new Immagine("Skyline di New York", 20);
                Elemento_Multimediale im3 = new Immagine("Le montagne di avatar", 10);
                Elemento_Multimediale im4 = new Immagine("Yellowstone", 20);
                Elemento_Multimediale im5 = new Immagine("Il buco blu in Belize", 18);

                arrayElementi[0] = im1;
                arrayElementi[1] = im2;
                arrayElementi[2] = im3;
                arrayElementi[3] = im4;
                arrayElementi[4] = im5;

            } else {
                System.out.println("Parola inserita non correta");
            }

        } while (!richiesta.equals("audio") && !richiesta.equals("video") && !richiesta.equals("immagini"));





    int posizione;
        do{
            System.out.println("Scrivi un numero da 1 a 5 per far riprodurre uno degli elementi che hai scelto prima. Premi 0 per terminare.");
            posizione= sc.nextInt();


            if(posizione==0){
                System.out.println("Programma terminato");
                break;
            }

            if(posizione>=1 && posizione<=5){
                Elemento_Multimediale elemento= arrayElementi[posizione-1];
                if(elemento instanceof Audio){
                ((Audio) elemento).play();
                } else if (elemento instanceof Video) {
                    ((Video) elemento).play();
                }else if(elemento instanceof Immagine){
                    ((Immagine) elemento).show();
                }
            } else{
                System.out.println("numero non valido");
            }


        } while (posizione != 0);




}





}
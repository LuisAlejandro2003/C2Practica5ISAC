package models;

import java.util.Scanner;

public class Lectura {
    Scanner teclado = new Scanner(System.in);
    public int hora,minuto,segundo;
    public void leerHora(){
        do {
            System.out.println("Escriba la hora: ");
            hora=teclado.nextInt();
        }while (hora<0);

    }
    public void leerMinuto(){
        do {
            System.out.println("Escriba el minuto: ");
            minuto=teclado.nextInt();
        }while (minuto<0);
    }
    public void leerSegundo(){

        do {
            System.out.println("Escriba el segundo: ");
            segundo=teclado.nextInt();

        }while (segundo<0);


    }

}

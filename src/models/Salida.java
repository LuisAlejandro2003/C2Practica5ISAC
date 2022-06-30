package models;

public class Salida {
    public void imprimir(int hora ,int minuto , int segundo){
        Procesos procesos = new Procesos();
        if (procesos.banderaHora==false || procesos.banderaMinuto==false|| procesos.banderaSegundo==false ){
            System.out.println("Esta hora no es valida");
            System.out.println("Hora escrita: " + hora+":"+minuto+":"+segundo);

        }
    }
}

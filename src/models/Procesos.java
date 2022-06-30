package models;

public class Procesos {
    boolean banderaHora=false;
    boolean banderaMinuto=false;
    boolean banderaSegundo=false;
    public int validarHora(int hora){
            if (hora<=24){
                banderaHora=true;
            }
        return hora;
    }
    public int validarMinuto(int minuto){
            if (minuto<60){
                banderaMinuto=true;
            }
        return minuto;
    }
    public int validarSegundo(int segundo){
        if (segundo<60){
            banderaSegundo=true;
        }
        return segundo;
    }
}

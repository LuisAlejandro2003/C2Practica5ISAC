import models.Lectura;
import models.Procesos;
import models.Salida;

public class Principal {
    public static void main(String[] args) {
        Lectura lectura = new Lectura();
        //Leemos datos
        lectura.leerHora();
        lectura.leerMinuto();
        lectura.leerSegundo();

        //Hacemos validacion
        Procesos procesos = new Procesos();
        int hora = procesos.validarHora(lectura.hora);
        int minuto = procesos.validarMinuto(lectura.minuto);
        int segundo = procesos.validarSegundo(lectura.segundo);

        Salida salida= new Salida();
        salida.imprimir(lectura.hora , lectura.minuto , lectura.segundo);

    }
}

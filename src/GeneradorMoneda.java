import java.util.Date;
import java.util.Scanner;

public class GeneradorMoneda {

    public static void convertir(String monedaActual, String monedaABuscar, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;
        Date hoy = new Date();

        Moneda monedas = consulta.buscarMoneda(monedaActual, monedaABuscar);
        System.out.println("La tasa de conversion actual es " + hoy +
                " \n1 " + monedaActual + " = " + monedas.conversion_rate() + " " + monedaABuscar);


        System.out.println("Ingresa la cantidad que quieres convertir a " + monedaABuscar);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("El valor de " + cantidad + " " + monedaActual + " es igual a " + cantidadConvertida + " " + monedas.target_code());

    }
}



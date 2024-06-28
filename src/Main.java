import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();

        var opcion = -1;
        try {
            while (opcion != 9) {
                var menu = """
                        *************************************************
                        Bienvenido al coversor de monedas, que deseas convertir?
                        1.- Dolar a Peso Argentino
                        2.- Dolar a Real Brasileño
                        3.- Dolar a Peso Colombiano
                        4.- Dolar a Peso Mexicano
                        5.- Peso Argentino a Dolar
                        6.- Real Brasileño a Dolar
                        7.- Peso Colombiano a Dolar
                        8.- Peso Mexicano a Dollar
                        9.- Salir
                        *************************************************
                        """;
                System.out.printf(menu);
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        GeneradorMoneda.convertir("USD", "ARS", consulta, teclado);
                        break;
                    case 2:
                        GeneradorMoneda.convertir("USD", "BRL", consulta, teclado);
                        break;
                    case 3:
                        GeneradorMoneda.convertir("USD", "PCO", consulta, teclado);
                        break;
                    case 4:
                        GeneradorMoneda.convertir("USD", "MXN", consulta, teclado);
                        break;
                    case 5:
                        GeneradorMoneda.convertir("ARS", "USD", consulta, teclado);
                        break;
                    case 6:
                        GeneradorMoneda.convertir("BRL", "USD", consulta, teclado);
                        break;
                    case 7:
                        GeneradorMoneda.convertir("PCO", "USD", consulta, teclado);
                        break;
                    case 8:
                        GeneradorMoneda.convertir("MXN", "USD", consulta, teclado);
                        break;

                    case 9:
                        System.out.println("Regresa cuando requieras consultar algo más  SIHS");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Este conversor solo reconocé números");
            opcion = -1;
        } catch (Exception e) {
            System.out.println("Opción no válida");
        }
    }
}
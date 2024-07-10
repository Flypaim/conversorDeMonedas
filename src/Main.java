import calculos.buscarDivisa;
import calculos.calcularDivisa;
import model.divisaCon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaDato = new Scanner(System.in);
        while (true) {

            System.out.println("********Eliga una opción de conversión de moneda*******");
            System.out.println("""
                        1). Dolar ---> Moneda Peruana
                       \s
                        2). Moneda Peruana ---> Dolar
                       \s
                        3). Dolar ---> peso argentino
                       \s
                        4). Peso Argentino ---> Dolar
                       \s
                        5). Dolar ---> Real Brasileño
                       \s
                        6). Real Brasileño ---> Dolar
                       \s
                        7). Dolar ---> Peso Colombiano
                       \s
                        8). Peso Colombiano ---> Dolar
                       \s
                        9). Salir
                   \s""");
            System.out.println("******************************************************");
            try {

                int opcion = Integer.parseInt(entradaDato.next());
                if (opcion == 13) {
                    break;
                }
                String CodMoneda;
                buscarDivisa buscar = new buscarDivisa();
                calcularDivisa calcular = new calcularDivisa();
                divisaCon mBuscada;
                switch (opcion) {

                    case 1:
                        CodMoneda = "PEN";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cMonedas(mBuscada.getValor(), CodMoneda);
                        break;
                    case 2:
                        CodMoneda = "PEN";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cDolares(mBuscada.getValor(), CodMoneda);
                        break;
                    case 3:
                        CodMoneda = "ARS";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cMonedas(mBuscada.getValor(), CodMoneda);
                        break;
                    case 4:
                        CodMoneda = "ARS";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cDolares(mBuscada.getValor(), CodMoneda);
                        break;
                    case 5:
                        CodMoneda = "BRL";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cMonedas(mBuscada.getValor(), CodMoneda);
                        break;
                    case 6:
                        CodMoneda = "BRL";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cDolares(mBuscada.getValor(), CodMoneda);
                        break;
                    case 7:
                        CodMoneda = "COP";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cMonedas(mBuscada.getValor(), CodMoneda);
                        break;
                    case 8:
                        CodMoneda = "COP";
                        mBuscada = buscar.buscar(CodMoneda);
                        calcular.cDolares(mBuscada.getValor(), CodMoneda);
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("*******************************************************************\n");

        }
    }
}




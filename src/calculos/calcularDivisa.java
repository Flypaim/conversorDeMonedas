package calculos;

import java.util.Scanner;

public class calcularDivisa {
    private double convMoneda;
    private double cantConvertir;
    public double getConvMoneda(){
        return convMoneda;
    }
    Scanner entradaDato= new Scanner(System.in);
    public void cMonedas(double valorMoneda, String abreviatura){
        cantConvertir = cantidadM();
        convMoneda = valorMoneda* cantConvertir;
        System.out.println("El valor de " + cantConvertir + " [USD],  corresponde a el valor de " + convMoneda + " ["+abreviatura+"]");
    }
    public void cDolares(double valorMoneda, String abreviatura){
        double cConvertir = cantidadM();

        convMoneda = cConvertir /valorMoneda;
        System.out.println("El valor de " + cConvertir + "["+abreviatura+"], corresponde a el valor de " + convMoneda +" [USD] \n");
    }

    public double cantidadM(){
        try {
            System.out.println("Ingrese el valor que desea convertir");
            cantConvertir = Double.valueOf(entradaDato.next());

        }catch (NumberFormatException n){
            System.out.println("Ocurrio un error: " + n.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error : "+e.getMessage());
        }
        return cantConvertir;
    }

}
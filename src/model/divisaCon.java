package model;

public class divisaCon {
    private String moneda;
    private double valor;

    public divisaCon(){
    }
    public divisaCon(String moneda, double valor) {
        this.moneda = moneda;
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Clave: " + moneda + ", Valor: " + valor;
    }
}
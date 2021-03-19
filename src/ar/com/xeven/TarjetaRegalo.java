package ar.com.xeven;

import java.text.DecimalFormat;

public class TarjetaRegalo {
    //atrib
    private Double saldo;
    private String numeroTarjeta;

    //constructor
    public TarjetaRegalo(Double saldo) {
        this.saldo = saldo;

        //genera un nro de tarjeta aleatorio de 5 cifras
        numeroTarjeta = "";
        for (int i=0;i<5;i++){
            this.numeroTarjeta += (int)(Math.random()*10);
        }
    }

    //getters y setters
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    //toString
    @Override
    public String toString() {
        DecimalFormat dosDecimales = new DecimalFormat("0.00");
        return "Tarjeta Nro "+numeroTarjeta+" - Saldo "+dosDecimales.format(saldo)+" $";
    }

    //metodo gastar dinero de la tarjeta de regalo
    public void gastar(Double monto){
        if (monto>=saldo)
            System.out.printf("No tiene suficiente saldo para gastar %.2f$\n",monto);
        else
            saldo -= monto;
    }

    public TarjetaRegalo fusionCon(TarjetaRegalo t){
        double nuevoSaldo = this.getSaldo() + t.getSaldo();
        //seteo a 0 los saldos de ambas tarjetas
        this.setSaldo(0.00);
        t.setSaldo(0.00);
        return new TarjetaRegalo(nuevoSaldo);
    }
}

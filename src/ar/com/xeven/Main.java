package ar.com.xeven;
/*
La empresa El Corte Islandés nos ha encargado una aplicación para gestionar
las tarjetas regalo.
Cuando se crea una nueva tarjeta, se le da un saldo y se asigna de forma automática
un número de 5 dígitos.
Si se intenta gastar más dinero del que tiene la tarjeta, se debe mostrar un mensaje de error.
Dos tarjetas regalo se pueden fusionar
creando una nueva tarjeta con la suma del saldo que tenga cada una y un nuevo
número aleatorio de 5 cifras. Al fusionar dos tarjetas en una, las dos tarjetas
originales se quedarían con 0 € de saldo.
 */
public class Main {

    public static void main(String[] args) {

        TarjetaRegalo tarjeta1 = new TarjetaRegalo(500.00);
        TarjetaRegalo tarjeta2 = new TarjetaRegalo(3350.00);
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);
        tarjeta1.gastar(50.00);
        tarjeta2.gastar(330.00);
        tarjeta2.gastar(200.00);
        tarjeta1.gastar(300.00);
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);
        System.out.println();
        TarjetaRegalo tarjeta3 = tarjeta1.fusionCon(tarjeta2);
        System.out.println(tarjeta1);
        System.out.println(tarjeta2);
        System.out.println(tarjeta3);




    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];

        listaElectrodomesticos[0]=new Electrodomestico('C', "importado");
        listaElectrodomesticos[1]=new Lavadora( 'C', "nacional", 130);
        listaElectrodomesticos[2]=new Television( 'A', "nacional", 42, false);
        listaElectrodomesticos[3]=new Electrodomestico('B', "nacional");
        listaElectrodomesticos[4]=new Electrodomestico('B', "importado");
        listaElectrodomesticos[5]=new Lavadora( 'C', "nacional", 40);
        listaElectrodomesticos[6]=new Television( 'A', "nacional", 30, true);
        listaElectrodomesticos[7]=new Lavadora( 'A', "importado", 15);
        listaElectrodomesticos[8]=new Television( 'A', "nacional", 30, true);
        listaElectrodomesticos[9]=new Electrodomestico( 'A', "importado");

        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;

        for(int i=0;i<listaElectrodomesticos.length;i++){
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }

        System.out.println("La suma del precio de los electrodomesticos es de: "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de: "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de: "+sumaTelevisiones);

    }

}
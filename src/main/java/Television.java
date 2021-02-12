
public class Television extends Electrodomestico{

    private int resolucion;

    private boolean sintonizadorTDT;

    public double precioFinal(){
        double plus=super.precioFinal();

        if (resolucion>40){
            plus = plus + (plus*0.3);
        }

        if (sintonizadorTDT){
            plus+=250000;
        }

        return plus;
    }

    public Television(char consumoEnergetico, String procedencia, int resolucion, boolean sintonizadorTDT){
        super(consumoEnergetico, procedencia);
        this.resolucion=resolucion;
        this.sintonizadorTDT=sintonizadorTDT;
    }

}

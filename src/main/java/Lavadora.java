public class Lavadora  extends Electrodomestico{

    private int carga;

    public int getCarga() {
        return carga;
    }

    public double precioFinal(){

        double plus = super.precioFinal();

        if(carga>120){
            while(carga>=120){
                plus=plus+(plus*0.05);
                carga-=5;
            }
        }

        return plus;
    }

    public Lavadora(char consumoEnergetico, String procedencia, int carga){
        super(consumoEnergetico, procedencia);
        this.carga=carga;
    }

}

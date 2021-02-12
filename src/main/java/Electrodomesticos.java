class Electrodomestico {

    protected char consumoEnergetico;

    protected String procedencia;

    public void comprobarConsumoEnergetico(char consumoEnergetico){
        this.consumoEnergetico=consumoEnergetico;
    }

    public char getConsumoEnergetico() {
        return this.consumoEnergetico;
    }

    public String getProcedencia() {
        return this.procedencia;
    }

    public double precioFinal(){
        int plus=0;
        switch(consumoEnergetico){
            case 'A':
                plus+=450000;
                break;
            case 'B':
                plus+=350000;
                break;
            case 'C':
                plus+=250000;
                break;
        }

        if (procedencia == "nacional"){
            plus+=250000;
        }else {
            plus+=350000;
        }

        return plus;
    }

    public Electrodomestico(char consumoEnergetico, String procedencia){
        this.procedencia=procedencia;
        comprobarConsumoEnergetico(consumoEnergetico);
    }

}

public class CombustionB extends Combustion {

    public CombustionB(String matrícula, double cilindrada) {
        super(matrícula, cilindrada);
        porcentaje = 0.10;
    }

    @Override
    public double impuesto() {
        return porcentaje*cilindrada+porcentaje;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", impuesto= " + impuesto()+", cilindrada= "+cilindrada+ ", porcentaje= "+ this.porcentaje+
                "}");
    }
}

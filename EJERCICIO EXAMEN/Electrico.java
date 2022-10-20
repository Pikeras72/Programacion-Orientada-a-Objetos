public class Electrico extends Vehiculo{

    public Electrico(String matrícula) {
        super(matrícula);
        porcentaje = 0;
    }

    @Override
    public double impuesto() {
        return porcentaje;
    }

    @Override
    public String toString() {
        return super.toString().replace("}", ", impuesto= " + impuesto()+ "}");
    }
}

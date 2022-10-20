public abstract class Vehiculo {
    private String matrícula;
    protected double porcentaje;

    public Vehiculo(String matrícula){
        this.matrícula = matrícula;
        this.porcentaje = 0.05;
    }

    public abstract double impuesto();

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matrícula='" + this.matrícula + '\'' +
                '}';
    }
}

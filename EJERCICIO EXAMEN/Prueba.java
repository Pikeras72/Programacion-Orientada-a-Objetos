public class Prueba {
    public static void main(String[] args) {
        Vehiculo electrico1 = new Electrico("ASDF");
        Vehiculo electrico2 = new Electrico("HASG");
        Vehiculo electrico3 = new Electrico("POUJ");
        Vehiculo combustion1 = new CombustionA("LKJH",45);
        Vehiculo combustion2 = new CombustionB("JHSD",5);
        Vehiculo combustion3 = new CombustionC("PÑLO",18);
        Vehiculo combustion4 = new CombustionA("UJDT",57);
        Vehiculo combustion5 = new CombustionB("KHSD",62);
        Vehiculo combustion6 = new CombustionC("WHMS",51);
        System.out.println(electrico1.toString());
        System.out.println(electrico2.toString());
        System.out.println(electrico3.toString());
        System.out.println(combustion1.toString());
        System.out.println(combustion2.toString());
        System.out.println(combustion3.toString());
        System.out.println(combustion4.toString());
        System.out.println(combustion5.toString());
        System.out.println(combustion6.toString());
    }
}

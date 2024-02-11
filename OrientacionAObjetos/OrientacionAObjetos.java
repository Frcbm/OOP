package OrientacionAObjetos;

public class OrientacionAObjetos {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 1);
        Vehiculo vehiculo2 = new Vehiculo("Honda", "PCX", 2);
        Coche coche1 = new Coche("Renault","Clio", 3);
        System.out.println(vehiculo1.toString());
        System.out.println(coche1.toString());
        System.out.println(coche1.arrancarMotor());
        
        /*Aqui os paso unos ejemplos de cosas que podeis hacer con estas clases, 
        os recomiendo copiar el proyecto e intentar utilizar los metodos ya
        construidos para que os vayan mostrando la información por parte, o crear 
        nuevos objetos*/
    }
}

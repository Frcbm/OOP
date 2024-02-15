package OrientacionAObjetos;

public class Coche extends Vehiculo {
    /*Como esta clase hereda de vehiculo solamente tendremos que especificar
    los atributos que seran diferentes el nRuedas lo inicializaremos en 4*/
    private int nRuedas = 4;
    
    /*Para crear el constructor utilizaremos la palabra reservada super que se
    encargará de coger los atributos de la clase padre, i le incluiremos los 
    atributos especificos de la clase hija. Podemos ver como en este caso
    no estoy pasando como parametro el numero de ruedas, porque estoy
    presuponiendo que un coche va a tener siempre 4 ruedas, por tanto,
    es algo que quiero que se quede asi*/
    public Coche(String marca, String modelo, int matricula){
        super(marca, modelo, matricula);
        this.nRuedas= nRuedas;
    }
    
    /*Solamente necesito crear un getter para el parametro que no esta
    incluido en la clase padre*/
    public int getnRuedas(){
        return this.nRuedas;
    }
    
    /*No voy a crear ningun setter porque no quiero que se pueda cambiar
    el numero de ruedas*/
    
    /*Sobrecargaremos el metodo toString() de la clase padre para que nos muestre
    también el atributo que hemos incluido en la clase hija*/
    public String toString(){
        String a = "";
        a += super.toString() +"\n";
        a += "Numero de ruedas: " + getnRuedas();
        return a;
    }
}

package OrientacionAObjetos;

public class Vehiculo {
    /*Atributos: En primer lugar creamos los atributos comunes a todos los objetos de nuestra clase*/
    private String marca;
    private String modelo;
    private int matricula;
    
    /*Constructor: Creamos un constructor que nos permitiria crear objetos de nuestra clase
    al constructor le pasamos como parametro el valor que queremos que tenga
    nuestro objeto para cada atributo, y el se encargará de que el valor para
    este objeto sea el que le hemos atribuido.
    Para hacerlo utilizamos la palabra reservada "this", como podeis ver,
    en el ámbito del constructor tendríamos 2 variables que tienen el mismo
    nombre, el atríbuto de clase y el parametro que pasamos a la función.
    Utilizar this indica al programa cual debe tomar como el atríbuto y cual no,
    basicamente para que el programa no se líe*/
    public Vehiculo(String marca, String modelo, int matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
    /*Getters: Como los atributos son privados no podemos acceder a ellos a través del main
    por eso creamos "getters", del inglés "to get"(obtener). Estos métodos
    deben ser públicos y nos retornarán el valor del atributo en cuestión,
    por decirlo de un modo sencillo, no pedimos pedirle a la clase cual es el valor
    de un atributo privado, pero si le podemos pedir al getter que nos enseñe
    el valor de dicho atributo*/
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getMatricula(){
        return this.matricula;
    }
    
    /*Aquí incluiriamos los setters, del inglés "to set"(poner, colocar).
    Nos servirán para poder cambiar los atributos una vez creado el objeto,
    lo que hacen es coger el parametro que le pasamos y simplemente cambiar
    el atributo, vereis que la sintaxis es similar a la del constructor a la 
    hora de establecer el valor del atributo ya que al final viene a hacer
    eso mismo, establecer un nuevo valor.*/
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    
    /*Metodos de clase: Los metodos de clase son funciones que podremos usar 
    con objetos que pertenezcan a la misma clase o clases que hereden de la misma
    En este caso crearemos un metodo llamado arrancarMotor() que nos devolverá
    un String*/
    public String arrancarMotor(){
        return getMarca() + " " + getModelo() + " arranca el motor: brum, brum";
    }
    
    /*El método toString() tendrá como función mostrarnos toda la información relativa al objeto*/
    public String toString(){
        String a = "";
        a += "Marca: " + getMarca() + "\n";
        a += "Modelo: " + getModelo() + "\n";
        a += "Matricula: " + getMatricula();
        return a;
    }
}

package javaapplication67;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int matricula;
    
    public Vehiculo(String marca, String modelo, int matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    
    public int getMatricula(){
        return this.matricula;
    }

    public String arrancarMotor(){
        return getMarca() + " " + getModelo() + " arranca el motor: brum, brum";
    }
    public String toString(){
        String a = "";
        a += "Marca: " + getMarca() + "\n";
        a += "Modelo: " + getModelo() + "\n";
        a += "Matricula: " + getMatricula();
        return a;
    }
}

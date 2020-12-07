package Class;

import java.io.Serializable;

public class Atleta implements Serializable{
    private String nombre;
    private int edad;
    private String deporte;
    private double altura;
    private double peso;

    public Atleta(String nombre, int edad, String deporte, double altura, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.deporte = deporte;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
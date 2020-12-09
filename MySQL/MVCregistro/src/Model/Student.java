package Model;

import java.sql.Date;

public class Student {
    private int idstudet;
    private String clave;
    private String nombre;
    private String domicilio;
    private String telefono;
    private String correo;
    private String genero;
    private Date nacimiento;

    public int getIdstudet() {
        return idstudet;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getGenero() {
        return genero;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setIdstudet(int idstudet) {
        this.idstudet = idstudet;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
}
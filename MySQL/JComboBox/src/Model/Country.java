package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Country {
    private int idpais;
    private String nombre;

    public int getIdpais() {
        return idpais;
    }

    public void setIdpais(int idpais) {
        this.idpais = idpais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    public Vector<Country> showCountries(){
        ResultSet rs;
        PreparedStatement ps;
        Country country = new Country();
        Vector<Country> countries = new Vector<>();
        try{
            ConnectionSQL conexion = new ConnectionSQL();
            Connection connection = conexion.getConnect();
            String query = "select * from paises";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            country.setIdpais(0);
            country.setNombre("Opciones");
            countries.add(country);
            while(rs.next()){
                country = new Country();
                country.setIdpais(rs.getInt("idpais"));
                country.setNombre(rs.getString("nombre"));
                countries.add(country);
            }
            rs.close();
        }catch(SQLException except){
            System.err.println(except.getMessage());
        }
        return countries;
    }
}
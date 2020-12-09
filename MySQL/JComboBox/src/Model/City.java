package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class City {
    private int idciudad;
    private String nombre;

    public int getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(int idciudad) {
        this.idciudad = idciudad;
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
    
    public Vector<City> showCities(Integer idciudad){
        ResultSet rs;
        PreparedStatement ps;
        City country = new City();
        Vector<City> countries = new Vector<>();
        try{
            ConnectionSQL conexion = new ConnectionSQL();
            Connection connection = conexion.getConnect();
            String query = "select * from ciudades where idestado="+idciudad;
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            country.setIdciudad(0);
            country.setNombre("Opciones");
            countries.add(country);
            while(rs.next()){
                country = new City();
                country.setIdciudad(rs.getInt("idciudad"));
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
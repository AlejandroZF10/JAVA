package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class State {
    private int idestado;
    private String nombre;

    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
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
    
    public Vector<State> showStates(Integer idpais){
        ResultSet rs;
        PreparedStatement ps;
        State country = new State();
        Vector<State> countries = new Vector<>();
        try{
            ConnectionSQL conexion = new ConnectionSQL();
            Connection connection = conexion.getConnect();
            String query = "select * from estados where idpais="+idpais;
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            country.setIdestado(0);
            country.setNombre("Opciones");
            countries.add(country);
            while(rs.next()){
                country = new State();
                country.setIdestado(rs.getInt("idestado"));
                country.setNombre(rs.getString("nombre_estado"));
                countries.add(country);
            }
            rs.close();
        }catch(SQLException except){
            System.err.println(except.getMessage());
        }
        return countries;
    }
}
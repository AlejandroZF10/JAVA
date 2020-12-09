package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class SQLUser {
    public boolean registrar(User person){
        ConnectionSQL connect = new ConnectionSQL();
        PreparedStatement ps = null;
        try{
            Connection conexion = connect.getConnect();
            String query = "insert into userdata "
                +"(nombre_usuario,contraseña,nombre,correo,idtipo_usuario) values (?,?,?,?,?)";
            ps = conexion.prepareStatement(query);
            ps.setString(1,person.getNameuser());
            ps.setString(2,person.getPassword());
            ps.setString(3,person.getName());
            ps.setString(4,person.getEmail());
            ps.setInt(5,person.getIduser_type());
            ps.executeUpdate();
            return true;
        }catch(SQLException except){
            System.err.println(except.toString());
            return false;
        }
    }
    
    public int confirmar(String usuario){
        ConnectionSQL connect = new ConnectionSQL();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = connect.getConnect();
            String query = "select count(id) from userdata where nombre_usuario=?";
            ps = conexion.prepareStatement(query);
            ps.setString(1,usuario);
            rs = ps.executeQuery();
            if(rs.next())              
                return rs.getInt(1);
            return 1;
        }catch(SQLException except){
            System.err.println(except.toString());
            return 1;
        }
    }
    
    public boolean verificaremail(String email){
        String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron = Pattern.compile(pattern);
        Matcher match = patron.matcher(email);
        return match.find();
    }
    
    public boolean login(User person){
        ConnectionSQL connect = new ConnectionSQL();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            Connection conexion = connect.getConnect();
            String query = "select us.id,us.nombre_usuario,us.contraseña,us.nombre,us.idtipo_usuario,us.correo,ut.nombre from userdata as us inner join usertype as ut on us.idtipo_usuario=ut.id where nombre_usuario=?";
            ps = conexion.prepareStatement(query);
            ps.setString(1,person.getNameuser());
            rs = ps.executeQuery();
            if(rs.next()){
                if(person.getPassword().equals(rs.getString("contraseña"))){
                    System.out.println(person.getIduser());
                    ps = conexion.prepareStatement("update userdata set ultima_sesion=? where id=?");
                    ps.setString(1,person.getLastsession());
                    ps.setInt(2,rs.getInt("id"));
                    ps.executeUpdate();
                    
                    person.setIduser(rs.getInt("us.id"));
                    person.setName(rs.getString("us.nombre"));
                    person.setEmail(rs.getString("us.correo"));
                    person.setIduser_type(rs.getInt("us.idtipo_usuario"));
                    person.setRolname(rs.getString("ut.nombre"));
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta!");
                    return false;
                }
            }else{
                JOptionPane.showMessageDialog(null,"Usuario "+person.getNameuser()+" no encontrado!");
                return false;
            }
        }catch(SQLException except){
            System.err.println(except.toString());
            return false;
        }
    }
}
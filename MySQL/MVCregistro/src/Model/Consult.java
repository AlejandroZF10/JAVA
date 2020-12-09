package Model;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class Consult extends ConnectionSQL{
    private ResultSet result;
    private PreparedStatement prepared;
    
    public boolean insertData(Student user){
        Connection conexion = getConnect();
        try{
            String query = "insert into student (clave,name,address,cellphone,email,birthday,genere) values (?,?,?,?,?,?,?)";
            prepared = conexion.prepareStatement(query);
            prepared.setString(1,user.getClave());
            prepared.setString(2,user.getNombre());
            prepared.setString(3,user.getDomicilio());
            prepared.setString(4,user.getTelefono());
            prepared.setString(5,user.getCorreo());
            prepared.setDate(6,user.getNacimiento());
            prepared.setString(7,user.getGenero());
            if(prepared.executeUpdate()>0)
                return true;
        }catch(SQLException except){
            System.err.println(except.toString());
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }        
        return false;
    }
    
    public boolean searchData(Student user){
        Connection conexion = getConnect();
        try{
           prepared = conexion.prepareStatement("select * from student where clave=?");
           prepared.setString(1,user.getClave());
           result = prepared.executeQuery();
           if(result.next()){
               user.setIdstudet(result.getInt("idstudent"));
               user.setClave(result.getString("clave"));
               user.setNombre(result.getString("name"));
               user.setDomicilio(result.getString("address"));
               user.setTelefono(result.getString("cellphone"));
               user.setCorreo(result.getString("email"));
               user.setNacimiento(result.getDate("birthday"));
               user.setGenero(result.getString("genere"));
               return true;
           }else{
               return false;
           }
        }catch(SQLException except){
            System.err.println(except.toString());
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }
    }
    
    public boolean updateData(Student user){
        Connection conexion = getConnect();
        try{
            String query = "update student set clave=?,name=?,address=?,cellphone=?,email=?,birthday=?,genere=? where idstudent=?";
            prepared = conexion.prepareStatement(query);
            prepared.setString(1,user.getClave());
            prepared.setString(2,user.getNombre());
            prepared.setString(3,user.getDomicilio());
            prepared.setString(4,user.getTelefono());
            prepared.setString(5,user.getCorreo());
            prepared.setDate(6,user.getNacimiento());
            prepared.setString(7,user.getGenero());
            prepared.setInt(8,user.getIdstudet());
            if(prepared.executeUpdate()>0)
                return true;
        }catch(SQLException except){
            System.err.println(except.toString());
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }        
        return false;
    }
    
    public boolean deleteData(Student user){
        Connection conexion = getConnect();
        try{
            String query = "delete from student where idstudent=?";
            prepared = conexion.prepareStatement(query);
            prepared.setInt(1,user.getIdstudet());
            if(prepared.executeUpdate()>0)
                return true;
        }catch(SQLException except){
            System.err.println(except.toString());
            return false;
        }finally{
            try{
                conexion.close();
            }catch(SQLException except){
                System.err.println(except.toString());
            }
        }        
        return false;
    }
}
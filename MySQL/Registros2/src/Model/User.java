package Model;

public class User {
    private int iduser;
    private int iduser_type;
    private String nameuser;
    private String password;
    private String email;
    private String name;
    private String lastsession;
    private String rolname;
    
    public int getIduser() {
        return iduser;
    }

    public int getIduser_type() {
        return iduser_type;
    }

    public String getNameuser() {
        return nameuser;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getLastsession() {
        return lastsession;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public void setIduser_type(int iduser_type) {
        this.iduser_type = iduser_type;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastsession(String lastsession) {
        this.lastsession = lastsession;
    }

    public String getRolname() {
        return rolname;
    }

    public void setRolname(String rolname) {
        this.rolname = rolname;
    }
    
}
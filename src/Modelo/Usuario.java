package Modelo;

/**
 *
 * @author Final
 */
public class Usuario {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDateborn() {
        return Dateborn;
    }

    public void setDateborn(String Dateborn) {
        this.Dateborn = Dateborn;
    }

    private int id;
    private String Password;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Dateborn;

    public String getDateReg() {
        return DateReg;
    }

    public void setDateReg(String DateReg) {
        this.DateReg = DateReg;
    }

    public Boolean getEstado() {
        return Estado;
    }

    public void setEstado(Boolean Estado) {
        this.Estado = Estado;
    }
    private String DateReg;
    private Boolean Estado;

}

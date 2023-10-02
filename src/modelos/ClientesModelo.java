package modelos;

public class ClientesModelo{
    private int idCliente;
    private String nombre;
    private String telefono;
    private String email;

    public int getId() {
        return idCliente;
    }

    public void setId(int id) {
        this.idCliente = id;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

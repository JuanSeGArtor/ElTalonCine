package eltaloncine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesControlador {
    private Conectar conectar;
    private ClientesModelo modelo;
    private Connection con;
    
    public ClientesControlador() {
        conectar = new Conectar();
        modelo = new ClientesModelo();
    }
    
    public void insertar(String nombre, String telefono, String email) {
        PreparedStatement ps;
        String sql;
        modelo.setNombre(nombre);
        modelo.setTelefono(telefono);
        modelo.setEmail(email);
        
        try{
            con = conectar.getConexion();
            sql = "insert into clientes(nombre, telefono, email) values(?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(2, modelo.getNombre());
            ps.setString(3, modelo.getTelefono());
            ps.setString(4, modelo.getEmail());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado el Cliente");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e);
        }
    }
}

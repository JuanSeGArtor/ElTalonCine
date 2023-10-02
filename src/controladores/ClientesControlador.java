package controladores;

import modelos.ClientesModelo;
import eltaloncine.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ClientesControlador {
    private static ClientesControlador instance;
    private Conectar conectar;
    private ClientesModelo modelo;
    private Connection con;
    
    public ClientesControlador() {
        conectar = new Conectar();
        modelo = new ClientesModelo();
        con = conectar.getConexion();
    }
    
    public static ClientesControlador getInstance() {
        if (instance == null) {
            instance = new ClientesControlador();
        }
        return instance;
    }   
    
    public void insertar(String nombre, String telefono, String email) {
        PreparedStatement ps;
        String sql;
        modelo.setNombre(nombre);
        modelo.setTelefono(telefono);
        modelo.setEmail(email);

        try{
            if (con != null) {
                sql = "insert into clientes(nombre, telefono, email) values(?, ?, ?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, modelo.getNombre());
                ps.setString(2, modelo.getTelefono());
                ps.setString(3, modelo.getEmail());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se ha registrado el Cliente");
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexión: la conexión es nula");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e);
        }
    }
    
    public void eliminar(int clienteId) {
        PreparedStatement ps;
        String sql;

        try {
            if (con != null) {
                sql = "DELETE FROM clientes WHERE idCliente = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, clienteId);
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el cliente con el ID especificado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexión: la conexión es nula");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
    }
}

}

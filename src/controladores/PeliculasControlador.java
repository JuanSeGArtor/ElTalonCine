package controladores;

import modelos.PeliculasModelo;
import eltaloncine.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PeliculasControlador {
    private static PeliculasControlador instance;
    private Conectar conectar;
    private PeliculasModelo modelo;
    private Connection con;
    
    public PeliculasControlador() {
        conectar = new Conectar();
        modelo = new PeliculasModelo();
        con = conectar.getConexion();
    }
    
    public static PeliculasControlador getInstance() {
        if (instance == null) {
            instance = new PeliculasControlador();
        }
        return instance;
    }
    
    public void insertar(String titulo, String genero, int duracion, String tipoPelicula, int anio) {
        PreparedStatement ps;
        String sql;

        try {
            if (con != null) {
                sql = "INSERT INTO eltaloncine.peliculas (titulo, genero, duracion, tipoPelicula, anio) VALUES (?, ?, ?, ?, ?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, titulo);
                ps.setString(2, genero);
                ps.setInt(3, duracion);
                ps.setString(4, tipoPelicula);
                ps.setInt(5, anio);

                int filasAfectadas = ps.executeUpdate();
                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(null, "Se ha registrado la película");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo registrar la película");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexión: la conexión es nula");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
    }

    
    public void eliminar(int peliculaId) {
        PreparedStatement ps;
        String sql;

        try {
            if (con != null) {
                sql = "DELETE FROM peliculas WHERE idPelicula = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, peliculaId);
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Película eliminada correctamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la película con el ID especificado");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexión: la conexión es nula");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
    }
}

}

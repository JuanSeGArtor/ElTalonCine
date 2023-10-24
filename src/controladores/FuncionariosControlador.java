/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import eltaloncine.Conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelos.FuncionariosModelo;

/**
 *
 * @author user
 */
public class FuncionariosControlador {
    private static FuncionariosControlador instance;
    private Conectar conectar;
    private FuncionariosModelo modelo;
    private Connection con;
    
    public FuncionariosControlador() {
        conectar = new Conectar();
        modelo = new FuncionariosModelo();
        con = conectar.getConexion();
    }
    
    public static FuncionariosControlador getInstance() {
        if (instance == null) {
            instance = new FuncionariosControlador();
        }
        return instance;
    }   
    
    public void insertar(String nombre, String cargo, double salario) {
        PreparedStatement ps;
        String sql;
        modelo.setNombre(nombre);
        modelo.setCargo(cargo);
        modelo.setSalario(salario);

        try{
            if (con != null) {
                sql = "INSERT INTO funcionarios(nombre, cargo, salario) VALUES(?, ?, ?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, modelo.getNombre());
                ps.setString(2, modelo.getCargo());
                ps.setDouble(3, modelo.getSalario());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se ha registrado el Funcionario");
            } else {
                JOptionPane.showMessageDialog(null, "Error de conexión: la conexión es nula");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e);
        }
    }
    
    public void eliminar(int funcionarioId) {
        PreparedStatement ps;
        String sql;

        try {
            if (con != null) {
                sql = "DELETE FROM funcionarios WHERE idFuncionario = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, funcionarioId);
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    JOptionPane.showMessageDialog(null, "Funcionario eliminado correctamente");
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

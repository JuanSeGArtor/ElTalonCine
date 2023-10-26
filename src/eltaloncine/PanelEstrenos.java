/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eltaloncine;
import javax.swing.JOptionPane;
import vistas.Peliculas;

/**
 *
 * @author SENA
 */
public class PanelEstrenos extends javax.swing.JFrame {

    ElTalonCine estrenos;
    
    public PanelEstrenos() {
        initComponents();
        
        estrenos = new ElTalonCine();
    
        estrenos.setAforo(100);
        estrenos.setEntrada(25000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtFieldEstreno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFieldIngresosTotales = new javax.swing.JLabel();
        sideBar2 = new javax.swing.JPanel();
        btnVistaEstrenos2 = new javax.swing.JButton();
        btnVistaClasicos2 = new javax.swing.JButton();
        btnVistaMenu2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnVistaClasicos3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(255, 255, 204));
        menu.setPreferredSize(new java.awt.Dimension(1320, 1400));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 96)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EL TALON");

        jButton1.setBackground(new java.awt.Color(51, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VENDER");
        jButton1.setActionCommand("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1btnEstrenoVenderActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OCUPACION");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2btnEstrenoOcupacionActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("VACIAR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3btnEstrenoVaciarActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 0, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("NUEVA");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5btnEstrenoCambiarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 0, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("INGRESOS");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4btnEstrenoIngresosActionPerformed(evt);
            }
        });

        txtFieldEstreno.setEditable(false);
        txtFieldEstreno.setBackground(new java.awt.Color(204, 204, 204));
        txtFieldEstreno.setFont(new java.awt.Font("Bodoni MT", 0, 24)); // NOI18N
        txtFieldEstreno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldEstrenoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Bodoni MT", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ESTRENOS");

        txtFieldIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFieldIngresosTotales.setEnabled(false);

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFieldEstreno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                            .addGroup(menuLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(menuLayout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtFieldIngresosTotales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(190, 190, 190)
                        .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFieldEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(txtFieldIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        sideBar2.setBackground(new java.awt.Color(255, 255, 153));
        sideBar2.setPreferredSize(new java.awt.Dimension(320, 1400));

        btnVistaEstrenos2.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaEstrenos2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaEstrenos2.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaEstrenos2.setText("ESTRENOS");
        btnVistaEstrenos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaEstrenos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaEstrenos2(evt);
            }
        });

        btnVistaClasicos2.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaClasicos2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaClasicos2.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaClasicos2.setText("CLÁSICOS");
        btnVistaClasicos2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaClasicos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaClasicos2(evt);
            }
        });

        btnVistaMenu2.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaMenu2.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaMenu2.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaMenu2.setText("MENÚ");
        btnVistaMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaMenu2(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("SALAS");

        btnVistaClasicos3.setBackground(new java.awt.Color(102, 0, 0));
        btnVistaClasicos3.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnVistaClasicos3.setForeground(new java.awt.Color(255, 255, 255));
        btnVistaClasicos3.setText("PELÍCULAS");
        btnVistaClasicos3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVistaClasicos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVistaClasicos3(evt);
            }
        });

        javax.swing.GroupLayout sideBar2Layout = new javax.swing.GroupLayout(sideBar2);
        sideBar2.setLayout(sideBar2Layout);
        sideBar2Layout.setHorizontalGroup(
            sideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnVistaEstrenos2, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
            .addComponent(btnVistaClasicos2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVistaMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(btnVistaClasicos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sideBar2Layout.setVerticalGroup(
            sideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVistaMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(jLabel6)
                .addGap(44, 44, 44)
                .addComponent(btnVistaEstrenos2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVistaClasicos2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVistaClasicos3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(sideBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                    .addComponent(sideBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1btnEstrenoVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1btnEstrenoVenderActionPerformed
        // TODO add your handling code here:
        if(estrenos.getTituloPelicula().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la película primero");
        } else {
            estrenos.venderEntrada();
        }
    }//GEN-LAST:event_jButton1btnEstrenoVenderActionPerformed

    private void jButton2btnEstrenoOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2btnEstrenoOcupacionActionPerformed
        // TODO add your handling code here:
        if (!estrenos.getTituloPelicula().isEmpty()) {
            int ocupacion = estrenos.getSillasOcupadas();
            JOptionPane.showMessageDialog(null, "La cantidad de sillas ocupadas es de: " + ocupacion);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la película primero.");
        }
    }//GEN-LAST:event_jButton2btnEstrenoOcupacionActionPerformed

    private void jButton3btnEstrenoVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3btnEstrenoVaciarActionPerformed
        // TODO add your handling code here:
        if (!estrenos.getTituloPelicula().isEmpty()) {
            estrenos.vaciarSala();
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la película primero.");
        }
    }//GEN-LAST:event_jButton3btnEstrenoVaciarActionPerformed

    private void jButton5btnEstrenoCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5btnEstrenoCambiarActionPerformed
        // TODO add your handling code here:
        String pelicula = JOptionPane.showInputDialog(null, "Ingrese el nombre de la película");

        if (pelicula != null && !pelicula.isEmpty()) {
            estrenos.setPelicula(pelicula);
            txtFieldEstreno.setText(pelicula);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de película válido.");
        }
    }//GEN-LAST:event_jButton5btnEstrenoCambiarActionPerformed

    private void jButton4btnEstrenoIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4btnEstrenoIngresosActionPerformed
        // TODO add your handling code here:
        if (!estrenos.getTituloPelicula().isEmpty()) {
            double ingresos = estrenos.getIngresoSala();

            // Formatear el mensaje para mostrar los ingresos con dos decimales y el símbolo de dólar
            String mensaje = String.format("Los ingresos de la sala son de: $%.2f", ingresos);

            // Mostrar el mensaje formateado en un cuadro de diálogo
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar el nombre de la película primero.");
        }
    }//GEN-LAST:event_jButton4btnEstrenoIngresosActionPerformed

    private void txtFieldEstrenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldEstrenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldEstrenoActionPerformed

    private void btnVistaEstrenos2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaEstrenos2

    }//GEN-LAST:event_btnVistaEstrenos2

    private void btnVistaClasicos2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaClasicos2
        this.setVisible(false);

        PanelClasicos m = new PanelClasicos();
        m.setVisible(true);
    }//GEN-LAST:event_btnVistaClasicos2

    private void btnVistaMenu2(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaMenu2
        this.setVisible(false);

        PanelMenu m = new PanelMenu();
        m.setVisible(true);
    }//GEN-LAST:event_btnVistaMenu2

    private void btnVistaClasicos3(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVistaClasicos3
        //this.setVisible(false);

        Peliculas m = new Peliculas();
        m.setVisible(true);
    }//GEN-LAST:event_btnVistaClasicos3

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelEstrenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelEstrenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelEstrenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelEstrenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelEstrenos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVistaClasicos2;
    private javax.swing.JButton btnVistaClasicos3;
    private javax.swing.JButton btnVistaEstrenos2;
    private javax.swing.JButton btnVistaMenu2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel sideBar2;
    private javax.swing.JTextField txtFieldEstreno;
    private javax.swing.JLabel txtFieldIngresosTotales;
    // End of variables declaration//GEN-END:variables
}

package eltaloncine;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;

public class ElTalonCine extends JFrame {
    private JPanel panelPrincipal;
    private PanelMenu panelMenu;
    private PanelEstrenos panelEstrenos;
    private PanelClasicos panelClasicos;

    private int aforo;
    private int sillasOcupadas;
    private String tituloPelicula;
    private double precioEntrada;

    public ElTalonCine() {
        // Inicializar los datos del cine
        aforo = 100;
        sillasOcupadas = 0;
        tituloPelicula = "";
        precioEntrada = 5000;

        // Inicializar las vistas
        panelMenu = new PanelMenu();
        panelEstrenos = new PanelEstrenos();
        panelClasicos = new PanelClasicos();

        // Crear el panel principal que utilizará un CardLayout para mostrar las vistas
        panelPrincipal = new JPanel(new CardLayout());
        panelPrincipal.add(panelMenu, "menu");
        panelPrincipal.add(panelEstrenos, "estrenos");
        panelPrincipal.add(panelClasicos, "clasicos");

        // Mostrar la vista del menú al inicio
        mostrarVista("menu");

        // Agregar el panel principal a la ventana
        getContentPane().add(panelPrincipal);
    }

    // Método para mostrar una vista específica
    private void mostrarVista(String vista) {
        CardLayout cardLayout = (CardLayout) panelPrincipal.getLayout();
        cardLayout.show(panelPrincipal, vista);

        // Actualizar la información de la sala de cine en cada vista
        if (vista.equals("menu")) {
            panelMenu.actualizarInfoSala();
        } else if (vista.equals("estrenos")) {
            panelEstrenos.actualizarInfoSala();
        } else if (vista.equals("clasicos")) {
            panelClasicos.actualizarInfoSala();
        }
    }
    
    
    //METODOS SET
    public void setAforo(int afo) {
        aforo = afo;
    }
    
    public void setSillasOcupadas(int cantSillasOcupadas) {
        sillasOcupadas = cantSillasOcupadas;
    }
        
    public void setPelicula(String pelicula) {
        tituloPelicula = pelicula;
    }
    
    public void setEntrada(double entrada) {
        precioEntrada = entrada;
    }
    
    public void setSillasLibres(int libres) {
        int ocupado;
        ocupado = aforo - libres;
        
        sillasOcupadas = ocupado;
    }
    
    //METODOS GET
    public int getAforo() {
        return aforo;
    }

    public int getSillasOcupadas() {
        return sillasOcupadas;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }
    
    public int getSillasLibres() {
        return sillasOcupadas;
    }
    
    //METODO PORCENTAJE OCUPADO
    public double getPorcentajeOcupacion() {
        double porcentaje;
        porcentaje = (double)sillasOcupadas / aforo * 100;
        return porcentaje;
    }
    
    //METODO INGRESOS DE LA SALA
    public double getIngresoSala() {
        double ingresoSala = sillasOcupadas * precioEntrada;
        return ingresoSala;
    }
    
    public void vaciarSala() {
        sillasOcupadas = 0;
        tituloPelicula = "";
    }
    
    public void venderEntrada() {
        sillasOcupadas ++;
    }
}

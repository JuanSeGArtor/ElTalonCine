package eltaloncine;

public class ElTalonCine {

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

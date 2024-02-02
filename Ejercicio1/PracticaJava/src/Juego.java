public class Juego {
    // Atributos

    private String genero;
    private int duracionEnHoras;
    private double precio;
    private boolean esComprado;
    private String nombre;

    // Metodos

    /**
     * El siguiente constructor está vacío y no devuelve nada GG
     */

    public Juego() {
        this.nombre = "ninguno";
        this.duracionEnHoras = 0;
        this.esComprado = false;
    }

    /**
     * 
     * @param genero Establece el genero del juego
     * @param nombre
     * @param precio
     */
    public Juego(String genero, String nombre, int precio) {
        this.esComprado = false;
        this.genero = genero;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Juego(Juego j) {
        this.nombre = j.nombre;
    }

    public void comprarJuego() {
        this.esComprado = true;
    }

    public void venderJuego() {
        this.esComprado = false;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracionEnHoras() {
        return duracionEnHoras;
    }

    public void setDuracionEnHoras(int duracionEnHoras) {
        this.duracionEnHoras = duracionEnHoras;
    }

    public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }

    public boolean isEsComprado() {
        return esComprado;
    }

    public void setEsComprado(boolean esComprado) {
        this.esComprado = esComprado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPrecio(int precio){
        if (precio < 0) precio = 0;
        if(precio > 60) this.precio = 60;

        this.precio = precio;
    }

    public String toString() {
        return "Juego [genero=" + genero + ", duracionEnHoras=" + duracionEnHoras + ", precio=" + precio
        + ", esComprado=" + esComprado + ", nombre=" + nombre + "]";
    }

    
}

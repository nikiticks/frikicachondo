package theworldisyours;

public class TheWorldIsYours {

    private String nombre;
    private String colorPrincipal;
    private int habitantes;
    private double temperaturaPromedio;
    private String continentePrincipal;

    // Constructor vacío (por defecto)
    public TheWorldIsYours() {
        this.nombre = "Mundo Desconocido";
        this.colorPrincipal = "Verde";
        this.habitantes = 0;
        this.temperaturaPromedio = 15.0;
        this.continentePrincipal = "Desconocido";
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getColorPrincipal() {
        return colorPrincipal;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public double getTemperaturaPromedio() {
        return temperaturaPromedio;
    }

    public String getContinentePrincipal() {
        return continentePrincipal;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColorPrincipal(String colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public void setTemperaturaPromedio(double temperaturaPromedio) {
        this.temperaturaPromedio = temperaturaPromedio;
    }

    public void setContinentePrincipal(String continentePrincipal) {
        this.continentePrincipal = continentePrincipal;
    }
}

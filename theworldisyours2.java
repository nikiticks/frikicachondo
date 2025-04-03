package theworldisyours;

public class theworldisyours2 {

    public static void main(String[] args) {

        TheWorldIsYours mundo = new TheWorldIsYours();
        mundo.setNombre("Tierra");
        mundo.setColorPrincipal("Verde");
        mundo.setHabitantes(8000000);
        mundo.setTemperaturaPromedio(16.5);
        mundo.setContinentePrincipal("América");
        
        System.out.println("Nombre del mundo: " + mundo.getNombre());
        System.out.println("Color principal: " + mundo.getColorPrincipal());
        System.out.println("Número de habitantes: " + mundo.getHabitantes());
        System.out.println("Temperatura promedio: " + mundo.getTemperaturaPromedio() + " °C");
        System.out.println("Continente principal: " + mundo.getContinentePrincipal());
    }
}

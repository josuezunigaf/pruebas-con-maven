package tests;

import org.junit.Test;

public class PruebaUnoTest {
    // Atributos
    String color;
    String marca;
    int km;

    // Anotacion Maven + junit para identificar tests
    //@Test
    // Metodo impresion
    public void imprimirAtributos() {

        // Crear o instanciar un objeto
        PruebaUnoTest autoUno = new PruebaUnoTest();

        // Asignacion de valores a los atributos del objeto
        autoUno.color = "Rojo";
        autoUno.marca = "Ferrari";
        autoUno.km = 0;

        // Impresion en consola
        System.out.println("El color del autoUno es: " + autoUno.color);
        System.out.println("La marca del autoUno es: " + autoUno.marca);
        System.out.println("El kilometraje del autoUno es: " + autoUno.km);
    }
}

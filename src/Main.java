import figurasGeometricas.Circulo;
import figurasGeometricas.Rectangulo;
import figurasGeometricas.Triangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo("rojo", true, 5);
        Rectangulo rectangulo1= new Rectangulo("azul", false, 5, 10);
        Triangulo triangulo1 = new Triangulo("azul", false, 3, 4, 5);

        System.out.println("Datos del circulo");
        circulo1.area();
        circulo1.perimetro();
        System.out.println("Datos del rectangulo");
        rectangulo1.area();
        rectangulo1.perimetro();
        System.out.println("Datos del triangulo");
        triangulo1.area();
        triangulo1.perimetro();

    }

}

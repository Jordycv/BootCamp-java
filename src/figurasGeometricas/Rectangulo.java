package figurasGeometricas;

public class Rectangulo extends Figura{

    private int ancho;
    private int altura;
    public Rectangulo(String color, boolean relleno, int ancho, int altura) {
        super(color, relleno);
        this.ancho=ancho;
        this.altura=altura;
    }

    @Override
    public void area(){
        System.out.println("Area: "+(ancho*altura));
    }
    @Override
    public void perimetro(){
        System.out.println("Perimetro: "+2*(ancho+altura));
    }

}

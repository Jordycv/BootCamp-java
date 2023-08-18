package figurasGeometricas;

public class Circulo extends Figura{

    private double radio;

    public Circulo(String color, boolean lleno, double radio){
        super(color,lleno);
        this.radio=radio;
    }
    @Override
    public void area(){
        double areat=3.1416*radio*radio;
        System.out.println("Area: "+areat);
    }
    @Override
    public void perimetro(){
        double p=2*3.1416*radio;
        System.out.println("Perimetro:"+p);
    }
}

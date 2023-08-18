package figurasGeometricas;

public class Triangulo extends Figura {

    private int a;
    private int b;
    private int c;
    public Triangulo(String color, boolean relleno, int a, int b, int c) {
        super(color, relleno);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public void area(){ //Formula de Herón
        double areat;
        double s=(double)(a+b+c)/2;
       areat= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area: "+areat);
    }
    @Override
    public void perimetro(){
        int p=a+b+c;
        System.out.println("Perimetro : "+p);
    }



}

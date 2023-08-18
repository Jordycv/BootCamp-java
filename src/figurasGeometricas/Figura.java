package figurasGeometricas;

public class Figura {
    protected String color;
    protected boolean relleno;
    public Figura(String color, boolean relleno){
        this.color=color;
        this.relleno=relleno;
    }
    protected void area(){
        System.out.println("Calculando el area");
    }
    protected void perimetro(){
        System.out.println("Calculando el perimetro ");
    }

}

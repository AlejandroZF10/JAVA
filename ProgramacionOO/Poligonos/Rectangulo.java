public class Rectangulo extends Poligono{
    private final double sizeone;
    private final double sizetwo;

    public Rectangulo(double sizeone, double sizetwo, int noLados) {
        super(noLados);
        this.sizeone = sizeone;
        this.sizetwo = sizetwo;
    }

    public double getSizeone() {
        return sizeone;
    }

    public double getSizetwo() {
        return sizetwo;
    }

    @Override
    public String toString() {
        return "Rectangulo{Lados = "+super.toString()+"Lado uno = "+sizeone+", Lado dos = "+sizetwo+'}';
    }
    
    @Override
    public double area(){
       return sizeone*sizetwo; 
    }
}
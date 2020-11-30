public class Triangulo extends Poligono{
    private final double sizeone;
    private final double sizetwo;
    private final double sizethree;

    public Triangulo(double sizeone, double sizetwo, double sizethree, int noLados) {
        super(noLados);
        this.sizeone = sizeone;
        this.sizetwo = sizetwo;
        this.sizethree = sizethree;
    }

    public double getSizeone() {
        return sizeone;
    }

    public double getSizetwo() {
        return sizetwo;
    }

    public double getSizethree() {
        return sizethree;
    }

    @Override
    public String toString() {
        return "Triangulo{Lados = "+super.toString()+" Lado uno = "+sizeone+", Lado dos = "+sizetwo+", Lado tres = "+sizethree+'}';
    }
    
    @Override
    public double area(){
        double perimetro = (sizeone+sizetwo+sizethree)/2;
        return Math.sqrt((perimetro*(perimetro-sizeone))*(perimetro*(perimetro-sizetwo))*(perimetro*(perimetro-sizethree)));
    }
}
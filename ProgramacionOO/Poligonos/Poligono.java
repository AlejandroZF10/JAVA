public abstract class Poligono {
    protected int noLados;

    public Poligono(int noLados) {
        this.noLados = noLados;
    }

    public int getNoLados() {
        return noLados;
    }

    @Override
    public String toString() {
        return "Numero de lados = "+noLados;
    }
    
    public abstract double area();
}

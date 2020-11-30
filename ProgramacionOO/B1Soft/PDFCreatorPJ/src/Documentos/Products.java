package Documentos;

import java.text.DecimalFormat;

public class Products {
    private final String codigo;
    private final String lote;
    private final String descripcion;
    private final String cantidad;
    private final String claveU;
    private final String claveSP;
    private final String unidad;
    private final double precioU;
    private final double descuento;
    private final double total;

    public Products(String codigo, String lote, String descripcion, String cantidad, String claveU, String claveSP, String unidad, double precioU, double descuento, double total) {
        this.codigo = codigo;
        this.lote = lote;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.claveU = claveU;
        this.claveSP = claveSP;
        this.unidad = unidad;
        this.precioU = precioU;
        this.descuento = descuento;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getLote() {
        return lote;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String getCantidad(){
        return convert(cantidad);
    }

    public String getClaveU() {
        return claveU;
    }

    public String getClaveSP() {
        return claveSP;
    }

    public String getPrecioUImp() {
        return convert(precioU);
    }

    public String getDescuentoImp() {
        return (descuento == 0.0)?"$0.00":convert(descuento);
    }

    public String getTotalImp() {
        return convert(total);
    }

    public String getUnidad() {
        return unidad;
    }

    public double getPrecioU() {
        return precioU;
    }

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }
    
    private String convert(double numero){
        DecimalFormat myFormatter = new DecimalFormat("$###,###.00");
        String output = myFormatter.format(numero);
        return output;
    }
    
    private String convert(String numero){
        double number = Double.parseDouble(numero);
        DecimalFormat myFormatter = new DecimalFormat("###,###");
        String output = myFormatter.format(number);
        return output;
    }
}
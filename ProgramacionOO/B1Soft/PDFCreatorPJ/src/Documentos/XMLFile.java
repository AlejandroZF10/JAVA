package Documentos;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class XMLFile{
    private double subTotal_aux,iva_aux;
    private final String namefile;
    private final String tipoComp,serie,fecha,lugarExp,numSello,folioInt;
    private final String cliente,clientRFC,domicilioFis,entregaA;
    private final String pagoCond,pagoForma,pagoMeth,tipoRel,uuidRel,cfdiUso,monedaTipo,periodoFac;
    private final String contrato,fianza,casaAfin,noProvee,noRemision,noPedido,cambioTipo,observaciones;
    private final String subtotal,iva,total,noContrato,vigencia,dateContrato,valContrato;
    private final String folioFiscal,certificadoSAT,fechaCert,cadenaOriginal,selloDigitalE,selloDigitalSAT,codeQR;
    private ArrayList<Products> productos = new ArrayList<>();

    public XMLFile(String namefile, String tipoComp, String serie, String fecha, String lugarExp, String numSello, String folioInt, String cliente, String clientRFC, String domicilioFis, String entregaA, String pagoCond, String pagoForma, String pagoMeth, String tipoRel, String uuidRel, String cfdiUso, String monedaTipo, String periodoFac, String contrato, String fianza, String casaAfin, String noProvee, String noRemision, String noPedido, String cambioTipo, String observaciones, String folioFiscal, String certificadoSAT, String fechaCert, String cadenaOriginal, String selloDigitalE, String selloDigitalSAT, String codeQR,String noContrato, String vigencia, String dateContrato, String valContrato, ArrayList<Products> productos){
        this.namefile = namefile;
        this.tipoComp = tipoComp;
        this.serie = serie;
        this.fecha = fecha;
        this.lugarExp = lugarExp;
        this.numSello = numSello;
        this.folioInt = folioInt;
        this.cliente = cliente;
        this.clientRFC = clientRFC;
        this.domicilioFis = domicilioFis;
        this.entregaA = entregaA;
        this.pagoCond = pagoCond;
        this.pagoForma = pagoForma;
        this.pagoMeth = pagoMeth;
        this.tipoRel = tipoRel;
        this.uuidRel = uuidRel;
        this.cfdiUso = cfdiUso;
        this.monedaTipo = monedaTipo;
        this.periodoFac = periodoFac;
        this.contrato = contrato;
        this.fianza = fianza;
        this.casaAfin = casaAfin;
        this.noProvee = noProvee;
        this.noRemision = noRemision;
        this.noPedido = noPedido;
        this.cambioTipo = cambioTipo;
        this.productos = productos;
        this.subtotal = calculateSubTotal();
        this.iva = calculateIVA();
        this.total = calculateTotal();
        this.observaciones = observaciones;
        this.folioFiscal = folioFiscal;
        this.certificadoSAT = certificadoSAT;
        this.fechaCert = fechaCert;
        this.cadenaOriginal = cadenaOriginal;
        this.selloDigitalE = selloDigitalE;
        this.selloDigitalSAT = selloDigitalSAT;
        this.codeQR = codeQR;
        this.noContrato = noContrato;
        this.vigencia = vigencia;
        this.dateContrato = dateContrato;
        this.valContrato = valContrato;
    }

    public String getNoContrato() {
        return noContrato;
    }

    public String getVigencia() {
        return vigencia;
    }

    public String getDateContrato() {
        return dateContrato;
    }

    public String getValContrato() {
        return valContrato;
    }
    
    

    public String getCodeQR() {
        return codeQR;
    }

    public String getFolioFiscal() {
        return folioFiscal;
    }

    public String getCertificadoSAT() {
        return certificadoSAT;
    }

    public String getFechaCert() {
        return fechaCert;
    }

    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    public String getSelloDigitalE() {
        return selloDigitalE;
    }

    public String getSelloDigitalSAT() {
        return selloDigitalSAT;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getNamefile() {
        return namefile;
    }

    public String getTipoComp() {
        return tipoComp;
    }

    public String getSerie() {
        return serie;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLugarExp() {
        return lugarExp;
    }

    public String getNumSello() {
        return numSello;
    }

    public String getFolioInt() {
        return folioInt;
    }

    public String getCliente() {
        return cliente;
    }

    public String getClientRFC() {
        return clientRFC;
    }

    public String getDomicilioFis() {
        return domicilioFis;
    }

    public String getEntregaA() {
        return entregaA;
    }

    public String getPagoCond() {
        return pagoCond;
    }

    public String getPagoForma() {
        return pagoForma;
    }

    public String getPagoMeth() {
        return pagoMeth;
    }

    public String getTipoRel() {
        return tipoRel;
    }

    public String getUuidRel() {
        return uuidRel;
    }

    public String getCfdiUso() {
        return cfdiUso;
    }

    public String getMonedaTipo() {
        return monedaTipo;
    }

    public String getPeriodoFac() {
        return periodoFac;
    }

    public String getContrato() {
        return contrato;
    }

    public String getFianza() {
        return fianza;
    }

    public String getCasaAfin() {
        return casaAfin;
    }

    public String getNoProvee() {
        return noProvee;
    }

    public String getNoRemision() {
        return noRemision;
    }

    public String getNoPedido() {
        return noPedido;
    }

    public String getCambioTipo() {
        return cambioTipo;
    }

    public ArrayList<Products> getProductos() {
        return productos;
    } 

    public String getSubtotal() {
        return subtotal;
    }

    public String getIva() {
        return iva;
    }

    public String getTotal() {
        return total;
    }
    
    private String calculateSubTotal(){
        for(int i = 0; i<productos.size() ;i++)
            subTotal_aux += productos.get(i).getTotal();
        DecimalFormat myFormatter = new DecimalFormat("$###,###.00");
        String output = myFormatter.format(subTotal_aux);
        return output;
    }
    
    private String calculateIVA(){
        iva_aux = subTotal_aux*0.16;
        DecimalFormat myFormatter = new DecimalFormat("$###,###.00");
        String output = myFormatter.format(iva_aux);
        return output;
    }
    
    private String calculateTotal(){
        DecimalFormat myFormatter = new DecimalFormat("$###,###.00");
        String output = myFormatter.format(subTotal_aux+iva_aux);
        return output;
    }
}
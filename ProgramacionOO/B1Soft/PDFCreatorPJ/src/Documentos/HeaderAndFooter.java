package Documentos;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;

final class HeaderAndFooter extends PdfPageEventHelper {
    protected final XMLFile file;

    HeaderAndFooter(XMLFile file) {
        this.file = file;
    }
        
    @Override
    public void onStartPage(PdfWriter pdfWriter, Document document) {
        try { //Header
            PdfContentByte cb = pdfWriter.getDirectContent();
            Image imgSoc = Image.getInstance("C:/PDFCreatorPJ/recursos/img_header.jpg");
            imgSoc.setAbsolutePosition(15,780);
            imgSoc.scalePercent(33f,32f);
            cb.addImage(imgSoc);
            
            //Obtención y declaración de campos y etiquetas de los datos del archivo xml.
            String label[] = {"Tipo De Comprobante:","Folio:","Fecha :","Lugar de Expedición:","Núm. de Sello:","Folio Interno:","\n"};
            String field[] = {file.getTipoComp(),file.getSerie(),file.getFecha(),file.getLugarExp(),file.getNumSello(),file.getFolioInt(),"\n"};
            //Declaración y configuracuón inicial de la tabla.
            PdfPTable header = new PdfPTable(4);
            header.setPaddingTop(10);
            header.setTotalWidth(new float[]{100,80,100,75});
            header.setWidthPercentage(100);
            header.getDefaultCell().setBorder(0);
            for(int i = 0; i<7;i++){
                header.addCell(""); header.addCell("");
                Font boldFont = new Font(Font.FontFamily.HELVETICA,8,Font.BOLD);
                boldFont.setColor(46,121,236);
                //pdfCell es el lado de la etiqueta.
                PdfPCell pdfCell = new PdfPCell(new Phrase(label[i],boldFont));
                pdfCell.setBorder(0);
                pdfCell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                header.addCell(pdfCell);
                //pdfCell1 es el campo leído del xml.
                Font boldFont1 = new Font(Font.FontFamily.HELVETICA,8,Font.NORMAL);
                PdfPCell pdfCell1 = new PdfPCell(new Phrase(field[i],boldFont1));
                pdfCell1.setBorder(0);
                pdfCell1.setHorizontalAlignment(Element.ALIGN_LEFT);
                header.addCell(pdfCell1);
            }
            document.add(header);
            
        } catch (BadElementException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | DocumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        try { //Footer
            PdfContentByte cb = pdfWriter.getDirectContent();
            Image imgSoc = Image.getInstance("C:/PDFCreatorPJ/recursos/img_footer_empresa.jpg");
            imgSoc.setAbsolutePosition(15,10);
            imgSoc.scalePercent(33f,32f);
            cb.addImage(imgSoc);
        } catch (BadElementException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException | DocumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
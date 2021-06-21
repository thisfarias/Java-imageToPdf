import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
public class CreatePdf{
    public static void main(String[] args){
        String FILE_NAME = "C:\\Users\\faria\\OneDrive\\Documentos\\Dev\\Java\\static\\pdf\\chillyfacts.pdf";
        Document document = new Document();
        try{
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            document.open();

            Paragraph p = new Paragraph();
            p.add("Text 1");
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);

            Paragraph p2 = new Paragraph();
            p2.add("Text 2");
            document.add(p2);   

            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("This is my paragraph 3", f));
            document.close();
            System.out.println("Done");
        } catch(Exception e){
            e.printStackTrace();
        }

    }
}

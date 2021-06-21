import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfWithImage {
    public static void main(String[] args){
        String FILE_NAME = "C:\\Users\\faria\\OneDrive\\Documentos\\Dev\\Java\\static\\pdf\\PdfWithImage.pdf";
        Document document = new Document();
        try{
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            document.open();
            Image img = Image.getInstance("static/images/wallpaper.png");
            img.scaleAbsolute(500, 300);
            img.setAlignment(Element.ALIGN_CENTER);
            document.add(img);
            document.close();
            System.out.println("Done");

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}

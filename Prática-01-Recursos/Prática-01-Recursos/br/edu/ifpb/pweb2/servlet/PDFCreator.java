package br.edu.ifpb.pweb2.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

@WebServlet("/create")
public class PDFCreator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/pdf");
		try {
			createPdf(response.getOutputStream());
		} catch (DocumentException e) {
			response.sendError(404, "PDF n�o gerado.");
		}
	}
	
	public void createPdf(OutputStream stream) throws IOException, DocumentException {
        Document document = new Document();
        PdfWriter.getInstance(document, stream);
        document.open();
        Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 16, Font.BOLDITALIC);
        Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
        Chunk chunk = new Chunk("Isto � um t�tulo", chapterFont);
        Chapter chapter = new Chapter(new Paragraph(chunk), 1);
        chapter.setNumberDepth(0);
        chapter.add(new Paragraph("Isto � um par�grafo.", paragraphFont));
        document.add(chapter);
        document.close();
    }

}

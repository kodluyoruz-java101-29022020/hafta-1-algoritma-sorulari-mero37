
public class Printer {
	public static void printPDFDocument(PDFDocument pdf) {
		System.out.println(pdf.getBody());
	}
	public static void printWordDocument(WordDocument docx) {
		System.out.println(docx.getBody());
	}
	public static void main(String[] args) {
		PDFDocument pdf=new PDFDocument("PDF Document");
		WordDocument docx=new WordDocument("Word Document");
		printPDFDocument(pdf);
		printWordDocument(docx);
	}

}

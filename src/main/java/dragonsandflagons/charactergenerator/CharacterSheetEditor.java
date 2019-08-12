package dragonsandflagons.charactergenerator;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import javax.swing.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class CharacterSheetEditor {

    private static final File CHARACTER_SHEET_ALTERNATIVE_PDF = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/CharacterSheetAlternative.pdf")
            .getFile());

    private static final File CHARACTER_SHEET_COMPLETE = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/CharacterSheetComplete.pdf")
            .getFile());

    private static final File CHARACTER_DETAIL_FORM = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/CharacterDetailsForm.pdf")
            .getFile());

    private static final File TYRANNY_OF_DRAGONS_SHEET = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/TyrannyOfDragons.pdf")
            .getFile());

    private static final File SPELLCASTING_SHEET = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/SpellcastingSheet.pdf")
            .getFile());

    private static final File CHARACTER_SHEET_FIFTH_EDITION = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/CharacterSheet5E.pdf")
            .getFile());

    private static final File DND_CHARACTER_SHEET = new File(CharacterSheetEditor.class.getClassLoader()
            .getResource("CharacterSheetPDFs/DnD/CharacterSheet.pdf")
            .getFile());

    /**
     * Create a fillable form copy of the provided pdf document.
     * @param document The original pdf document to be copied.
     * @return A fillable form copy of the provided pdf document.
     * @throws IOException If original document not found.
     */
    public static PDDocument createCopyOfPDF(PDDocument document) throws IOException {
        // Create an extra document to hold the future copy
        PDDocument newSheet = new PDDocument();

        // Create a list of the fields and an int to iterate when we make updates
        List<PDField> fields = new ArrayList<>();
        int i = 0;

        // Grab the Fillable Fields from the PDF
        PDDocumentCatalog docCatalog = document.getDocumentCatalog();
        PDAcroForm pdAcroForm = docCatalog.getAcroForm();

        for (PDPage page: document.getPages()){
            for (PDField field : pdAcroForm.getFields()) {
                // get the fields that are check boxes.
                fields.add(field);
            }
            newSheet.addPage(page);
        }

        // Create new PDAcroForm to apply to our new copy
        PDAcroForm newForm = new PDAcroForm(newSheet);
        newSheet.getDocumentCatalog().setAcroForm(newForm);
        newForm.setFields(fields);

        // Save and close new document
        return newSheet;
    }

    /**
     * Fill out and save a copy of the character sheet document provided.
     * @param characterSheet the original character sheet pdf document.
     * @throws IOException If original document not found.
     */
    public static void fillOutCharacterSheet(PDDocument characterSheet) throws IOException {
        PDDocument characterSheetCopy = createCopyOfPDF(characterSheet);

        // Grab the Fillable Fields from the PDF
        PDDocumentCatalog docCatalog = characterSheetCopy.getDocumentCatalog();
        PDAcroForm pdAcroForm = docCatalog.getAcroForm();

        for (PDPage page: characterSheetCopy.getPages()){
            for (PDField field : pdAcroForm.getFields()) {

                PDField fieldCopy = field;
                // get the fields that are check boxes.
                if (!field.getFieldType().equalsIgnoreCase("btn")) {
                    field.setValue(JOptionPane.showInputDialog("Enter value for: "
                            + field.getPartialName()));
                    field.setPartialName(field.getPartialName());
                }
            }
        }

        characterSheetCopy.save("NewSheetFilled.pdf");
        characterSheetCopy.close();
    }

    public static void main(String[] args) throws IOException {

        PDDocument document = PDDocument.load(CHARACTER_SHEET_ALTERNATIVE_PDF);

        try {
            fillOutCharacterSheet(document);
        } catch (IOException e) {
            System.out.println("File not found at " + e);
        }

    }

}

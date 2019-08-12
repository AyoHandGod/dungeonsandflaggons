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

    public static void main(String[] args) throws IOException {

        try {

            // Load a copy of the character sheet pdf
            PDDocument document = PDDocument.load(CHARACTER_SHEET_ALTERNATIVE_PDF);
            // Create an extra document to hold the future copy
            PDDocument newSheet = new PDDocument();

            List<PDField> fields = new ArrayList<PDField>();
            int i = 0;

            // Grab the Fillable Fields from the PDF
            PDDocumentCatalog docCatalog = document.getDocumentCatalog();
            PDAcroForm pdAcroForm = docCatalog.getAcroForm();

            for (PDField field : pdAcroForm.getFields()) {

                PDField fieldCopy = field;
                // get the fields that are check boxes.
                if (!field.getFieldType().equalsIgnoreCase("btn")) {
                    field.setValue(JOptionPane.showInputDialog("Enter value for: "
                            + field.getPartialName()));
                    field.setPartialName(field.getPartialName() + i++);
                    List<PDPage> pages = doc
                }

                //System.out.println(field.getFieldType());

//            String response = JOptionPane.showInputDialog("Please enter your characters " + field.getPartialName());
//            JFrame frame = new JFrame();
//            frame.add(new JCheckBox("A check box"));
//            frame.setVisible(true);
//            field.setValue(response);
//            System.out.println(field.getPartialName());
//            System.out.println(" : " +field.getValueAsString());
            }

            for (PDPage page : document.getPages()) {
                newSheet.addPage(page);
            }

            System.out.println(document.getNumberOfPages());

            newSheet.save("NewSheet.pdf");

            document.close();
            newSheet.close();
        } catch (IOException e) {
            System.out.println("File not found at " + e);
        }

    }


}

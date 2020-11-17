package com.mycompany.ppe_v2;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Facture {

    /**
     *
     * @param panier
     * @param PrixTotale
     * @param idCommande
     */


public Facture(List<String> panier, String PrixTotale, Integer idCommande){
        ArrayList columnTitle = new ArrayList<String>();
        columnTitle.add("Id_Produit");
        columnTitle.add("Libelle");
        columnTitle.add("Quantité");
        columnTitle.add("Prix Unitaire HT");
        columnTitle.add("Prix Total");
        Document unDocument = new Document(PageSize.A4);
        try {
            PdfWriter.getInstance(unDocument, new FileOutputStream(System.getProperty("user.home") + "/Documents" + "\\Facture_Theo_"+idCommande+".pdf"));
            unDocument.addAuthor("Theo le bg");
            unDocument.addTitle("Facturation_Theo_Bg");
            unDocument.open();

            Paragraph p = new Paragraph("Bon de commande (ID: " + idCommande + ")", FontFactory.getFont(FontFactory.defaultEncoding,24, Font.BOLD));
            p.setAlignment(Element.ALIGN_CENTER);

            Paragraph emetteur = new Paragraph("\n \n Théo Polo \n 8 rue des romarins,\n 66130 Corbère \n\n",
                    FontFactory.getFont(FontFactory.defaultEncoding,13));


            Paragraph destinataire = new Paragraph("Theo" + "\n" + "Theo@gmail.com"+"\n" + "0612353625" + "\n \n");
            destinataire.setAlignment(Element.ALIGN_RIGHT);

            Paragraph test = new Paragraph("\n LISTE DES PRODUITS:",
                    FontFactory.getFont(FontFactory.defaultEncoding,13));

            PdfPTable table = new PdfPTable(5);
            PdfPCell c1;

            for (int i = 0; i < 5; i++) {
                c1 = new PdfPCell(new Phrase((String) columnTitle.get(i)));
                c1.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(c1);
            }

            for (String string : panier) {
                table.addCell(string);
            }
            table.setHeaderRows(1);
            table.setTotalWidth(PageSize.A4.getWidth()-100);
            table.setLockedWidth(true);

            Paragraph Totale = new Paragraph("PrixTotale = "+PrixTotale);
            Totale.setAlignment(Element.ALIGN_RIGHT);

            unDocument.add(p);
            unDocument.add(emetteur);
            unDocument.add(destinataire);
            unDocument.add(test);
            unDocument.add(table);
            unDocument.add(Totale);

        } catch (Exception ex) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
        }
        unDocument.close();
    }

}
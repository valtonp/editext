package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

import java.util.Objects;

public class CommandeRemplacer extends CommandeDocument {


    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;start;end;texte");
            return;
        }
        int debut = Integer.parseInt(parameters[1]);
        int fin = Integer.parseInt(parameters[2]);
        String texte;
        if(parameters.length == 3) texte = "";
        else texte = parameters[3];

        this.document.remplacer(debut, fin, texte);
        super.executer();
    }

}

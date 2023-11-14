package fr.iut.editeur.document;

import junit.framework.TestCase;


public class DocumentTest extends TestCase {


    public void test_remplacer(){
        Document d = new Document();
        d.setTexte("coucou");
        d.remplacer(2, 3, "a");
        assertEquals("coacou", d.getTexte());
    }

    public void test_majuscules(){
        Document d = new Document();
        d.setTexte("coucou");
        d.majuscules(2, 4);
        assertEquals("coUCou", d.getTexte());
    }
}
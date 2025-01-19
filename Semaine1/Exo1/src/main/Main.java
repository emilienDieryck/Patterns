package main;

import implementations.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        AnalyseurDeTexte analyseurDeTexte = new AnalyseurDeTexte();

        analyseurDeTexte.addObserver(new Belgique());
        analyseurDeTexte.addObserver(new Ligne());
        analyseurDeTexte.addObserver(new Mots());
        analyseurDeTexte.addObserver(new Palindromes());


        try {
           BufferedReader bufferedReader = new BufferedReader(new FileReader("../resources/file.txt"));
           analyseurDeTexte.readObservers(bufferedReader);

        } catch (FileNotFoundException e) {
            System.out.println("Fichier introuvable ou error lors de l'ouverture du fichier");
        }

    }
}

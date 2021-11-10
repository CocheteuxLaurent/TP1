import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Bibliothèque bibliothèque;
    private Scanner scanner;

public Main(){
    bibliothèque = new Bibliothèque();
    scanner = new Scanner(System.in);
    scanner.close();
}

public Livre ajoutLivre(){
        System.out.println("Veuillez rentrer le titre du livre ");
        String titre = scanner.nextLine();
        System.out.println("Veuillez rentrer l'auteur du livre ");
        String auteur = scanner.nextLine();
        System.out.println("Veuillez rentrer genre du livre ");
        String genre = scanner.nextLine();
        System.out.println("Veuillez rentrer l'année de publication du livre ");
        String datePublication = scanner.nextLine();
        Livre livre = new Livre(titre,auteur,genre,datePublication);
        return livre;

}


}

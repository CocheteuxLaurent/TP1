
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private Bibliothèque bibliothèque;
    private Scanner scanner;

    public Main() {
        bibliothèque= new Bibliothèque();
        scanner = new Scanner(System.in);
        this.afficheMenu();
        scanner.close();
    }

public Livre CreationLivre(){
        //bibliothèque = new Bibliothèque();
        //scanner = new Scanner(System.in);
        ArrayList<String> livres = new ArrayList<String>();
        System.out.println("Veuillez rentrer le titre du livre ");
        String titre = scanner.nextLine();
        System.out.println("Veuillez rentrer l'auteur du livre ");
        String auteur = scanner.nextLine();
        System.out.println("Veuillez rentrer genre du livre ");
        String genre = scanner.nextLine();
        System.out.println("Veuillez rentrer l'année de publication du livre ");
        String datePublication = scanner.nextLine();
        Livre livre = new Livre(titre,auteur,genre,datePublication);
        //scanner.close();
        return livre;
}

        public Revues CreationRevue(){
                //bibliothèque = new Bibliothèque();
                //scanner = new Scanner(System.in);

                ArrayList<String> revues = new ArrayList<String>();
                System.out.println("Veuillez rentrer le titre de la revue ");
                String titre = scanner.nextLine();
                System.out.println("Veuillez rentrer le numero de la revue ");
                String numero = scanner.nextLine();
                System.out.println("Veuillez rentrer l'année d'édition de la revue ");
                String anneeEdition = scanner.nextLine();
                Revues revue = new Revues(titre,numero,anneeEdition);
                //scanner.close();
                return revue;
        }

        public Dvd CreationDvd(){
                //bibliothèque = new Bibliothèque();
                //scanner = new Scanner(System.in);

                ArrayList<String> dvds = new ArrayList<String>();
                System.out.println("Veuillez rentrer le titre du DVD ");
                String titre = scanner.nextLine();
                System.out.println("Veuillez rentrer l'auteur du DVD ");
                String auteur = scanner.nextLine();
                System.out.println("Veuillez rentrer l'année de sortie du DVD ");
                String anneeSortie = scanner.nextLine();
                Dvd dvd = new Dvd(titre,auteur,anneeSortie);
                //scanner.close();
                return dvd;
        }

        public void afficheMenu(){
        int choix;
        do {
              System.out.println();
              System.out.println(" Gestion De La Bibliothèque ");
              System.out.println();
              System.out.println("1 - Enregistrer un nouveau livre ");
              System.out.println("2 - Enregistrer une nouvelle revue ");
              System.out.println("3 - Enregistrer un nouveau dvd ");
              System.out.println("4 - Rechercher un livre par son auteur ");
              System.out.println("5 - Rechercher un livre par sa date de publication ");
              System.out.println("0 - Quitter ");
              System.out.println();
              System.out.println(" Entrer votre choix : ");
              choix = scanner.nextInt();
              scanner.nextLine();
              System.out.println();

              switch (choix){
                      case 1 :
                              Livre livre = this.CreationLivre();
                              bibliothèque.ajoutLivre(livre);
                              break;

                      case 2 :
                              Revues revue = this.CreationRevue();
                              bibliothèque.ajoutRevues(revue);
                              break;

                      case 3 :
                              Dvd dvd = this.CreationDvd();
                              bibliothèque.ajoutDvd(dvd);
                              break;

              }
         }
        while (choix != 0);
}

public static void main(String[] args) {
Main main = new Main();
//main.ajoutLivre();
//main.ajoutRevue();
//main.ajoutDvd();

}


}

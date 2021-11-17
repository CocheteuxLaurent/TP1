import java.util.ArrayList;
import java.util.Scanner;



public class Bibliothèque {

private ArrayList<Livre> livres;
private ArrayList<Revues> revues;
private ArrayList<Dvd> dvds;
private Scanner scanner;


public Bibliothèque (){
 livres = new ArrayList<Livre>();
 revues = new ArrayList<Revues>();
 dvds = new ArrayList<Dvd>();

 }

 public String ajoutLivre(Livre livre){
 livres.add(livre);
 return livre.getTitre();
 }

 public String ajoutRevues(Revues revue){
  revues.add(revue);
  return revue.getTitre();
 }

 public String ajoutDvd(Dvd dvd){
  dvds.add(dvd);
  return dvd.getTitre();
 }

 public void chercherAuteur(){

  scanner = new Scanner(System.in);
  System.out.println("Veuillez entrer le nom de l'auteur");
  String auteurClavier = scanner.nextLine();
  for (int i=0; i< livres.size(); i++){
   if(livres.get(i).getAuteur().equals(auteurClavier)){
    System.out.println("Voici les informations de l'auteur trouvé");
    System.out.println("Titre :" + livres.get(i).getTitre().toString());
    System.out.println("Auteur :" + livres.get(i).getAuteur().toString());
    System.out.println("Genre :"+ livres.get(i).getGenre().toString());
    System.out.println("Année dde publication :" + livres.get(i).getDatePublication().toString());
   }else {
    System.out.println("Votre auteur n'a pas était retrouvé");
   }
  }
 }

 public void chercherArtiste(){
  scanner = new Scanner(System.in);

  System.out.println("Veuillez entrer le nom d'un artiste");
  String nomArtiste = scanner.nextLine();
  for (int i=0;i<dvds.size();i++){
   if(dvds.get(i).getAuteur().equals(nomArtiste)){
    System.out.println("Voici les informations de l'auteur trouvé");
    System.out.println("Titre :" + dvds.get(i).getTitre().toString());
    System.out.println("Auteur :" + dvds.get(i).getAuteur().toString());
    System.out.println("Année de publication :" + dvds.get(i).getAnneeSortie().toString());
   }else {
    System.out.println("Votre artiste n'a pas était trouvé");
   }
  }
 }

 public void chercherDateRevue(){
  scanner = new Scanner(System.in);

  System.out.println("Veuillez entrer la date d'une revue");
  String dateRevue = scanner.nextLine();
  for (int i=0;i<revues.size();i++){
   if(revues.get(i).getAnneeEdition().equals(dateRevue)){
    System.out.println("Voici les informations de la revue trouvé");
    System.out.println("Titre :" + revues.get(i).getTitre().toString());
    System.out.println("Auteur :" + revues.get(i).getNumero().toString());
    System.out.println("Année d'édition :" + revues.get(i).getAnneeEdition().toString());
   }else {
    System.out.println("Votre date n'a pas était trouvé");
   }
  }
 }

}

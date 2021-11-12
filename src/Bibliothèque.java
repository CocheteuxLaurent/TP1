import java.util.ArrayList;


public class Bibliothèque {

private ArrayList<Livre> livres;
private ArrayList<Revues> revues;
private ArrayList<Dvd> dvds;

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

 public Livre chercherLivreParAuteur(String auteur) {
 System.out.println("Livre a trouver");
  Livre l = null;
  Livre livress = new Livre( "titre4","auteur4","roman","2020");
  if (livres.contains(livress)) {
   System.out.println("auteur trouver");
  }
  else {
   System.out.println("auteur pas trouver");
  }

  /*for (int i = 0; i < livres.size(); i++)
   if (livres.get(i).getAuteur() == auteur){
    l = livres.get(i);
    System.out.println("Touver");
    break;
  }
   */
  return l;
 }

 public Livre chercherLivreParDate(String datePublication) {
  Livre l = null;
  for (int i = 0; i < livres.size(); i++)
   if (livres.get(i).getAuteur() == datePublication){
    l = livres.get(i);
    break;
 }
 return l;
}

}

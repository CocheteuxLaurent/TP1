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

}


public class Dvd {

    public String titre;
    public String auteur;
    public int anneeSortie;

    public Dvd( String titre, String auteur, int anneeSortie){
        this.titre = titre;
        this.auteur = auteur;
        this.anneeSortie =anneeSortie;
    }

    public  String getTitre(){
        return titre;
    }

    public  String getAuteur(){
        return auteur;
    }

    public  int getAnneeSortie(){
        return anneeSortie;
    }
}

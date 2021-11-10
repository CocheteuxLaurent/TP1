public class Dvd {

    public String titre;
    public String auteur;
    public String anneeSortie;

    public Dvd( String titre, String auteur, String anneeSortie){
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

    public  String getAnneeSortie(){return anneeSortie;}
}

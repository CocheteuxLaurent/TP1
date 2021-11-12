import java.util.Date;

public class Livre {

        private String titre;
        private String auteur;
        private String genre;
        private String datePublication;
        private static long compteur = 0;
        private Date dateEmprunt;
        private Client clients;



    public Livre(String titre, String auteur, String genre, String datePublication){
            this.titre = titre;
            this.auteur = auteur;
            this.genre = genre;
            this.datePublication = datePublication;
            this.compteur++;



    }

        public String getTitre(){
            return titre;
        }

        public  String getAuteur(){
        return auteur;
    }

        public  String getGenre(){
        return genre;
    }

        public  String getDatePublication(){
        return datePublication;
    }

        public Date getDateEmprunt() {
        return dateEmprunt;
    }

        public Client getEmprunteur() {
        return clients;
    }

        public void setEmprunteur(Client client) {
        clients = client;
    }

        public void setDateEmprunt(Date date) {
        dateEmprunt = date;
    }

        public void emprunter(Client client) {
        this.clients = client;
        dateEmprunt = new Date();
        System.out.println(dateEmprunt);


    }

}




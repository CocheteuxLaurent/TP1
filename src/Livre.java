public class Livre {

        private String titre;
        private String auteur;
        private String genre;
        private String datePublication;

        public Livre(String titre, String auteur, String genre, String datePublication){
            this.titre = titre;
            this.auteur = auteur;
            this.genre = genre;
            this.datePublication = datePublication;
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

}




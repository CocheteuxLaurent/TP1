public class Client {
    private  String nom;
    private  String prenom;
    private  int numeroClient;
    private  String telephone;
    private  int compteurLivresEmpruntes;
    private  static int compteur = 0;


    public  Client (String nom, String prenom, int numeroClient, String telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroClient = numeroClient;
        this.telephone = telephone;
        this.compteurLivresEmpruntes = 0;
        compteur ++;
        this.numeroClient = compteur;

    }

    public String getNom(){return nom;}

    public String getPrenom(){return prenom;}

    public int getNumeroClient(){return numeroClient;}

    public  String getTelephone(){return telephone;}

    public  int getCompteurLivresEmpruntes(){return  compteurLivresEmpruntes;}

    public void incrementerCompteurLivre(){compteurLivresEmpruntes++;}

    public void decrementerCompteurLivre(){compteurLivresEmpruntes--;}


}

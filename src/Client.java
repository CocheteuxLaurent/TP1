public class Client {
    private  String nom;
    private  String prenom;
    private  int numeroClient;
    private  String telephone;



    public  Client (String nom, String prenom, int numeroClient, String telephone){
        this.nom = nom;
        this.prenom = prenom;
        this.numeroClient = numeroClient;
        this.telephone = telephone;


    }

    public String getNom(){return nom;}

    public String getPrenom(){return prenom;}

    public int getNumeroClient(){return numeroClient;}

    public  String getTelephone(){return telephone;}



}

public class Revues {

    private String titre;
    private String numero;
    private String anneeEdition;

    public Revues(String titre, String numero, String anneeEdition){
        this.titre = titre;
        this.numero = numero;
        this.anneeEdition = anneeEdition;
    }

    public  String getTitre(){
        return titre;
    }

    public  String getNumero(){
        return numero;
    }

    public  String getAnneeEdition(){
        return anneeEdition;
    }
}

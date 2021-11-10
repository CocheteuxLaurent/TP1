public class Revues {

    private String titre;
    private int numero;
    private int anneeEdition;

    public Revues(String titre, int numero, int anneeEdition){
        this.titre = titre;
        this.numero = numero;
        this.anneeEdition = anneeEdition;
    }

    public  String getTitre(){
        return titre;
    }

    public  int getNumero(){
        return numero;
    }

    public  int getAnneeEdition(){
        return anneeEdition;
    }
}

package Entities;

public class Vin
{
    private String nomVin;
    private String couleurVin;
    private int anneeVin;

    public Vin(String nomVin, String couleurVin, int anneeVin) {
        this.nomVin = nomVin;
        this.couleurVin = couleurVin;
        this.anneeVin = anneeVin;

    }

    public String getNomVin() {
        return nomVin;
    }

    public void setNomVin(String nomVin) {
        this.nomVin = nomVin;
    }

    public String getCouleurVin() {
        return couleurVin;
    }

    public void setCouleurVin(String couleurVin) {
        this.couleurVin = couleurVin;

    }

    public int getAnneeVin() {
        return anneeVin;
    }

    public void setAnneeVin(int anneeVin) {
        anneeVin = anneeVin;
    }
}

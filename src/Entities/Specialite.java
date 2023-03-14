package Entities;

public class Specialite
{
    private int codeSpe;
    private String nomSpe;

    public Specialite(int codeSpe, String nomSpe) {
        this.codeSpe = codeSpe;
        this.nomSpe = nomSpe;
    }

    public int getCodeSpe() {
        return codeSpe;
    }

    public Specialite setNomSpe(String nomSpe) {
        this.nomSpe = nomSpe;
        return this;
    }

    public String getNomSpe() {
        return nomSpe;
    }
}

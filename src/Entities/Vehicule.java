package Entities;

public class Vehicule
{
    private String immat;
    private String marque;
    private int nbCheveaux;
    private int nbPlaces;

    // etc etc ....

    public Vehicule(String _Immat, String _Marque, int _NbCheveaux, int unNbPlaces)
    {
        immat = _Immat;
        marque = _Marque;
        nbCheveaux = _NbCheveaux;
        nbPlaces = unNbPlaces;
    }

    public String getImmat()
    {
        return immat;
    }

    public String getMarque()
    {
        return marque;
    }

    public void setImmat(String nouvelleImmat)
    {
        immat = nouvelleImmat;
    }

}

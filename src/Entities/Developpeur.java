package Entities;

import java.util.ArrayList;

public class Developpeur
{
    // Membres privés / Attributs
    private int idDeveloppeur;
    private String nomDeveloppeur;
    private int ageDeveloppeur;

    // On crée notre collection typée avec des objets de type SPECIALITE
    private ArrayList<Specialite> sesSpecialites;

    //private Specialite saSpecialite;

    // On va utiliser une collection <==> un tableau intelligent
    // pas de limite de taille
    // on va pouvoir TYPER nos collections

    // Constructeur non paramétré
    public Developpeur()
    {

    }
    // Constructeur paramétré
    // Initialiser / valoriser les membres privés
    public Developpeur(int unId, String unNom, int unAge)//,Specialite uneSpecialite)
    {
        // membre privé = le paramètre correspondant
        idDeveloppeur = unId;
        nomDeveloppeur = unNom;
        ageDeveloppeur = unAge;
        //saSpecialite = uneSpecialite;

        // L'arrayList ne se passe pas en paramètre du constructeur
        // MAIS PAR CONTRE il faut INSTANCIER votre collection

        sesSpecialites = new ArrayList<>();

    }

    public void AjouterUneSpecialite(Specialite uneSpe)
    {
        sesSpecialites.add(uneSpe);
    }

    /*
    public Specialite getSaSpecialite() {
        return saSpecialite;
    }

     */

    // getters ==> récupérer + setters ==> modifier
    public int getIdDev()
    {
        return idDeveloppeur;
    }

    public String getNomDev()
    {
        return nomDeveloppeur;
    }
    public int getAgeDev()
    {
        return ageDeveloppeur;
    }

    //Setters
    public void setIdDeveloppeur(int unId)
    {
        idDeveloppeur = unId;
    }
    public void setNomDeveloppeur(String unNom)
    {
        nomDeveloppeur = unNom;
    }
    public void setAgeDeveloppeur(int unAge)
    {
        ageDeveloppeur = unAge;
    }

    public ArrayList<Specialite> getSesSpecialites()
    {
        return sesSpecialites;
    }

    public void setSesSpecialites(ArrayList<Specialite> desSpecialites)
    {
        sesSpecialites = desSpecialites;
    }

}

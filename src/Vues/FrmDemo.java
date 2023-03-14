package Vues;

import Entities.Developpeur;
import Entities.Specialite;
import Entities.Vehicule;
import Entities.Vin;

import javax.swing.*;

public class FrmDemo extends JFrame
{
    public FrmDemo()
    {
        // Je déclare mon objet
        Developpeur dev1;
        // J'instancie mon objet

        Specialite spec1 = new Specialite(1, "WEB");
        Specialite spec2 = new Specialite(2, "Java");
        Specialite spec3 = new Specialite(3, "C#");

        dev1 = new Developpeur(1, "Paul",24);

        // V1
        // On ajoute nos spécialités à notre développeur
        //dev1.getSesSpecialites().add(spec1);
        //dev1.getSesSpecialites().add(spec2);
        //dev1.getSesSpecialites().add(spec3);

        // V2
        // On ajoute nos spécialités à notre développeur
        dev1.AjouterUneSpecialite(spec1);
        dev1.AjouterUneSpecialite(spec2);
        dev1.AjouterUneSpecialite(spec3);

        String infos = "";

        infos = "ID du dev : " + dev1.getIdDev() +
                "\nNom du dev : "+ dev1.getNomDev()+
                "\nAge du dev : "+ dev1.getAgeDev();

        // V1 : on parcours la liste comme un tableau
        /*
        for(int i = 0 ; i < dev1.getSesSpecialites().size() ; i++)
        {
            infos = infos + "\nCode spe : "+dev1.getSesSpecialites().get(i).getCodeSpe()+
                    "\nNom spe : " +dev1.getSesSpecialites().get(i).getNomSpe();
        }
        JOptionPane.showMessageDialog(null,infos);

         */

        // V2 : on parcours la liste avec nos objets typés
        // Pour chaque Specialite que l'on nomme spe et qui se trouve
        // dans notre collection
        for(Specialite spe : dev1.getSesSpecialites())
        {
            infos = infos + "\nCode spe : "+spe.getCodeSpe()+
                    "\nNom spe : " +spe.getNomSpe();
        }
        JOptionPane.showMessageDialog(null,infos);

        //Developpeur dev2 = new Developpeur(2,"Virginie",34,laSpeDuDevVirginie);

        /*
        JOptionPane.showMessageDialog(null, dev1.getIdDev() + " - "+
                dev1.getNomDev() + " - "+ dev1.getAgeDev() + " - "+ dev1.getSaSpecialite().getCodeSpe()
        + " - " + dev1.getSaSpecialite().getNomSpe());


        JOptionPane.showMessageDialog(null, dev2.getIdDev() + " - "+
                dev2.getNomDev() + " - "+ dev2.getAgeDev() + " - "+ dev2.getSaSpecialite().getCodeSpe()
                + " - " + dev2.getSaSpecialite().getNomSpe());

        //laSpeDuDev.setNomSpe("JAVA");
        dev1.getSaSpecialite().setNomSpe("JAVA");

        JOptionPane.showMessageDialog(null, dev1.getIdDev() + " - "+
                dev1.getNomDev() + " - "+ dev1.getAgeDev() + " - "+ dev1.getSaSpecialite().getCodeSpe()
                + " - " + dev1.getSaSpecialite().getNomSpe());





        JOptionPane.showMessageDialog(null, dev2.getIdDev() + " - "+
                dev2.getNomDev() + " - "+ dev2.getAgeDev() + " - "+ dev2.getSaSpecialite().getCodeSpe()
                + " - " + dev2.getSaSpecialite().getNomSpe());


         */

/*
        dev1.setAgeDeveloppeur(26);

        JOptionPane.showMessageDialog(null, dev1.getIdDev() + " - "+
                dev1.getNomDev() + " - "+ dev1.getAgeDev());

        // En une seule ligne
        //Developpeur dev2 = new Developpeur();

        Vehicule veh = new Vehicule("123-DS-23","Renault", 130, 5);

        JOptionPane.showMessageDialog(null,veh.getImmat()
        + " - " + veh.getMarque());

        veh.setImmat("123-DS-56");
        JOptionPane.showMessageDialog(null,veh.getImmat()
                + " - " + veh.getMarque());


        Vin monVin  = new Vin("ORT","Rouge",2023);



 */

    }
}

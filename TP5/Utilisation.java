public class Utilisation
{
    public static void essai (){
        CompteCourant vC = new CompteCourant(1000);
        CompteAnnuel vA = new CompteAnnuel(1000,0.06);
        CompteMensuel vM = new CompteMensuel(1000,0.005);
        Compte[] tab = {vC,vA,vM};
        for (int i=0 ; i < 3 ; i++){ tab[i].bilanAnnuel(); }
    }
}

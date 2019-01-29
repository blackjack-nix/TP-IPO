
/**
 * 2ieme classe de clacul qui sert a pas grand chose de plus que l'autre
 *
 * @author Théo Péresse-Gourbil
 * @version V1
 */
public class Utilisation
{
    public static void essai (){
           int[] vTab = new int[25] ;
           initTab(vTab);
           affTab(vTab);
           affTabInv(vTab);
           System.out.println(somme(vTab));
    }
    
    public static void affTab (final int[] pTab){
        for (int i = 0 ; i < pTab.length ; i++){
            System.out.println(pTab[i]);
        }
    }
    
    public static void affTabInv (final int[] pTab){
        for (int i = pTab.length - 1 ; i > -1 ; i--){
            System.out.println(pTab[i]);
        }
    }
    
    public static void initTab (final int[] pTab){
        for ( int i = 0 ; i < pTab.length ; i ++){
            pTab[i] = 2 * i;
            System.out.println(pTab[i]);
        }
    }
    
    public static int somme (final int[] pTab){
        int vSomme = 0;
        for ( int i = 0 ; i < pTab.length ; i++){
            vSomme += pTab[i];
        }
        return vSomme;
    }
    
    public static double valeurMinial (final double[] pTab){
        double vMin = pTab[0];
        for ( int i = 0 ; i < pTab.length ; i++){
            if (pTab[i] < vMin){
                vMin = pTab[i];
            }
        }
        return vMin;
    }
    
    public static int indiceDuMinimum (final double[] pTab){
        int vIndMin = -1;
        double vMin = pTab[0];
        if ( pTab.length >= 1){
            
            for ( int i = 0 ; i < pTab.length ; i++){
                if (pTab[i] < vMin){
                    vMin = pTab[i];
                    vIndMin = i;
                }
            }
        }
        return vIndMin;
    }
}


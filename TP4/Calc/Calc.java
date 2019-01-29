
/**
 * Classe de calcul nulle qui sert a rien
 *
 * @author Théo Péresse-Gourbil
 * @version 1.0
 */
public class Calc {
    private static double aResult;
    
    public static void expression(){
       System.out.println("expression");
    }
    
    public static double racNeg(int pEntier){
        if (pEntier >= 0){
            return aResult = Math.sqrt(pEntier);
        }
        else return aResult = - (Math.sqrt(-pEntier));
    }
    
    public static void moitiers(final int pEntier){
        int i = 1;
        while (pEntier/i >= 1){
            System.out.println(pEntier/i);
            i = i * 2;
        }
    }
    
    public static boolean sontProches (final double p1 , final double p2){      
        return Math.abs(p1 - p2) < 10E-9;
    }
}


/**
 * Write a description of class Calc here.
 *
 * @author Théo Péresse-Gourbil
 * @version 1.0
 */
public class Calc
{
    private static double aResult;
    
    public static double expression(){
        
        return aResult;
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
}

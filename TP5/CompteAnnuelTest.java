

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CompteAnnuelTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompteAnnuelTest
{
    private static String                   sClassName;
    private static String                   sPkg;
    private static String                   sFil;
    private static veref.ClassContent       sCla;
    private static boolean                  sAbstract;
    private static String                   sAttName;
    private static String                   sAttType;
    private static veref.FieldContent       sAtt;
    private static String                   sProtoC;
    private static veref.ConstructorContent sCon;
    private static String                   sMetName;
    private static String                   sMetRT;
    private static String                   sProtoM;
    private static veref.MethodContent      sMet;

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        sPkg       = "";
        sClassName = "CompteAnnuel";
        sFil = sClassName + ".java";
        if ( sPkg != "" ) {
            veref.ClassContent.setRefPkg( sPkg );
            sFil = sPkg + "/" + sFil;
        }
        
        sProtoC = "( double p1, double p2 )";
    }
    
    @Test
    public void testClasse_1()
    {
        sCla = veref.V.getVClaFName( sClassName );
        sAbstract = sCla.classType().equals( "abstract class" );
        veref.V.vrai( sAbstract, "Vous ne voulez pas avoir le droit de creer des objets de la classe "+sClassName+" ???" );
        veref.V.failIf(); 
    } // testClasse_1()
    
    @Test
    public void testConstructeur_3()
    {
        testClasse_1();
        sCon = veref.V.getVConFProto( sCla, sProtoC );
        veref.V.vrai( veref.V.nbCon( sCla ) <= 1 , "Il y a au moins un constructeur de trop ..." );
        veref.V.mesIfNot();        
    } // testConstructeur_3()

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}

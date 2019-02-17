public abstract class Compte
{
    private double aSolde;

    public Compte (final double pSolde) {this.affecte(pSolde);}//constructeur naturel

    public double getSolde() { return this.aSolde;} // accesseur

    private static double arrondi2( final double pR )
    {
        double vR = Math.abs( pR );
        int    vI = (int)(vR * 1000);
        if ( vI%10 >= 5 )  vR = vR + 0.01;
        return Math.copySign( ((int)(vR*100))/100.0, pR );
    } // arrondi2(.)

    private void affecte(final double pSolde) {this.aSolde = arrondi2(pSolde);}//modificateur

    public void debite (final double pDebit) {this.affecte(this.aSolde - pDebit);}

    public void credite (final double pCredit) { this.affecte(this.aSolde + pCredit);}

    public abstract void capitaliseUnAn() ;

    public void bilanAnnuel(){
        System.out.println("solde="+this.getSolde());
        this.capitaliseUnAn();
        System.out.println("/ après capitalisation, solde="+this.getSolde());}
        
    
}
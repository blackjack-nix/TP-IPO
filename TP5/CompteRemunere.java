public abstract class CompteRemunere extends Compte
{
    private double aTaux;

    public CompteRemunere (final double pSolde , final double pTaux){
         super(pSolde);
         this.aTaux=pTaux;}

    public double getTaux() {return this.aTaux;}

    @Override public abstract void capitaliseUnAn();
}

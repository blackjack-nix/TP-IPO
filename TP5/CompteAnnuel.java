public class CompteAnnuel extends CompteRemunere
{
    public CompteAnnuel (final double pSolde , final double pTaux) {super(pSolde,pTaux);}

    @Override public void capitaliseUnAn() {this.credite(this.getSolde()*this.getTaux());}
}
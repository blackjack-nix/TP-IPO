public class CompteMensuel extends CompteRemunere
{
    public CompteMensuel (final double pSolde , final double pTaux) {super(pSolde,pTaux);}
    
    @Override public void capitaliseUnAn(){
        this.capitaliseUnMois(12);
    }
    
    public void capitaliseUnMois (final int pNbMois){
       if (pNbMois > 0) { 
           this.credite(this.getSolde()*this.getTaux());
           this.capitaliseUnMois(pNbMois-1);
        }
    }
}
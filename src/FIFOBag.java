public class FIFOBag extends AbstractBag{
    @Override
    public ISurprise takeOut() {
        if(getSurpriseList().isEmpty()){
            return null;
        }else{
            ISurprise firstSurprise = getSurpriseList().get(0);//extragem prima surpriza din sac
            super.removeInSurpriseList(0);
            return firstSurprise;
        }
    }
}

public class LIFOBag extends AbstractBag{
    @Override
    public ISurprise takeOut() {
        if(getSurpriseList().isEmpty()){
            return null;
        }else{
            ISurprise lastSurprise = getSurpriseList().get(getSurpriseList().size()-1);
            super.removeInSurpriseList(getSurpriseList().size()-1);
            return lastSurprise;
        }
    }
}
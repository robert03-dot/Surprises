public class RandomBag extends AbstractBag{
    @Override
    public ISurprise takeOut() {
        if(getSurpriseList().isEmpty()){
            return null;
        }
        int randomNumber = RandomHelper.getNewRandomInt(getSurpriseList().size());
        ISurprise surprise = getSurpriseList().get(randomNumber);
        super.removeInSurpriseList(randomNumber);
        return surprise;
    }
}

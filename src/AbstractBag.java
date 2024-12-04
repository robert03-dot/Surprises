import java.util.ArrayList;

abstract class AbstractBag implements IBag{
    private ArrayList<ISurprise> surpriseList = new ArrayList<>();
    public void put(ISurprise newSurprise){
        if(newSurprise == null){
            //pentru ca nu vreau sa adaug o surpriza null,
            //in cazul in care am extras folosind metoda takeOut() dintr-un bag gol, o surpiza null,
            //evit astfel ISurprize surprize = big.takeOut(), cand bag-ul e gol, surpriza ar fi == null, ca sa nu adaugam null
            System.out.println("Sorry!Your surprise is null so it cannot be added!");
            return;
        }
        surpriseList.add(newSurprise);
    }
    // adds all the surprises from another IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    public void put(IBag bagOfSurprises){
        if(bagOfSurprises.isEmpty()){
            System.out.println("Sorry,nothing to add.Get some surprises in your bag first!");
        }
        while(!bagOfSurprises.isEmpty()){
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public boolean isEmpty() {
        return surpriseList.isEmpty();
    }

    @Override
    public int size() {
        return surpriseList.size();
    }
    public void put(ArrayList<ISurprise> newSurpriseList){
        newSurpriseList.forEach(element -> this.put(element));
    }
    public ArrayList<ISurprise> getSurpriseList(){
        return surpriseList;
    }
    public void removeInSurpriseList(int num){
        surpriseList.remove(num);
    }
    public void printSurpriseList(){
        if(this.surpriseList == null || isEmpty()){
            System.out.println("The bag is empty!");
        }else{
            System.out.println("Surprise in this bag:");
            for(ISurprise crtSurprise : this.surpriseList){
                System.out.println(crtSurprise);
            }
        }
    }
}
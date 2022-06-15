public class Cherepaha implements CherepahaService, Makevoise,OtkladyvatEggs {
    @Override
    public String makeEgg() {
        return "I make Eggs";
    }

    @Override
    public String shield() {
        return "i have shield";
    }

    @Override
    public String makevoise() {
        return "TTTT";
    }
    public String print(){
       return " I m here";
    }

    @Override
    public String otkladyvateggs() {
        return "Откладывает яйца";
    }
}

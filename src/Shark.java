public class Shark implements Fishable, Makevoise ,Ohotitsya{
    @Override
    public String swim() {
        return Fishable.super.swim();
    }

    @Override
    public String makevoise() {
        return "RRRR";
    }

    @Override
    public String ohotitsya() {
        return "Охотиться";
    }
}

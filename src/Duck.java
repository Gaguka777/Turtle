public class Duck implements Fishable, Makevoise {
    @Override
    public String swim() {
        return Fishable.super.swim();
    }

    @Override
    public String makevoise() {
        return "GRRR";
    }
}

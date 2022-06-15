public interface Fishable {
    boolean isSwim= true;
    double maxDeep =11000;
    default String swim(){
        return "I can swim";
    }
}

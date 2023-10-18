package koschei.models;



public class Duck5 {
    private Egg6 egg;

    public Duck5(Egg6 egg) {this.egg = egg;}

    @Override
    public String toString() {
        return ", в утке яйцо " + egg.toString();
    }
}

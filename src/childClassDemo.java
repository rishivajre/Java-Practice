public class childClassDemo extends parentClassDemo {

    public static void main(String[] args) {

        childClassDemo b = new childClassDemo();
        b.breaks();
        b.engine();
        b.gear();
        b.color();
        System.out.println(tyres);
    }

    public void color() {
        System.out.println(bikeColor);
    }

    public void engine() {
        System.out.println("Engine applied");
    }

    @Override
    public void horn() {
        System.out.println("Horn Ok Please");
    }
}

public abstract class ParentAircraft {

    public void engine() {
        System.out.println("Follow Engine Guidelines");
    }

    static String bikeColor = "Black";

    public void safetyGuidelines() {
        System.out.println("Follow safety Guidelines");
    }

    public abstract void bodyColor();
    // this is how you declare abstract method -->> "public 'abstract' void mtd()"
}

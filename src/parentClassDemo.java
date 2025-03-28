

public abstract class parentClassDemo {
    
    
    String bikeColor= "Black Color Applied on Bike";
    static String tyres = "MRF Tyres Attached";     //static keyword for child inheritance

    //public void gear();

    public void breaks(){
        System.out.println("Breaks applied");
    }

    public void gear() {
        System.out.println("Gears applied");
    }

    public abstract void horn();

}

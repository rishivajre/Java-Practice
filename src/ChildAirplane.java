public class ChildAirplane extends ParentAircraft {
    public static void main(String[] args){

        ChildAirplane a = new ChildAirplane();
        a.bodyColor();
        a.engine();
        a.safetyGuidelines();
        System.out.println(bikeColor);
    }

    @Override
    public void bodyColor() {
        System.out.println("Red color to be painted");
    }

}

public class traffic implements trafficRules, pedestrianRules {
    public static void main(String[] args) {
        trafficRules tr = new traffic();    // interface implementation
        tr.green();
        tr.red();
        tr.yellow();

        traffic zc = new traffic();         // this classs method object
        zc.zebraCrossing();

        pedestrianRules pr = new traffic(); // 2nd interface implementation
        pr.crossing();
        pr.walking();
    }

    public void zebraCrossing() {
        System.out.println("cross when Green Lights");
    }

    @Override
    public void green() {
        System.out.println("Green Light On");
    }

    @Override
    public void red() {
        System.out.println("Red Light on");
    }

    @Override
    public void yellow() {
        System.out.println("slow down");
    }

    @Override
    public void walking() {
        System.out.println("walk on footpath");
    }

    @Override
    public void crossing() {
        System.out.println("Cross while Green Walk Sign");
    }
}

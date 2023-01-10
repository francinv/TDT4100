package uke2.fasit;

public class AverageCoordinator {

    Random100 random100;
    Average average;
    DownCounter dc;


    public AverageCoordinator() {
        this.random100 = new Random100();
        this.average = new Average();
        dc = new DownCounter(10);
    }

    public double getAverage() {
        while (!dc.isFinished()) {
            average.acceptValue(random100.nextInt());
            dc.countDown();
        }
        return average.getAverage();
    }
    

    public static void main(String[] args) {
        AverageCoordinator ac = new AverageCoordinator();
        System.out.println(ac.getAverage());
    }
    
}

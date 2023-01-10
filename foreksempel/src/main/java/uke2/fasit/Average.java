package uke2.fasit;

public class Average {
    
    int valueCount;
    double sum;


    public Average() {
    }

    public void acceptValue(int tall) {
        valueCount += 1;
        sum += tall;
    }

    public double getAverage() {
        return sum/valueCount;
    }

    public static void main(String[] args) {
        Average avg = new Average();
        avg.acceptValue(33);
        avg.acceptValue(100);
        System.out.println(avg.getAverage());
    }

}

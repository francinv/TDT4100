package oving1;

public class UpOrDownCounter {
    private int counter;
    private int end;

    public UpOrDownCounter(int start, int end) {
        if (end == start) {
            throw new IllegalArgumentException("The end value can not be equal to the counter.");
        }
        this.counter = start;
        this.end = end;
    }

    public int getCounter() {
        return this.counter;
    }

    public boolean count() {
        if (this.counter < this.end) {
            this.counter++;
            return this.counter < this.end;
        } else if (this.end < this.counter) {
           this.counter--;
           return this.end < this.counter;
        } else {
            return false;
        }
    }


}

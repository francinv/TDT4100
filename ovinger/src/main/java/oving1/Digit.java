package oving1;

public class Digit {
    private int base;
    private int value;

    private String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Digit(int base) {
        this.base = base;
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public boolean increment() {
        this.value++;

        if (this.value == this.base) {
            this.value = 0;
            return true;
        }
        return  false;
    }

    public int getBase() {
        return this.base;
    }

    @Override
    public String toString() {
        return String.valueOf(digits.charAt(this.value));
    }
}

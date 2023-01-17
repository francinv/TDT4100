package uke3;

public class Person {
    String navn;
    int alder;

    public Person(String navn, int alder) {
        this.alder = alder;
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public String getNavn() {
        return navn;
    }

    @Override
    public String toString() {
        return this.navn + "("+this.alder+")";
    }

    public static void main(String[] args) {
        Person p = new Person("Ida ", 33);
        System.out.println(p.getAlder());
        System.out.println(p);
    }
}

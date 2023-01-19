package of0.lf;

public class CryptoCoin {

    private double price;
    private String name;

    public CryptoCoin(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0)
            this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void toTheMoon() {
        this.price *= 10;
    }

    public double rugPull() {
        double p = this.price;
        this.price = 0;
        return p;
    }

    @Override
    public String toString() {
        return "CryptoCoin [price=" + price + ", name=" + name + "]";
    }

    public static void main(String[] args) {

        CryptoCoin bitcoin = new CryptoCoin(20_000, "Bitcoin");
        bitcoin.setName("BTC");
        System.out.println(bitcoin);
    }
}

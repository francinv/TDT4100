package uke4;

public class Bok {
    
    private String tittel;
    private int antallSider;
    private int hvorLangtLest;

    public Bok(String tittel, int antallSider) {
        this.tittel = tittel;
        this.antallSider = antallSider;
    }

    @Override
    public String toString() {
        return tittel + " ("+hvorLangtLest+"/"+antallSider+")";
    }

    private boolean kanLese(int sider) {
        return hvorLangtLest + sider <= antallSider ? true : false;  
    }

    public void lesSider(int sider) {
        if (kanLese(sider)) {
            hvorLangtLest += sider;
        }
        else {
            throw new IllegalStateException("Du kan ikke lese så mange sider");
        }
    }

    public static void main(String[] args) {
        Bok bok = new Bok("Ni liv", 203);
        System.out.println(bok);
        bok.lesSider(30);
        System.out.println(bok);
        try {
            bok.lesSider(3000);
            System.out.println(bok);                
        } catch (Exception e) {
            System.out.println("Det ble litt mange sider gitt!");
        }

    }
    

}

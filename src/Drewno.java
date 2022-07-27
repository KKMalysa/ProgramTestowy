public class Drewno {

    String nazwaDrewna;
    int dlugosc;
    int szerokosc;

    public Drewno(String nazwaDrewna, int dlugosc, int szerokosc) {
        this.nazwaDrewna = nazwaDrewna;
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public String getNazwaDrewna() {
        return nazwaDrewna;
    }

    public void setNazwaDrewna(String nazwaDrewna) {
        this.nazwaDrewna = nazwaDrewna;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }
}

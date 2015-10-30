package pl.model;

public class Person {
    
    private String imie;
    private String nazwisko;
    private String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Person(String imie, String nazwisko, String adress) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adress = adress;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    
}

import klasy.Komputer;
import klasy.Pracownia;
import klasy.Uczen;

public class Main {
    public static void main(String[] args) {
        Pracownia pracownia = new Pracownia();
        Komputer komputer = new Komputer();
        komputer.setNumer(3);
        komputer.setCzyDziala(true);

        pracownia.dodajKomputer(new Uczen("Mateusz", "Maniak", "123"), komputer);
        pracownia.wyswietlPracownie();
    }
}
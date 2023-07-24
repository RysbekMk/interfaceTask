public class Main {


    public static void main(String[] args) {
        Hotel family1 = new Hotel(3500, 3, "Osh");
        family1.returnFamily();

        Dormitories family2 = new Dormitories(2000, 4, "Bishkek");
        family2.returnFamily();

        House family3 = new House(200, 5, "Moscow");
        family3.returnFamily();
    }
}
public class Dormitories implements NumberOfPeople {
    private int rent;
    private int numberOfPeople;
    private String address;

    public Dormitories(int rent, int numberOfPeople, String address) {
        this.rent = rent;
        this.numberOfPeople = numberOfPeople;
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void returnFamily() {
        System.out.println("\nDormitories family :" + "\n   Address: " + address +
                "\n   Number of people: " + numberOfPeople +
                "\n   How much pay: " + rent + '$');

    }
}

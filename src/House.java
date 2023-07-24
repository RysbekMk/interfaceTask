public class House implements NumberOfPeople {
    private int comulalService;
    private int numberOfPeople;
    private String address;

    public House(int comulalService, int numberOfPeople, String addres) {
        this.comulalService = comulalService;
        this.numberOfPeople = numberOfPeople;
        this.address = addres;
    }

    public int getComulalService() {
        return comulalService;
    }

    public void setComulalService(int comulalService) {
        this.comulalService = comulalService;
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
        System.out.println("\nHouse Family :" + "\n   Address: " + address +
                "\n   Number of people: " + numberOfPeople +
                "\n   How much pay: " + comulalService + '$');
    }
}

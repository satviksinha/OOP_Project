public class Flight {
    private String Name;
    private City DestinationCity;
    private City SourceCity;
    private String DepartureTime;
    private String ArrivalTime;
    public int[] RunningDays;
    private double Fare;
    private int CAPACITY = 100;

    public Flight(String Name, City DestinationCity, City SourceCity, String DepartureTime, String ArrivalTime,
            int[] RunningDays) {
        this.Name = Name;
        this.DestinationCity = DestinationCity;
        this.SourceCity = SourceCity;
        this.DepartureTime = DepartureTime;
        this.ArrivalTime = ArrivalTime;
        this.RunningDays = RunningDays;
        this.Fare = Math.abs((DestinationCity.getPosition() - SourceCity.getPosition()) * 5);
    }

    public String getName() {
        return Name;
    }

    public City getDestinationCity() {
        return DestinationCity;
    }

    public City getSourceCity() {
        return SourceCity;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public int[] getRunningDays() {
        return RunningDays;
    }

    public double getFare() {
        return Fare;
    }

    public double getCapacity() {
        return CAPACITY;
    }

    public boolean checkCapacity(int numberOfTickets) {
        if (CAPACITY - numberOfTickets >= 0)
            return true;
        else
            return false;
    }

    public void decreaseCapacity(int numberOfTickets) {
        CAPACITY -= numberOfTickets;
    }

    @Override
    public String toString() {
        System.out.println("Flight Name: " + Name + "\n" + "Source: " + SourceCity.getName() + "\n" + "Destination: "
                + DestinationCity.getName() + "\n" + "Departure Time: " + DepartureTime + "\n" + "Arrival Time: "
                + ArrivalTime + "\n" + "Fare: " + Fare + "\n" + "Number Of Seats Available: " + CAPACITY);
            for(int m:RunningDays){
            switch(m){
                case 1:
                System.out.println("Monday");
                break;
                case 2:
                 System.out.println("Tuesday");
                 break;
                case 3:
                 System.out.println("Wednesday");
                 break;
                case 4:
                 System.out.println("Thursday");
                 break;
                case 5:
                 System.out.println("Friday");
                 break;
                case 6:
                 System.out.println("Saturday");
                 break;
                case 7:
                 System.out.println("Sunday");
                 break;

            }  
            }  
        return  "";
    }

}
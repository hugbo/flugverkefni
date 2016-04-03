package models;

public class Flight implements Comparable{

    // PRIVATE VARIABLES
    private String date;
    private int price;
    private String flightNumber;
    private String departureLoc;
    private String departureTime;
    private String depAirportId;
    private String arrivalLoc;
    private String arrivalTime;
    private String arrAirportId;
    private int numSeats;
    private int bookedSeats;
    private int numSagaSeats;
    private int bookedSagaSeats;
    private ConnectFlight connectFlight;
    private PassengerLuxuries passengerLuxuries;

    // CONSTRUCTOR
    public Flight(String date, int price, String flightNumber, String departureLoc, String departureTime,
                  String depAirportId, String arrivalLoc, String arrivalTime, String arrAirportId,
                  int numSeats, int bookedSeats, int numSagaSeats, int bookedSagaSeats,
                  String[] connectFlight, boolean[] passengerLuxBool, int[] passengerLuxInt) {

        this.date = date;
        this.price = price;
        this.flightNumber = flightNumber;
        this.departureLoc = departureLoc;
        this.departureTime = departureTime;
        this.depAirportId = depAirportId;
        this.arrivalLoc = arrivalLoc;
        this.arrivalTime = arrivalTime;
        this.arrAirportId = arrAirportId;
        this.numSeats = numSeats;
        this.bookedSeats = bookedSeats;
        this.numSagaSeats = numSagaSeats;
        this.bookedSagaSeats = bookedSagaSeats;

        // Create an instance of PassengerLuxuries and ConnectFlight objects
        if(connectFlight == null){
            this.connectFlight = null;
        }
        else{
            this.connectFlight = new ConnectFlight(connectFlight[0], connectFlight[1],
                    connectFlight[2], connectFlight[3]);
        }

        this.setPassengerLuxuries(new PassengerLuxuries(passengerLuxBool[0], passengerLuxBool[1],
                passengerLuxInt[0], passengerLuxInt[1]));

    }

    // COMPARE METHOD
    @Override
    public int compareTo(Flight flight1){
        int comparePrice = ((Flight) flight1).getPrice();

        return comparePrice - this.getPrice();
    }

    // PRIVATE METHODS
    private boolean isConnectedFlight() {
        return connectFlight == null;
    }

    // GET/SET METHODS

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDepartureLoc() {
        return departureLoc;
    }

    public void setDepartureLoc(String departureLoc) {
        this.departureLoc = departureLoc;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDepAirportId() {
        return depAirportId;
    }

    public void setDepAirportId(String depAirportId) {
        this.depAirportId = depAirportId;
    }

    public String getArrivalLoc() {
        return arrivalLoc;
    }

    public void setArrivalLoc(String arrivalLoc) {
        this.arrivalLoc = arrivalLoc;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getArrAirportId() {
        return arrAirportId;
    }

    public void setArrAirportId(String arrAirportId) {
        this.arrAirportId = arrAirportId;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public int getNumSagaSeats() {
        return numSagaSeats;
    }

    public void setNumSagaSeats(int numSagaSeats) {
        this.numSagaSeats = numSagaSeats;
    }

    public int getBookedSagaSeats() {
        return bookedSagaSeats;
    }

    public void setBookedSagaSeats(int bookedSagaSeats) {
        this.bookedSagaSeats = bookedSagaSeats;
    }

    public PassengerLuxuries getPassengerLuxuries() {
        return passengerLuxuries;
    }

    public void setPassengerLuxuries(PassengerLuxuries passengerLuxuries) { this.passengerLuxuries = passengerLuxuries; }


    public String getDate() {
        return date;
    }
}

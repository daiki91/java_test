package language;

import java.util.Date;

public class ReservationSystem {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int reservationNumber;
    private Date arrivalDate;
    private Date departureDate;
    private RoomType roomType;
    private int numAdults;
    private int numChildren;
    private boolean includesBreakfast;

    // Constructeur
    public ReservationSystem(String firstName, String lastName, String phoneNumber, int reservationNumber,
            Date arrivalDate, Date departureDate, RoomType roomType, int numAdults, int numChildren,
            boolean includesBreakfast) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.reservationNumber = reservationNumber;
        this.arrivalDate = arrivalDate;
        this.departureDate = departureDate;
        this.roomType = roomType;
        this.numAdults = numAdults;
        this.numChildren = numChildren;
        this.includesBreakfast = includesBreakfast;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getNumAdults() {
        return numAdults;
    }

    public void setNumAdults(int numAdults) {
        this.numAdults = numAdults;
    }

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }

    public boolean isIncludesBreakfast() {
        return includesBreakfast;
    }

    public void setIncludesBreakfast(boolean includesBreakfast) {
        this.includesBreakfast = includesBreakfast;
    }

    // Méthode pour vérifier si la chambre est disponible pour les dates données
    public boolean isRoomAvailable(Date startDate, Date endDate) {
        // Logique pour vérifier si la salle est disponible
        return true;
    }

    // Méthode pour envoyer un e-mail de confirmation au client
    public void sendConfirmationEmail() {
        // Logique pour envoyer un e-mail avec les détails de la réservation
    }

    // Méthode pour annuler la réservation
    public void cancelReservation() {
        // Logique pour annuler la réservation et mettre à jour la disponibilité
    }

    public static int generateReservationNumber() {
        return 0;
    }
}

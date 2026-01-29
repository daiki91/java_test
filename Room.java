package language;

import java.util.*;

class Room {
    private String roomNumber;
    private RoomType roomType;
    private double price;
    private List<Reservation> reservations;

    public Room(String roomNumber, RoomType roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.reservations = new ArrayList<>();
    }

    // Méthode pour vérifier si la salle est disponible pour une plage de dates
    // donnée
    public boolean isAvailable(Date startDate, Date endDate) {
        // Vérifier si la chambre a des réservations pendant la plage de dates
        for (Reservation reservation : reservations) {
            if (reservation.getStartDate().before(endDate) && reservation.getEndDate().after(startDate)) {
                return false;
            }
        }

        return true;
    }

    // Getters et setters
    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    // Méthode pour ajouter une réservation à la salle
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }
}
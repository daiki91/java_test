package language;

import java.util.*;
import language.*;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        // initialiser la liste des chambres
        rooms = new ArrayList<>();
        rooms.add(new Room("101", RoomType.SINGLE, 50.0));
        rooms.add(new Room("102", RoomType.SINGLE, 50.0));
        rooms.add(new Room("201", RoomType.DOUBLE, 75.0));
        rooms.add(new Room("202", RoomType.DOUBLE, 75.0));
        rooms.add(new Room("301", RoomType.SUITE, 100.0));
    }

    // Method to get available rooms for a given date range
    public List<Room> getAvailableRooms(Date startDate, Date endDate) {
        List<Room> availableRooms = new ArrayList<>();

        // Iterate over each room and check if it's available
        for (Room room : rooms) {
            if (room.isAvailable(startDate, endDate)) {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }

    // Méthode avoir une réservation
    public Reservation makeReservation(String firstName, String lastName, String phoneNumber, Date arrivalDate,
            Date departureDate, RoomType roomType, int numAdults, int numChildren, boolean includesBreakfast) {
        // Récupère les chambres disponibles pour la plage de dates et le type de
        // chambre donnés
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable(arrivalDate, departureDate) && room.getRoomType() == roomType) {
                availableRooms.add(room);
            }
        }

        // Si aucune salle n'est disponible, retourne null
        if (availableRooms.isEmpty()) {
            return null;
        }

        // Choisissez la première chambre disponible
        Room room = availableRooms.get(0);

        // Créer une réservation
        int reservationNumber = ReservationSystem.generateReservationNumber();
        Reservation reservation = new Reservation(arrivalDate, departureDate, firstName + " " + lastName);

        // Ajouter la réservation à la salle
        room.addReservation(reservation);

        // Envoi de l'e-mail de confirmation
        reservation.sendConfirmationEmail();

        return reservation;
    }

}

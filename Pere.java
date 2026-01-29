public class Pere {

    public Pere() {
        System.out.println("Je suis le constructeur de la classe Pere");
        System.out.println("je suis le pere de arphan !");
    }
    public void parler() {
        System.out.println("Je suis en train de parler !");
        System.out.print("Quelle est ton nom ? ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String nom = scanner.nextLine();
        System.out.println("Bonjour " + nom + " !");
    }
}   
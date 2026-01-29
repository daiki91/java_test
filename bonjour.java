// public class bonjour{
//     public static void main(String[] args) {
//         System.out.println("Bonjour le monde!  \t");
//         System.out.println("mon pere est Diolla!");
//     }
// }


public class bonjour extends Pere {

    private String message;

    // constructeur avec paramètre
    public bonjour(String message) {
        super(); // appelle automatiquement le constructeur de Pere
        this.message = message;
        System.out.println(message);
    }

    public void afficher() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        bonjour b = new bonjour("Bonjour le monde on est bon !");
        b.afficher();
        b.parler();
    }
}

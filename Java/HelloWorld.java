public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World !");
        System.out.println("Bienvenue " + args[1]);
        for (int i=1; i<=6; i++) {
            System.out.println("Bonjour à tous, repete " + i + " fois !");
        }
    }
}
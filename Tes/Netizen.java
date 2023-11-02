public class Netizen extends Player { 

    public Netizen() {
    }

    public Netizen(String name) {
        super(name);
    }

    public void attack(String hateSpeec) {
        showName();
        System.out.println(": " + hateSpeec);
    }
}

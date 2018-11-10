package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", "s6", "0662552426");

        System.out.println(phone);
        phone.call();
    }
}

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> manicure = new LinkedList<>();
        manicure.addAll(firstClients);

        while (!manicure.isEmpty()) {
            if (Math.random() < 0.5) {
                manicure.offer("friend of " + manicure.peek());
                System.out.println(manicure.poll() + " сделала новый маникюр ");
            } else {
                System.out.println(manicure.poll() + " сделала новый маникюр ");

            }
        }
    }
}
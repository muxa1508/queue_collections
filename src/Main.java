import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Петя", "Николаев", 10));
        clients.add(new Person("Иван", "Петров", 4));
        clients.add(new Person("Ольга", "Иванова", 5));
        clients.add(new Person("Алексей", "Ольгин", 2));
        clients.add(new Person("Николай", "Алексеев", 1));

        for (int i = 0; i < clients.size(); i++) {
            Person person = clients.get(i);
            System.out.println(person.getName() + " " + person.getSurname() + " " + person.getTickets());
        }
        System.out.println();
        return clients;
    }

    public static void main(String[] args) {

        Deque<Person> queue = new ArrayDeque(generateClients());

        while (!queue.isEmpty()) {
            Person person = queue.pollFirst();
            int ticketNumber = person.getTickets();
            if (ticketNumber > 0) {
                queue.offerLast(person);
                person.setTickets(ticketNumber - 1);
                System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе. Осталось билетов: " + person.getTickets());
                if (person.getTickets() == 0) {
                    System.out.println(person.getName() + " " + person.getSurname() + " исключен из очереди. Закончились билеты.");
                }
            }
            System.out.println();
        }
        System.out.println("У всех закончились билеты");
    }
}
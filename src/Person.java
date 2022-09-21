public class Person {

    private String name;
    private String surname;
    private int tickets;

    protected Person(String name, String surname, int tickets) {
        this.name = name;
        this.surname = surname;
        this.tickets = tickets;
    }

    protected String getName() {
        return name;
    }

    protected String getSurname() {
        return surname;
    }

    protected int getTickets() {
        return tickets;
    }

    protected void setTickets(int tickets) {
        this.tickets = tickets;
    }

}

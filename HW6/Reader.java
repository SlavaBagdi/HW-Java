package HW6;


import java.util.Arrays;


public class Reader {
    private String fio;
    private int numLitCard;
    private String faculty;
    private String dateOfBirth;
    private String phone;

    public Reader(String fio, int numLitCard, String faculty, String dateOfBirth, String phone) {
        this.fio = fio;
        this.numLitCard = numLitCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int amount) {
        System.out.printf("%s взял %d книги\n", fio, amount);
    }

    public void returnBook(int amount) {
        System.out.printf("%s вернул %d книги\n", fio, amount);
    }

    public void takeBook(String... books) {
        System.out.printf("%s взял книги: %s\n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    public void returnBook(String... books) {
        System.out.printf("%s вернул книги: %s\n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    public void takeBook(Book... books) {
        System.out.printf("%s взял книги: %s \n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    public void returnBook(Book... books) {
        System.out.printf("%s вернул книги: %s\n", fio, Arrays.toString(books).replaceAll("\\[|\\]", ""));
    }

    @Override
    public String toString() {
        return "Читатель:" +
                "Фио='" + fio + '\'' +
                ", Номер читательского билета=" + numLitCard +
                ", Факультет='" + faculty + '\'' +
                ", Дата рождения='" + dateOfBirth + '\'' +
                ", Телефон='" + phone + '\'' +
                '}';
    }
}
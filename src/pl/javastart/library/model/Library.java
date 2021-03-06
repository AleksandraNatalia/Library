package pl.javastart.library.model;

public class Library {
    private final int maxBooks = 2;
    private Book[] books = new Book[maxBooks];
    private int booksNumber;

    public void addBook(Book book){
        if (booksNumber < maxBooks){
            books[booksNumber]= book;
            booksNumber++;
        }else {
            System.out.println("Masymalna liczba książek została osiągnięta");
        }

    }

    public void printBooks(){
        if (booksNumber == 0){
            System.out.println("Brak książek do wyświetlenia");
        }
        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();

        }
    }
}

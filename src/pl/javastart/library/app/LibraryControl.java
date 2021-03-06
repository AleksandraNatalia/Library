package pl.javastart.library.app;

import pl.javastart.library.io.DataReader;
import pl.javastart.library.model.Book;
import pl.javastart.library.model.Library;

public class LibraryControl {
    // zmienne do sterowania programem
    private final int exit = 0;
    private final int addBook = 1;
    private final int printBooks = 2;

    //zmienna do komunikacji z użytkownikiem

    private DataReader dataReader = new DataReader();

    //biblioteka z danymi

    private Library library = new Library();

    /*
    *Główna metoda programu pozwalająca na wybór opcji i interakcję
     */
    public void controlLoop(){
        int option;

        do{
            printOptions();
            option = dataReader.getInt();

            switch (option){
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja. Wybierz ponownie");
            }
        } while (option!=exit);
    }

    private void exit() {
        System.out.println("Koniec programu. Dzięki!");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcję");
        System.out.println(exit + " - wyjście z programu");
        System.out.println(addBook + " - dodanie książki");
        System.out.println(printBooks + " - wyświetlenie książek");

    }

}

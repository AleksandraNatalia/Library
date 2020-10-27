package pl.javastart.library.app;

import pl.javastart.library.model.Library;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka v.0.9";
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}

import Dao.Dao;
import Model.Library;
import Model.LibraryMember;
import service.impl.LibraryServiceImpl;

import java.util.*;

public class Main {
    static Scanner scannerN = new Scanner(System.in);
    static Scanner scannerS = new Scanner(System.in);

    public static void main(String[] args) {
        Dao dao = new Dao(new Library());
        LibraryServiceImpl libraryService = new LibraryServiceImpl(dao);

        String operation = "null";

        while (!operation.equals("x")) {
            buttons();
            System.out.println("\nНапишите команду:");
            operation = scannerN.nextLine();

            switch (operation) {
                case "1" -> libraryService.addLibraryMember();
                case "2" -> libraryService.getLibraryMembers();
                case "3" -> libraryService.findLibraryMemberById();
                case "4" -> libraryService.deleteLibraryMemberByID();
                default -> System.out.println("Нету такой кнопки!");
            }
        }


    }

    public static void buttons() {
        System.out.println("\n<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 1, чтобы добавить нового участника в библиотеку.");
        System.out.println("Нажмите 2, чтобы увидеть всех участников библиотеки.");
        System.out.println("Нажмите 3, чтобы найти участника по ID и увидеть данные участника, читаемая книга и прочитанные.");
        System.out.println("Нажмите 4, чтобы удалить участника по ID.");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 5, чтобы добавить книгу в библиотеку.");
        System.out.println("Нажмите 6, чтобы увидеть все книги в библиотеке.");
        System.out.println("Нажмите 7, чтобы найти книгу по ID.");
        System.out.println("Нажмите 8, чтобы удалить книгу по ID.");
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("Нажмите 9, чтобы ввести memberId участника и bookId книги, добавить в читаемые");
        System.out.println("Нажмите 10, чтобы ввести memberId участника и bookId книги, добавить в прочитанные");
        System.out.println("Нажмите x, чтобы завершить программу.");
    }
}
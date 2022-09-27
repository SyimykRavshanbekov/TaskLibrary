package service.impl;

import Dao.Dao;
import Model.Book;
import Model.LibraryMember;
import service.LibraryService;

import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {
    private static final  Scanner scannerN = new Scanner(System.in);
    private static final Scanner scannerS = new Scanner(System.in);
    private Dao dao;

    public LibraryServiceImpl(Dao dao) {
        this.dao = dao;
    }

    @Override
    public void getLibraryMembers() {
        dao.getLibrary().getLibraryMembers();
    }

    @Override
    public void addLibraryMember() {
        System.out.println("Напишите ID: ");
        int ID = scannerS.nextInt();
        System.out.println("Напишите имя: ");
        String name = scannerN.nextLine();
        LibraryMember member = new LibraryMember(ID, name);
        dao.getLibrary().addMember(member);
    }

    @Override
    public void findLibraryMemberById() {
        System.out.println("Напишите ID читателя:");
        int number = scannerN.nextInt();
        dao.getLibrary().searchByID(number);
    }

    @Override
    public void deleteLibraryMemberByID() {
        System.out.println("Напишите ID читателя:");
        int number = scannerN.nextInt();
        dao.getLibrary().getMemberData().remove(dao.getLibrary().getMemberData().stream().filter(x -> x.getMemberId() == number).findFirst());
    }

    @Override
    public void addBookToLibrary(Book book) {

    }

    @Override
    public List<Book> getLibraryBooks() {
        return null;
    }

    @Override
    public Book findLibraryBookById(Long id) {
        return null;
    }

    @Override
    public void deleteLibraryBookByID(Long id) {

    }

    @Override
    public void addBookToMember() {

    }

    @Override
    public void removeBookFromReading() {

    }
}

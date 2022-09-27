package service;

import Model.Book;
import Model.LibraryMember;

import java.util.List;

public interface LibraryService {
    void getLibraryMembers();
    void addLibraryMember();

    void findLibraryMemberById();
    void deleteLibraryMemberByID();

    void addBookToLibrary(Book book);

    List<Book> getLibraryBooks();

    Book findLibraryBookById(Long id);

    void deleteLibraryBookByID(Long id);

    void addBookToMember();

    void removeBookFromReading();
}

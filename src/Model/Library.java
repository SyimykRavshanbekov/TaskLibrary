package Model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<LibraryMember> libraryMembers;

    public Library() {
        this.books = new ArrayList<>();
        this.libraryMembers = new ArrayList<>();
    }

    public List<LibraryMember> getMemberData(){
        return libraryMembers;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void searchByID(int number){
        if (libraryMembers.stream().noneMatch(x -> x.getMemberId() == number)){
            System.out.println("Нету такого пользователя!!");
        } else{
            System.out.println(libraryMembers.stream().filter(x -> x.getMemberId() == number).findFirst());
        }

    }

    public void addMember(LibraryMember libraryMember){
        libraryMembers.add(libraryMember);
    }

    public void getLibraryMembers(){
        libraryMembers.forEach(System.out::println);
    }
}

import java.util.ArrayList;

public class Member {
    private String firstName;
    private String lastName;
    private Integer memberNumber;
    private ArrayList<Book> booksCheckedOut;

    public Member(String firstName, String lastName, Integer memberNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberNumber = memberNumber;
        this.booksCheckedOut = new ArrayList<Book>();
    }

    //METHDOS(Keep at top and getters/setters at bottom)

    //Check out a book
    public void checkOutBook(Book book) {
        this.booksCheckedOut.add(book);
    }

    //Return a book
    public void returnBook(Book book) {
        this.booksCheckedOut.remove(book);
    }


    //GETTERS
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Integer getMemberNumber() {
        return this.memberNumber;
    }

    public ArrayList<Book> getBooksCheckedOut() {
        return this.booksCheckedOut;
    }

    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMemberNumber(Integer memberNumber) {
        this.memberNumber = memberNumber;
    }

    public void setBooksCheckedOut(ArrayList<Book> booksCheckedOut) {
        this.booksCheckedOut = booksCheckedOut;
    }


    
}

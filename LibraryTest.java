public class LibraryTest {
    public static void main(String[] args) {
        
        //Start coding here!

        //Add New Books
        Book book1 = new Book("Can't Hurt Me", "David Goggins",
        "Biography", 256);
        System.out.println(book1.getTitle());

        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 
        "Fantasy", 620);
        System.out.println(book2.getAuthor());

        Book book3 = new Book("Where The Crawdads Sing", "Delia Owens", 
        "Mystery", 400);
        System.out.println(book3.getGenre());

        //Add New Members
        Member jake = new Member("Jake", "Clise", 1);
        System.out.println(jake.getFirstName());

        Member lily = new Member("Lily", "Clise", 2);
        System.out.println(lily.getFirstName());

        lily.checkOutBook(book1);
        lily.checkOutBook(book1);
        jake.checkOutBook(book2);
        //System.out.println(jake.getBooksCheckedOut()); //Output space in memory
        System.out.println(jake.getBooksCheckedOut().get(0).getTitle()); //Output title of book
        jake.returnBook(book2);
        System.out.println(jake.getBooksCheckedOut()); //should be empty list
        System.out.println("Lily's First Book: " + lily.getBooksCheckedOut().get(0).getTitle());
        System.out.println("Lily's Second Book: " + lily.getBooksCheckedOut().get(1).getTitle());
        lily.returnBook(book1);
        System.out.println("Lily's Remaining Books After Returns: " + lily.getBooksCheckedOut().get(0).getTitle());

    }
}
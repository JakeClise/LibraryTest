public class Book {
    private String title;
    private String author;
    private String genre;
    private Integer numberOfPages;
    

    //Zero Argument Constructor
    //public Book(){};

    public Book(String title, String author, String genre, Integer numberOFPages) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.numberOfPages = numberOFPages;
    }
    
    //GETTERS
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public Integer getNumberOfPages(){
        return this.numberOfPages;
    }
}

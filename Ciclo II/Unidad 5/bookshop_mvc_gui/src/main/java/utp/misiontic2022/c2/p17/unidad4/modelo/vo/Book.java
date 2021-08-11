package utp.misiontic2022.c2.p17.unidad4.modelo.vo;

public class Book {
    private String title;
    private String isbn;
    private int year;
    private int id;

    public Book(){}
    
    public Book(String title, String isbn, int year) {
        this.title = title;
        this.isbn = isbn;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return title+" "+"("+isbn+" - "+year+")";
    }
    
}

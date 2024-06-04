public class Book{

    private String title;
    private String author;
    private String year;
    private boolean status;

    public Book(String title, String author, String year, boolean status){
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getYear(){
        return year;
    }

    public boolean getStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status = status;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setYear(String year){
        this.year = year;
    }
    @Override
    public String toString(){
        return "Title: " + title + "\nAuthor: " + author + "\nYear: " + year + "\nStatus: " + status;
    }


}
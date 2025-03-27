public class Book extends LibraryItem{
    private boolean fiction;


    public Book(String author, String title, String acquisitionDate, String callCode,
    double replacementCost, boolean checkedOut, boolean fiction) {

        super(author, title, aquisitionDate, callCode, replacementCost, checkedOut);

        this.fiction = fiction;
    }
}



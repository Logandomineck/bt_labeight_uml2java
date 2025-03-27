public class Book extends LibrayItem{
    private boolean isfiction;
    private boolean fiction(String author, String title, String aquisitionDate, String callCode, double replacementCost, boolean checkedOut, boolean fiction){
        super(author, title, aquisitionDate, callCode, replacementCost, checkedOut);
        this.isfiction = fiction;
    }
}



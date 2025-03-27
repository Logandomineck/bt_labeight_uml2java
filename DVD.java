public class DVD extends LibraryItem {
    private double length;

    
    public DVD(String author, String title, String acquisitionDate, String callCode,
               double replacementCost, boolean checkedOut, double length) {
        super(author, title, acquisitionDate, callCode, replacementCost, checkedOut);
        this.length = length;
    }

}

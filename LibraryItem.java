abstract class LibraryItem implements Borrowable {
    private String author;
    private String title;
    private String callCode;
    private double replacementCost;
    public String acquisitionDate;
    private boolean checkedOut;

    public LibraryItem(String author, String title, String callCode, 
    double replacementCost, String acquisitionDate, boolean checkedOut){
      this.author = author;
      this.title = title;
      this.callCode = callCode;
      this.replacementCost = replacementCost;
      this.acquisitionDate = acquisitionDate;
      this.checkedOut = checkedOut;
    }

    @Override
    public boolean borrowItem(String date){
      return false;
    }

    @Override
    public boolean returnItem(String date) {
        return false;
    }
}


abstract class LibraryItem implements Borrowable {
    private String author;
    private String title;
    private String callCode;
    private double replacementCost;
    public String acquisitionDate;
    private boolean checkedOut;

    @Override
    public boolean borrowItem(String date){
      return false;
    }

    @Override
    public boolean returnItem(String date) {
        return false;
    }
}


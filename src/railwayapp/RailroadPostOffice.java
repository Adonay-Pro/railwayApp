package railwayapp;

public class RailroadPostOffice implements Railroad {

    int quantityOfSortingTables, mailBags;
    public RailroadPostOffice(int quantSortingtTables, int mailBags){
        this.quantityOfSortingTables = quantSortingtTables;
        this.mailBags = mailBags;
    }

    @Override
    public boolean electricalGrid() {
        return true;
    }



}

package Exercise2;

public class Tester{
    private static void showPrice(RetailItem item){
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    }
    public static void main(String[] args) {
        CompactDisc compactDisc = new CompactDisc("Greatest Hits", "Joe Looney Band", 18.95);
        DvdMovie dvdMovie = new DvdMovie("Joker", 122, 12.95);

        System.out.println("Item #1: " + compactDisc.getTittle());
        showPrice(compactDisc);

        System.out.println("Item #2: " + dvdMovie.getTittle());
        showPrice(dvdMovie);
    }
}
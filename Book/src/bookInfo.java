

public class bookInfo {
    private int ISBN, BookQuantity;
    private String BookTitle;
    private double BookPrice;


    public bookInfo(){

        ISBN=100;
        BookTitle="No title";
        BookPrice=88;
        BookQuantity=1;


    }

    public bookInfo(int isbn , int bookQuantity, String bookTitle, double bookPrice){
        set(isbn,bookQuantity, bookTitle, bookPrice);
    }


    public void set(int isbn , int bookQ, String bookTitle, double bookPrice) {
        this.ISBN=isbn;
        this.BookQuantity=bookQ;
        this.BookTitle=bookTitle;
        this.BookPrice=bookPrice;
    }

    public int getISBN(){
        return ISBN;
    }

    public int getBookQuantity() {
        return BookQuantity;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public double Bill(){
        return getBookPrice()*getBookQuantity();
    }

    public double discount(int Q){
        if (Q>20) {
            if (Q > 19 & Q < 51) {
                return Bill() * 0.05;
            } else if (Q > 50) {
                return Bill() * 0.1;
            } else
                return 0;
        }else {
            return 0;
        }
    }

    public double discount(double pr){
        if (pr>80){
            return Bill()*0.1;
        }else
            return 0;
    }

    public double checkDis(){
        if (discount(BookQuantity)>discount(BookPrice)){
            return discount(BookQuantity);
        }else if (discount(BookPrice)>discount(BookQuantity)){
            return discount(BookPrice);
        }else
            return 0;
    }


    public String toString(){
        return "Qun Dis: "+ discount(BookQuantity)+
                "\nPrice Dis: "+discount(BookPrice)+
                "\nBill without Dis: "+Bill()+
                "\nBill with Dis: "+ (Bill()-checkDis());
    }



}


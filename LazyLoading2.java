class TaxCal {
    //Lazy Loading example with simple with tax calculation.
    private String name;
    private Double price;
    private Double priceIncTax = null;
    TaxCal(String name, Double price, Double priceIncTax){
        this.name = name;
        this.price = price;
        this.priceIncTax = priceIncTax;
    }
    //When I need to calculate the tax-price then we initialize it.
    public Double getPriceIncTax(){
        if (priceIncTax == null) {
            this.priceIncTax = this.price * 1.25;
            System.out.println("We have calculate the price include taxes " + this.priceIncTax);
        }
        return this.priceIncTax * price;
    }
}
public class LazyLoading2{
    public static void main(String[] args) {
        TaxCal taxCal = new TaxCal("Laptop", 12000.00, null); 
        taxCal.getPriceIncTax();
        System.out.println("Your without default vat" + taxCal.getPriceIncTax());
    }
}
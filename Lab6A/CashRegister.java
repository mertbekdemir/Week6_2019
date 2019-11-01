
/**
 * Write a description of class CashRegister here.
 *
 * @author Mert
 * @version 1409
 */
public class CashRegister
{
    public static final double TAX_RATE = 0.06;

    private RetailItem item;
    private int quantitySold;

    /**
     * CashRegister Constructor
     *
     * @param newItem A parameter
     * @param newQuantitySold A parameter
     */
    public CashRegister(RetailItem newItem, int newQuantitySold){

        setItem(newItem);
        setQuantitySold(newQuantitySold);
    }
    /**
     * Method getItem
     *
     * @return The return value
     */
    public RetailItem getItem(){
        return item;   
    }

    /**
     * Method getQuantitySold
     *
     * @return The return value
     */
    public int getQuantitySold(){
        return quantitySold;
    }

    /**
     * Method setItem
     *
     * @param newItem 
     */
    public void setItem(RetailItem newItem){
        if(newItem != null){
            item = newItem;   
        }else{
            item = new RetailItem();   
        }
    }

    /**
     * Method setQuantitySold
     *
     * @param newQuantitySold 
     */
    public void setQuantitySold(int newQuantitySold){
        if(newQuantitySold > 0 && newQuantitySold <= item.getNumberOfUnitsInStock()){
            quantitySold = newQuantitySold;
        }
    }

    /**
     * Method calculateSubtotal
     *
     * @return The return value
     */
    public double calculateSubtotal(){
        double subTotalCost = getQuantitySold()*item.getItemPriceInCAD();
        return subTotalCost;
    }

    /**
     * Method calculateTax
     *
     * @return The return value
     */
    public double calculateTax(){
        double tax = calculateSubtotal() * TAX_RATE;
        return tax;
    }

    /**
     * Method calculateTotal
     *
     * @return The return value
     */
    public double calculateTotal(){
        double totalPrice = calculateSubtotal() + calculateTax();
        return totalPrice;
    }

    public void printSalesReceipt(){
        System.out.println("Item Description: " + item.getItemDescription());
        System.out.println("Unit Price: $" + item.getItemPriceInCAD());
        System.out.println("Quantity: " + getQuantitySold());
        System.out.println("Subtotal: $" + calculateSubtotal());
        System.out.println("Tax amount: " + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }
}

/**
*@author Mert
*@version 1409
*/
public class CarpetCalculator{

private double pricePerSquareFoot;
private Room room;

/**
 * First constructor - takes no parameter, sets both fields to the default value
 */
public CarpetCalculator()
{
    pricePerSquareFoot = 0;
    room = null;
}
/**
*Constructor - use mutator methods to initialize fields
*@param newPricePerSquareFoot
*@param newRoom
*/
public CarpetCalculator(double newPricePerSquareFoot, Room newRoom){
    setPricePerSquareFoot(newPricePerSquareFoot);
    setRoom(newRoom);
}
//Accessor methods
/**
*Method getPricePerSquareFoot
*@return pricePerSquareFoot
*/
public double getPricePerSquareFoot(){
return pricePerSquareFoot;
}

/**
*Method getRoom
*@return room
*/
public Room getRoom(){
return room;
}

//Mutator methods
/**
*Method setPricePerSquareFoot
*@param newPricePerSquareFoot
*/
public void setPricePerSquareFoot(double newPricePerSquareFoot){
if(newPricePerSquareFoot > 0){
pricePerSquareFoot = newPricePerSquareFoot;
}
}

/**
*Method setRoom
*@param newRoom
*/
public void setRoom(Room newRoom){
if(newRoom != null){
room = newRoom;
}else{
room = new Room(); 
}
}

/**
*method calculateTotalCost
*@return totalCost
*/
public double calculateTotalCost(){
double totalCost = pricePerSquareFoot * room.getLengthInFeet() * room.getWidthInFeet();
return totalCost;
}

/**
*method displayAllInfo
*display dimensions of the room, the price per square foot of the carpet and the total cost for the carpet for that room
*/
public void displayAllInfo(){
System.out.println("Dimensions of the room - length in feet : " + room.getLengthInFeet() + " width in feet :" + room.getWidthInFeet());
System.out.println("Price per square foot :" + pricePerSquareFoot);
System.out.println("Total Cost :" + calculateTotalCost());
}
}


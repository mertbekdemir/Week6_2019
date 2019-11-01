/**
*@author Mert
*@version 1409
*/
public class Room{

private double lengthInFeet;
private double widthInFeet;

/**
*Constructor with no arg - sets both instance variable to default value
*
*/
public Room(){

lengthInFeet = 0;
widthInFeet = 0;

}

/**
*Second constructor
*@param lengthInFeet
*@param widthInFeet
*/
public Room(double lengthInFeet,double widthInFeet){
setLengthInFeet(lengthInFeet);
setWidthInFeet(widthInFeet);
}

//Accessor Method

/**
*Method getLengthInFeet
*@return lengthInFeet
*/
public double getLengthInFeet(){
return lengthInFeet;
}

/**
*Method getWidthInFeet
*@return widthInFeet
*/
public double getWidthInFeet(){
return widthInFeet;
}

//Mutator methods

/**
*Method setLengthInFeet
*@param newLengthInFeet
*/
public void setLengthInFeet(double newLengthInFeet){
if(newLengthInFeet > 0){
lengthInFeet = newLengthInFeet;
}else{
throw new IllegalArgumentException("length in feet must be positive");
}
}

/**
*Method setWidthInFeet
*@param newWidthInFeet
*/
public void setWidthInFeet(double newWidthInFeet){
if(newWidthInFeet > 0){
widthInFeet = newWidthInFeet;
}else{
throw new IllegalArgumentException("width in feet must be positive");
}
}

/**
*Method calculateArea 
*/
public double calculateArea(){
double area = lengthInFeet * widthInFeet;
return area;
}
}
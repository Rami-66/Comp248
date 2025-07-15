//-----------------------------------------------------------------
// Assignment 2
//Written by: Rami Al Najem 40242034
// For COMP 248 section EC - Fall 2022
//-----------------------------------------------------------------
import java.util.Scanner;
public class A2_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(" Welcome to My City Recycling Program:");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Item Recycling Code. | --> Item samples");
        System.out.println("----------------------------------------");
        System.out.println("1. | -->[Soft drink bottles/Trash cans]");
        System.out.println("2. | -->[Shampoo bottles/Yogurt containers]");
        System.out.println("3. | -->[Plastic bags]");
        System.out.println("4. | -->[Storage bins/Brooms/Brushes]");
        System.out.println("5. | -->[Garden hoses/Piping]");
        System.out.println("6. | -->[Carry-out food containers]");
        System.out.println("7. | -->[Plastics straws/Chip bags/Coffee pods]");
        System.out.println("8. | -->[Cell phone/Computer/Camera/Batteries]");
        System.out.println("9. | -->[TV Remote/Flashlight batteries]");
        System.out.println("10. | -->[Car batteries]");
        System.out.println("11. | -->[Cereal/Snack Cardboard boxes]");
        System.out.println("12. | -->[Newspaper/Books/Wallpaper]");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        System.out.print("Please enter the Recycling Code, from the above, that corresponds to the item you want to recycle:");
        
Scanner Keyboard = new Scanner(System.in);
int code = Keyboard.nextInt();

if (code <= 5 && code >= 1)
{
	System.out.println(" This is a Recycled Plastic/Paper item.");
System.out.println(" Item required to be put in the blue household recycling bin.");
System.out.println("\nThank you for saving the planet!");
}
else if (code== 6 || code== 7)
{
	System.out.println(" This is a Non-Recycled Plastics");
	System.out.println(" Item required to be put in the gray household garbage bin.");
	System.out.println("\nThank you for saving the planet!");
}
else if (code<= 10 && code >=8)
{
	System.out.println("This item is Battery.");
	System.out.println(" Item required to be taken to your local recycling depot or nearby store for disposal.");
	System.out.println("\nThank you for saving the planet!");
}
else if(code==11 || code==12)
{
	System.out.println(" This item is Paper.");
	System.out.println(" Item required to be put in the blue household recycling bin.");
	System.out.println("\nThank you for saving the planet!");
}
else if (code <= 127 && code >= 13)
{
	System.out.println(" This item is N/A.");
	System.out.println(" Item code not handeled by the city recycling system.");
	System.out.println(" Kindly check the nearby city(ies) for possible recycling availability.");
	System.out.println("\nThank you for saving the planet!");
}
else if (code >= -128 && code == 0)
{
	System.out.println(" This is a Hazardous material.");
	System.out.println(" Material required to be put in a hazardous dumpster diving.");
	System.out.println(" Kindly check your area for the nearby one.");
	System.out.println(" Thank you for saving the planet!");
}
else
System.out.println(" Error: Your recycling Code is not a valid integer between -128 to 127. Kindly retry again!");
		
}

}
// Just a comment to try commiting and pushing on Github via Terminal
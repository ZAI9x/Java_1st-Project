/**
 * CS112 Project (Italian restaurant) By Zainab.
 */

import java.util.Scanner; //import the Scanner to take input from the user.
public class PROJECT {

//Craete a method for the Menu.. so I Can design The menu inside and then call it when I need it. 
    public static void menu() {
    //I've used printf so that I can control the place of the text.
    System.out.printf("%42s","----- THE MENU ----- ");
    System.out.println("\n");

    System.out.printf("%25s %25s","Dishes  ","Drinks        ");
    System.out.println("\n          -----------------------------------------");

    System.out.printf("%25s %25s","1.Pizza 20.0SR","1.Pipse     5.0SR ");
    System.out.println();

    System.out.printf("%25s %26s","2.Pasta 30.0SR","2.Coca-Cola 7.0SR  ");
    System.out.println();

    System.out.println("\nWhat would you like to order? ");
}


//Craete a method for the Order.. so I Can take the order of the Customer and then call it when I need it. 
    public static void theOrder(){
        Scanner input = new Scanner(System.in);      
        menu();

        //use (try and catch) to not have an error.
        try {             
        System.out.println("Enter Dish's Number: ");
            //create needed Variables
            int dishNum = input.nextInt();
            int dishPrice;
            int drinkPrice;

            //use (if-else) statment to determain the (Dish) choice of the user.
            if (dishNum==1){    
                dishPrice = 20;
                System.out.println("Enter Drink's Number: "); 
                int drinkNum = input.nextInt();

                //use (nested if) to determain the (drink) choice of the user.
                if (drinkNum==1){
                    drinkPrice = 5;
                    billShape();
                    System.out.println("Pizza   "+dishPrice+" SR     "+"Pipse   "+drinkPrice+" SR");
                    System.out.println("\nThe Total is: "+(dishPrice+drinkPrice)+"\n");
                    doAgain();

                }

                else if (drinkNum==2){
                    drinkPrice = 7;
                    billShape();
                    System.out.println("Pizza   "+dishPrice+" SR    "+"Coca-Cola "+drinkPrice+" SR");
                    System.out.println("\nThe Total is: "+(dishPrice+drinkPrice)+"\n");
                    doAgain();

                }

                else{
                    System.out.println("Not Vaild input.. PLEASE choose number from the menu\n");
                    theOrder(); 
                }

            }


            //use (if-else) statment to determain the (Dish) choice of the user.
            else if (dishNum==2){
                dishPrice = 30;
                System.out.println("Enter Drink's Number: "); 
                int drinkNum = input.nextInt();

                //use (nested if) to determain the (drink) choice of the user.
                if (drinkNum==1){
                    drinkPrice = 5;
                    billShape();
                    System.out.println("Pasta   "+dishPrice+" SR     "+"Pipse   "+drinkPrice+" SR");
                    System.out.println("\nThe Total is: "+(dishPrice+drinkPrice)+"\n");
                    doAgain();
                }

                else if (drinkNum==2){
                    drinkPrice = 7;
                    billShape();
                    System.out.println("Pasta   "+dishPrice+" SR     "+"Coca-Cola "+drinkPrice+" SR");
                    System.out.println("\nThe Total is: "+(dishPrice+drinkPrice)+"\n");
                    doAgain();
                }

                else{
                    System.out.println("Not Vaild input.. PLEASE choose number from the menu\n");
                    theOrder(); 
                }

            }


            else{
                System.out.println("Not Vaild input.. PLEASE choose number from the menu\n");
                theOrder();

            }

        } catch (Exception e) {
            System.out.println("\n!!! please enter a NUMBER !!!\n");
            theOrder();
            
        }
        //close the Scanner.
        input.close();
    }


//Craete a method to design the shape of the bill and then call it when I need it.    
    public static void billShape() {
        int row,column; //create needed Variables
        System.out.println("\nYour Bill:- \n");
        //use loops (nested for) to print the Bill. 
        for(row=1; row<=1; row++){
            for(column=1; column<=2; column++){
                System.out.print("Order"+"   "+"Price"+"     ");
            }
                System.out.println("\n----------------------------------");    
        } 
    }


//Craete a method thats repeat the program if need. 
    public static void doAgain() {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to order again?.. Choose a number\n1.Yes\n2.No ");
        
        int option, cheakTheOption=0;

        //use (try and catch) to not have an error.
        try {
            option = input.nextInt();

            //if-else statment to determain the choice of the user.
            if(option==1){
            cheakTheOption = 1;
            }
            else if(option==2){
            cheakTheOption = 2;
            }
            else{
                System.out.println("please enter 1 or 2");
                doAgain();
            }
            
        } catch (Exception e) {
            System.out.println("please enter 1 or 2");
            doAgain();
        }  


        
        //use Switch to check the choice of the user.
        switch (cheakTheOption) {
            case 1:
            theOrder();
                break;

            case 2 :
            System.out.println("Thanks for Order :) ");
                break;
        
            default:
            break;
        }
       input.close(); 
    }
      
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); //craete a scanner object.

        System.out.println("");
        System.out.printf("%50s","_________________________________\n\n");
        System.out.printf("%50s","Welcome to The Restaurant Program \n");
        System.out.printf("%50s","_________________________________\n\n");
        System.out.println("");      

    //use (try and catch) to not have an error.
    try{
        theOrder(); //Call the methode
    } 
    catch (Exception e) {
        System.out.println("please enter a NUMBER !");
        theOrder();
    }
    input.close();
    }   
}
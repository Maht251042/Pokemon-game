import java.io.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class Pokemon{
    private Scanner sc = new Scanner(System.in);
    private int hp  ;
    private int exp  ;
    private int power ;
    private String name ;
   
    public Pokemon(){
        
        hp = 100 ;
        exp = 0 ;
        power = 1000 ;
        
    }
    
    //Set name charecter
    public String setName(){
       
        System.out.println("What your name ? ");
        name = sc.nextLine();
         return "" ;
    }    

    //Show status charecter
    public String showStatus(){
        System.out.println("MY STATUS POINT");
        System.out.println("My name is : "+name );
        System.out.println("My Health point : "+hp+"  Point");
        System.out.println("My Experience ( evolve ) : "+exp+"  Point");
        System.out.println("My Power : "+power+"  Point");
       
        return "";
    }

   public String startGame(){
     int i;
     for(i=0;i<15;i++ ){
       if(i == 2){
         exp += 6;
         System.out.println(" evolve : "+exp);

       }
       else if(exp >= 18){
         hp -= 15;
         exp = 0;
         power -= 120;
         System.out.println(" evolve : "+exp);
         System.out.println(" power : "+power);
         System.out.println(" hp : "+hp);
       }
       else if(i == 14){
         i = 0;
       }
       else if(hp <= 0){
         System.out.println("<<< DEAD !! >>>");
         break;    
       }
     }
     return "";
   }
}

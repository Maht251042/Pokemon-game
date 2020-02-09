import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Pokemon{
    private Scanner sc = new Scanner(System.in);
    private int hp  ;
    private int evolve  ;
    private int power ;
    private String name ;
   
    public Pokemon(){
        
        hp = 100 ;
        evolve = 0 ;
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
        System.out.println("My Experience ( evolve ) : "+evolve+"  Point");
        System.out.println("My Power : "+power+"  Point");
       
        return "";
    }

   public String startGame(){
     int i;
     for(i=0;i<15;i++ ){
       if(i == 2){
         evolve += 6;
         System.out.println(" evolve : "+evolve);

       }
       else if(evolve >= 18){
         hp -= 15;
         evolve = 0;
         power -= 100;
         System.out.println(" evolve : "+evolve);
         System.out.println(" power : "+power);
         System.out.println(" hp : "+hp);
       }
       else if(i == 14){
         i = 0;
       }
       else if(hp <= 0){
         System.out.println("<<< DEAD >>>");
         break;    
       }
     }
     return "";
   }
}

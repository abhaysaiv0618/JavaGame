import java.util.Scanner;
import java.io.*;
public class game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAbhaysai's Fight Club Game [Simple Version]\n\nThis is a simple fighting game where you choose between three types of characters.\n\nAttack Type:\nHealth: 100    Attack: 17    Heal: 7    Speed: 3\n\nBrute Type:\nHealth: 200    Attack: 13    Heal: 7    Speed: 4 \n\nHealer Type:\nHealth: 130    Attack: 10    Heal: 15    Speed: 2");         
        System.out.println("\nPlayer 1, pick a type - {default/1: attacktype, 2: brutetype, 3: healertype}:");
        int input = scanner.nextInt();
        player p1;
        if(input==2){
            p1 = new brutetype();
            System.out.println("Player 1 is a brute type" + "\n");
        }else if(input==3){
            p1 = new healertype();
            System.out.println("Player 1 is a healer type" + "\n");
        }else {
            p1 = new attacktype();
            System.out.println("Player 1 is an attack type" + "\n");
        }

        System.out.println("Player 2, pick a type - {default/1: attacktype, 2: brutetype, 3: healertype}: ");
        input = scanner.nextInt();
        player p2;
        if(input==2){
            p2 = new brutetype();
            System.out.println("Player 2 is a brute type");
        }else if(input==3){
            p2 = new healertype();
            System.out.println("Player 2 is a healer type");
        }else {
            p2 = new attacktype();
            System.out.println("Player 2 is an attack type");
        }

        while(p1.isalive() && p2.isalive()){ //game runner
            System.out.println("\nHealth Status: " + "Player 1: " + p1.getHealth() + 
            "; Player 2: " + p2.getHealth());
             
            int random = (int)(p1.getspeed() * Math.random()) + 1;
            System.out.print("Player 1, ");
            p1.choicemaker();
            input = scanner.nextInt();
            if (input == random){
                System.out.println("MATCHED! Pick a move - {default/1 = attack, 2 = heal}");
                input = scanner.nextInt();
                if(input!=2){
                    System.out.println("Player 1 is Attacking Player 2!");
                    p2.setHealth(p1.getAttack());
                    p2.setlifestatus(p2);
                }else{
                    p1.heal(p1);
                    System.out.println("Player 1 is Healing");
                }
            }

            random = (int)(p2.getspeed() * Math.random()) + 1;
            System.out.print("Player 2, ");
            p2.choicemaker();
            input = scanner.nextInt();
            if (input == random){
                System.out.println("MATCHED! Pick a move - {default/1 = attack, 2 = heal}");
                input = scanner.nextInt();
                if(input!=2){
                    System.out.println("Player 2 is Attacking Player 1!");
                    p1.setHealth(p2.getAttack());
                    p1.setlifestatus(p1);
                }else{
                    p2.heal(p2);
                    System.out.println("Player 2 is Healing");
                }
            }
        }
        scanner.close();
        
        System.out.println("GAME OVER!");

       


    }

}


import java.util.Scanner;

class rollDie {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll = 0;
        int total = 0;
        String decision = "y";
        
        while (decision.equals("y")) {
            System.out.println("How many dices's do you want to roll?");
            int num = sc.nextInt();
            
            System.out.println("How many sides do these dice have?");
            int sides = sc.nextInt();
            
            System.out.println(" ");
            System.out.print("You rolled: ");
            
            int i = 0;
            while(i < num) {
                roll = rollDie(sides);
                System.out.print(roll + " "); 
                total = total + roll;
                i++;
            }
            
            System.out.println(" ");
            System.out.println("total: " + total);
            System.out.println(" ");
            
            System.out.println("Again? [y/n]");
            decision = sc.next();
            System.out.println(" ");
            if(decision.equals("n")) {
             System.out.println("Good-bye!");   
            }
        }        
    }
    
    public static int rollDie(int sides) {
        return (int) (Math.random()*sides) + 1;
    }
}


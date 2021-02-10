package exercises_5_feb;

import java.util.Scanner;


public class Exercises_5_Feb {
    public static void main(String[] args) {
        // 1. Hello world
        // System.out.println("Hello World!");
        
        Exercises_5_Feb obj = new Exercises_5_Feb();
        
        // obj.hangmanGame();
        // System.out.println(obj.StrSize());
        // obj.OddOrEven();
        
        obj.arrayEx();
    }
    
    // 2. Operators
    public double sum(double num1, double num2) {
        return num1 + num2;
    }
    
    public double sub(double num1, double num2) {
        return num1 - num2;
    }
    
    public double mul(double num1, double num2) {
        return num1 * num2;
    }
    
    public double div(double num1, double num2) {
        return num1 / num2;
    }
    
    public double edu(double num1, double num2) {
        return num1 % num2;
    }
    
    // 3. Take user input
    public int StrSize() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word:");
        String name = input.nextLine();
        
        return name.length();
    }
    
    // 4. conditions
    public void OddOrEven() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        if(number % 2 == 0) {
            System.out.println("Your number is Even");
        } else {
            System.out.println("Your number is Odd");
        }
    }
    
    // 5. loop
    public void hangmanGame() {
        int attempts = 10;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = input.nextLine();
        
        System.out.print(word);
        

        while(word.length() > 0 && attempts > 0) {  
            System.out.print("Enter a letter: ");
            char letter = input.next().charAt(0);
            
            System.out.println(letter);
            
            if(word.indexOf(letter) >= 0) {
                System.out.println("Correct letter, there still more...");
                word = word.replace(Character.toString(letter), "");
                
                System.out.println("word: " + word);
            } else {
                System.out.println("worng letter, try again!");
                attempts--;
            }
        }
        
        if(attempts > 1) {
            System.out.println("You won!! you have guessed the word correctly");
        } else {
            System.out.println("You have lost!");
        }
        
    }
    
    
    // 6. Array
    
    public void arrayEx() {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter a value(number, ',' or ';'): ");
        String input = Character.toString(reader.next().charAt(0));
        
        
        System.out.println(input);
    }
    
    
    
}

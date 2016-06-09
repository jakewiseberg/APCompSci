package Practice;

import java.util.Scanner;

/**
 *
 * @author mswasserman
 */
public class Practice {
    public static void main(String[] args) {
         rockPaperScissors();   
    }
    
    //1. Display numbers between 10 and 55, 
    //inclusive, forwards and backwards
    public static void tenTo55(){
        for(int i = 10; i <= 55; i++)
            System.out.print(i + " ");
        System.out.println("");
        for(int i = 55; i >= 10; i--)
            System.out.print(i + " ");
        System.out.println("");
    }

    //2. Display all numbers divisible by 7, 
    //between 1 and 100, inclusive
    public static void multiplesOf7(){
        for(int i = 1; i <= 100; i++){
            if(i % 7 == 0)
                System.out.print(i + " ");
        }
        System.out.println("");
    }

    //3. Ask the user for 5 positive integers and only allow for positive 
    //integers to be entered. If the user enters a non-positive integer, 
    //continue to request a positive until one is given. Then, identify 
    //the largest of the 5 integers. 
    public static int sumOf5(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            System.out.print("Number: ");
            int num = reader.nextInt();
            
            while(num <= 0){
                System.out.print("Number: ");
                num = reader.nextInt();
            }
            
            sum += num;
        }
        
        return sum;
    }

    //4. Given a 6 digit integer, identify if the 
    //number 1 exists (6 digit doesn't matter for my algorithm, but you
    //could use a for loop and check each digit instead)
    public static int numOfOnes(int num){
        int n = num;    //I don't like editing the parameter
        int count = 0;
        while(n > 0){
            if(n % 10 == 1)     //check ones digit
                count++;
            n /= 10;
        }
        return count;
    }
    
    //5. Ask the user to enter 10 words and display 
    //the word with the longest length
    public static String maxOf10(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Word: ");
        String max = reader.next();
        for(int i = 1; i <= 9; i++){        //already asked for one
            System.out.print("Word: ");
            String word = reader.next();
            if(word.length() > max.length())
                max = word;
        }
        return max;
    }

    //6. Given an integer, identify all of the factors
    //of that number
    public static void printFactors(int n){
        for(int i = 1; i < n; i++){
            if(n % i == 0)
                System.out.print(i + " , ");
        }
        System.out.println(n);
    }
    
    //7. Create a dice class, and in a separate class, roll the 
    //dice until the sum of 12 is reached. Then identify how 
    //many rolls were taken until the 12. 
    public static int rollTilTwelve(){
        int count = 0;
        Dice a = new Dice(6);
        Dice b = new Dice(6);
        a.roll();
        b.roll();
        count++;
        while(a.getDots() + b.getDots() != 12){
            a.roll();
            b.roll();
            count++;
        }
        
        return count;
    }
    
    //8. Write a method that identifies the number of occurrences of a given 
    //character parameter in a given String parameter. 
    //Ex: methodName("I like ice", "i" ) would return 2
    public static int howMany(String s, char c){
        int amt = 0;
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == c)
                amt++;
        return amt;
    }
    
    //9. Given a string, identify the indices of all occurrences of the 
    //letter "e"
    public static String countEs(String str){
        String indices = "";
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == 'e')
                indices += i + " ";
        return indices;
    }
    
    //10. Given a string, identify the index of the last occurrence of the 
    //letter "a"
    public static int indexOfLastA(String str){
        for(int i = str.length() - 1; i >= 0; i--)
            if(str.charAt(i) == 'a')
                return i;
        return -1;  //doesn't exist
    }
    
    //11. Identify the number of times one string appears in another string. 
    //Ex: methodName("My dog loves dogs", "dog") returns 2
    public static int howMany(String str, String c){
        int amt = 0;
        for(int i = 0; i <= str.length() - c.length(); i++)
            if(str.substring(i, i+c.length()).equals(c))
                amt++;
        return amt;
    }
    
    //12. Ask the user for a string and display the string backwards
    public static String backwards(String s){
        String word = "";
        for(int i = s.length() - 1; i >= 0; i--)
            word += s.substring(i, i+1);
        return word;
    }
    
    //13. Given a string, display every other letter
    public static String everyOther(String str){
        String newWord = "";
        for(int i = 0; i < str.length(); i+=2){
            newWord += str.charAt(i);
        }
        
        return newWord;
    }    
    
    //14. Ask for a string and display the string with all of the 
    //vowels removed
    public static String noVowels(String s){
        String word = "";
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' &&
                    s.charAt(i) != 'u')
                word += s.charAt(i);
        return word;
    }

    
    //15. Given a string, identify if it is or is not a palindrome
    public static boolean isPalindrome(String s){
        int i = 0;
        while(s.charAt(i) == s.charAt( s.length() - 1 - i) && i < s.length()/2)
            i++;
        if(i == s.length()/2 )
            return true;
        else
            return false;
    }
    
    //16. Rock Paper Scissors
    public static void rockPaperScissors() {

        Scanner reader = new Scanner(System.in);
        System.out.print("Best out of: ");
        int bestOutOf = reader.nextInt();
        int compScore = 0, userScore = 0;
        String comp = "", user;

        while (compScore != bestOutOf / 2 + 1 && userScore != bestOutOf / 2 + 1) {
            System.out.print("Rock... Paper... Scissors... SHOOT!  ");
            user = reader.next().toLowerCase();

            switch ((int) (Math.random() * 3)) {
                case 0:
                    comp = "rock";
                    break;
                case 1:
                    comp = "paper";
                    break;
                case 2:
                    comp = "scissors";
                    break;
            }
            
            if(user.equals("paper") && comp.equals("rock") 
                    || user.equals("scissors") && comp.equals("paper")
                    || user.equals("rock") && comp.equals("scissors")){
                userScore++;
                System.out.println("You won! The computer threw " + comp);
                System.out.println("  User: " + userScore + " --- Computer: " + compScore);
                System.out.println("");
            }
            else if(comp.equals("paper") && user.equals("rock") 
                    || comp.equals("scissors") && user.equals("paper")
                    || comp.equals("rock") && user.equals("scissors")){
                compScore++;
                System.out.println("You lose! The computer threw " + comp);
                System.out.println("  User: " + userScore + " --- Computer: " + compScore);
                System.out.println("");
            }       
            else{
                System.out.println("Tie");
                System.out.println("  User: " + userScore + " --- Computer: " + compScore);
                System.out.println("");
            }
        }
        
        if(userScore == bestOutOf / 2 + 1)
            System.out.println("YOU WON " + userScore + " to " + compScore + "! CONGRATULATIONS!");
        else
            System.out.println("YOU LOST " + userScore + " to " + compScore + "! SORRY!");
        

    }
    
    
}

class Dice{
    private int dots;
    private int numOfSides;
    
    public Dice(int sides){
        numOfSides = sides;
        roll();
    }
    
    public void roll(){
        dots = (int)(Math.random() * numOfSides + 1);
    }
    
    public int getDots(){
        return dots;
    }
    
    public int getNumOfSides(){
        return numOfSides;
    }
}

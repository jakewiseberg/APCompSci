package ArrayPractice;

/**
 *
 * @author jakew
 */
public class ArrayPractice {
    public static void main(String[] args) {
        Student[] students = {new Student("Jake", 85), new Student("Bob", 73), new Student("Alice", 99)};
        String[] testWords = {"jake", "best", "boards", "test"};
        
        Student best = bestStudent(students);
        System.out.println("Congrats to " + best.getName() + ", LHS's best student!\nWith a final grade of " + best.getGrade() + "%!");
        System.out.println("");
    }
    
    //returns the longest word of an array
    public static String longestWord(String[] arr) {
        String word = "";
        for (String words : arr)
            if (words.length() > word.length()) word = words;
        return word;
    }
    
    //returns the *first* index of a word in a string array
    public static int indexOf(String[] arr, String word) {
        for (int i=0; i<arr.length; i++)
            if (arr[i].equalsIgnoreCase(word)) return i;
        return -1;
    }
    
    //creates a new word using the first letter from all of the words in the array
    public static String createWord(String[] arr) {
        String newWord = "";
        for (int i=0; i<arr.length; i++) {
            newWord += arr[i].charAt(0);
        }
        return newWord;
    }
    
    //returns the first word in an array that alphebetically comes first
    public static String firstWordABC(String[] arr) {
        String word = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i].compareTo(word) < 0)
                word = arr[i];
        }
        return word;
    }
    
    //returns the student with the highest grade
    public static Student bestStudent(Student[] students) {
        int highestGrade = students[0].getGrade();
        Student bestStudent = students[0];
        for (int i=1; i<students.length; i++) {
            if (students[i].getGrade() > highestGrade) {
                highestGrade = students[i].getGrade();
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }
}

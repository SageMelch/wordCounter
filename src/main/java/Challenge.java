import java.util.Arrays;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] charArray = {{"", "", "", "", "", ""}, {"", "", "", "", "", ""}, {"", "", "", "", "", ""}, {"", "", "", "", "", ""}, {"", "", "", "", "", ""}};
        System.out.println("Create Five Sub-Arrays");
        for (int row = 0; row <= charArray.length - 1; row++){
            for (int column = 0; column <= charArray[row].length - 1; column++){
                charArray[row][column] = scanner.next();
                System.out.println(Arrays.deepToString(charArray));
            }
        }
        System.out.println("Enter word to find!");
        Scanner scan = new Scanner(System.in);
        String find = scan.nextLine().toLowerCase();
        letterCounter(charArray, find);
    }
    public static int letterCounter(String[][] charArray, String find){
        int count = 0;
        for (int row = 0; row <= charArray.length - 1; row++) {
            for (int column = 0; column <= charArray[row].length - 1; column++) {
                if(find.equals(charArray[row][column].toLowerCase())){
                    count++;
                }
            }
        }
        if(count == 1){
            System.out.println(count + " " + find);
        }else{
            System.out.println(count + " " + find +"'s");
        }
        return count;
    }
}

import java.util.Scanner; 
public class Reverse 
{
    public static void main(String[] args) 
   {
        String original, reverse = "";
        System.out.println("Enter the string to be reversed");
        Scanner in = new Scanner(System.in);
        original = in.nextLine();
        int length = original.length();
        for(int i=length-1; i&gt;=0; i--) 
       {
            reverse = reverse + original.charAt(i);
        }
        System.out.println(reverse);
    }
 
}

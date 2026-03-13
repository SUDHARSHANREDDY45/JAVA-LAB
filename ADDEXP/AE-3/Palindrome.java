import java.util.Scanner;
class Palindrome {
  public static void main(String args[]) {
    String str;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string : ");
    str=sc.nextLine();
    int start=0;
    int end=str.length()-1;
    boolean flag=true;
    while(start<end) {
      if(str.charAt(start)!=str.charAt(end)) {
        System.out.println("string is not a palindrome");
        flag=false;
        break;
      }
      start++;
      end--;
    }
    if(flag) {
      System.out.println("string is a palindrome");
    }
  }
}

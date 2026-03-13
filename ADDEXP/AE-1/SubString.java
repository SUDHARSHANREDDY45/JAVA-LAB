import java.util.Scanner;

class SubString {
  public static void main(String args[]) {

    String mainString;
    String subString;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the main string: ");
    mainString = sc.nextLine();

    System.out.println("Enter the sub string: ");
    subString = sc.nextLine();

    System.out.println("Enter the position: ");
    int position = sc.nextInt();

    if (position >= 0 && position <= mainString.length()) {

      String firstPart = mainString.substring(0, position);
      String secondPart = mainString.substring(position);

      String resultString = firstPart + subString + secondPart;

      System.out.println("Resulting String: " + resultString);
    }
    else {
      System.out.println("Substring cannot be inserted.");
      System.out.println("Condition: 0 <= position <= length of main string");
    }

    sc.close();
  }
}

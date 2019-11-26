public class AddNum {

  public int addNum (int numA, int numB) {
    return numA + numB;
  }

  public static void main(String args[]) {
    AddNum obj = new AddNum();

    int num1 = 1;
    int num2 = 2;

    int ans = obj.addNum(num1, num2);

    System.out.println("\nSum of two numbers is: " + ans + "\n  Number 1 is " + num1 + "\n  Number 2 is " + num2 + "\n");
  }
}


class Main {
  public static void main(String[] args) {
    int pepsi = 69;
    String dew = "Mountain Dew";
    double coke = 4.2;
    System.out.println("pepsi = " + pepsi);
    System.out.println("dew = " + dew);
    System.out.println("coke = " + coke);
    System.out.println("coke to the third power = " + mentos(coke));
    System.out.println("It's dew, but with lower sugar! Try new " + gamerfuel(dew));
    System.out.println("pepsi but funnier = " + ispep(pepsi));

  }

  public static double mentos(double coke) {
    double x = Math.pow(coke, 3);
    return x;

  }

  public static String gamerfuel(String dew) {
    String z = "Diet Mountain Dew";
    return z;
  }

  public static int ispep(int pepsi) {
    int y = pepsi + 351;
    return y;
  }

}
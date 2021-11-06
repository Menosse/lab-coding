package fit.challenge;

public class ImcCalculator {
  public static String calculate(double weight, double height) {
    // double altura2 = Math.pow(height, 2);
    double result = weight / Math.pow(height, 2);
    if (result < 18.5) return "Magreza";
    if (result < 24.9) return "Normal";
    if (result < 30) return "Sobrepeso";
    return "Obesidade";
  }
}
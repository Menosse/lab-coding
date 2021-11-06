package fit.core;

public class IrpfCalculator 
{
    public static double calculateBaseSalary( double totalSalary )
    {
        double baseSalary = totalSalary - (totalSalary * 0.11);
        return baseSalary;
    }
    public static double calculateExemption()
    {
        // primeira faixa
        return 1903.98;
    }
    public static double calculateDiscount(double baseSalary)
    {
        double discount = baseSalary - calculateExemption();
        return discount;
    }
    public static double calculateTaxLayer(double baseSalary)
    {
        if (baseSalary <= 1903.98) return 0;
        if (baseSalary > 1903.98 && baseSalary <= 2826.65) return 0.075;
        if (baseSalary > 2826.65 && baseSalary <= 3751.05) return 0.15;
        if (baseSalary > 3751.05 && baseSalary <= 4664.68) return 0.225;
        // if (baseSalary > 4664.68) return 0.275;
        else return 0.275;
    }
    public static double calculateIrpf(double totalSalary)
    {
        double baseSalary = calculateBaseSalary(totalSalary);
        double irpf = calculateDiscount(baseSalary) * calculateTaxLayer(baseSalary);
        return irpf;
    }
}

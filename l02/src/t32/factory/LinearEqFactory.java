package t32.factory;

import t32.equations.Equation;
import t32.equations.IEquation;

public class LinearEqFactory extends EquationFactory {
    public LinearEqFactory(boolean detailedOutput) {
        this.detailedOutput = detailedOutput;
    }
    @Override
    public IEquation createEquation(String[] coefficients) {
        if (coefficients.length != 2) {
            throw new IllegalArgumentException("The number of coefficients must be 2");
        }
        if (detailedOutput)
            System.out.println("Creating LinearEquation: " + coefficients[0] + "x + " + coefficients[1] + " = 0");
        return new Equation(coefficients[0], coefficients[1]);
    }
}
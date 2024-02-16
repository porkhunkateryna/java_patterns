package t32.factory;

import t32.equations.IEquation;

public abstract class EquationFactory {
    protected boolean detailedOutput;
    public abstract IEquation createEquation(String[] coefficients);
}
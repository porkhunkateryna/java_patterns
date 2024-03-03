package t31;
import t31.equations.BiQuadraticEquation;
import t31.equations.QuadraticEquation;
import t31.equations.LinearEquation;
import t31.equations.EquationInterface;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<EquationInterface> equations = new ArrayList<>();
        equations.add(new LinearEquation(new double[]{4, -8}));
        equations.add(new QuadraticEquation(new double[]{1,2,1}));
        equations.add(new BiQuadraticEquation(new double[]{1,0,0,0,-1}));
        int arraySize = equations.size();

        for(int i=0;i<arraySize;i++){
            equations.add(equations.get(i).clone());
        }

        for(EquationInterface eq : equations){
            eq.printEquation();
        }
    }
}
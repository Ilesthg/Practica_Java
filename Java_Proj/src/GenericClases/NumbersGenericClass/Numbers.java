package Java_Proj.src.GenericClases.NumbersGenericClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers<N extends Number & Comparable<N>> {

    private final List<N> operands;

    public Numbers(List<N> operands) {
        this.operands = new ArrayList<>(operands);
    }

    public List<N> getOperands() {
        return operands;
    }

    public List<N> sortNumbers() {
        //return operands.stream().sorted()
        Collections.sort(operands);
        return operands;
    }

    //MAXIMO VALOR DEL ARRAY DE OBJETOS
    public N getMax(List<N> operands) {
        return Collections.max(operands);

    }
}

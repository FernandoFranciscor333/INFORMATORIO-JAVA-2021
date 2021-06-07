import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class EjComp5 {

    public static void main(String[] args) {

        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> horasT = Arrays.asList(6, 7, 8, 4, 5);
        horasTrabajadas.addAll(horasT);

        
        List<Integer> valorHora = new ArrayList<>();
        List<Integer> ValorH = Arrays.asList(350, 345, 550, 600, 320);
        valorHora.addAll(ValorH);

        List<Integer> totalFinal = new ArrayList<>();             

        
        for (int i = 0 ;  i < horasTrabajadas.size() ; ++i){
            int y = horasTrabajadas.get(i) * valorHora.get(i);
            totalFinal.add(y);
        } 
        
        //Suma total
        int totalF = totalFinal.stream().mapToInt(Integer::intValue).sum();

        System.out.println(totalFinal);
        System.out.println("Total Final: $" + totalF);
        
    }
    
}

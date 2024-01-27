import java.util.*;

public class SqrRoot {
    public static void main(String[] args) {
        List<Integer> factor= new ArrayList<>();
        Integer x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No: ");
        x = scanner.nextInt();
        for (int i=1;Math.sqrt(x)>=i;i++){
            if (x%i==0){
                factor.add(i);
                if (x/i!=i){
                    factor.add(x/i);
                }
            }
        }
        System.out.println(factor);
    }
}

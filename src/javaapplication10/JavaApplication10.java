
package javaapplication10;
import static java.lang.System.out;
import java.math.BigDecimal; 

public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BigDecimal bigTotal = new BigDecimal(0.40);
        for( int n = 0; n < 100; n ++){
            
           bigTotal = bigTotal.add(BigDecimal.valueOf(0.4));
        }
        
       bigTotal =bigTotal.setScale(3, BigDecimal.ROUND_HALF_UP);
       out.println("total = " + bigTotal);
       out.println("Testing");
       out.println("Hello");
    }
    
}

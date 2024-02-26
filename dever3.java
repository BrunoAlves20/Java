
import javax.swing.JOptionPane;
public class dever3 {

     public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null,"digite um numero");
        int numb = Integer.parseInt(numero);

        String numero2 = JOptionPane.showInputDialog(null,"digite o segundo numero");
        int numb2 = Integer.parseInt(numero2);

        int soma = numb + numb2 ;
        int sub = numb - numb2 ;
        int mult = numb * numb2;
        int divi = numb / numb2;
        
          JOptionPane.showMessageDialog(null,"resultado:"+soma);
          JOptionPane.showMessageDialog(null,"resultado:"+sub);
          JOptionPane.showMessageDialog(null,"resultado:"+mult);
          JOptionPane.showMessageDialog(null,"resultado:"+divi);
          
      //
    }

    
}
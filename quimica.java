import javax.swing.JOptionPane;
public class quimica {
 public static void main(String[] args) {
   double q0 = Double .parseDouble(JOptionPane.showInputDialog(null,"Qual quantidade inicial da substância"));
   double r = Double. parseDouble(JOptionPane.showInputDialog(null,"Qual a taxa de desintegração da substância"));
   int t = Integer.parseInt(JOptionPane.showInputDialog(null,"Qunato tempo anos se passou"));

   double q = q0 * Math.exp(-r*t);

   JOptionPane.showMessageDialog(null,"Sobrou "+ q + "g de substância." );
   
  
        
    }
}
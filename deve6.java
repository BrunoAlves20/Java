import javax.swing.JOptionPane;

public class deve6 {
    
     public static void main(String[] args) {
        String  numero = JOptionPane.showInputDialog(null,"digite um numero");
       
      int numero1 = Integer.parseInt(numero);

      if(numero1 % 2 == 0 ){
         JOptionPane.showMessageDialog(null,"é par "+numero);
      }
      else{
         JOptionPane.showMessageDialog(null,"é impar "+numero);
      }
        
        
        
    
    }
}

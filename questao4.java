import javax.swing.JOptionPane;

public class questao4 {
     public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog(null,"digiter um valor numerico" );
        int numero = Integer.parseInt(valor);
        if(numero > 0){
            JOptionPane.showMessageDialog(null,"valor Positivo ");
        }
        else if(numero < 0){
            JOptionPane.showMessageDialog(null,"valor Negativo");
        }
        else if(numero == 0){
            JOptionPane.showMessageDialog(null, "valor nulo ");

        }
        
    }
    
}

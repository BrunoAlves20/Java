import javax.swing.JOptionPane;

import org.omg.PortableInterceptor.INACTIVE;

public class deve10 {

     public static void main(String[] args) {
     //   String numero = JOptionPane.showInputDialog(null,"informe os numeros");
     //   int numb = Integer.parseInt(numero);
        int recebe ;
        int soma=0 ;
        String numero;
        for(recebe = 0; recebe < 10; recebe++){  
            numero = JOptionPane.showInputDialog(null,"informe os numeros");
            int numb = Integer.parseInt(numero);
            soma += numb ;
        }
        
        
            JOptionPane.showMessageDialog(null,"resultado da soma foi: "+soma);
    }
    
}

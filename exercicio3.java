import javax.swing.JOptionPane;

public class exercicio3 {

    public static void main(String[] args) {
       int numb ;
       int soma = 0 ;
       do {
        String numero = JOptionPane.showInputDialog(null,"Informe os numeros, Digite 0 para encerrar");
         numb = Integer.parseInt(numero);
         soma = numb + soma ;


       }while(numb != 0);
       JOptionPane.showMessageDialog(null,"Resultado da soma foi: " +soma);
        

        
    }
}

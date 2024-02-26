import javax.swing.JOptionPane;
public class exercicio6 {
    
    public static void main(String[] args) {
        
        float soma = 0;
        float dolar = 0;

        for(dolar = 0; dolar <= 7; dolar++){
            dolar = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do dolar "));
            soma += dolar ; 
            
            
        }
        JOptionPane.showMessageDialog(null,"Resultado da soma: " + soma);
        float media = soma / 7;
        JOptionPane.showMessageDialog(null,"Resultado da media: " + media);
        
    }
    
}

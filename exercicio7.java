import javax.swing.JOptionPane;
public class exercicio7 {
    
     public static void main(String[] args) {
 
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o primeiro "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o segundo numero"));
        double Resultado = 1;
        
        for(int calculo = 0; calculo < numero2; calculo++ ){
            Resultado *= numero; 
        }
        JOptionPane.showMessageDialog(null,"O Resultado do calculo foi: "+ Resultado);
    }
}

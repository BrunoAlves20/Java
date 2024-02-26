import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
       String [] opcoes = {"soma", "subtração", "multiplicação", "divisão"};
       int opcao = JOptionPane.showOptionDialog(null, "Selecione uma das operações Abaixo:", "Menu",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, null);

        double soma ;
        double subtracao ;
        double multiplicao ;
        double divisao  ;

        if(opcao == JOptionPane.YES_OPTION){
          Double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite um numero"));
          Double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o segundo numero")); 
          soma = numero1 + numero2 ;
            JOptionPane.showMessageDialog(null,"Resultado da soma: " +soma);
        }
        else if(opcao == JOptionPane.NO_OPTION){
            Double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite um numero"));
            Double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o segundo numero")); 
            subtracao = numero1 - numero2 ;
              JOptionPane.showMessageDialog(null,"Resultado da Subtração: " +subtracao);
        }
        else if(opcao == JOptionPane.CANCEL_OPTION){
            Double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite um numero"));
            Double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o segundo numero")); 
            multiplicao = numero1 * numero2 ;
              JOptionPane.showMessageDialog(null,"Resultado da Multiplicação: " +multiplicao);
        }
        else if(opcao == JOptionPane.CANCEL_OPTION+1){
            Double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite um numero"));
            Double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o segundo numero")); 
            divisao = numero1 / numero2 ;
              JOptionPane.showMessageDialog(null,"Resultado da Divisão: " +divisao);
        }
        
    }
    
}

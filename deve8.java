import javax.swing.JOptionPane;


public class deve8 {
    public static void main(String[] args) {
        String[] opcoes = {"Cumprimento", "Elogio", "Despedida"};
        int opcao = JOptionPane.showOptionDialog(null, "Selecione uma opção:", "Menu",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, null);
        if(opcao == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Boa tarde!");
        } else if(opcao == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Parabéns!");
        } else if(opcao == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Até breve!");
        }
    }
}

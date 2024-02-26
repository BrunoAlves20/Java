 import javax.swing.JOptionPane;

public class exercicio8  {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null,"informe um numero");

        int numb = Integer.parseInt(numero,16);

        JOptionPane.showMessageDialog(null,Integer.toString(numb,2));


    }
    
}

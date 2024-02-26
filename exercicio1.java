import javax.swing.JOptionPane;

public class exercicio1 {
    
    public static void main(String[] args) {
        int[] x = new int [25];
        for(int i = 0; i < x.length; i++) {
            x[i] = Float.parseFloat(JOptionPane.showInputDialog("valor de x é :"));
        }
        System.out.println("Numeros do array:");
    }
}

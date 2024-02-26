import javax.swing.JOptionPane;

/**
 * questao1
 */
public class questao1 {

    public static void main(String[] args) {
        float[] lista = new float[10];
        for(int i = 0; i < lista.length; i++) {
            lista[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe 10 numeros:"));
        }
        System.out.println("Numeros do array:");
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] < 10) {
                System.out.println(lista[i]);
            }

            if(lista[i] % 2 == 0 ){
                JOptionPane.showMessageDialog(null,"é impar "+i);
             }
             else{
                JOptionPane.showMessageDialog(null,"é par "+i);
             }
               

        }
       
        
    }
}
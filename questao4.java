import javax.swing.JOptionPane;

public class questao4 {

    public static void main(String[] args) {
        String areas = JOptionPane.showInputDialog(null, "valor da area:");
        float raio = Float.parseFloat(areas);
        double pi = 3.141592653 ; 
 //       double raio ;

        double area = Math.PI * raio * raio;
        double perimetro = Math.PI * 2* raio;

        JOptionPane.showMessageDialog(null,"O valor da Area é: " + area);
       JOptionPane.showMessageDialog(null,"O valor do Perimetro é: " + perimetro);

    }
}

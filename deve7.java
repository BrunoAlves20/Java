import javax.swing.JOptionPane;

public class deve7 {

     public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog(null,"digite sua idade");
        int idades = Integer.parseInt(idade);
        
        if(idades <= 2){
            JOptionPane.showMessageDialog(null, "sua classificação é bebê");
        }
        else if(idades <= 11){
            JOptionPane.showMessageDialog(null, "sua classificação é Criança");
        }
        else if(idades <= 17){
            JOptionPane.showMessageDialog(null, "sua classificação é Adolecente");
        }
        else if(idades <= 24){
            JOptionPane.showMessageDialog(null, "sua classificação é Jovem");
        }
        else if(idades <= 59){
            JOptionPane.showMessageDialog(null, "sua classificação é Adulto");
        }
        else if(idades >= 100){
            JOptionPane.showMessageDialog(null, "sua classificação é Ancião");
        }
        
    }
    
}

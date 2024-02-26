import javax.swing.JOptionPane;

public class deve5 {
    
     public static void main(String[] args) {
      String numero = JOptionPane.showInputDialog(null,"digite um numero");
      String numeroo =  JOptionPane.showInputDialog(null,"digite o segundo numero");

       int  numero1 = Integer.parseInt(numero);
       int numero2 = Integer.parseInt(numeroo);
        

        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null,"ordem crescente:"+numero2 +" "+numero1);
        }
       else{
        JOptionPane.showMessageDialog(null,"ordem crescente:"+numero1 +" "+numero2);
       }  
        
    }
    
}

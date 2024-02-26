import javax.swing.JOptionPane;

public class exercicio9 {
     public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog(null,"Digite o primeiro número:");
        String numeru = JOptionPane.showInputDialog(null,"Digite o segundo número:");
        String numeros = JOptionPane.showInputDialog(null,"Digite o terceiro número:");

        int numero1 = Integer.parseInt(numero);
        int numero2 = Integer.parseInt(numeru);
        int numero3 = Integer.parseInt(numeros);

        if(numero1 > numero2 && numero2 > numero3 ){
            JOptionPane.showMessageDialog(null,"ordem crescente:"+numero3 +" "+numero2 +" "+ numero1);

        }  
        else if(numero1 > numero3  && numero3 > numero2 ){
            JOptionPane.showMessageDialog(null,"ordem crescente:"+numero2 +" "+numero3 + " " + numero1);
        }
        else if(numero2 > numero1  && numero1 > numero3 ){
            JOptionPane.showMessageDialog(null,"ordem crescente:"+numero3 +" "+numero1 + " " + numero2);
        }
        else if(numero2 > numero3  && numero3 > numero1 ){
            JOptionPane.showMessageDialog(null,"ordem crescente:"+numero1 +" "+numero3 + " " + numero2);
        }
        else if(numero3 > numero1  && numero1 > numero2 ){
            JOptionPane.showMessageDialog(null,"ordem crescente:"+numero2 +" "+numero1 + " " + numero3);
        } 


    }
    
}


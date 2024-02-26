import javax.swing.JOptionPane;;
public class exercicio10 {
    public static void main(String[] args) {
        String  numero = JOptionPane.showInputDialog(null,"digite um numero");
       int numero1 = Integer.parseInt(numero);
        int primo = 0;
        for(int p = numero1; p >=1; p--){
            if(numero1 %p ==0){
                primo ++ ;
            }
        }


        if(numero1  == 2){
           JOptionPane.showMessageDialog(null,"é primo "+numero1);
        }
        else if(primo > 2){
            JOptionPane.showMessageDialog(null,"Não é primo "+numero1);
        }
        else{
            JOptionPane.showMessageDialog(null,"é primo"+numero1 ) ;
        }
    }
    
}

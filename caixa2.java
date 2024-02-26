//Ana Beatriz da silva Rocha 
//Sarah Vitoria Santos 
//Bruno Nogueira A. Ferreira



import java.text.DecimalFormat;

import javax.swing.JOptionPane;


public class caixa2{

    public static void main(String[] args) {
       
        //String produto = ;
        double produto = Double.parseDouble (JOptionPane.showInputDialog(null, "Informe o valor das compras:"));
        
        //JOptionPane.showMessageDialog(null,"Qual Forma de Pagamento:"+ "\n\nDinheiro\nCheque\nCartao de Credito");
        
        //calculos >>
       // int produto =0;
        int valor =0;
        int valo =0;

        //String cartao =;
        double cartaocrd = 0;
        
        

        //String cheque ="0";
        double cheque = 0;
       
        
        
        //String dinheiro = "0";
        double dinheiro = 0;
       
       
       // JOptionPane.showMessageDialog(null,"resultado final:"+cartaocrd+" "+cheque+" "+dinheiro);
        
        
        
        String[] opcoes = {"cartão de credito", "Cheque", "Dinheiro"};
        int opcao = JOptionPane.showOptionDialog(null, "Selecione a forma de pagamento:", "Menu",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                opcoes, null);
        if(opcao == JOptionPane.YES_OPTION) {
        Double parcelas =  Double.parseDouble ( JOptionPane.showInputDialog(null,"Quantas vezes você quer parcela"+" "+"\nPode ser Parcelas de até 10x"));
         cartaocrd = produto / parcelas; 
            JOptionPane.showMessageDialog(null, "valor das parcelas foram: "+new DecimalFormat("0.00").format(cartaocrd));
        } else if(opcao == JOptionPane.NO_OPTION) {
            double parcelas =  Double.parseDouble ( JOptionPane.showInputDialog(null,"Quantas vezes você quer parcela"+" "+"\nPode ser Parcelas de até 3x"));
             cheque = produto / parcelas;
            JOptionPane.showMessageDialog(null, "valor das parcelas forma: "+new DecimalFormat("0.00").format(cheque));
        } else if(opcao == JOptionPane.CANCEL_OPTION) {
            dinheiro = produto * 0.9;
            JOptionPane.showMessageDialog(null, "valor em dinheiro foi: "+dinheiro+"\nCom 10% de Desconto" );
        }
        


    }
}
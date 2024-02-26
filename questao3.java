import javax.swing.JOptionPane;

public class questao3 {

    public static void main(String[] args) {

        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe as horas trabalhadas:"));
        int valorHoras = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor  das horas trabalhadas:"));


             if (horas <= 40) {
            int salario = horas * valorHoras;
            JOptionPane.showMessageDialog(null, "O salario final é: " +salario);
            
        }
        else if(horas > 40){
            int diferente = horas - 40;
            int hora_extra = (diferente * valorHoras) * 2;
            int salario = (horas * valorHoras) + (diferente * hora_extra);
            JOptionPane.showMessageDialog(null, "O salario com extra é de: " +salario);
        }
    
            

            }
            
        }



/*Escreva um programa que permita ao gerente de um escrit´orio calcular quanto deve ser pago
de sal´ario semanal a um funcion´ario baseado no n´umero de horas que ele trabalhou e quanto foi o
valor combinado para a hora trabalhada, considerando que mais de 40 horas semanal resulta em
pagamento de hora-extra. E importante observar que, se o funcion´ario trabalhar mais de 40 horas, ´
as horas excedentes ser˜ao pagas em dobro. */

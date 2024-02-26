import javax.swing.JOptionPane;

public class questao2 {

    public static void main(String[] args) {
        String velocidade = JOptionPane.showInputDialog(null,"informe a velocidade do vento:");
        int velo = Integer.parseInt(velocidade);
        
        if (velo == 1) {
            JOptionPane.showMessageDialog(null, "Calmo");
        }
        else if(velo >= 1  && velo <= 5){
            JOptionPane.showMessageDialog(null,"Aragem");
        }
        else if(velo >= 6 && velo <= 11){
            JOptionPane.showMessageDialog(null,"Brisa leve");
        }
        else if(velo >= 12  && velo <= 19){
            JOptionPane.showMessageDialog(null,"Brisa fraca");
        }
        else if(velo >= 20  && velo <= 28){
            JOptionPane.showMessageDialog(null,"Brisa moderada");
        }
        else if(velo >= 29  && velo <= 38){
            JOptionPane.showMessageDialog(null,"Brisa forte");
        }
        else if(velo >= 39  && velo <= 49){
            JOptionPane.showMessageDialog(null,"Vento fresco");
        }
        else if(velo >= 50  && velo <= 61){
            JOptionPane.showMessageDialog(null,"Vento forte");
        }
        else if(velo >= 62  && velo <= 74){
            JOptionPane.showMessageDialog(null,"Ventania");
        }
        else if(velo >= 75  && velo <= 88){
            JOptionPane.showMessageDialog(null,"Tempestade");
        }
        else if(velo >= 89  && velo <= 102){
            JOptionPane.showMessageDialog(null,"Tempestade");
        }
        else if(velo >= 103  && velo <= 117){
            JOptionPane.showMessageDialog(null,"Tempestade violenta");
        }
        else if(velo >= 118){
            JOptionPane.showMessageDialog(null,"Furacão");
        }

    }
    
}

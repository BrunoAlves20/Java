import javax.swing.JOptionPane;

public class exercicio5 {
    
    public static void main(String[] args) {
        float tempFahrenheit = 0 ; 
        float tempCelsius = 0 ;
        for(tempFahrenheit = 0;tempFahrenheit <= 300 ;tempFahrenheit += 30 ){
            
            tempCelsius = 5/9f * (tempFahrenheit - 32);
             
            System.out.println("esta temperatura é "+ tempCelsius + "°C\t" + tempFahrenheit + "°F");
        }

       
        
    }
}

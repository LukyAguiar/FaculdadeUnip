package unip;

import javax.swing.JOptionPane;

public class EntradaTela {

		public static void main(String[] args) {
			
			//V?riaveis
			String aux; 
			double nota1,nota2,trabalho,media = 0.0; 
			
			//nota1 sendo inserida
			aux = JOptionPane.showInputDialog("Digite a primeira nota: ");
			nota1=Double.parseDouble(aux);
			
			//nota2 sendo inserida
			aux = JOptionPane.showInputDialog("Digite a segunda nota: ");
			nota2=Double.parseDouble(aux);
			
			
			//nota do trabalho sendo inserida
			aux = JOptionPane.showInputDialog("Digite a nota do Trabalho: ");
			trabalho=Double.parseDouble(aux);
			
			//Calcula da Media
			media = (nota1+nota2+trabalho)/3;
			
			JOptionPane.showMessageDialog(null,"A m?dia obtida foi: " + media);
			System.exit(0);
			
		}
}

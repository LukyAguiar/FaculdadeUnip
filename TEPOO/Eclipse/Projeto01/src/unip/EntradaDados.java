package unip;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		//Variaveis
		double nota1, nota2, trabalho, media = 0.0;
		//Declarando Leitor
		Scanner entrada = new Scanner(System.in);
		
		try
		{
			//
			
			System.out.print("Entre com a primeira nota: ");
			nota1 = entrada.nextDouble();
			if(nota1 > 10)
			{
				System.out.println("Uma nota não pode ser maior que 10 | System Reinicia");
				System.exit(1);
			}else
				System.out.print("Entre com a segunda nota: ");
				nota2 = entrada.nextDouble();
				if(nota2 > 10)
				{
					System.out.print("Uma nota não pode ser maior que 10 | System Reinicia");
					System.exit(1);
				}else
					System.out.print("Entre com a nota do Trabalho: ");
					trabalho = entrada.nextDouble();
					if(trabalho > 10)
					{
						System.out.println("Uma nota não pode ser maior que 10 | System Reinicia");
						System.exit(1);
					}else
			
						media = (nota1+nota2+trabalho)/3;
			
			System.out.printf("Media do aluno : " + media );
			entrada.close();
		}
		catch(NumberFormatException e) {
			System.out.println("Apenas Números, Por favor");
		};
	}
	
}

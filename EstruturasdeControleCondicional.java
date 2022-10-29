package cursojava;

import java.util.Scanner;

//

public class EstruturasdeControleCondicional {

	public static void main(String[] args) {
		
		//IF-ELSE
		
		char sexo = 'F';
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		//-----------------------------------------------------------------------
		
		if(sexo=='M') {
			System.out.println("Alistamento militar obrigatório!");
		} else {
			System.out.println("Alistamento militar não obrigatório!");
		}
		
		//------------------------------------------------------------------------
		
		if (idade<18) {
			System.out.println("Menor de idade! Idade: " +idade);
		} else {
			System.out.println("Maior de idade! Idade: "+idade);
		}

		//------------------------------------------------------------------------
		
		if(idade<16) {
			System.out.println("Proibido votar");
		} else if (idade>=18 && idade <=70){
			System.out.println("Voto obrigatório");
		} else {
			System.out.println("Voto opcional");
		}
		
		//------------------------------------------------------------------------
		//SWITCH-CASE
		
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Relatórios");
		
		int escolha;
		Scanner opcao = new Scanner(System.in);
		System.out.println("Escolha uma opção: ");
		escolha = opcao.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println("CLIENTES");
			break;
		case 2: 
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			break;
		}
	}

}

package atividadeslaçoscondicionaisswitch;

import java.util.Scanner;

public class AtividadeSwitch1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int produto, quantidade, resultado;
		 System.out.println("Código do Produto	     Produto	    Preço Unitário\r\n"
		 		+           "        1	         Cachorro Quente       R$ 10.00\r\n"
		 		+           "        2	             X-Salada	       R$ 15.00\r\n"
		 		+           "        3	             X-Bacon	       R$ 18.00\r\n"
		 		+           "        4	              Bauru            R$ 12.00\r\n"
		 		+           "        5	          Refrigerante	       R$ 8.00\r\n"
		 		+           "        6	         Suco de laranja       R$ 13.00\r\n"
		 		+ "");
		 
		 System.out.println("Digite o código do produto desejado: ");
		 produto = leia.nextInt();
		 
		 System.out.println("Digite a quantidade do produto desejado: ");
		 quantidade = leia.nextInt();
		 
		 
		 switch (produto) {
		 	case 1: 
		 		resultado = 10 * quantidade;
		 		System.out.println("Produto: Cachorro Quente\r\n"
		 				+          "Valor Total: R$" + resultado + ".00");
		 		break;
		 		
		 	case 2: 
		 		resultado = 15 * quantidade;
		 		System.out.println("Produto: X-Salada\r\n"
		 				+          "Valor Total: R$" + resultado + ".00");
		 		break;	
		 	
		 	case 3: 
		 		resultado = 18 * quantidade;
		 		System.out.println("Produto: X-Bacon\r\n"
		 				+          "Valor Total: R$" + resultado + ".00");
		 		break;
		 	case 4: 
		 		resultado = 12 * quantidade;
		 		System.out.println("Produto: Bauru\r\n"
		 				+          "Valor Total: R$" + resultado + ".00");
		 		break;
		 	case 5: 
		 		resultado = 8 * quantidade;
		 		System.out.println("Produto: Refrigerante\r\n"
		 				+          "Valor Total: R$" + resultado + ".00");
		 		break;
		 	case 6: 
		 		resultado = 13 * quantidade;
		 		System.out.println("Produto: Suco de Laranja\r\n"
		 				+          "Valor Total: R$" + resultado + ".00");
		 		break;
		 	default:
                System.out.println("Código inválido!!! ");
		 }
	leia.close();	
	}

}

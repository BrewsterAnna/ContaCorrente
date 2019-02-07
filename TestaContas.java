package testes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import negocio.Conta;

public class TestaContas {
	public static void main(String[] args) {
		Conta[] contas = new Conta[6];
		int cont = -1;
		int opcao;
		opcao = Menu();
		cont = lerContas(contas);
		todasContas(contas, cont);
	
		
	}
	
	public static void todasContas(Conta[] contas, int cont) {
		for (int i = 0; i <= cont; i++) {
			System.out.print(contas[i].getNumero()+" ");
			System.out.print(contas[i].getNome()+" ");
			System.out.print(contas[i].getCorrente()+" ");
			System.out.print(contas[i].getPoupanca());
			System.out.println("");
		}
	}
	
	public static int lerContas( Conta[] contas) {
	        final String NOMEARQ = "F:\\DEV\\ECLIPSE -LP\\contas.txt";
	       
	        Scanner ler = abreArquivo(NOMEARQ);
	        Conta conta;
		    int cont = -1;
		    
		    try {
		        while(ler.hasNext()) {
		        	conta = new Conta();
		        	conta.setNumero(ler.next());    
		        	conta.setNome(ler.next());
		        	conta.setCorrente(ler.nextFloat());
		        	conta.setPoupanca(ler.nextFloat());
		            cont++;
		            contas[cont] = conta;          
		        }
		        System.out.println(contas);
		    }
		    catch (NoSuchElementException erro) {
		        System.out.println("Erro: formatacao do arquivo");
		    }
		    catch (IllegalStateException erro) {
		        System.out.println("Erro: leitura do arquivo");
		    }
	        fechaArquivo(ler);
	        
	        return cont;
	    }
	

	public static Scanner abreArquivo(String arq) {
	    Scanner ler = null;
	    
	    try {
	        ler = new Scanner(new File(arq));
	    }
	    catch (FileNotFoundException erro) {
	        System.out.println("Erro: arquivo nao existe");
	        System.exit(0);
	    }
	    return ler;
	}
	
	public static void fechaArquivo(Scanner ler) {
        if (ler != null) {
        	ler.close();
        }
	}
	public static int Menu() {
		int opcao;
		Scanner ler = new Scanner(System.in);
		  
		System.out.println("1 - Inclusão");
		System.out.println("2 - Alteração de cliente");
		System.out.println("3 - Exclusão de cliente");
		System.out.println("4 - Relatórios gerenciais");
		System.out.println("5 - Sair");
		System.out.print("Escolha uma opção: ");
		opcao = ler.nextInt();
		return opcao;
	}
	
	public static float Input(Menu) {
		String numero, nome;
        float corrente, poupanca;

        if ((operacao >= 1) && (operacao <= 4)) {
            op1 = leContas("Entre com o operando 1: ");
            op2 = leContas("Entre com o operando 2: ");
            switch (operacao) {
                case 1:
                    result = op1 + op2;
                    System.out.println("Resultado = " + result);
                    break;
                case 2:
                    result = op1 - op2;
                    System.out.println("Resultado = " + result);
                    break;
                case 3: 
                    result = op1 * op2;
                    System.out.println("Resultado = " + result);
                    break;
                case 4:
                    if (op2 != 0) {
                        result = op1 / op2;
                        System.out.println("Resultado = " + result);
                    }
                    else {
                        System.out.println("Erro: divisÃ£o por zero");
                    }
                    break;
            }
        }
        else {
            System.out.println("Operacao invÃ¡lida");
        }        
        return result;
    }
}




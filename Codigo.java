package senhas;
import java.security.SecureRandom;
import java.util.Scanner;
public class gerador_de_senhas {
	 private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        boolean continuar = true;

	        while (continuar) {
	            System.out.print("Digite o comprimento da senha desejada: ");
	            int comprimentoSenha = scanner.nextInt();

	            String senhaGerada = gerarSenha(comprimentoSenha);
	            System.out.println("Senha gerada: " + senhaGerada);

	            System.out.print("Deseja gerar outra senha? (S/N): ");
	            String resposta = scanner.next();
	            if (!resposta.equalsIgnoreCase("S")) {
	                continuar = false;
	            }
	        }

	        System.out.println("Obrigado por usar o Gerador de Senha!");
	        scanner.close();
	    }

	    public static String gerarSenha(int comprimento) {
	        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
	        SecureRandom random = new SecureRandom();
	        StringBuilder senha = new StringBuilder();

	        for (int i = 0; i < comprimento; i++) {
	            int index = random.nextInt(caracteres.length());
	            senha.append(caracteres.charAt(index));
	        }

	        return senha.toString();
	}

}

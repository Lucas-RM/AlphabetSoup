import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;

public class AlphabetSoup {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner (System.in);		
		String str = "";
		

		System.out.print("Digite uma frase: ");
		str = input.nextLine().replace(" ", "").toLowerCase();
		
		if (str.isEmpty()) {
			System.out.println("\nValor Inválido");
		}
			
		System.out.println(AlphabetSoup(str));
	}
	
	public static String AlphabetSoup (String frase) {		
		char arr[] = frase.toCharArray();
		Arrays.sort(arr);
		
		String newFrase = String.valueOf(arr);
		
		return newFrase;
	}

}

package Desafio;

import java.util.Scanner;

public class Cesar_FHVCU {

	public static void main(String[] args) {
		Scanner GMW=new Scanner(System.in);
		Scanner scan=new Scanner(System.in);

		System.out.println("Digite\n1-Criar cifra\n2-Decifrar a cifra");
		int escolha = GMW.nextInt();
		if (escolha == 1) {
			System.out.println("Digite o que deseja cifrar");
			String sifra = scan.nextLine();
			sifra = sifra.toUpperCase();
			for (int i = 0; i < sifra.length(); i++) {
				int desifrado = sifra.charAt(i);
				if (desifrado > 64 && desifrado < 91) {
					if (desifrado == 90) {
						desifrado = 67;
					} else if (desifrado == 89) {
						desifrado = 66;
					} else if (desifrado == 88) {
						desifrado = 65;
					} else {
						desifrado += 3;
					}
				}
				char sifrado = (char) desifrado;
				System.out.print(sifrado);

			}
		} else if (escolha == 2) {
			System.out.println("Digite o que deseja decifrar");
			String sifra=scan.nextLine();
			for (int i = 0; i < sifra.length(); i++) {
				int sifrado = sifra.charAt(i);
				if (sifrado > 64 && sifrado < 91) {
				if (sifrado == 65) {
					sifrado = 88;
				} else if (sifrado == 66) {
					sifrado = 89;
				} else if (sifrado == 67) {
					sifrado = 90;
				} else {
					sifrado = sifrado - 3;
				}
				}
				char desifrado = (char) sifrado;
				System.out.print(desifrado);

			}

		}

	}

}

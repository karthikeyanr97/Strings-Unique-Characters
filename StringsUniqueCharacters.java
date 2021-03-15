import java.util.Scanner;

public class StringsUniqueCharacters extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the two words:");
		String firstWord = scanner.nextLine();
		String secondWord = scanner.nextLine();

		String result = replacePlus(firstWord, secondWord);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String replacePlus(String firstWord, String secondWord) {

		String result = "";

		for (int i = 0; i < firstWord.length(); i++) {

			boolean b = true;

			for (int j = 0; j < secondWord.length(); j++) {

				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					b = false;
					result += firstWord.charAt(i);
				} else {
					if (firstWord.charAt(i) >= 'a' && secondWord.charAt(j) <= 'Z'
							&& firstWord.charAt(i) == (char) (secondWord.charAt(j) + 32)) {
						b = false;
						result += firstWord.charAt(i);
					} else if ((firstWord.charAt(i) >= 'A' && firstWord.charAt(i) <= 'Z') && secondWord.charAt(j) >= 'a'
							&& firstWord.charAt(i) == (char) (secondWord.charAt(j) - 32)) {
						b = false;
						result += firstWord.charAt(i);
					}
				}

			}

			if (b)
				result += "+";
		}

		return result;
	}
}
package _21y._10m._21d_17.StringsProcvicovani;

import java.util.Scanner;

//Napište program, který přečte řetězec a v závislosti na jeho posledním znaku provede:
//l (L) - převod řetězce na malá písmena (lower)
//u (U) - převod řetězce na velká písmena (upper)
//x (X) - prohození malých a velkých písmen (exchange)
//Změny proveďte v řetězci, nikoliv jen na výstupu
public class StringToLux {
    public static void main(String[] args) {
        System.out.println("Zadej slovo");
        Scanner sc = new Scanner(System.in);
        String slovo = sc.nextLine();
        StringBuffer word = new StringBuffer(slovo);
        String lower = slovo.toLowerCase();
        char last = lower.charAt(slovo.length() - 1);
        switch (last) {
            case 'l':
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    word.setCharAt(i, Character.toLowerCase(c));
                }
                System.out.println(word);
                break;
            case 'u':
                for (int i = 0; i < word.length(); i++) {
                    char c = word.charAt(i);
                    word.setCharAt(i, Character.toUpperCase(c));
                }
                System.out.println(word);
                break;
            case 'x':
                for (int i = 0; i < slovo.length(); i++) {
                    if (Character.isUpperCase(slovo.charAt(i))) {
                        word.setCharAt(i, Character.toLowerCase(slovo.charAt(i)));
                    } else if (Character.isLowerCase(slovo.charAt(i))) {
                        word.setCharAt(i, Character.toUpperCase(slovo.charAt(i)));
                    }
                }
                System.out.println(word);
                break;
            default:
                System.out.println("Slovo nema v poslednim znaku l, u , x");
        }

    }
}

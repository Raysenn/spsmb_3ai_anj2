package _21y._10m._21d_17.StringsProcvicovani;

import java.util.Scanner;

//Napište program, který načítá řetězce složené z číslic. Pokud bude
//první číslicí 0, je zbytek řetězce považovaný za osmičkové číslo.
//Jsou-li na začátku znaky 0x (nebo 0X), pak se jedná o šestnáctkové
// číslo. Všechna ostatní čísla jsou desítková čísla. Toto načtené číslo
// vy¨pište binárně
public class StringToBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer userInput = new StringBuffer(sc.nextLine());
        if (userInput.substring(0,2).toLowerCase().equals("0x")) {
            System.out.format("%s", Integer.parseInt(userInput.substring(2),16));
        } else if (userInput.charAt(0) == '0') {
            System.out.format("%s", Integer.parseInt(userInput.substring(1),8));
        } else {
            System.out.format("%s", Integer.toBinaryString(Integer.parseInt(userInput.toString())));
        }
    }
}

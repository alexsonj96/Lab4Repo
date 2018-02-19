import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a hexadecimal number: ");

        String hex = scan.nextLine();

        int length = hex.length();

        int i = hex.length()-1;
        int value = 0;
        long place = 0;
        int j = 0;

        if ((hex.charAt(0)== '0') && ((hex.charAt(1)== 'x' || hex.charAt(1) == 'X' ))) {
            while ( i >= 2) {
                switch (Character.toUpperCase(hex.charAt(i))) {
                    case '0':
                        value = 0;
                        break;
                    case '1':
                        value = 1;
                        break;
                    case '2':
                        value = 2;
                        break;
                    case '3':
                        value = 3;
                        break;
                    case '4':
                        value = 4;
                        break;
                    case '5':
                        value = 5;
                        break;
                    case '6':
                        value = 6;
                        break;
                    case '7':
                        value = 7;
                        break;
                    case '8':
                        value = 8;
                        break;
                    case '9':
                        value = 8;
                        break;
                    case 'A':
                        value = 10;
                        break;
                    case 'B':
                        value = 11;
                        break;
                    case 'C':
                        value = 12;
                        break;
                    case 'D':
                        value = 13;
                        break;
                    case 'E':
                        value = 14;
                        break;
                    case 'F':
                        value = 15;
                        break;
                }

                place += value * Math.pow(16, j);

                j++;
                i--;
            }
        }
        else{
            while ( i > 0) {
                switch (Character.toUpperCase(hex.charAt(i))) {
                    case '0':
                        value = 0;
                        break;
                    case '1':
                        value = 1;
                        break;
                    case '2':
                        value = 2;
                        break;
                    case '3':
                        value = 3;
                        break;
                    case '4':
                        value = 4;
                        break;
                    case '5':
                        value = 5;
                        break;
                    case '6':
                        value = 6;
                        break;
                    case '7':
                        value = 7;
                        break;
                    case '8':
                        value = 8;
                        break;
                    case '9':
                        value = 8;
                        break;
                    case 'A':
                        value = 10;
                        break;
                    case 'B':
                        value = 11;
                        break;
                    case 'C':
                        value = 12;
                        break;
                    case 'D':
                        value = 13;
                        break;
                    case 'E':
                        value = 14;
                        break;
                    case 'F':
                        value = 15;
                        break;
                }

                place += (value * Math.pow(16, j));

                j++;
                i--;
            }
        }

        System.out.println("Your number is " + place + " in decimal");

    }


}
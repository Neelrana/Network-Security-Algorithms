import java.util.Locale;
import java.util.Scanner;

public class Ceaser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Plain_text,Enc_text="",Dec_text="";
        int shift = 0 ;
        System.out.println("Enter plain text :");
        Plain_text = sc.nextLine();
        System.out.println("Enter a number :");
        shift=sc.nextInt();
        Enc_text = encryption(Plain_text,shift);
        System.out.println("Plain Text = "+ Plain_text);
        System.out.println("Encrypted text = "+ Enc_text);
        Dec_text = decryption(Enc_text,shift);
        System.out.println("\n\nEncrypted text = "+ Enc_text);
        System.out.println("Decreypted Text + "+Dec_text);
    }

    private static String encryption(String plain_text, int shift) {
        StringBuilder e_text= new StringBuilder();
        String p_text;
        p_text=plain_text;
        char chArr[] = p_text.toCharArray();
        char ch;
        for(int i=0 ; i< chArr.length;i++){
            if(Character.isLowerCase(chArr[i])){
                ch=(char)(((int)chArr[i]+shift-96)%26+96);
                e_text.append(ch);
            }
            else if (Character.isUpperCase(chArr[i])){
                ch=(char)(((int)chArr[i]+shift-65)%26+65);
                e_text.append(ch);
            }
            else if(chArr[i] == ' '){
                e_text.append(chArr[i]);
            }
        }
        return e_text.toString();
    }

    private static String decryption(String enc_text, int shift) {
        StringBuilder d_text= new StringBuilder();
        String Enc_text=enc_text;
        char chArr[] = Enc_text.toCharArray();
        char ch;
        for(int i=0 ; i< chArr.length;i++){
            if(Character.isLowerCase(chArr[i])){
                ch=(char)(((int)chArr[i]-shift-96)%26+96);
                d_text.append(ch);
            }
            else if (Character.isUpperCase(chArr[i])){
                ch=(char)(((int)chArr[i]-shift-65)%26+65);
                d_text.append(ch);
            }
            else if(chArr[i] == ' '){
                d_text.append(chArr[i]);
            }
        }
        return d_text.toString();
    }
}

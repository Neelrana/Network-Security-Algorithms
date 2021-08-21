import java.util.Scanner;

public class Mono_alpha {
    char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] code =  {'z','n','e','l','s','a','j','w','y','d','i','p','k','r','h','m','t','x','v','b','c','f','g','o','u','q'};

    public static void main(String[] args) {
        Mono_alpha m1 = new Mono_alpha();
        Scanner sc = new Scanner(System.in);
        String e_text,text,d_text="";
        System.out.println("Enter a Plain Text");
        text= sc.nextLine();
        e_text = m1.encrypt_text(text);
        System.out.println("\n\nPlain Text = " + text);
        System.out.println("Encrypted Text = " + e_text);
        d_text = m1.decrypt_text(e_text);
        System.out.println("\n\nEncrypted Text = " + e_text);
        System.out.println("Decrypted Text = " + d_text);
    }

    String encrypt_text(String p_text){
        p_text = p_text.toLowerCase();
        Mono_alpha m2 = new Mono_alpha();
        String enc_text="";
        for (int i=0;i<p_text.length();i++){
            for (int j=0;j<alpha.length;j++) {
                if (p_text.charAt(i) == m2.alpha[j]) {
                    enc_text += m2.code[j];
                    break;
                }
            }
            if (p_text.charAt(i)<'a' || p_text.charAt(i)>'z'){
                enc_text += p_text.charAt(i);
            }
        }
        return enc_text;
    }

    String decrypt_text(String enc_text){
        Mono_alpha m2 = new Mono_alpha();
        String dec_text="";
        for(int i=0;i<enc_text.length();i++){
            for (int j=0;j<code.length;j++){
                if(enc_text.charAt(i) == code[j]){
                    dec_text += alpha[j];
                }
            }
            if (enc_text.charAt(i)<'a' || enc_text.charAt(i)>'z'){
                dec_text += enc_text.charAt(i);
            }
        }
        return dec_text;
    }
}

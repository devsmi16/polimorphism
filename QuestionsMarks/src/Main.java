import java.util.*;
class Main {

        public static String QuestionsMarks(String str) {

            int i = 0;
            while(i < str.length()) {
                if(Character.isDigit(str.charAt(i))) {
                    int j = i + 1;
                    int qCount = 0;
                    while(j < str.length()) {
                        if(str.charAt(j) == '?') qCount++;
                        if(Character.isDigit(str.charAt(j))) {
                            int sum = Integer.parseInt(str.charAt(i) + "") + Integer.parseInt(str.charAt(j) + "");
                            if(!(sum == 10 && qCount == 3)) return "false";
                            i = j;
                            break;
                        }
                        j++;
                    }
                }
                i++;
            }
            return "true";
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.print(QuestionsMarks(s.nextLine()));
        }
    }
/*
QuestionsMarks(str) fonksiyonu, tek basamaklı sayılar, harfler ve soru işaretleri içeren str string parametresini alsın ve toplamı 10 olan her iki sayı çifti arasında tam olarak 3 soru işareti olup olmadığını kontrol etsin.
Eğer öyleyse, programınız true dizesini döndürmelidir, aksi takdirde false dizesini döndürmelidir. Dize içinde toplamı 10 olan iki sayı yoksa, programınız da false döndürmelidir.

Örneğin: str "arrb6???4xxbl5???eee5" ise, programınız true döndürmelidir çünkü dizenin sonunda 6 ile 4 arasında tam olarak 3 soru işareti ve 5 ile 5 arasında 3 soru işareti vardır.
*/


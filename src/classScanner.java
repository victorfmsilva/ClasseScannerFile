import java.io.File;
import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        try {
            System.out.println("Vou ler o arquivo");
//            Scanner sc = new Scanner(System.in);
            Scanner sc = new Scanner(new File("teste.txt"));
            while (sc.hasNextInt()) {
                int anInt = sc.nextInt();
                System.out.println(anInt);
            }
            sc.close();
        }catch (Exception e){
            //TODO: handle exception
            System.out.println(e);
        }
    }

}

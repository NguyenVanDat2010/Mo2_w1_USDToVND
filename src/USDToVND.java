import java.util.Scanner;
public class USDToVND {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập USD: ");
        float USD=scanner.nextFloat();
        float VND= (float) (USD*22.2);
        System.out.println("VND la: "+VND);
    }
}

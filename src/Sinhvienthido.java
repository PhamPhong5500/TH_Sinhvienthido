import java.util.Scanner;

public class Sinhvienthido {
    public static void main(String[] args) {
        int size;
        int[] array ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 30)
                System.out.println("Kích thước không được vượt quá 30");
        } while (size > 30);
             array = new int[size];
          int i = 0;
          while ( i < array.length) {
              System.out.println("Nhập điểm cho học sinh" + (i + 1) + ": ");
              array[i] = sc.nextInt();
              i++;
        }
          int count = 0 ;
        System.out.println("Danh sách đánh dấu: ");
        for(int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if(array[j] >= 5 && array[j] <= 10)
                    count++;
        }
        System.out.println("\n số học sinh thi đạt là " + count );
    }
}

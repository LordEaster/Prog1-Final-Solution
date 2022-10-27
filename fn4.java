import java.util.Scanner;

public class fn4 {
    /**
     * เช็คค่าตัวเลขมหัศจรรย์
     * @param arr อาร์เรย์ของชุดตัวเลข
     * @return ค่าที่จะบอกว่าชุดตัวเลขนี้มหัศจรรย์จริงหรือไม่
     */
    public static boolean check_wonderful_num(int arr[][]) {
        // ประกาศตัวแปร isWonder เป็นค่าที่จะบอกว่าชุดตัวเลขนี้มหัศจรรย์จริงหรือไม่
        boolean isWonder = true;

        // ประกาศอาร์เรย์ Sum_row สำหรับเก็บค่าผมรวมแถว
        int Sum_row[] = new int[arr.length];

        // ประกาศอาร์เรย์ Sum_col สำหรับเก็บค่าผมรวมหลัก
        int Sum_col[] = new int[arr.length];

        // ประกาศตัวแปร Sum_Lcross สำหรับเก็บค่าผมรวมในแนวแทยงซ้าย
        int Sum_Lcross = 0;

        // ประกาศตัวแปร Sum_Rcross สำหรับเก็บค่าผมรวมในแนวแทยงขวา
        int Sum_Rcross = 0;

        // ลูปบวกเลข
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // บวกค่าตัวเลขของแถวนั้นๆ
                Sum_row[i] += arr[i][j];

                // บวกค่าตัวเลขของหลักนั้นๆ
                Sum_col[j] += arr[i][j];

                // ถ้าตำแหน่งแถว i บวกหลัก j เท่ากับ 2 
                if (i + j == 2) {
                    Sum_Lcross += arr[i][j];
                }

                // ถ้าตำแหน่งแถว i เท่ากับหลัก j
                if (i == j) {
                    Sum_Rcross += arr[i][j];
                }
            }
        }

        // ลูปเช็คว่าค่าที่เราบวกไปใช่ 15 หรือไม่
        for (int i = 0; i < Sum_row.length; i++) {
            // ถ้าเจอเงื่อนไขใดเงื่อนไขหนึ่งไม่เท่ากับ 15 เปลี่ยนค่า isWonder เป็น false แล้วหยุดลูป
            if (Sum_col[i] != 15 || Sum_row[i] != 15 || Sum_Lcross != 15 || Sum_Rcross != 15) {
                isWonder = false;
                break;
            }
        }
        
        // รีเทิร์นค่า isWonder
        return isWonder;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ประกาศอาร์เรย์ 2 มิติ arr สำหรับเก็บตัวเลข
        int arr[][] = new int[3][3];

        // ลูปรับค่า
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = console.nextInt();
            }
        }
        console.close();

        // ถ้าค่าที่ได้จาก method check_wonderful_num เป็นจริงปริ้น Yes เป็นเท็จปริ้น No
        if (check_wonderful_num(arr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

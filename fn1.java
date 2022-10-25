import java.util.Scanner;

public class fn1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ประกาศอาร์เรย์ num ไว้ใช้สำหรับเก็บตัวเลขที่เหลืออยู่ 7 ตัว
        int num[] = new int[7]; 

        // ประกาศอาร์เรย์ checker ที่มีข้อมูลครบทุกจำนวนใช้สำหรับเช็คค่าที่หายไปในอนาคต
        int checker[] = {1,2,3,4,5,6,7,8,9}; 

        // ลูปรับค่าตัวเลข 7 จำนวน
        for (int i = 0; i < num.length; i++) {
            num[i] = console.nextInt();
        }
        console.close();

        // ส่วนของการลูปเช็คตัวที่หายไป
        // ลูปทุกตัวใน checker เพื่อเปรียบเทียบกับตัวเลขที่มีใน num
        for (int i = 0; i < checker.length; i++) {
            // ประกาศ havenum เป็น false เพื่อติต่างว่าเรายังไม่มีตัวเลขนั้น
            boolean havenum = false;

            for (int j = 0; j < num.length; j++) {
                // เมื่อเจอตัวเลขนั้นๆ เปลี่ยนค่า havenum เป็น true และหยุดลูป(j)
                if (checker[i] == num[j]) {
                    havenum = true;
                    break;
                }
            }

            // เช็คว่า havenum เป็น false หรือไม่ ถ้าใช่ให้ปริ้นออกมา
            if (!havenum) {
                System.out.println(checker[i]);
            }
        }
    }
}
import java.util.Scanner;

public class fn2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // รับค่าจำนวนคน
        int n = console.nextInt();

        // ประกาศอาร์เรย์ name มีขนาด n
        String name[] = new String[n];

        // ประกาศอาร์เรย์ score มีขนาด n
        int score[] = new int[n];

        // ลูปเก็บค่า
        for (int i = 0; i < name.length; i++) {
            name[i] = console.next();
            score[i] = console.nextInt();
        }
        console.close();

        // ส่วนการประมวลผล
        // ลูปเรียงลำดับจากมาก ไปน้อย
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) { 
                // ถ้าคะแนนใน index ที่ i มากกว่า index ที่ j
                if (score[i] > score[j]) {
                    // สลับค่า เอาคะแนนมากมาไว้ index หน้าสุด
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;

                    // สลับค่า เอาชื่อของคะแนนมากมาไว้ index หน้าสุด
                    String N_temp = name[i];
                    name[i] = name[j];
                    name[j] = N_temp;
                }
            }
        }

        // ลูปปริ้น 3 อันดับแรก
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s %d", name[i], score[i]);
        }
    }
}

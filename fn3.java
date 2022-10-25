import java.util.Scanner;

public class fn3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // ประกาศอาร์เรย์ Round เก็บรอบของการแข่งขัน
        String Round[] = new String[6];

        // ส่วนของการเช็คข้อมูล
        //! index ของทีมจะตรงกัน
        String N_team[] = {"Red", "Green", "Blue", "Yellow"}; // ชื่อทีมเต็ม
        char short_N_team[] = {'R', 'G', 'B', 'Y'}; // ชื่อทีมย่อ
        int Score_team[] = new int[4]; // คะแนนแต่ละทีม

        // ลูปรับค่าและเช็คค่าไปในตัว
        for (int i = 0; i < Round.length; i ++) {
            // รับค่าในแต่ละรอบทั้งบรรทัด
            Round[i] = console.nextLine();

            // ลูปเช็คว่าทีมใดชนะ
            for (int j = 0; j < short_N_team.length; j++) {
                // ถ้าตัวอักษรแรกของทีมใน index นั้นๆ มีค่าเท่ากับชื่อทีมย่อ ให้บวกคะแนนทีมนั้นขึ้น 1 ค่า
                if (Round[i].toUpperCase().charAt(0) == short_N_team[j]) {
                    Score_team[j]++;
                }
            }
        }
        console.close();

        // ลูปเช็คว่าทีมใดมีคะแนนเท่ากับ 3
        for (int i = 0; i < Score_team.length; i++) {
            // ถ้าเจอทีมที่คะแนนเท่ากับ 3 ให้ปริ้นชื่อทีมใน index นั้นออกมาและหยุดลูป
            if (Score_team[i] == 3) {
                System.out.println(N_team[i]);
                break;
            }
        }
    }
}

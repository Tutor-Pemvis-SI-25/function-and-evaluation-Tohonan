//Tohonan Silaban - 12S25036 //
import java.util.*;
import java.lang.Math;

public class TLAST {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    }
    
    public static double prio(double tingkatkesulitan, double hariHinggaDeadline) {
        double prioritas;
        String prio;

        tingkatkesulitan = Double.parseDouble(input.nextLine());
        hariHinggaDeadline = Double.parseDouble(input.nextLine());
        prioritas = tingkatkesulitan * 1.0 / hariHinggaDeadline;
        if (prioritas > 3) {
            prio = "Penting! Anda harus mengerjakan tugas ini segera";
        } else {
            if (prioritas <= 3 && prioritas >= 1.5) {
                prio = "Tugas ini memiliki prioritas menengah";
            } else {
                if (prioritas > 1.5) {
                    prio = "Tugas ini relatif ringan, namun jangan tunda terlalu lama";
                }
            }
        }
        System.out.println(prio);
        
        return prioritas;
    }
    
    public static String task(String[] add) {
        String h;

        
        return h;
    }
}


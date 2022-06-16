import java.util.Scanner;

public class challenge2 {
    public static void main(String[] args) {
        int lantai_max = 30;
        int lantai_min = 1;
        int masukan_user;
        int lantai_saat_ini = 1;
        boolean ulangi = true;

        Scanner input = new Scanner(System.in);
        System.out.println("press -1 to terminate the application");
        while (ulangi) {
            System.out.println("Go to Floor : ");
            masukan_user = input.nextInt();

            if (masukan_user >= lantai_min && masukan_user <= lantai_max) {
                if (masukan_user > lantai_saat_ini) {
                    for (int loop = lantai_saat_ini; loop < masukan_user; loop++) {
                        System.out.println("Elevator at floor " + loop);
                        lantai_saat_ini = loop;
                    }
                    lantai_saat_ini += 1;
                    System.out.println("Elevator stop at floor " + lantai_saat_ini);
                } else if (masukan_user < lantai_saat_ini) {
                    for (int loop = lantai_saat_ini; loop > masukan_user; loop--) {
                        System.out.println("Elevator at floor " + loop);
                        lantai_saat_ini = loop;
                    }
                    lantai_saat_ini -= 1;
                    System.out.println("Elevator stop at floor " + lantai_saat_ini);
                } else if (masukan_user == lantai_saat_ini) {
                    System.out.println("Elevator already at floor " + masukan_user);
                }

            } else if (masukan_user < 0) {
                System.out.println("application is terminate");
                ulangi = false;
            } else {
                System.out.println("The floor number does not exist.");
            }

        }
    }
}

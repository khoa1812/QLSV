package QLHS;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        ManageStudent manageStudent = new ManageStudent();
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("" +
                    "1. Xem danh sach" +
                    "\n2. Them moi" +
                    "\n3. Sua" +
                    "\n4. Xoa" +
                    "\n5. Tim kiem" +
                    "\n0. Thoat" +
                    "\nNhap vao lua chon");
            choice = scanner.nextInt();
            if (choice == 1) {
                manageStudent.findAll();
            }
        }
    }
}

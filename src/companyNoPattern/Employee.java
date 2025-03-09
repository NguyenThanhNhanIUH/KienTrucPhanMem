package companyNoPattern;

import java.util.Scanner;

public class Employee {
    private String chucVu;

    public Employee(String chucVu) {
        this.chucVu = chucVu;
    }

    public void handleRequest() {
        if (chucVu.equals("Đội trưởng")) {
            System.out.println("Công việc của Đội trưởng:");
            System.out.println("- Đi tuần");
            System.out.println("- Gán việc nhân viên");
        } else if (chucVu.equals("Giám đốc")) {
            System.out.println("Công việc của Giám đốc:");
            System.out.println("- Quản lý toàn bộ công ty");
            System.out.println("- Ra quyết định chiến lược");
        } else if (chucVu.equals("Nhân viên VP")) {
            System.out.println("Công việc của Nhân viên VP:");
            System.out.println("- Pha trà");
            System.out.println("- Phê duyệt hồ sơ");
        } else {
            System.out.println("Chức vụ không hợp lệ!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chức vụ nhân viên: ");
        String chucVu = scanner.nextLine();
        scanner.close();

        Employee employee = new Employee(chucVu);
        employee.handleRequest();
    }
}

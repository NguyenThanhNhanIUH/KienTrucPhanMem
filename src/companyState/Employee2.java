package companyState;

import java.util.Scanner;

// Interface State
interface EmployeeState {
    void handleRequest();
}

class DoiTruongState implements EmployeeState {
    public void handleRequest() {
        System.out.println("Công việc của Đội trưởng:");
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc nhân viên");
    }
}

class GiamDocState implements EmployeeState {
    public void handleRequest() {
        System.out.println("Công việc của Giám đốc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}

class NhanVienVPState implements EmployeeState {
    public void handleRequest() {
        System.out.println("Công việc của Nhân viên VP:");
        System.out.println("- Pha trà");
        System.out.println("- Phê duyệt hồ sơ");
    }
}

class InvalidState implements EmployeeState {
    public void handleRequest() {
        System.out.println("Chức vụ không hợp lệ!");
    }
}

// Lớp Employee sử dụng State Pattern
public class Employee2 {
    private EmployeeState state;

    public Employee2(String chucVu) {
        if (chucVu.equals("Đội trưởng")) {
            state = new DoiTruongState();
        } else if (chucVu.equals("Giám đốc")) {
            state = new GiamDocState();
        } else if (chucVu.equals("Nhân viên VP")) {
            state = new NhanVienVPState();
        } else {
            state = new InvalidState();
        }
    }

    public void handleRequest() {
        state.handleRequest();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chức vụ nhân viên: ");
        String chucVu = scanner.nextLine();
        scanner.close();

        Employee2 employee = new Employee2(chucVu);
        employee.handleRequest();
    }
}

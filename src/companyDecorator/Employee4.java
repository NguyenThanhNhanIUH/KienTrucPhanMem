package companyDecorator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Giao diện cơ bản của nhân viên
interface Employee4 {
    void handleRequest();
}

// Lớp cơ bản của nhân viên
class BasicEmployee implements Employee4 {
    public void handleRequest() {
        System.out.println("Công việc cơ bản của nhân viên.");
    }
}

// Lớp Decorator
abstract class EmployeeDecorator implements Employee4 {
    protected Employee4 employee;

    public EmployeeDecorator(Employee4 employee) {
        this.employee = employee;
    }

    public void handleRequest() {
        employee.handleRequest();
    }
}

// Lớp Đội trưởng
class DoiTruong extends EmployeeDecorator {
    public DoiTruong(Employee4 employee) {
        super(employee);
    }

    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Đội trưởng:");
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc nhân viên");
    }
}

// Lớp Giám đốc
class GiamDoc extends EmployeeDecorator {
    public GiamDoc(Employee4 employee) {
        super(employee);
    }

    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Giám đốc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}

// Lớp Nhân viên VP
class NhanVienVP extends EmployeeDecorator {
    public NhanVienVP(Employee4 employee) {
        super(employee);
    }

    public void handleRequest() {
        super.handleRequest();
        System.out.println("Công việc của Nhân viên VP:");
        System.out.println("- Pha trà");
        System.out.println("- Phê duyệt hồ sơ");
    }
}

// Lớp Employee4 để chạy chương trình
class Employee4Impl {
    public static void main(String[] args) {
        Map<String, Employee4> strategies = new HashMap<>();
        strategies.put("Đội trưởng", new DoiTruong(new BasicEmployee()));
        strategies.put("Giám đốc", new GiamDoc(new BasicEmployee()));
        strategies.put("Nhân viên VP", new NhanVienVP(new BasicEmployee()));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chức vụ nhân viên: ");
        String chucVu = scanner.nextLine();
        scanner.close();

        Employee4 employee = strategies.getOrDefault(chucVu, () -> System.out.println("Chức vụ không hợp lệ!"));
        employee.handleRequest();
    }
}
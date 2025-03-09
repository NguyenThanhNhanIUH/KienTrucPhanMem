package companyStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Strategy Interface
interface EmployeeStrategy {
    void handleRequest();
}


class DoiTruong implements EmployeeStrategy {
    public void handleRequest() {
        System.out.println("Công việc của Đội trưởng:");
        System.out.println("- Đi tuần");
        System.out.println("- Gán việc nhân viên");
    }
}

class GiamDoc implements EmployeeStrategy {
    public void handleRequest() {
        System.out.println("Công việc của Giám đốc:");
        System.out.println("- Quản lý toàn bộ công ty");
        System.out.println("- Ra quyết định chiến lược");
    }
}

class NhanVienVP implements EmployeeStrategy {
    public void handleRequest() {
        System.out.println("Công việc của Nhân viên VP:");
        System.out.println("- Pha trà");
        System.out.println("- Phê duyệt hồ sơ");
    }
}


class Employee3 {
    private EmployeeStrategy strategy;

    public Employee3(EmployeeStrategy strategy) {
        this.strategy = strategy;
    }

    public void handleRequest() {
        strategy.handleRequest();
    }
    
    public static void main(String[] args) {
        Map<String, EmployeeStrategy> strategies = new HashMap<>();
        strategies.put("Đội trưởng", new DoiTruong());
        strategies.put("Giám đốc", new GiamDoc());
        strategies.put("Nhân viên VP", new NhanVienVP());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chức vụ nhân viên: ");
        String chucVu = scanner.nextLine();
        scanner.close();

        EmployeeStrategy strategy = strategies.getOrDefault(chucVu, () -> System.out.println("Chức vụ không hợp lệ!"));
        Employee3 employee = new Employee3(strategy);
        employee.handleRequest();
    }
}



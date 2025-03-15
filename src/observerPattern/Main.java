package observerPattern;

public class Main {
	public static void main(String[] args) {
        // Tạo lớp học
        LopHocImpl lopHoc = new LopHocImpl();

        // Tạo sinh viên
        SinhVienImpl sv1 = new SinhVienImpl("An");
        SinhVienImpl sv2 = new SinhVienImpl("Bình");
        SinhVienImpl sv3 = new SinhVienImpl("Chi");

        // Đăng ký sinh viên vào lớp học
        lopHoc.attach(sv1);
        lopHoc.attach(sv2);
        lopHoc.attach(sv3);

        // Tạo lớp trưởng
        LopTruong lopTruong = new LopTruong(lopHoc);

        // Lớp trưởng gửi thông báo
        lopTruong.guiThongBao("Ngày mai học online vào 8h sáng.");

        // Sinh viên Bình rời khỏi lớp học
        lopHoc.detach(sv2);

        // Lớp trưởng gửi thông báo mới
        lopTruong.guiThongBao("Lịch học thay đổi: 9h sáng.");
    }
}

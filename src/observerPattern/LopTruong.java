package observerPattern;

public class LopTruong {
	private Subject lopHoc;

    public LopTruong(Subject lopHoc) {
        this.lopHoc = lopHoc;
    }

    public void guiThongBao(String message) {
        System.out.println("\n[Lớp trưởng gửi thông báo]: " + message);
        lopHoc.notifyAllObservers(message);
    }
}

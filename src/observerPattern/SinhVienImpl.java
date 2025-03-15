package observerPattern;

public class SinhVienImpl implements Observer{
	private String ten;

    public SinhVienImpl(String ten) {
        this.ten = ten;
    }

    @Override
    public void update(String message) {
        System.out.println("Sinh viên " + ten + " nhận thông báo: " + message);
    }
}

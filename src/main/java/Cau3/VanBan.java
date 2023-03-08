package Cau3;

public class VanBan {
    private String text;

    public VanBan() {
    }

    public VanBan(String text) {
        this.text = text;
    }

    public void demTu() {
        System.out.println("So tu cua chuoi la : "+text.length());
    }

    public void chuHoaTatCa() {
        System.out.println(text.toUpperCase());
    }

    public void chuThuongTatCa() {
        System.out.println(text.toLowerCase());
    }

    public void vietHoaChuDau() {
        System.out.println(text.substring(0, 1).toUpperCase() + text.substring(1));
    }

    @Override
    public String toString() {
        return "VanBan{" +
                "text='" + text + '\'' +
                '}';
    }
}

package Cau3;

public class Main_test {
    public static void main(String[] args) {
        System.out.println("Chuoi text ban dau la : ");
        VanBan vanBan1 = new VanBan("bai kiem tra so ba BKACAD");
        System.out.println(vanBan1);
        vanBan1.chuHoaTatCa();
        vanBan1.chuThuongTatCa();
        vanBan1.demTu();
        vanBan1.vietHoaChuDau();
    }
}

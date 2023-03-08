package Cau2;

public class KyThuat extends NhanVien{
    private String chuyenNganh;

    public KyThuat(String maNhanVien, String hoTen, String namSinh, String diaChi, String chuyenNganh) {
        super(maNhanVien, hoTen, namSinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KyThuat{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                "} " + super.toString();
    }

    @Override
    public String moTaCongViec() {
        return "Lap dat internet va thiet bi";
    }
}

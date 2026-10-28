import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    // Nhập thông tin sách
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = scanner.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = scanner.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = scanner.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        System.out.print("Nhap so luong: ");
        soLuong = scanner.nextInt();
    }

    // Tính thành tiền = đơn giá x số lượng
    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    // Bài 3: Phí vận chuyển = 5% giá trị sách
    public double tinhPhiVanChuyen() {
        return 0.05 * tinhThanhTien();
    }

    //Tổng tiền nhập = Thành tiền + Phí vận chuyển
    public double tinhTongTienNhap() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // Hiển thị thông tin
    public void hienThi() {
        System.out.println("\nNHAP THONG TIN SACH");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien : " + tinhThanhTien());
        System.out.println("Phi van chuyen (5%) : " + tinhPhiVanChuyen());
        System.out.println("Tong tien nhap : " + tinhTongTienNhap());
    }
}

public class QuanLySach {
    public static void main(String[] args) {
        Sach sach = new Sach();
        System.out.println(" NHAP THONG TIN SACH THU VIEN ");
        sach.nhap();
        sach.hienThi();
    }
}
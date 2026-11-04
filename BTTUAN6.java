import java.util.ArrayList;
import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private int soLuong;
    private double donGia;

    public Sach() {
        maSach = "";
        tenSach = "";
        soLuong = 0;
        donGia = 0.0;
    }

    public Sach(String maSach, String tenSach, int soLuong, double donGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
    }

    public void xuat() {
        System.out.printf("Ma sach: %-10s | Ten sach: %-20s | So luong: %-5d | Don gia: %-10.2f | Thanh tien: %.2f\n", 
                maSach, tenSach, soLuong, donGia, (soLuong * donGia));
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
}

public class BTTUAN6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> dsSach = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n================ MENU QUAN LY THU VIEN ================");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Sua thong tin sach");
            System.out.println("6. Tinh tong so luong sach");
            System.out.println("7. Tinh tong gia tri sach");
            System.out.println("8. Thoat");
            System.out.print("Chon chuc nang (1-8): ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach muon them: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Nhap thong tin cuon sach thu " + (i + 1) + " ---");
                        Sach s = new Sach();
                        s.nhap();
                        dsSach.add(s);
                    }
                    System.out.println("Them sach thanh cong!");
                    break;

                case 2:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien hien chua co cuon sach nào!");
                    } else {
                        System.out.println("\n--- DANH SACH SACH TRONG THU VIEN ---");
                        for (Sach s : dsSach) {
                            s.xuat();
                        }
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    System.out.println("\n--- KET QUA TIM KIEM ---");
                    for (Sach s : dsSach) {
                        if (s.getMaSach().equalsIgnoreCase(maTim)) {
                            s.xuat();
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean xoaThanhCong = false;
                    for (int i = 0; i < dsSach.size(); i++) {
                        if (dsSach.get(i).getMaSach().equalsIgnoreCase(maXoa)) {
                            dsSach.remove(i);
                            xoaThanhCong = true;
                            break;
                        }
                    }
                    if (xoaThanhCong) {
                        System.out.println("Da xoa thanh cong sach co ma: " + maXoa);
                    } else {
                        System.out.println("Khong tim thay ma sach de xoa!");
                    }
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    boolean suaThanhCong = false;
                    for (Sach s : dsSach) {
                        if (s.getMaSach().equalsIgnoreCase(maSua)) {
                            System.out.println("Nhap thong tin moi cho sach:");
                            s.nhap();
                            suaThanhCong = true;
                            break;
                        }
                    }
                    if (suaThanhCong) {
                        System.out.println("Cap nhat thong tin sach thanh công!");
                    } else {
                        System.out.println("Khong tim thay ma sach de sua!");
                    }
                    break;

                case 6:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        int tongSL = 0;
                        for (Sach s : dsSach) {
                            tongSL += s.getSoLuong();
                        }
                        System.out.println("-> Tong so lượng tat ca cac sach: " + tongSL);
                    }
                    break;

                case 7:
                    if (dsSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                    } else {
                        double tongGT = 0;
                        for (Sach s : dsSach) {
                            tongGT += s.getSoLuong() * s.getDonGia();
                        }
                        System.out.println("-> Tong gia tri tat ca cac sach: " + tongGT);
                    }
                    break;

                case 8:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le! Vui long chon tu 1 den 8.");
            }
        } while (chon != 8);
    }
}
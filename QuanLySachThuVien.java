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

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }
}

public class QuanLySachThuVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach[] dsSach = new Sach[100]; 
        int n = 0;
        int chon;

        do {
            System.out.println("\n================ MENU QUAN LY THU VIEN ================");
            System.out.println("1. Nhap n sach bang vong lap (Bai 1)");
            System.out.println("2. Hien thi danh sach sach");
            System.out.println("3. Tinh tong so luong va tong gia tri sach (Bai 2)");
            System.out.println("4. Tim sach theo ma (Bai 4)");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang (0-4): ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong sach n: ");
                    n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("--- Nhap thong tin cuon sach thu " + (i + 1) + " ---");
                        dsSach[i] = new Sach();
                        dsSach[i].nhap();
                    }
                    System.out.println("Da nhap thanh cong " + n + " cuon sach!");
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Thư viện hiện chưa có cuốn sách nào!");
                    } else {
                        System.out.println("\n--- DANH SÁCH SÁCH TRONG THƯ VIỆN ---");
                        for (int i = 0; i < n; i++) {
                            dsSach[i].xuat();
                        }
                    }
                    break;

                case 3:
                    if (n == 0) {
                        System.out.println("Thư viện trống!");
                    } else {
                        int tongSoLuong = 0;
                        double tongGiaTri = 0;
                        for (int i = 0; i < n; i++) {
                            tongSoLuong += dsSach[i].getSoLuong();
                            tongGiaTri += dsSach[i].getSoLuong() * dsSach[i].getDonGia();
                        }
                        System.out.println("-> Tổng số lượng tất cả các sách: " + tongSoLuong);
                        System.out.println("-> Tổng giá trị tất cả các sách: " + tongGiaTri);
                    }
                    break;

                case 4:
                    sc.nextLine(); 
                    System.out.print("Nhập mã sách cần tìm: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;
                    System.out.println("\n--- KẾT QUẢ TÌM KIẾM ---");
                    for (int i = 0; i < n; i++) {
                        if (dsSach[i].getMaSach().equalsIgnoreCase(maTim)) {
                            dsSach[i].xuat();
                            timThay = true;
                        }
                    }
                    if (!timThay) {
                        System.out.println("Không tìm thấy cuốn sách có mã: " + maTim);
                    }
                    break;

                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng chọn lại từ 0 đến 4.");
            }
        } while (chon != 0);
    }
}
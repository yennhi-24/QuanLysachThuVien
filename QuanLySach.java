import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;
    private int loaiSach; 

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
        
        // Nhập lựa chọn cho Bài 4
        System.out.println("Chon loai sach (1. Sach giao khoa, 2. Sach tham khao, 3. Sach chuyen nganh, 4. Sach khac): ");
        loaiSach = scanner.nextInt();
    }

    // Tính thành tiền = đơn giá x số lượng
    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    // Phí vận chuyển = 5% giá trị sách
    public double tinhPhiVanChuyen() {
        return 0.05 * tinhThanhTien();
    }

    // Tổng tiền nhập = Thành tiền + Phí vận chuyển
    public double tinhTongTienNhap() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ
    public void kiemTraHopLe() {
        if (donGia > 0 && soLuong >= 0 && namXuatBan >= 1900 && namXuatBan <= 2026) {
            System.out.println("-> Bai 1: Thong tin sach hop le!");
        } else {
            System.out.println("-> Bai 1: Thong tin sach KHONG hop le!");
        }
    }

    // Phân loại giá
    public void phanLoaiGia() {
        System.out.print("-> Bai 2: Phan loai gia: ");
        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia >= 50000 && donGia <= 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia > 100000 && donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }
    }

    //  Phân loại tồn kho
    public void phanLoaiTonKho() {
        System.out.print("-> Bai 3: Phan loai ton kho: ");
        if (soLuong == 0) {
            System.out.println("Het sach");
        } else if (soLuong >= 1 && soLuong <= 5) {
            System.out.println("Sap het");
        } else if (soLuong >= 6 && soLuong <= 20) {
            System.out.println("Con it");
        } else {
            System.out.println("Con nhieu");
        }
    }

    //  Dùng switch chọn loại sách
    public void chonLoaiSach() {
        System.out.print("-> Bai 4: Loai sach (Switch): ");
        switch (loaiSach) {
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong xac dinh");
                break;
        }
    }

    // Hiển thị thông tin
    public void hienThi() {
        System.out.println("\n--- THONG TIN CHI TIET SACH ---");
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
        System.out.println("Thanh tien : " + tinhThanhTien());
        System.out.println("Phi van chuyen (5%) : " + tinhPhiVanChuyen());
        System.out.println("Tong tien nhap : " + tinhTongTienNhap());
        
        // Hiển thị kết quả kiểm tra điều kiện các bài tập
        System.out.println("\nKET QUA PHAN TICH THU VIEN");
        kiemTraHopLe();
        phanLoaiGia();
        phanLoaiTonKho();
        chonLoaiSach();
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
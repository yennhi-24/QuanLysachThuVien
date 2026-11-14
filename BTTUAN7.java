import java.time.Year;
// Lớp Sach cập nhật theo yêu cầu tuần 8
class Sach {
    //Tất cả các thuộc tính được khai báo với từ khóa private
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }
    // Constructor có tham số đầy đủ khởi tạo tất cả các thuộc tính
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        setNamXuatBan(namXuatBan); 
        setSoLuong(soLuong);       
    }
    //Cung cấp đầy đủ các phương thức public getters và setters
    public String getMaSach() {
        return maSach;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTieuDe() {
        return tieuDe;
    }
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public int getNamXuatBan() {
        return namXuatBan;
    }
    //Đảm bảo namXuatBan không lớn hơn năm hiện tại hoặc nhỏ hơn 0
    public void setNamXuatBan(int namXuatBan) {
        int currentYear = Year.now().getValue();
        if (namXuatBan > 0 && namXuatBan <= currentYear) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("Lỗi: Năm xuất bản phải lớn hơn 0 và không vượt quá năm hiện tại (" + currentYear + ")!");
        }
    }
    public int getSoLuong() {
        return soLuong;
    }
    //Đảm bảo soLuong không âm
    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("Lỗi: Số lượng sách không được âm!");
        }
    }
    public void hienThiThongTin() {
        System.out.printf("Ma Sach: %-10s ,Tieu De: %-22s ,Tac Gia: %-18s ,Nam XB: %-5d ,So Luong: %-5d\n",
                maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }
}

class Sach {
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    public Sach() {}

    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    public String getMaSach() { 
        return maSach; }
    public void setMaSach(String maSach) { 
        this.maSach = maSach; }

    public String getTieuDe() { 
        return tieuDe; }
    public void setTieuDe(String tieuDe) { 
        this.tieuDe = tieuDe; }

    public String getTacGia() { 
        return tacGia; }
    public void setTacGia(String tacGia) { 
        this.tacGia = tacGia; }

    public int getNamXuatBan() { 
        return namXuatBan; }
    public void setNamXuatBan(int namXuatBan) { 
        this.namXuatBan = namXuatBan; }

    public int getSoLuong() { 
        return soLuong; }
    public void setSoLuong(int soLuong) { 
        this.soLuong = soLuong; }

    public void hienThiThongTin() {
        System.out.printf("Ma Sach: %-10s,Tieu De: %-25s,Tac Gia: %-20s,Nam XB: %-5d,So luong: %-5d\n",
                maSach, tieuDe, tacGia, namXuatBan, soLuong);
    }
}


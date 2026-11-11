import java.util.ArrayList;
 class Test {
    public static void main(String[] args) {
        ArrayList<Sach> danhSachSach = new ArrayList<>();

        Sach s1 = new Sach("B01", "Lap Trinh Java", "Nguyen Van A", 2023, 10);
        Sach s2 = new Sach("B02", "Cau Truc du Lieu","Le Thi B", 2022, 5);
        Sach s3 = new Sach("B03", "Co so du lieu", "Le Thi C", 2024, 8);

        danhSachSach.add(s1);
        danhSachSach.add(s2);
        danhSachSach.add(s3);

        System.out.println("DANH SACH SACH TRONG THU VIEN");
        for (Sach sach : danhSachSach) {
            sach.hienThiThongTin();
        }
    }
}
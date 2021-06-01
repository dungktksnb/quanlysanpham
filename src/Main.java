import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        QuanLyXe quanLyXe=new QuanLyXe();
        while (true){
            System.out.println("menu");
            System.out.println("1:thêm xe");
            System.out.println("2:hiển thị danh sách xe");
            System.out.println("3:tìm kiếm thông tin xe");
            System.out.println("4:xóa thông tin xe theo id");
            System.out.println("5:sửa thông tin xe thep id");
            System.out.println("6:sắp xếp xe");
            System.out.println("7:exit");
            int choice=-1;
            while (choice==-1){
                try {
                    choice=scanner.nextInt();
                }catch (InputMismatchException e){
                    System.out.println("bạn hãy chọn số");

                }finally {
                    scanner.nextLine();
                }
            }
            switch (choice){
                case 1:
                    System.out.println("nhập thông tin xe");
                    quanLyXe.add(inputXe());
                case 2:
                    System.out.println(quanLyXe.display());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;










            }
        }





    }
    public static  Xe inputXe(){
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập mã vào");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("nhập vào hãng sản xuất:");
        String hangSx=sc.nextLine();
        System.out.println("nhập năm sản xuất:");
        int namSX=sc.nextInt();
        System.out.println("nhập vào giá bán:");
        float giaXe=sc.nextFloat();
        System.out.println("nhập mầu xe:");
        String mauXe=sc.nextLine();
        return new Xe(id,hangSx,namSX,giaXe,mauXe);


    }
}

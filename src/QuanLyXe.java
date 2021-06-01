import java.io.IOException;
import java.util.List;

public class QuanLyXe{
    private List<Xe>xeList;

    public QuanLyXe(List<Xe> xeList) {
        this.xeList = xeList;
    }

    public QuanLyXe() {

    }

    public List<Xe> getXeList() {
        return xeList;
    }

    public void setXeList(List<Xe> xeList) {
        this.xeList = xeList;
    }
    public  String display(){
        String str="";
        for (Xe p: this.xeList) {
            str += p.toString()+ "\n";

        }
        return str;



    }
    public  void  add(Xe xe)throws IOException {
        this.xeList.add(xe);
        System.out.println("thêm vào thành công :" );

    }
    public  int findByID(int id){
        for (int i=0;i<xeList.size();i++){
            if(xeList.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    public  void  edit(int id,Xe xe){
        if(findByID(id)==-1){
            System.out.println("id không tồn tại");

        }else {
            xeList.set(findByID(id),xe);
            System.out.println("sửa thành công");
        }
    }
    public void remove(int id){
        if(findByID(id)==-1){
            System.out.println("id không tồn tại");

        }else {
            xeList.remove(findByID(id));
            System.out.println("xóa thành công");
        }
    }
}


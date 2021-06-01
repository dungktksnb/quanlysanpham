public class Xe {
    private  int id;
    private String hangSX;
    private int namSX;
    private float giaBan;
    private String mauXe;

    public Xe(int id) {
        this.id = id;
    }

    public Xe(int id, String hangSX, int namSX, float giaBan, String mauXe) {
        this.id = id;
        this.hangSX = hangSX;
        this.namSX = namSX;
        this.giaBan = giaBan;
        this.mauXe = mauXe;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getMauXe() {
        return mauXe;
    }

    public void setMauXe(String mauXe) {
        this.mauXe = mauXe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Xe{" +
                "id=" + id +
                ", hangSX='" + hangSX + '\'' +
                ", namSX=" + namSX +
                ", giaBan=" + giaBan +
                ", mauXe='" + mauXe + '\'' +
                '}';
    }
}

//CLASS BANGUN RUANG
public class BangunRuang {
    private String name;

    BangunRuang(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("MENCARI NILAI DARI BANGUN RUANG");
    }

    public void luasPermukaan(){
        System.out.println("Menghitung luas permukaan bangun " + name);
    }

    public void volume(){
        System.out.println("Menghitung volume bangun " + name);
    }

    public void setName(){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

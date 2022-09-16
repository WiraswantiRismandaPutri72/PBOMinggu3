public class Anggota{
    private String nama;
    private String id;
    private int pinjaman;

    Anggota(String nama, String id, int pinjaman){
        this.nama = nama;
        this.id = id;
        this.pinjaman = 0;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNama(){
        return nama;
    }

    public String getId(){
        return id;
    }

    public int getLimitPinjaman(){
        return pinjaman;
    }

    public int getJumlahPinjaman(){
        return pinjaman;
    }

    public void setor(float uang){
        pinjaman += uang;
    }

    public void pinjam(float uang){
        pinjaman -= uang;
    }
}
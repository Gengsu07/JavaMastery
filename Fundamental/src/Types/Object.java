package Types;
class Office {
    String name;
    long jumlah;
    long gaji;

    Office(String name, int jumlah, int gaji) {
        this.name = name;
        this.jumlah = jumlah;
        this.gaji = gaji;
    }

    public long hitungGaji() {
        return jumlah * gaji;
    }
}

public class Object {
    public static void main(String[] args) {
        Office aqua = new Office("Aqua", 5000000, 10000000);
        long totalGaji = aqua.hitungGaji();
        System.out.println(aqua.name);
        System.out.println(aqua.jumlah);
        System.out.println("Total gaji: " + totalGaji);
    }
}

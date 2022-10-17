public class Lingkaran extends LuasDanKeliling {

    // jari-jari lingkaran
    float r;

    float luas() {
        float luas = (float) (Math.PI * r * r);
        System.out.println("Luas lingkaran: " + luas);
        return luas;
    }

    float keliling() {
        float keliling = (float) (2 * Math.PI * r);
        System.out.println("Keliling Lingkaran: " + keliling);
        return keliling;
    }
public static class Main{
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;

        lingkaran.luas();
        lingkaran.keliling();
    }
}
}

import java.util.Scanner;
public class UTSno1 {

	private int jam = 0;
	private int menit = 0;
	private int detik = 0;

	public int getJam() {
		return jam;
	}

	public void setJam(int jam) {
		this.jam = jam;
	}

	public int getMenit() {
		return menit;
	}

	public void setMenit(int menit) {
		this.menit = menit;
	}

	public int getDetik() {
		return detik;
	}

	public void setDetik(int detik) {
		this.detik = detik;
	}

	public UTSno1 durasike(UTSno1 nextHour) {
		UTSno1 lama = new UTSno1();
		int lamaDetik = (nextHour.jam - this.jam) * 3600 +
				(nextHour.menit - this.menit) * 60 +
				(nextHour.detik - this.detik);
		lama.jam = lamaDetik / 3600;
		lamaDetik = lamaDetik % 3600;
		lama.menit = lamaDetik / 60;
		lamaDetik = lamaDetik % 60;
		lama.detik = lamaDetik;
		return lama;
	}

	public static void main(String[] args) {
		System.out.println("Program oop harga percakapan di smartphone");
		System.out.println("==========================================");
		Scanner input = new Scanner(System.in);

		boolean ulang = true;
		while (ulang == true) {
			UTSno1 mulai = new UTSno1();
			System.out.print("Menelpon jam berapa: ");
			mulai.jam = input.nextInt();
			System.out.print("         pada menit: ");
			mulai.menit = input.nextInt();
			System.out.print("         pada detik: ");
			mulai.detik = input.nextInt();

			UTSno1 selesai = new UTSno1();
			System.out.print("Selesai menelpon jam: ");
			selesai.jam = input.nextInt();
			System.out.print("          pada menit: ");
			selesai.menit = input.nextInt();
			System.out.print("          pada detik: ");
			selesai.detik = input.nextInt();

			if (selesai.jam < mulai.jam) {
				System.out.println("Program berjalan hanya di hari yang sama, " +
						"masukan jam lagi :");
				System.out.println("==========================================");
			} else {
				UTSno1 lama = mulai.durasike(selesai);
				System.out.println("==========================================");
				System.out.println("Lama biaya percakapan : " +
						lama.jam + " jam " +
						lama.menit + " menit " +
						lama.detik + " detik");
				int lamaDurasi = (lama.jam * 3600) + (lama.menit * 60) + lama.detik;
				System.out.println("Biaya : Rp" + lamaDurasi * 30);
				break;
			}
		}
	}
}
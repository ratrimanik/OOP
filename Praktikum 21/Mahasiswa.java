public class Mahasiswa extends User{
	public Dosen dosenWali;

	public void setDosenWali(Dosen dosenWali){
		this.dosenWali = dosenWali;
	}

	public void mengikutiPerkuliahan(){
		System.out.println("Mengikuti Perkuliahan");
	}

	public void belajar(){
		System.out.println("Belajar");
	}

	public void mengerjakanTugas(){
		System.out.println("Mengerjakan Tugas");
	}
}
public class TestEmployee{
	public static void main(String arguments[]){
		Employee fadil = new Employee();
		fadil.setName("Fadilah Fahrul Hardiansyah");
		boolean salarySaved = fadil.setSalary(1000000);
		if(salarySaved){
			System.out.println(fadil.getName()+" Rp. "+fadil.getSalary());
		}else{
			System.out.println("Penyimpanan gaji gagal");
		}
		salarySaved = fadil.setSalary(10000000);
		if(salarySaved){
			System.out.println(fadil.getName()+" Rp. "+fadil.getSalary());
		}else{
			System.out.println("Penyimpanan gaji gagal");
		}
		salarySaved = fadil.setSalary(100000000);
		if(salarySaved){
			System.out.println(fadil.getName()+" Rp. "+fadil.getSalary());
		}else{
			System.out.println("Penyimpanan gaji gagal");
		}
	}
}
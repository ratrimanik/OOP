public  class MultiTabungan{
	private int saldo;

	public MultiTabungan(int initsaldo){
		saldo = initsaldo;
	}

	public int getSaldo(){
		return saldo;
	}

	public void simpanUang(int menu, int jumlah){
		if(menu == 1){
			int total = jumlah * 10000;
			saldo += total;
		}
		else if(menu == 2){
			int total = jumlah * 9000;
			saldo += total;
		}
		else{
			saldo += jumlah;
		}
	}

	public boolean ambilUang(int menu, int jumlah){
		if(saldo > jumlah){
			saldo -= jumlah;
			return true;
		} else {
			return false;
		}
	}

	public int konvUang(int menu, int uang){
		if(menu == 1){
			return uang * 9000;
		}
		else if(menu == 2){
			return uang * 10000;
		}
		else{
			return uang;
		}
	}
}
public class fibonacci {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Mau berapa deret? ");
int bil1=0, bil2=1, bil3, deret=scan.nextInt();
if (deret<1) {
System.out.println("Minimal satu deret");
} if (deret==1) {
System.out.println(bil1);
} else {
System.out.print(bil1+" "+bil2);
for (int i = 1; i < deret-1; i++) {
bil3=bil1+bil2;
System.out.print(" "+bil3);
bil1=bil2;
bil2=bil3;
}
System.out.println("");
}
}

class Nilai{
    private int nilai = 0;
    private String hitungGrade(){
        if(nilai >= 80){
             return "A";
        }else if(nilai < 80 && nilai >= 70){
             return "B";
        } return "C";
    }   
    public String getGrade(int nilai){
        this.nilai = nilai;
        return hitungGrade();
    }
}
public class Student{
    String sname;
    int sid;
    String slevel;
    int sresd;
    int scred;
    void insert(int n, String s, String l, int r, int c){
        sid = n;
        sname = s;
        slevel = l;
        sresd = r;
        scred = c;
    }
    void tuition() {
        if(slevel.equals("U")){
            System.out.println(""+sname+"="+120*sresd*scred);
        }
        else{
            System.out.println(""+sname+"="+185.5*sresd*scred);
        }
    }
    void option2() {
        if(slevel.equals("U")){
            System.out.println(""+sname);
        }
    }
    void option3() {
        if(slevel.equals("G")){
            System.out.println(""+sname);
        }
    }
    void displayInf(){
        System.out.println(""+sname);
    }
}
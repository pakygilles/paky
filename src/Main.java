import com.sun.source.tree.ReturnTree;

class Robot{
    private String nom;
    private int PV;
    public Robot(String nom){
        this.nom=nom;
        this.PV= 10;
    }
    public void Fire (Robot A){
        A.PV = A.PV - 2;
        System.out.println("Robot "+ A.getNom()+" a été touché par "+this.getNom()+"\n");
    }
    public boolean isDead (){
        if(this.PV==0){
            System.out.println(" le Robot " + this.nom + " est mort \n");
            return true;
        }else{
            return false;
        }
    }
    String getNom(){
        return nom;}
    int getPV(){
        return PV;}

    protected void setPV(int PV) {
        this.PV = PV;
    }
}
    class Arena {
        public Robot Fight(Robot A, Robot B) {

            if(!A.isDead() && !B.isDead())
            {
                do {
                    A.Fire(B);
                    if (B.getPV() > 0) {
                        B.Fire(A);
                    }
                } while (B.getPV() > 0 && A.getPV() > 0);
            }
            else
            {
                System.out.println("L'un des robots est mort impossible de combattre");
            }
            if (A.getPV() > 0) {
                return A;
            } else {
                return B;
            }
        }
    }

public class Main {
    public static void main(String[] args) {
        /*Robot Paky=new Robot ("D2R2");
        Robot Ibrah=new Robot ("Data");

        Arena arena = new Arena();
        System.out.println("le Robot de "+arena.Fight(Ibrah, Paky).getNom()+" A gagné");*/

        Figter figter = new Figter("Rodrigue", 5);
        System.out.print(figter.getPV());
    }
}
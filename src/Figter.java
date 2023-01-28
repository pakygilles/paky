public class Figter extends Robot {
    private int graine;

    public Figter(String nom, int graine) {
        super(nom);
        this.graine = graine;
    }


    public void Fire (Robot A){

        A.setPV(A.getPV() - 2);
        System.out.println("Robot "+ A.getNom()+" a été touché par "+this.getNom()+"\n");
    }

}

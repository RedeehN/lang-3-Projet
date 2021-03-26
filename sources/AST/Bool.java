

public abstract class Bool extends Exp{
    
    private Exp aExp1;
    private Exp aExp2;

    public Bool(final Exp pExp1,final Exp pExp2){
        this.aExp1 = pExp1;
        this.aExp2 = pExp2;
    }

    public Exp getExp1(){return this.aExp1;}
    public Exp getExp2(){return this.aExp2;}

    public abstract double accept(Visitor v);

}
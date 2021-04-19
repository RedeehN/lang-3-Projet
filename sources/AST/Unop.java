
public abstract class Unop extends Exp{

    private Exp aExp1;

    public Unop(final Exp pExp1){
        this.aExp1 = pExp1;
    }

    public Exp getExp1(){return this.aExp1;}

    public abstract double accept(Visitor v);

}
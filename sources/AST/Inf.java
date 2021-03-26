public class Inf extends Bool{

    public Inf(final Exp exp1, final Exp exp2 ){
        super(exp1,exp2);
    }

    public double accept(Visitor v)
    {
        return v.visit(this);
    }
    
}
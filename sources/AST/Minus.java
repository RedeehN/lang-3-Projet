public class Minus extends Unop {


    public Minus(final Exp exp1){
        super(exp1);
    }

    public double accept(Visitor v)
    {
        return v.visit(this);
    }
    
}
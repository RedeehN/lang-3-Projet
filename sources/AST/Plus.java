public class Plus extends Unop{


    public Plus(final Exp exp1){
        super(exp1);
    }

    public double accept(Visitor v)
    {
        return v.visit(this);
    }
    
}
public abstract class Visitor {

    public abstract double visit(final Num pNum);
    public abstract double visit(final Add pAdd);
    public abstract double visit(final Sub pSub);
    public abstract double visit(final Div pDiv);
    public abstract double visit(final Mul pMul);
    
}

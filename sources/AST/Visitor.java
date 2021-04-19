
public abstract class Visitor {

    public abstract double visit(final Num pNum);
    public abstract double visit(final Add pAdd);
    public abstract double visit(final Sub pSub);
    public abstract double visit(final Div pDiv);
    public abstract double visit(final Mul pMul);
    public abstract double visit(final Inf pInf);
    public abstract double visit(final Sup pSup);
    public abstract double visit(final Equal pEqual);
    public abstract double visit(final NotEqual pNotEqual);
    public abstract double visit(final InfEqual pInfEqual);
    public abstract double visit(final SupEqual pSupEqual);
    public abstract double visit(final Print pPrint);
    public abstract double visit(final Minus pMinus);
    public abstract double visit(final Plus pPlus);
    
}

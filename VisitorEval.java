


public class VisitorEval extends Visitor{

    public VisitorEval(){


    }

    public double visit(final Num pNum)
    {
        return pNum.getNum();
    }

    public double visit(final Add pAdd)
    {
        return pAdd.getExp1().accept(this) + pAdd.getExp2().accept(this) ;
    }

    public double visit(final Sub pSub)
    {
        return pSub.getExp1().accept(this) - pSub.getExp2().accept(this) ;
    }

    public double visit(final Div pDiv)
    {
        return pDiv.getExp1().accept(this) / pDiv.getExp2().accept(this) ;
    }

    public double visit(final Mul pMul)
    {
        return pMul.getExp1().accept(this) * pMul.getExp2().accept(this) ;
    }


}
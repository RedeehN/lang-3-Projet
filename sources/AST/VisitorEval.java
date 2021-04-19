


public class VisitorEval extends Visitor{

    public VisitorEval(){


    }
    @Override
    public double visit(final Num pNum)
    {
        return pNum.getNum();
    }
    @Override
    public double visit(final Add pAdd)
    {
        return pAdd.getExp1().accept(this) + pAdd.getExp2().accept(this) ;
    }
    @Override
    public double visit(final Sub pSub)
    {
        return pSub.getExp1().accept(this) - pSub.getExp2().accept(this) ;
    }
    @Override
    public double visit(final Div pDiv)
    {
        return pDiv.getExp1().accept(this) / pDiv.getExp2().accept(this) ;
    }
    @Override
    public double visit(final Mul pMul)
    {
        return pMul.getExp1().accept(this) * pMul.getExp2().accept(this) ;
    }
    @Override
    public double visit(final Inf pInf)
    {
        if( pInf.getExp1().accept(this) < pInf.getExp2().accept(this))
         return 1;
        else return 0;
    }
    @Override
    public double visit(final Sup pSup)
    {
        if( pSup.getExp1().accept(this) > pSup.getExp2().accept(this))
        return 1;
        else return 0;
    }
    @Override
    public double visit(final Equal pEqual)
    {
        if (pEqual.getExp1().accept(this) == (pEqual.getExp2().accept(this)))
        return 1;
        else return 0;
    }
    @Override
    public double visit(final NotEqual pEqual)
    {
        if(pEqual.getExp1().accept(this) != (pEqual.getExp2().accept(this)))
        return 1;
        else return 0;
    }
    @Override
    public double visit(final InfEqual pInfEqual)
    {
        if(pInfEqual.getExp1().accept(this) == (pInfEqual.getExp2().accept(this)) ||  pInfEqual.getExp1().accept(this) < pInfEqual.getExp2().accept(this))
        return 1;
        else
        return 0;
    }
    @Override
    public double visit(final SupEqual pSupEqual)
    {
        if(pSupEqual.getExp1().accept(this) == pSupEqual.getExp2().accept(this) ||  pSupEqual.getExp1().accept(this) > pSupEqual.getExp2().accept(this))
          return 1;
        else
        return 0;
    }

    @Override
    public double visit(Print pPrint) {
        double val =pPrint.accept(this);
        System.out.print("print(");
        System.out.print(val);
        System.out.println(")");
        
        return val;
    }

    public double visit(final Minus pMinus)
    {
        return - pMinus.getExp1().accept(this);
    }

    public double visit(final Plus pPlus)
    {
        return + pPlus.getExp1().accept(this);
    }
    
}
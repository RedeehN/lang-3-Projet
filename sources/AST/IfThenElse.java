

public class IfThenElse extends Exp
{
    private Exp aConf;
    private Exp aThen;
    private Exp aElse;
    public IfThenElse(Exp pConf,Exp pThen, Exp pElse){
        this.aConf=pConf;
        this.aThen=pThen;
        this.aElse=pElse;
    }

    public Exp getElse() {
        return aElse;
    }

    public Exp getThen() {
        return aThen;
    }


    public Exp getConf() {
        return aConf;
    }

    @Override
    public double accept(Visitor v){
        return v.visit(this);
    }



}
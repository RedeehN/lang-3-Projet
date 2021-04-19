

public class IfThenElse extends Exp
{
    private Exp aConf;
    private Exp aThen;
    private Exp aElse;
    public IfThenElse(Exp pConf,Exp pThen, Exp pElse){
        this.aConf(pConf);
        this.setaThen(pThen);
        this.setaElse(pElse);
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


    public double accept(Visitor v){
        return v.visit(this);
    }



}
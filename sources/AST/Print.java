

public class Print extends Exp  {

    private Exp aExp;
    public Print(Exp pExp){
        setaExp(pExp);
    }

    
    public Exp getaExp() {
        return aExp;
    }


    public void setaExp(Exp aExp) {
        this.aExp = aExp;
    }


    @Override
    public double accept(Visitor v) {
        return v.visit(this);
    }

    
}

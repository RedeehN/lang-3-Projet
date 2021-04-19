
public class Num extends Exp{

    private double aNum;

    public Num(final double pDouble){
        this.aNum = pDouble;
    }

    public double getNum(){return this.aNum;}

    public double accept(Visitor v)
    {
        return v.visit(this);
    }
}
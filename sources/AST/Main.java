

public class Main {

    public static void main(String[] args) {
        
        Visitor v = new VisitorEval();
        double res = new Inf(new Num(7), new Num(7)).accept(v);

        double res1 = new Sup(new Num(7), new Num(7)).accept(v);
        double res2 = new Equal(new Num(7), new Num(7)).accept(v);
        double res3 = new NotEqual(new Num(7), new Num(7)).accept(v);
        double res4 = new InfEqual(new Num(7), new Num(7)).accept(v);
        double res5 = new SupEqual(new Num(7), new Num(7)).accept(v);
        
        System.out.println("Result = "+ res);
        System.out.println("Result = "+ res1);
        System.out.println("Result = "+ res2);
        System.out.println("Result = "+ res3);
        System.out.println("Result = "+ res4);
        System.out.println("Result = "+ res5);
    }
    
}

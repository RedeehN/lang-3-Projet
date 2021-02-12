public class Main {

    public static void main(String[] args) {
        
        Visitor v = new VisitorEval();
        double res = new Add(new Num(12), new Num(7)).accept(v);
        System.out.println("Result = "+ res);
    }
    
}

import org.example.Formula;

public class FormulaBuilder {

    double a, b, c;

    public FormulaBuilder setA(double a){
        this.a = a;
        return this;
    }

    public FormulaBuilder setB(double b){
        this.b = b;
        return this;
    }

    public FormulaBuilder setC(double c){
        this.c = c;
        return this;
    }

    public Formula build(){
        return new Formula(a,b,c);
    }

}

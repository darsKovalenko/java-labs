package lab03;
public class Fraction{
    float m; //числитель
    float n; //знаменатель
    float fraction; //дробь
    Fraction() {
        m = 0;
        n = 1;
    }
    Fraction(float m, float n){
        this.m = m;
        this.n = n;
        fraction = m / n;
    }

    void printFraction(){
        System.out.print(fraction);
    }

    Fraction add(Fraction other){
        Fraction sum = new Fraction();
        sum.fraction = this.fraction + other.fraction;
        return sum;
    }
    Fraction sub(Fraction other){
        Fraction sub = new Fraction();
        sub.fraction = this.fraction - other.fraction;
        return sub;
    }
    Fraction multiply(Fraction other){
        Fraction multi = new Fraction();
        multi.fraction = this.fraction * other.fraction;
        return multi;
    }
}


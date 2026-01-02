package lab03;
public class Complex {
    Fraction re;
    Fraction im;

    Complex(){
        re = new Fraction();
        im = new Fraction();
    }
    Complex(float x1, float y1, float x2, float y2)
    {
        re = new Fraction(x1,y1);
        im = new Fraction(x2,y2);
    }
    void printComplex(){
        re.printFraction();
        if (im.fraction >= 0) {
            System.out.print(" + ");
        }
        else {
            System.out.print(" ");
        }
        im.printFraction();
        System.out.println(" * i ");
    }

    Complex add(Complex other){
        Complex add = new Complex();
        add.re = this.re.add(other.re);
        add.im = this.im.add(other.im);
        return add;
    }
    Complex multiply(Complex other){
        Complex multi = new Complex();

        multi.re = this.re.multiply(other.re).sub(this.im.multiply(other.im));
        multi.im = this.im.multiply(other.re).add(this.re.multiply(other.im));

        return multi;
    }
}

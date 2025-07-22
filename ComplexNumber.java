public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComplexNumber) {
            ComplexNumber number = (ComplexNumber)obj;
            
            if (this.re == number.getRe() && this.im == number.getIm()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return (Double.hashCode(this.im)) + (Double.hashCode(this.re));
    }

}

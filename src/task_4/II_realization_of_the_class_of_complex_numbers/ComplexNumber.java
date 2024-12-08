package task_4.II_realization_of_the_class_of_complex_numbers;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber pow(int exponent) {
        if (exponent == 0) {
            return new ComplexNumber(1, 0);
        }

        ComplexNumber result = new ComplexNumber(this.real, this.imaginary);
        ComplexNumber base = new ComplexNumber(this.real, this.imaginary);

        for (int i = 1; i < Math.abs(exponent); i++) {
            result = result.multiply(base);
        }

        if (exponent < 0) {
            result = result.reciprocal();
        }

        return result;
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    public ComplexNumber reciprocal() {
        double scale = this.real * this.real + this.imaginary * this.imaginary;
        return new ComplexNumber(this.real / scale, -this.imaginary / scale);
    }

    @Override
    public String toString() {
        return String.format("%.2f + %.2fi", real, imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber number = new ComplexNumber(2, 3);
        int exponent = 3;

        ComplexNumber result = number.pow(exponent);
        System.out.println("Результат: " + result);
    }
}


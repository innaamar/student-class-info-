public class Student {
    private String firstName;
    private String secondName;
    private String location;

    public Student(String firstName, String secondName, String location) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.location = location;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }
    
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public void display() {
        System.out.println(" First name: " + firstName);
        System.out.println("Second name: " + secondName);
        System.out.println(" Location: " + location);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Popescu", "Ion", "Constanta");
        Student s2 = new Student("Ionescu", "Dan", "Iasi");
        Student s3 = new Student("Stanescu", "Elena", "Brasov");

        s1.display();
        s2.display();
        s3.display();

        s1.setLocation("Bucuresti");
        s2.setLocation("Cluj");
        s3.setLocation("Craiova");

        s1.display();
        s2.display();
        s3.display();

        ComplexNumber c1 = new ComplexNumber(3.5, 2.0);
        ComplexNumber c2 = new ComplexNumber(1.2, 4.7);

        ComplexNumber result = c1.subtract(c2);
        System.out.println(c1 + " - " + c2 + " = " + result);
        
       // ComplexNumber result = c1.multiply(c2);
       System.out.println(c1 + " * " + c2 + " = " + result);
      
       System.out.println("Module of " + c1 + " = " + c1.module());

        System.out.println(" Module of " + c2 + " = " + c2.module());


    }
}

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    public ComplexNumber multiply(ComplexNumber other) {
    double newReal = this.real * other.real - this.imaginary * other.imaginary;
    double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
    return new ComplexNumber(newReal, newImaginary);
}
public double module() {
    return Math.sqrt(real * real + imaginary * imaginary);
}


    public String toString() {
        if (this.imaginary < 0) {
            return this.real + " - " + Math.abs(this.imaginary) + "i";
        } else {
            return this.real + " + " + this.imaginary + "i";
        }
    }
}

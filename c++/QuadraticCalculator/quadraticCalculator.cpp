#include "quadraticCalculator.h"

double QuadraticCalculator::a = 0;
double QuadraticCalculator::b = 0;
double QuadraticCalculator::c = 0;

QuadraticCalculator::
    // Constructor for the quadratic calculator.
    QuadraticCalculator::QuadraticCalculator(/* args */)
{
}

// Destructor for the quadratic calculator.
QuadraticCalculator::~QuadraticCalculator()
{
}

// Get the input from the user.
void QuadraticCalculator::getInput()
{
    cout << "Enter a value for a: ";
    cin >> a;
    cout << endl;
    cout << "Enter a value for b: ";
    cin >> b;
    cout << endl;
    cout << "Enter a value for c: ";
    cin >> c;
    cout << endl;
}

// Get the discriminant of the quadratic equation.
double QuadraticCalculator::getDiscriminant(double a, double b, double c)
{
    return (b * b) - (4 * a * c);
}

// Get the roots of the quadratic equation.
void QuadraticCalculator::getRoots(double a, double b, double discriminant)
{
    // If the discriminant is less than 0, there are no real roots.
    if (discriminant < 0)
    {
        cout << "The equation has two complex roots: " << endl;
        cout << "x1 = " << -b / (2 * a) << " + " << sqrt(-discriminant) / (2 * a) << "i" << endl;
        cout << "x2 = " << -b / (2 * a) << " - " << sqrt(-discriminant) / (2 * a) << "i" << endl;
    }
    // If the discriminant is equals to 0, there is only one root.
    else if (discriminant == 0)
    {
        double root = (-b + sqrt(discriminant)) / (2 * a);
        cout << "The equation has one root: " << root << endl;
    }
    // If the discriminant is greater than 0, there are two real roots.
    else
    {
        double root1 = (-b + sqrt(discriminant)) / (2 * a);
        double root2 = (-b - sqrt(discriminant)) / (2 * a);
        cout << "The two roots are " << root1 << " and " << root2 << endl;
    }
}

// Run the quadratic calculator.
void QuadraticCalculator::run()
{
    for (int i = 0; i < 4; i++)
    {
        getInput();
        double discriminant = getDiscriminant(a, b, c);
        getRoots(a, b, discriminant);
        cout << endl;
    }
}

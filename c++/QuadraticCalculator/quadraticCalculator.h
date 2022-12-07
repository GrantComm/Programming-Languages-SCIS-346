#ifndef QUADRATICCALCULATOR_H
#define QUADRATICCALCULATOR_H

#include <iostream>
#include <cmath>

using namespace std;

class QuadraticCalculator
{
private:
    double a;
    double b;
    double c;

public:
    QuadraticCalculator();
    ~QuadraticCalculator();
    void run();
    void getInput();
    double getDiscriminant(double a, double b, double c);
    void getRoots(double a, double b, double discriminant);
};
#endif
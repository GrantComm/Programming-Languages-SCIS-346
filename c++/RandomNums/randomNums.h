#ifndef RANDOMNUMS_H
#define RANDOMNUMS_H

#include <iostream>
#include <list>

using namespace std;

class RandomNums
{
private:
    static int sum;
    static int average;
    static int max;
    static int min;
    static list<int> nums;

public:
    RandomNums();
    ~RandomNums();
    void run();
    void getRandomNums();
    void getSum();
    void getAverage();
    void getMax();
    void getMin();
    void sortNums();
    void printNums();
};

#endif
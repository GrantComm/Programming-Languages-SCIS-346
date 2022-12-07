#include "randomNums.h"

int RandomNums::sum = 0;
int RandomNums::average = 0;
int RandomNums::max = 0;
int RandomNums::min = 0;
list<int> RandomNums::nums;

RandomNums::RandomNums(/* args */)
{
}

RandomNums::~RandomNums()
{
}

// Get the random numbers and add them to the list.
void RandomNums::getRandomNums()
{
    for (int i = 0; i < 33; i++)
    {
        nums.push_back(rand() % 100);
    }
    cout << endl;
    cout << "The random numbers are: ";
    printNums();
    cout << endl;
}

// Get the sum of the random numbers.
void RandomNums::getSum()
{
    for (int num : nums)
    {
        sum += num;
    }
    cout << "The sum of the random numbers list is: " << sum << endl;
}

// Get the average of the random numbers.
void RandomNums::getAverage()
{
    average = sum / nums.size();
    cout << "The average of the random numbers list is: " << average << endl;
}

// Get the max of the random numbers.
void RandomNums::getMax()
{
    max = nums.front();
    for (int num : nums)
    {
        if (num > max)
        {
            max = num;
        }
    }
    cout << "The max of the random numbers list is: " << max << endl;
}

// Get the min of the random numbers.
void RandomNums::getMin()
{
    min = nums.front();
    for (int num : nums)
    {
        if (num < min)
        {
            min = num;
        }
    }
    cout << "The min of the random numbers list is: " << min << endl;
}

// Sort the random numbers.
void RandomNums::sortNums()
{
    nums.sort();
    cout << "The sorted random numbers list is: ";
    printNums();
}

// Print the list of random numbers.
void RandomNums::printNums()
{
    for (int num : nums)
    {
        cout << num << " ";
    }
    cout << endl;
}

// Run the program.
void RandomNums::run()
{
    getRandomNums();
    getSum();
    getAverage();
    getMax();
    getMin();
    sortNums();
}
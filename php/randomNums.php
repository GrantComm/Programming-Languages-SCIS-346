<?php
// Grant Commodore
// This program creates a list of 32 random numbers. The list is printed along with the sum, 
// the average, the minimum, and the maximum, and a sorted version.

// Create an array of 32 random numbers.
$randomNums = array();

for ($i = 0; $i < 32; $i++) {
    $randomNums[$i] = rand(0, 100);
}

// Print the array.
echo "The random numbers are: \n";
for ($i = 0; $i < 32; $i++) {
    echo $randomNums[$i] . " ";
}

echo "\n----------------------------------------\n";

// Calculate the sum.
$sum = 0;
for ($i = 0; $i < 32; $i++) {
    $sum += $randomNums[$i];
}

// Print the sum.
echo "The sum is: $sum \n";

// Calculate the average.
$average = $sum / 32;

// Print the average.
echo "The average is: $average \n";

// Calculate the minimum.
$min = $randomNums[0];
for ($i = 1; $i < 32; $i++) {
    if ($randomNums[$i] < $min) {
        $min = $randomNums[$i];
    }
}

// Print the minimum.
echo "The minimum is: $min \n";

// Calculate the maximum.
$max = $randomNums[0];
for ($i = 1; $i < 32; $i++) {
    if ($randomNums[$i] > $max) {
        $max = $randomNums[$i];
    }
}

// Print the maximum.
echo "The maximum is: $max \n";

// Print the sorted array.
sort($randomNums);
echo "The sorted array is: \n";
for ($i = 0; $i < 32; $i++) {
    echo $randomNums[$i] . " ";
}

echo "\n";
?>
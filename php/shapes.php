<?php
// Grant Commodore
// This program computes the appropriate area, and/or perimeter and circumference.  
// It also echoes any dimensions used.

// Run the program until the selection is 0.
function menu () {
    echo "---------------------\n";
    echo "1: Hexagon \n";
    echo "2: Circle\n";
    echo "3: Pentagon\n";
    echo "4: Rectangle\n"; 
    echo "0: Quit\n";
    echo "---------------------\n";
    $selection = readline("Enter your selection: ");
    return $selection;
}

$selection = menu();

while ($selection != 0) {
    // Get the dimensions from the user based on the selected shape.
    if ($selection == 1) {
        // Get the dimensions for a hexagon.
        $side = readline("Enter the length of a side on the hexagon: ");
        $area = 3 * sqrt(3) / 2 * ($side * $side);
        $perimeter = 6 * $side;
        echo "The area of the hexagon is $area and the perimeter is $perimeter \n";
    } else if ($selection == 2) {
        // Get the dimensions for a circle.
        $radius = readline("Enter the radius of the circle: ");
        $area = pi() * $radius * $radius;
        $circumference = 2 * pi() * $radius;
        echo "The area of the circle is $area and the circumference is $circumference \n";
    } else if ($selection == 3) {
        // Get the dimensions for a pentagon.
        $side = readline("Enter the length of a side on the pentagon: ");
        $area = 5 * $side * $side / (4 * tan(pi() / 5));
        $perimeter = 5 * $side;
        echo "The area of the pentagon is $area and the perimeter is $perimeter \n";
    } else if ($selection == 4) {
        // Get the dimensions for a rectangle.
        $length = readline("Enter the rectangle length: ");
        $width = readline("Enter the rectangle width: ");
        $area = $length * $width;
        $perimeter = 2 * ($length + $width);
        echo "The area of the rectangle is $area and the perimeter is $perimeter \n";
    } else {
        // If the selection is not 1, 2, 3, 4, or 0, echo an error message.
        echo "Invalid selection \n";
    }
    // Get the next selection.
    echo "\n";
    $selection = menu();
}

echo "Program terminated \n";

?>
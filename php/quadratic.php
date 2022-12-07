<?php
// Grant Commodore
// This program calculates the roots of a quadratic equation.

// Run the program 5 times
for ($i = 0; $i < 5; $i++) {
    // Get the coefficients from the user.
    $a = readline("Enter value a: ");
    $b = readline("Enter value b: ");
    $c = readline("Enter value c: ");

    // Calculate the discriminant.
    $discriminant = $b * $b - 4 * $a * $c;

    // Calculate the roots.
    // If the discriminant is positive, the equation has two real roots.
    if ($discriminant > 0) {
        $root1 = (-$b + sqrt($discriminant)) / (2 * $a);
        $root2 = (-$b - sqrt($discriminant)) / (2 * $a);
        echo "The equation has two real roots: $root1 and $root2 \n";
    } else if ($discriminant == 0) {
        // If the discriminant is zero, the equation has one real root.
        $root1 = -$b / (2 * $a);
        echo "The equation has one real root: $root1 \n";
    } else {
        // If the discriminant is negative, the equation has no real roots.
        $unreal1 = -$b/(2*$a);
        $unreal2 = sqrt(-$discriminant)/(2*$a);
        echo "The equation has complex roots: $unreal1 ± $unreal2 i \n"; 
    }
}

?>
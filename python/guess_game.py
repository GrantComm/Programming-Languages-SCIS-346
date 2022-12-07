"""
Author: Grant Commodore

This program generates a random number between 0 and 100.  Then, it allows the user 10 guesses.
If the guess is correct, "You guessed it! The number was" is printed along with the number. If 
the guess was too high or too low, the user is notified and another guess is accepted .If the 
user does not guess in 10 guesses, "you lose, the number was" is printed along with the number.
"""

import random

# Generate a random number between 0 and 100.
def get_random_num():
    random_num = random.randint(0, 100)
    return random_num

# Get the user's guess.
def get_guess():
    guess = int(input("Enter your guess: "))
    return guess

# Determine if the guess is correct.
def is_correct(guess, correct_num, count):
    # If this is the last guess and the guess is not correct, return false;
    if (count == 10) and (guess != correct_num):
        print("You lose! The number was", correct_num, ".")
        print("")
        return False
    # If the guess is correct, return true.
    elif guess == correct_num:
        print  ("You guessed it! The number was", correct_num, ".")
        print("")
        return True
    # If the guess is too high, return false.
    elif guess < correct_num:
        print("Too low, try again.")
        print("")
        return False
    # If the guess is too low, return false.
    else:
        print("Too high, try again.")
        print("")
        return False

# Main program
def main():
    # Get the random number.
    correct_num = get_random_num()

    # Give the user 10 guesses.
    for i in range(10):
        guess = get_guess()
        guess_is_correct = is_correct(guess, correct_num, i)
        # If the guess is correct, end the program.
        if guess_is_correct == True:
            break
    if (guess_is_correct == False):
        print("You lose! The number was", correct_num, ".")
        print("")
main()
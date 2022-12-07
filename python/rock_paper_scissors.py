# Grant Commodore

# This program uses a GUI to play rock, paper, scissors.

import tkinter
import random

class RockPaperScissors:         
    def __init__(self):
        # Create the main window.
        self.main_window = tkinter.Tk()
        self.main_window.geometry('300x300')
        self.main_window.title('Rock, Paper, Scissors')

        # Create the frames.
        self.frame0 = tkinter.Frame(self.main_window)
        self.frame1 = tkinter.Frame(self.main_window)
        self.frame2 = tkinter.Frame(self.main_window)
        self.frame3 = tkinter.Frame(self.main_window)
        self.frame0.grid(row=0, column=0, pady=10)
        self.result_frame = tkinter.Frame(self.main_window)

        # Create and pack the label that holds the instructions.
        self.label0 = tkinter.Label(self.frame0, text='Please choose rock, paper, or scissors.')
        self.label0.pack(side='left')
        
        # Create and pack the radio button widgets.
        self.var = tkinter.IntVar()
        self.rb1 = tkinter.Radiobutton(self.frame1, text='Rock', variable=self.var, value=1)
        self.rb1.pack(side='left')
        self.rb2 = tkinter.Radiobutton(self.frame1, text='Paper', variable=self.var, value=2)
        self.rb2.pack(side='left')
        self.rb3 = tkinter.Radiobutton(self.frame1, text='Scissors', variable=self.var, value=3)
        self.rb3.pack(side='left')

        # Create and pack the button widges.
        self.button = tkinter.Button(self.frame2, text='Play', command=self.play)
        self.button.pack(side='left')
        self.exit_button = tkinter.Button(self.frame3, text="Exit", command=self.main_window.destroy)
        self.exit_button.pack(side='left')


        # Create and pack the widgets for the result.
        self.result_label = tkinter.Label(self.result_frame, text='Result:')
        self.result_value_label = tkinter.Label(self.result_frame)
        self.result_label.pack(side='left')
        self.result_value_label.pack(side='left')

        # Pack the frames.
        self.frame0.pack()
        self.frame1.pack()
        self.frame2.pack()
        self.result_frame.pack()
        self.frame3.pack()

        # Start the main loop.
        tkinter.mainloop()
    
    # Compare the user's selection to the computer's selection.
    def play(self):
        # Get the computer's selection between 1 and 3.
        computerValue = random.randint(1, 3)
        # Get the user's selection and compare it to the computer's selection.
        if self.var.get() == 1 and computerValue == 1:
            self.result_value_label.config(text='Tie! The computer also chose rock.')
                
        elif self.var.get() == 1 and computerValue == 2:
            self.result_value_label.config(text='You lose! The computer chose paper.')
                
        elif self.var.get() == 1 and computerValue == 3:
            self.result_value_label.config(text='You win! The computer chose scissors.')
               
        elif self.var.get() == 2 and computerValue == 1:
            self.result_value_label.config(text='You win! The computer chose rock.')
                
        elif self.var.get() == 2 and computerValue == 2:
            self.result_value_label.config(text='Tie! The computer also chose paper.')
                
        elif self.var.get() == 2 and computerValue == 3:
            self.result_value_label.config(text='You lose! The computer chose scissors')
                
        elif self.var.get() == 3 and computerValue == 1:
            self.result_value_label.config(text='You lose! The computer chose rock.')
                
        elif self.var.get() == 3 and computerValue == 2:
            self.result_value_label.config(text='You win! The computer chose paper')
                
        elif self.var.get() == 3 and computerValue == 3:
            self.result_value_label.config(text='Tie! The computer also chose scissors')
            
        self.button.config(text='Play Again')
            

# Create an instance of the RockPaperScissors class.
game = RockPaperScissors()



        

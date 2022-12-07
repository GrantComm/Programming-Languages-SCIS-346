# This program creates labels in two different frames.

import tkinter

class MyGUI:
    def __init__(self):
        # Create the main window widget.
        self.main_window = tkinter.Tk()

        # Create two frames. One for the top and one for the bottom.
        self.top_frame = tkinter.Frame(self.main_window)
        self.bottom_frame = tkinter.Frame(self.main_window)

        # Create the Label widgets for the top frame.
        self.label1 = tkinter.Label(self.top_frame, text='Winken')
        self.label2 = tkinter.Label(self.top_frame, text='Blinken')
        self.label3 = tkinter.Label(self.top_frame, text='Nod')

        # Pack the Label widgets into the top frame.
        self.label1.pack(side='top')
        self.label2.pack(side='top')
        self.label3.pack(side='top')

        # Create the Label widgets for the bottom frame.
        self.label4 = tkinter.Label(self.bottom_frame, text='Winken')
        self.label5 = tkinter.Label(self.bottom_frame, text='Blinken')
        self.label6 = tkinter.Label(self.bottom_frame, text='Nod')

        # Pack the Label widgets into the bottom frame.
        self.label4.pack(side='left')
        self.label5.pack(side='left')
        self.label6.pack(side='left')

        # Pack the frames.
        self.top_frame.pack()
        self.bottom_frame.pack()

        # Enter the tkinter main loop.
        tkinter.mainloop()

# Create an instance of the MyGUI class.
my_gui = MyGUI()
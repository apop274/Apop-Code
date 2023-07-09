#tkinter heirarchy: root window --> frame --> widgets

import tkinter as tk
import tkinter.messagebox
from tkinter import *


def getInput():
   #input = textbox.get("1.0", 'end-1c')   
   input= tk.Entry.get()


def displayOutput():
 
 input = 0 
 getInput()
 
 returnVal = ""
 counter = 0
 value = 0


 while value < input:
  value = 2**counter


 counter -= 1

 newVal = 0

 while counter > -1:
  newVal = 2**counter

  input -= newVal

  if input < 0:
   returnVal = returnVal + "0"
   input += newVal
  else:
   returnVal = returnVal + "1"

  counter -= 1

 returnVal = returnVal[1:]
 #print(returnVal)

 #tkinter.messagebox.showinfo("Binary Converted Result", returnVal)
 print(returnVal)



#root window
window = tk.Tk()
window.title("Binary Converter")
window.geometry('1000x600')

entry = tk.Entry(window)
entry.pack()


label = tk.Label(window, text="Integer to Binary Converter", font = ('Arial', 45))
label.pack(padx=100, pady = 40)

textbox = tk.Text(window, height=2, font= ('Arial',16))
textbox.pack(padx=300)

button = tk.Button(window, text="Convert", command = displayOutput)   # font = ('Arial', 13)
button.pack(padx=0, pady=10)

label = tk.Label(window, text= "Binary Value: ",  font=('Arial', 18))
label.pack(pady=50)

#returnBox = tk.Text(window, height = 2, font = ('Arial', 16))
#returnBox.pack(padx = 100, pady=0)

#run the main event loop
window.mainloop()


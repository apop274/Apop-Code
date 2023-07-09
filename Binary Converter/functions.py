import tkinter as tk
from tkinter import *
from gui import textbox
import tkinter.messagebox

def getInput():
    input = textbox.get("1.0", 'end-1c')




def displayOutput():
 
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

 tkinter.messagebox.showinfo("Binary Converted Result", returnVal)


import tkinter as tk

def displayOutput():
 num = entry.get()
    

 returnVal = ""
 counter = 0
 value = 0


 while value < num:
  
  value = 2**counter

  counter += 1


 counter -= 1

 newVal = 0

 while counter > -1:
  newVal = 2**counter

  num -= newVal

  if num < 0:
   returnVal = returnVal + "0"
   num += newVal
  else:
   returnVal = returnVal + "1"

  counter -= 1

 returnVal = returnVal[1:]
 #print(returnVal)

 returnVal.config(text="Binary Result: " + returnVal)

# Create the main window
window = tk.Tk()

# Create an entry field
entry = tk.Entry(window)
entry.pack()

# Create a button
button = tk.Button(window, text="Convert", command=displayOutput, font = ('Arial', 18))
button.pack()

# Create a label to display the result
binaryResultLabel = tk.Label(window, text="")
binaryResultLabel.pack()

# Run the main event loop
window.mainloop()

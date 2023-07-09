import tkinter as tk

#this is the root window
window = tk.Tk()
window.title("Binary Converter")
window.geometry('1000x600')

#label widget
label = tk.Label(window, text="Integer to Binary Converter", font = ('Arial', 45))
label.pack(padx=100, pady = 40)

button = tk.Button(window, text="Convert", font = ('Arial', 13))
button.pack(padx=100, pady=10)

textbox = tk.Text(window, height=3, font= ('Arial',16))
textbox.pack()

#run the main event loop
window.mainloop()

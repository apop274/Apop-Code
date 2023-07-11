import tkinter as tk

def int_to_bin():
    integer=int(entry.get())

    if integer == 0:
        return 0

    binary = 0
    digit_place = 1

    while integer > 0:
        remainder = integer % 2
        binary += remainder * digit_place
        integer = integer // 2
        digit_place *= 10

   # return binary
    binaryResultLabel.config(text= binary)
    


#main window
window = tk.Tk()
window.title("Integer to Binary Converter")
window.geometry("600x300")

#entryfield
entry = tk.Entry(window)
entry.pack(pady=30)

#button
button = tk.Button(window, text="Convert", command=int_to_bin, font = ('Arial', 18))
button.pack(pady=0)

#result displaying label
binaryResultLabel = tk.Label(window, text="Binary Version: ")
binaryResultLabel.pack(pady=25)


window.mainloop()

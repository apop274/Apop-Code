user_input = input("hello, what number would you like?: ")
num = int(user_input)

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
print(returnVal)
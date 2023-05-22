#python practice

#determine the total of the food
steak_amount = 35
chicken_amount = 70
pork_amount = 40

total_amount = steak_amount + chicken_amount + pork_amount

print(total_amount)

#how to turn number into string
print('$' + str(total_amount))


#how to make string
your_name = 'apop'
print(your_name)

#booleans
weather = 'rain'

if weather == 'rain':
    print('umbrella needed')
else:
    print('sunglasses needed') 

#comparison operators (==, <, >, <=, >=)
score = 86

if score >= 90:
    print('A')
elif score >= 80 and score < 90:
    print('B')


#functions (functions that have no paramters have 1 argument, functions that have multiple parameters
#           have multiple arguments)

def earth():
    print('the world is flat')
    print('the world is a sphere')
    print('the world is a cube')
earth()

#functions that contain multiple arguments
def greetings(greet, name):
    print(f"{greet}{name}")

print(greetings("hey there chap", " sir apop"))

#loops
for i in range(1, 6):
    print(i)

count = 0

while count < 5:
    print(count)
    count+=1
    if(count == 4):
        break
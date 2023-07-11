def int_to_bin(integer):
    if integer == 0:
        return 0

    binary = 0
    digit_place = 1

    while integer > 0:
        remainder = integer % 2
        binary += remainder * digit_place
        integer = integer // 2
        digit_place *= 10

    return binary

integer_number = int(input("Enter an integer: "))
binary_number = int_to_bin(integer_number)
print("Binary representation:", binary_number)

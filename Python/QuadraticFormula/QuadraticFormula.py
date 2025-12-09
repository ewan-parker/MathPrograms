import math

print('Values are denoted as such: ax² + bx + c')

a = float(input('Enter your value for a: '))

b = float(input('Enter your value for b: '))

c = float(input('Enter your value for c: '))

squared_part = b*b - 4*a*c

# Shows the algebra
print('                 _____')
print(f'        {-b} + ±√{squared_part}')
print('x =    ——————————————————')
print(f'             {2*a}')
print()

# Check for imaginary solutions:
imaginary_solution = False

if squared_part < 0:
    imaginary_solution = True


if imaginary_solution == False:
    first_x_value = (-b + math.sqrt(squared_part) ) / (2*a)
    second_x_value = (-b - math.sqrt(squared_part) ) / (2*a)
    print('Which calculates to: ', round(first_x_value, 4), 'and', round(second_x_value, 4))

if imaginary_solution == True:
    squared_part = abs(squared_part)

    x_real_part = -b / (2*a)
    x_complex_part = (math.sqrt(squared_part) ) / (2*a)
    
    print('Which calculates to: ')
    print()
    print(' x₁ = ', end = ' ')
    print(round(x_real_part, 4), end = " + ")
    print(round(x_complex_part, 4), end = 'i\n')

    print(' x₂ = ', end = ' ')
    print(round(x_real_part, 4), end = " - ")
    print(round(x_complex_part, 4), end = 'i\n')

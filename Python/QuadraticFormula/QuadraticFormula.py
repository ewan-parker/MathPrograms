import math

print('Values are denoted as such: ax² + bx + c')

a = float(input('Enter your value for a: '))

b = float(input('Enter your value for b: '))

c = float(input('Enter your value for c: '))

squared_part = b*b - 4*a*c


first_x_value = (-b + math.sqrt(squared_part) ) / (2*a)

second_x_value = (-b + math.sqrt(squared_part) ) / (2*a)



# Shows the algebra
print()
print(f'        {-b} + ±√{squared_part}')
print('       ——————————————————————————————')
print(f'             + {2*a}')
print()

# Shows the calculated values
print('Calculates to: ', round(first_x_value, 4), 'and', round(second_x_value, 4))


        

    



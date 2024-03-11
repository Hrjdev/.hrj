# mail = input('mail :')
# password = input('sifre :')
# print('Basariyla kayit oldunuz. \n Kullanici bilgileriniz : \n' , mail , password )

# n = int(input('Sayi Giriniz: '))

# while n > 0:
#          n = n-1
#          print(n)
# if n < 0:
#      print('Be positive!')





# # Sayinin Basamagini bulmaya calisiyorum
# number = int(input('Pick a Number: '))
# digits = 0

# while   number > 0:
#     number = number //10
#     digits = digits + 1
# print(digits , 'digits')


# Asal Sayi mi degil mi 
# sayi = int(input('Sayi girisi yapiniz: '))
# l = 0
# i = 2

# while i <= sayi / 2:
#     if sayi % i == 0:
#         l = 1
#         break
#     i = i + 1
# if l == 0:
#     print('asal.')
# else:
#     print('asal degil.')

# iki sayi arasinda sayilar da dahil olmak uzere toplamlari
# n1 = int(input("sayi1: "))
# n2 = int(input("sayi2: "))
# result = 0
# for k in range(n1,n2+1):
#     result+=k
# print(result)
# fonksiyon ile sayı sayının faktoriyeli
# def fac(num):
#     result = 1
#     for k in range(1,num+1):
#         result*= k
#     print(result,"is a factorial of",num)
# num = int(input("Enter a number: "))
# fac(num)

# def prime(k):
#     if k<2:
#         return False
#     for i in range(2,k//2+1):
#         if k % i == 0:
#             return False
#     return True
# num = int(input("Input a integer number: "))
# if prime(num):
#     print("Yes")
# else:
#     print("Nope")

# n1,n2,n3 = input("baslangic bitis ve bölen sayı giriniz: ").split()
# n1,n2,n3 = int(n1),int(n2),int(n3)
# result = 0
# counter = 0
# for i in range(n1,n2+1):
#     if  i % n3 ==0:
#         result+=i
#         counter+=1
# print(result/counter)

# def zort(a,b,c):
#     result,counter = 0,0
#     for i in range(a,b+1):
#         if i % c == 0:
#             result+=i
#             counter+=1
#     print(result/counter)
# a = int(input("sayi: "))            
# b = int(input("sayi: ")) 
# c = int(input("sayi: "))
# zort(a,b,c)

# z = int(input("numero: "))
# for i in range(z):
#     for k in range(i+1):
#         print("*",end="")
#     print()



# num = int(input("Enter an integer number: "))
# result = 0

# for i in range(1,num+1):
#     result += i
# if num % 2 == 0:
#     result -= (num-2)
# else:
#     result -= (num-1)

# print(result)


# num = int(input("Enter a positive integer number: "))
# print("3-digit positive integer numbers divisible by {} are:".format(num))
# counter = 0
# for i in range(100,1000):
#     if i % num == 0:
#         counter+=1
#         print(i,end=(" "))
# print()
# print("There are {} 3-digit numbers divisible by {}".format(counter,num))



"""Write a Python program that prints the odd numbers between integer variables n1 and n2 both
inclusive. 
"""
# n1 = int(input("Enter an integer number: "))
# n2 = int(input("Enter an integer number: "))

# for i in range(n1,n2+1):
#     if i % 2 != 0:
#         print(i)


# """
# Write Python statements that finds the sum of the numbers divisible by 7 between integer variables
# x1 and x2 both inclusive. (Assume x1 and x2 are assigned some values before your code.) 
# """
# num1 = 20
# num2 = 130
# summ = 0
# for i in range(num1,num2+1):
#     if i % 7 == 0:
#         summ += i
# print(summ)

# """
# Write Python statements that finds the number of integer numbers divisible by 5 between integers
# z1 and z2 both exclusive. (Assume z1 and z2 are assigned values before your statements.)
# """
# z1 = 70
# z2 = 770
# counter = 0

# for i in range(z1,z2+1):
#     if i % 5 == 0:
#         counter += 1
# print(counter)


# """
# Write a Python function max_of_three() that gets three numbers as parameters, and returns themaximum of the given numbers. Mind that two or three numbers may be equal.
# Write a Python program that inputs three numbers, calls this function, and then output the maximum.
# Example function calls: max_of_three (5, 7, 4) max_of_three (7, 7, 4)
# """

# def max_of_three(n1,n2,n3):
#     if n1>n2 and n1>n3:
#         return n1
#     elif n2>n1 and n2>n3:
#         return n2
#     else:
#         return n3

# num1 = int(input("Enter first number: "))
# num2 = int(input("Enter second number: "))
# num3 = int(input("Enter third number: "))
# print(f"The maximum number among {num1},{num2} and {num3} is {max_of_three(num1,num2,num3)}")

# """
# Write a Python program that performs the followings: (30 p)  input two integers numbers,  compute and print the count and sum of numbers that are divisible by 7 between 
# these two numbers(both inclusive).
# Example: if we assume that the user enters 10 and 28, then the numbers divisible by 7 between 10 and28 (both inclusive) will be 14, 21 and 28. Therefore their count will be 3 and their sum will be 63.
# Sample run:
# Enter first number: 10
# Enter second number: 28
# There are 3 numbers divisible by 7 between 10 and 28
# Their sum is 63
# """
# num1 = int(input("Enter a number 1: "))
# num2 = int(input("Enter a number 2: "))
# sum1 = 0
# count = 0

# for i in range(num1,num2+1):
#     if i % 7 == 0:
#         count+= 1
#         sum1 += i
# print(f"There are {count} numbers divisible by 7 between {num1} and {num2}")
# print("Their sum is", sum1)

# def getDigits(text):
#     fax = ("")
#     for i in text:
#         if i.isdigit():
#             fax +=i
#     return fax
# counter = 0

# fax = input("Enter a string: ")
# defax = getDigits(fax)
# print(defax)
# intfax = int(defax)
# while intfax > 0:
#     intfax //= 10
#     counter+= 1
# print(counter)

# def isPolindrome(text):
#     cleantext = ("")
#     for n in text:
#         if n.isalnum():
#             cleantext+= n
#     uppertext = cleantext.upper()
#     rev = uppertext[::-1]
#     if rev == uppertext:
#         return True
#     else:
#         return False
# fax = input("Enter a magic characters: ")
# a = isPolindrome(fax)
# if a:
#     print("Yes!!")
# else:
#     print("Nope^^")

# def middle(text):
#     textlen = len(text)
#     if textlen % 2 == 0:
#         result = text[textlen//2-1:textlen//2+1]
#     else:
#         result = text[textlen//2]
#     return result
# fax = input("Enter a text: ")
# a = middle(fax)
# print(a)

# def matrix(row,col,start):              
#     lst = list()
#     for i in range(row):
#         ls = list()
#         for j in range(col):
#             ls.append(start)
#             start+=1
#         lst.append(ls)
#     return lst

# row = int(input("row: "))
# col = int(input("col: "))
# start = int(input("start: "))

# fax = matrix(row,col,start)
# print(fax)


def createList(start, stop, increase):
    result_list = []
    current_value = start
   
    while current_value <= stop:
        result_list.append(round(current_value, 2))
        current_value += increase
   
    return result_list

start_number = float(input("Enter the start number: "))
stop_number = float(input("Enter the stop number: "))
increase_value = float(input("Enter the increase value: "))

result_float_list = createList(start_number, stop_number, increase_value)
print("Created List of Floats:")
print(result_float_list)



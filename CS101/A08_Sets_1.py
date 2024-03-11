# Sets
import random
#========================================
# Print elements, 10 on each line.
def printSet(set1, heading):
	print(heading)
	j = 1
	for v in set1:
		print(v, end=" ")
		if j % 10 == 0:
			print()
		j += 1
	if len(set1) % 10 != 0:
		print()
#========================================
# Main:

print("{} does not create empty set, but dictionary.")
s1 = {}		# does not create empty set, but empty dictionary
print(s1)
print(type(s1))
print("set?", type(s1) is set)
print("dictionary?", type(s1) is dict)
print(40 * "=")

# Create empty set:
print("Create empty set:")
s2 = set()	# creates empty set
print(s2)
print(type(s2))
s2.add(2)
print(s2)
#print(type(s2))
print(40 * "=")

# Create a set:
print("Create set:")
set1 = {"apple", "banana", "cherry"}
print("set1:", set1)
print("len(set1):", len(set1))
#print(type(set1) is set)
lst1 = ["apricot", "banana", "cherry", "banana"]
print(lst1)
set2 = set(lst1)	# Create a set from a list
print("set2:", set2)
set3 = set(("carrot", "potato", "tomato"))	# Create a set from a tuple
print("set3:", set3)
print(40 * "=")

print("Duplicates are ignored:")
s1 = {"apple", "banana", "cherry", "apple"}
print("s1:", s1)	# will contain: {'apple', 'banana', 'cherry'}

print(40 * "=")

print("Creating set with range function:")
s1 = set(range(4, 9))
print("s1:", s1)	# will contain: {4, 5, 6, 7, 8}

print(40 * "=")

set1 = {"Antalya", "Rio", "San Fransisco", "Ankara"}
printSet(set1, "set1:")
print("Loops to get all elements:")
for x in set1:
	print(x, end=", ")
print()
print(40 * "=")

print("Count even numbers in a set:")
s1 = {7, 8, 4, 9, 2, 14, 6, 3, 5}
printSet(s1, "set1:")
print(s1)
cnt = 0
for x in s1:
	if x % 2 == 0:
		cnt += 1
print("Count of even numbers:", cnt)
print(40 * "=")

def countEven(a):
	cnt = 0
	for x in a:
		if x % 2 == 0:
			cnt += 1
	return cnt

ls = [7, 8, 4, 9, 2, 14, 6, 3, 5]
print(countEven(ls))
tp = (7, 8, 4, 9, 2, 14, 6, 3, 5)
print(countEven(tp))
st = {7, 8, 4, 9, 2, 14, 6, 3, 5}
print(countEven(st))
print(40 * "=")

a = set(range(1, 10))
print(a)
b = a
print(b)
a = {7, 4, 8, 2, 3, 9, 6}
print(a)
x = a.pop()
print(x, a)
x = a.pop()
print(x, a)

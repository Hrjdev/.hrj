# Dictionaries
import random

print("DICTIONARIES")
print("============")

a = {}
print(a)
a[8] = 84		# create a new element
a[4] = 100		# create a new element
a[10] = 160		# create a new element
a[7] = 41		# create a new element
print(a)
a[4] = 240		# update value of element
print(a)
print("Number of elements:", len(a))
print("Maximum key:", max(a))
print("Minimum key:", min(a))
print("Sum of keys:", sum(a))
print("Sorted keys:", sorted(a))

print("Keys: ", a.keys())
print("Values: ", a.values())

for x in a.keys():
	print(x)

for v in a.values():
	print(v)

print("Sum of values:", sum(a.values()))

for k, v in a.items():
	print(k, v, sep="\t")

print("Loop with dictionary:")
for k in a:
	print(k, a[k])

print("Loop with dictionary - 2:")
for k in a:
	a[k] += 10
print(a)

print(20 * "=")
print("a:", a)
b = {6: 3, 10: 14, 3: 7}
print("b:", b)

a.update(b)
print("a:", a)

#del a[7]
#print("a after del:", a)

x = a.get(5, 200)
print("get method:", x)

p = a.popitem()
print("After popitem:", p, a)

if len(a) == 0:
	print("Dictionary is empty")

#while len(a) > 0:
	#p = a.popitem()
	#print("Last item:", p)

p = a.pop(10)
print("After pop(10):", p, a)

print(a)
print(20 * "=")

b = {3: 20, 7: 72, 1: 33, 8: 40}
print(b)

a.update(b)
print(a)

print(a.get(7, 1000))
print(a.get(9, 1000))

m = 62
if m in a:
	print(m, "is a key in dictionary")
else:
	print(m, "is not a key in dictionary")


print(a)


print("Creating elements in a loop:")
squares = dict()	# squares = {}
for k in range(10, 101, 10):		# 10 20 30 ... 100
	squares[k] = round(k ** 0.5, 3)	# add new key+value pair.
print("squares:", squares)
print(40 * "=")


print("Dictionary with lists as values:")
months2 = {1:['Jan', 31], 2:['Feb', 28], 3:['Mar', 31], 4:['Apr', 30], 
	5:['May', 31], 6:['Jun', 30], 7:['Jul', 31], 8:['Aug', 31], 
	9:['Sep', 30], 10:['Oct', 31], 11:['Nov', 30], 12:['Dec', 31]}

print(months2[2])
print(months2[2][0], months2[2][1])

months2[2][1] = 29
print(months2[2])


print(20 * "-")
for m in months2:
	print(m, months2[m])
print(20 * "-")
for m in months2:
	print(m, months2[m][0], months2[m][1])

print(40 * "=")
print("Creating random keys and values:")
rd = {}
for j in range(20):	# repeat this loop 20 times.
	k = random.randint(20, 40)
	v = random.randint(1, 100)
	rd[k] = v	# if k exists then updates value, otherwise adds new element.
print(rd)
print("Number of elements =", len(rd))

def aveValues(dd):
	total = 0
	for v in dd.values():
		total += v
	ave = total / len(dd)
	return ave

ave1 = aveValues(rd)
print("Average:", ave1)

def aveValues2(dd):
	return sum(dd.values()) / len(dd)

ave2 = aveValues2(rd)
print("Average:", ave2)
print(20 * "=")

vals = []
for j in range(20):
	vals.append(random.randint(10, 16))
print(vals)

# Dictionaries can be used as counters of occurences of values.
counts = {}		# Create an empty dictionary
for n in vals:
	if n in counts:		# if name exists as key in dict. counts,
		counts[n] += 1		# then increment that counter,
	else:				# if name doesn't exist as key in counts,
		counts[n] = 1		# then add new element to counts.
print(counts)		# print the dictionary
print(40 * "=")

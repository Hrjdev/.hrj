# Dictionaries (Associative Arrays)
import random

print("DICTIONARIES")
print("============")
print("Creating Dictionaries:")
print("----------------------")
d1 = {}		# Create empty dictionary. Or: d1 = dict()
d1[6] = "Anakara"	# adds new element
d1[7] = "Antalya"	# adds new element
d1[34] = "Istanbul"	# adds new element
d1[35] = "Izmir"	# adds new element
print(d1)
print("Number of elements:", len(d1))
print(d1[7])
d1[6] = "Ankara"	# changes a value because key exists.
print(d1)
print(40 * "=")

d2 = {1: "Adana", 6: "Ankara", 7: "Antalya", 34: "Istanbul",
      35: "Izmir", 48: "Muğla"}
print(d2)
print(40 * "=")

dx = {"Adana": 1, "Ankara": 6, "Antalya": 7, "Istanbul": 34,
      "Izmir": 35, "Muğla": 48}
print(dx)
print(40 * "=")

d5 = {24: "days", "Pi": 3.14159, 7.2: 2345}
print(d5)
print(40 * "=")

print("Convert list to dictionary:")
lst1 = [[1, "Jane"], [4, "John"], [8, "Dora"]]
d6 = dict(lst1)		# {1: 'Jane', 4: 'John', 8: "Dora"}
print(d6)
print(40 * "=")

print("months1:")
months1 = {1:'Jan', 2:'Feb', 3:'Mar', 4:'Apr', 5:'May', 6:'Jun', 
           7:'Jul', 8:'Aug', 9:'Sep', 10:'Oct', 11:'Nov', 12:'Dec'}
print(months1)
print(months1[5])
print("Number of elements:", len(months1))
for m in months1:	# Get keys to variable m.
	print("%2d: %s" % (m, months1[m]))
print("Using D.items():")
for k, v in months1.items():
	print(k, ":", v)
print(40 * "=")

mk = list(months1.keys())
print("Keys:", mk)
mv = list(months1.values())
print("Values: ", mv)
print("Keys:")
for n in months1.keys():
	print(n)
print("Keys:")
for n in months1:
	print(n)
print("Values:")
for n in months1.values():
	print(n)

print(40 * "=")

print(months1)
months2 = {}
for k, d in months1.items():
	months2[d] = k
print(months2)
print(40 * "=")

print("Creating elements in a loop:")
squares = dict()	# squares = {}
for k in range(1, 11):		# 1 2 3 4 5 6 7 8 9 10
	squares[k] = k * k	# add new key+value pair.
print("squares:", squares)
print(40 * "=")

print("Dictionary with lists as values:")
months2 = {1:['Jan', 31], 2:['Feb', 28], 3:['Mar', 31], 4:['Apr', 30], 
	5:['May', 31], 6:['Jun', 30], 7:['Jul', 31], 8:['Aug', 31], 
	9:['Sep', 30], 10:['Oct', 31], 11:['Nov', 30], 12:['Dec', 31]}
print(months2)
print(months2[5])
print(months2[5][0], months2[5][1])

print(20 * "-")
for m in months2:
	print(m, months2[m])
print(20 * "-")
for m in months2:
	print(m, months2[m][0], months2[m][1])

print("Change an element:")
months2[2][1] = 29
print(months2)

print(40 * "=")
print("Creating random keys and values:")
rd = {}
for j in range(20):	# repeat this loop 10 times.
	k = random.randint(20, 40)
	v = random.randint(1, 100)
	rd[k] = v	# if k exists then updates value, otherwise adds new element.
print(rd)
print("Number of elements =", len(rd))
print("in operator in if:")
if 24 in rd:
	print("key 24 exists in dictionary rd.")
else:
	print("key 24 doesn't exist in dictionary rd.")

print("in operator in for:")
for k in rd:
	print("Key=", k, " Value=", rd[k])

for k, v in rd.items():
	print(k, ":", v)

print(40 * "=")

print("max function (max key):")
print(max(rd))
print("min function (min key):")
print(min(rd))
print("sum function (sum of keys):")
print(sum(rd))

print("max of values:")
print(max(rd.values()))
print("min of values:")
print(min(rd.values()))
print("sum of values:")
print(sum(rd.values()))

print("sorted function (sorted keys):")
print(sorted(rd))
print(40 * "=")

mm = {"Jan": 31, "Feb": 28, "Mar": 31, "Aug": 31, "Sep": 30, "Dec": 31}
print(max(mm), min(mm))
print(40 * "=")

print("sorted function:")
print(rd)
ks = sorted(rd)
print("Sorted keys:", ks)
print("Elements in increasing order of keys:")
for k in ks:
	print("Key=", k, " Value=", rd[k])
for k in sorted(rd):
	print(k, rd[k])
print(40 * "=")

print("Dictionary methods:")
print("-------------------")
print(rd)
print("D.keys():")
print(rd.keys())
for x in rd.keys():
	print(x)
lk = list(rd.keys())
print(lk)
print("D.values():")
print(rd.values())
for x in rd.values():
	print(x)

print(40 * "=")

# Write a function aveValues() that gets a dictionary as parameter,
# and returns the average of its values.
def aveValues(d):
	vsum = 0
	for v in d.values():
		vsum += v
	return vsum / len(d)

def aveValues2(d):
	return sum(d.values()) / len(d)

print("Average of values:")
averd = aveValues(rd)
print(averd)	# Average of the values
print(aveValues2(rd))
print(40 * "=")

print("D.get(key, value):")
for j in range(20, 41):
	print(j, rd.get(j, -1))
print(40 * "=")

d1 = {1:"Adana", 6:"Ankara", 7:"Antalya"}
d2 = {31:"Hatay", 34:"Istanbul", 35:"Izmir", 48:"Mexico"}
d1.update(d2)			# Concatenates d2 to end of d1
d1.update({48:"Mugla", 77:"Yalova"})
print(d1)
print(40 * "=")

dict1 = {1:10, 2:20}
dict2 = {3:30, 4:40, 5:50}
dict3 = {6:60}
dict4 = {}
for d in (dict1, dict2, dict3):
	dict4.update(d)
print(dict4)
print(40 * "=")

a = {"Ali": 1998, "Mehmet": 2001, "Eda": 2000, "Halil": 1954}
b = {"Ali": [1998, "05551234567"], 
     "Mehmet": [2001, "05557834567"], 
     "Eda": [2000, "05551243567"], 
     "Halil": [1954, "05558754210"] }
b["Jane"] = [1948, "05327878784"]
print(b["Eda"])
print(b["Eda"][0])

c = {"Ali": {2018: "Ankara", 2019: "Antalya"},
     "Halil": {1987: "Amsterdam", 1982: "Canada"} }

d = {True: 66, False: 90, 6: "34ffr", 7.43: 3252345, "Abcd": False}
print(d)

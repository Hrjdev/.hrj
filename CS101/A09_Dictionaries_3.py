# Dictionaries
print("DICTIONARIES - 3")
print("================")
print("Dictionary Exercises:")
print("---------------------")
print("Exercise-1:")
# Write a function that gets as parameter a dictionary with numeric/string keys,
# and prints the dictionary contents in increasing order of keys.
def printIncKey(d):
	ks = sorted(d)
	for k in ks:
		print(k, ":", d[k])

a = {30: 51, 37: 51, 29: 20, 35: 31, 24: 48, 33: 98, 25: 2, 20: 21, 27: 9}
printIncKey(a)
print(40 * "=")

print("Exercise-2:")
# Write a Python function sqrtDict() that gets two integers (n1, n2) as parameters, 
# creates and returns a dictionary with keys from n1 to n2 (both inclusive) 
# and the values are the square-roots of the keys.
def sqrtDict(n1, n2):
	d = {}	# create empty dictionary
	for n in range(n1, n2+1):
		d[n] = n ** 0.5
	return d	# return dictionary

a, b = 10, 20
dsqrt = sqrtDict(a, b)
print(dsqrt)

print(40 * "=")
print("Exercise-3:")
# Write a Python function that gets one integer (say n) as parameter, 
# creates and returns a dictionary of 10 elements with keys 
# starting from parameter and increasing by one, 
# and the values are a list containing square roots and squares of the keys.
def sqrtSqr(n):
	d = {}	# create empty dictionary
	for k in range(n, n + 10):
		d[k] = [k ** 0.5, k * k]
	return d	# return dictionary

a = 101
sqDict = sqrtSqr(a)
print(sqDict)

print(40 * "=")
print("Exercise-4:")
# Write a Python function that gets as parameter a dictionary 
# that contains students id's as keys and a list containing firstname, lastname, 
# quiz-1, quiz-2, midterm and final grades. The function will return a new dictionary 
# that has as keys the student ids, and values the overall grades computed using 
# the assessment grades, where the weights are 5%, 5%, 40% and 50% respectively.
# stud = {170201003 : ["Batuhan", "Bal", 37, 49, 72, 65], 
#	  170201008 : ["Simay", "Ekici", 98, 100, 69, 93], 
#	  170201039 : ["Harun", "Öz", 68, 95, 82, 100], 
#	  .... ....}
def computeOveralls(stud):
	overalls = {}		# Create empty dictionary.
	# Loop over dictionary:
	for k, v in stud.items():
		# Compute overall for a student and store in new dictionary
		total = v[2] * 0.05 + v[3] * 0.05 + v[4] * 0.40 + v[5] * 0.50
		overalls[k] = total
	return overalls		# Return new dictionary.

stud = {170201008 : ["Simay", "Ekici", 98, 100, 69, 93], 
	170202002 : ["Mehmet Enes", "Kurucu", 41, 35, 43, 44], 
	170202003 : ["İbrahim Samet", "Akalın", 76, 65, 51, 57], 
	170201002 : ["Utku", "Sağlam", 67, 50, 94, 81], 
	170201039 : ["Harun", "Öz", 68, 95, 82, 100], 
	170203001 : ["Beyza", "Ünveren", 34, 5, 44, 39], 
	170203002 : ["İrem", "Güvendiren", 64, 50, 62, 64], 
	150201024 : ["Nuriye", "Yıldırım", 82, 77, 90, 97], 
	170202001 : ["Cihat Can", "Rüzgar", 34, 55, 66, 54], 
	170201030 : ["Emir", "Boyacı", 96, 38, 93, 100], 
	170201003 : ["Batuhan", "Bal", 37, 49, 72, 65], 
	170201040 : ["Eray", "Erman", 57, 7, 39, 53]}
overalls = computeOveralls(stud)
print(overalls)

# Print ids, firstnames, lastnames and overall grades, sorted by id's:
ids = sorted(stud)	# list containing keys of dict.
for sid in ids:
	print("%d %-14s %-12s %.2f" % 
	      (sid, stud[sid][0], stud[sid][1], overalls[sid]))

print(40 * "=")
print("Exercise-4:")
# Write a Python function sumKeyValue() that gets as parameter a dictionary 
# that has numbers as keys and values, 
# returns a list containing the sum of keys and the sum of values.
def sumKeyValue(d):
	return [sum(d.keys()), sum(d.values())]

a = {34: 77, 30: 97, 22: 80, 35: 87, 31: 86, 26: 27, 24: 21, 38: 35, 23: 8}
skv = sumKeyValue(a)
print(skv)
print(40 * "=")

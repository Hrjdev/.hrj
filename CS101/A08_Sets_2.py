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
print("Equality of Sets:")
s1 = {2, 2.4, 1, "abc", 3}
s2 = {"abc", 2, 2.4, 3, 1}
s3 = {"abc", 2.4, 3, 1, 7}
print(s1)
print(s2)
print(s1 == s2)
print(s3)
print(s1 == s3)
print(40 * "=")

print("Set methods:")
print("------------")
set1 = {"apple", "banana", "cherry"}
print("set1:", set1)
set2 = {"banana", "apricot", "carrot"}
print("set2:", set2)
print(40 * "=")

print("add():")
set1.add("orange")
print("after set1.add('orange'):", set1)

stn = {2, 4, 8, 16}
print(stn)
stn.add(8)
print(stn)
print(40 * "=")

print("update():")
set1.update(set2)
print("after set1.update(set2):", set1)
print(40 * "=")

print("remove():")
x = set1.remove("carrot")
print("after set1.remove('carrot'):", x, set1)
print(40 * "=")

print("discard():")
x = set1.discard("apricot")
print("after set1.discard('apricot'):", x, set1)
print(40 * "=")

print("pop():")
x = set1.pop()
print("set1.pop():", x, set1)
print(40 * "=")

print("union() and intersection():")
set1 = {2, 3, 5, 7, 8, 11}
print("set1:", set1)
set2 = {4, 10}
print("set2:", set2)
set3 = {4, 6, 7, 8, 9}
print("set3:", set3)

print("union():")
set4 = set1.union(set2)
print("set1.union(set2):", set4)
set42 = set1.union(set2, set3)
print("set1.union(set2, set3):", set42)

print("intersection():")
set5 = set1.intersection(set2)
print("set1.intersection(set2):", set5)
set6 = set1.intersection(set2).intersection(set3)
print("set1.intersection(set2).intersection(set3):", set6)
set6 = set1.intersection(set2,set3)
print("set1.intersection(set2).intersection(set3):", set6)
print(40 * "=")

print("difference():")
s1 = {2, 3, 5, 7, 11}
s2 = {2, 4, 7}
s3 = s1.difference(s2)
print("s1:", s1)
print("s2:", s2)
print("s1.difference(s2):", s3)
s4 = {2, 5, 10, 15, 20}
print("s4:", s4)
print("s1.difference(s2, s4):", s1.difference(s2, s4))

print(40 * "=")
print("List, set:")
print(set1)
print("if ... in setx:")
list1 = [8, 55]
print(list1)
for x in list1:
	if x in set1:
		print(x, "is in", set1)
	else:
		print(x, "is not in", set1)

print(40 * "=")

print("max, min, sum functions with sets:")

s1 = {20, 10, 40, 30}
print("set:", s1)
print("max:", max(s1))
print("min:", min(s1))
print("sum:", sum(s1))

print(40 * "=")

print("max, min functions with sets of strings:")
set1 = {"apple", "Banana", "cherry"}
print("set:", set1)
print("max:", max(set1))
print("min:", min(set1))

print(40 * "=")


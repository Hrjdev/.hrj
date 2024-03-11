# Dictionaries
print("DICTIONARIES - 2")
print("================")
print("Dictionaries as counters:")
print("-------------------------")

votes = ["Jane", "Raquel", "Kemal", "Raquel", "Raquel", "Albert", "Jane", 
	 "Kemal", "Jane", "Kemal", "Albert", "Kemal", "Raquel", "Jane", "Kemal", 
         "Raquel", "Kemal", "Jane", "Kemal", "Raquel", "Jane", "Raquel", "Albert"]
print(votes)

# Dictionaries can be used as counters of occurences of values.
counts = {}		# Create an empty dictionary
for name in votes:
	if name in counts:		# if name exists as key in dict. counts,
		counts[name] += 1		# then increment that counter,
	else:				# if name doesn't exist as key in counts,
		counts[name] = 1		# then add new element to counts.
print(counts)		# print the dictionary
print(40 * "=")

print("Vote results:")
for name in counts:
	print("%-12s :%3d" % (name, counts[name]))	# print nicely
print(40 * "=")

# Above for loop (line 13-18) can be changed with the following:
cnt = {}		# Create an empty dictionary
for name in votes:
	cnt[name] = cnt.get(name, 0) + 1	# Add or update elements.
print(cnt)		# print the dictionary
print(40 * "=")

# Find and print the person with max votes:
vts = list(cnt.values())	# vts = list(cnt.values())
print(vts)
maxv = max(list(cnt.values()))		# maxv = max(cnt.values())
maxv2 = max(cnt.values())
print("Persons with max votes:")
for name in cnt:
	if cnt[name] == maxv2:
		print(name, maxv2)	# print(name, cnt[name])
print(40 * "=")

dd = {1:"AA", 7:"NN", 4:"KK", 2:"TT"}
print(dd)
a = dd.popitem()
print(a)
print(dd)
b = dd.pop(7)
print(b)
print(dd)


def printDict(d):
	for k, v in d.items():
		print(k, ":", v)

# Function that gets a dictionary as parameter,
# returns a new dictionary where duplicate values are removed.
def uniqueValues(d):
	# Create an empty dictionary 'result' to store unique student records.
	result = {}
	# Iterate through the key-value pairs in the 'student_data' dictionary using a for loop.
	for key, value in student_data.items():
		# Check if the current 'value' (student record) is not already in the 'result' dictionary.
		if value not in result.values():
			# If the 'value' is not already in 'result', add it to 'result' with its corresponding 'key'.
			result[key] = value
	# Return the 'result' dictionary containing unique student records.
	return result

# Create a nested dictionary 'student_data' containing information about students with unique IDs.
student_data = {
        'id1': ['Sara', 'CS101 MATH101 ENG101'],
	'id2': ['David', 'CS101 MATH101 ENG101'],
	'id3': ['Sara', 'CS101 MATH101 ENG101'],
        'id4': ['Jane', 'CS101 MATH101 PHYS101'] }
printDict(student_data)
print(20*"=")
uniqueStu = uniqueValues(student_data)
printDict(uniqueStu)
print(20*"=")


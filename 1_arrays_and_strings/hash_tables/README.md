#HashTable

# What is a HashTable ?
	- map key to values
	- also called dictionnary, associative array, hash maps
	- uses a hashfunction to map value to key
	-- the hashFunction
		hash = f(data);
		# where hash is the index where data should be stored in our hashtable
		## eg:
		if 5 = f("John") => table[5] = "John";
	- Collisition can Occur because different values can produce same hash (depending on your hash function)
	- To avoid that possible solutions are:
		# Separate Chaining
		# Open Addressing
# Description:
	- HashTable is a datastructure 

# Implementation.
	- Choose data structure to store the (key, value)
	Array of linked list of a bucket
	- Define a hashfunction to determine the position where the data hould be stored
	
	

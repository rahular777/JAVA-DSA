# Example 1: Create a list of squares of numbers from 1 to 5
squares = [x * x for x in range(1, 6)]
print(f"Squares of numbers from 1 to 5: {squares}")

# Example 2: Create a list of even numbers from 1 to 10
even_numbers = [x for x in range(1, 11) if x % 2 == 0]
print(f"Even numbers from 1 to 10: {even_numbers}")

# Example 3: Create a list of strings with "Hello" for each name
names = ["Alice", "Bob", "Charlie"]
greetings = [f"Hello, {name}!" for name in names]
print(f"Greeting messages: {greetings}")

# Example 4: Create a list of numbers that are divisible by both 2 and 3
divisible_by_2_and_3 = [x for x in range(1, 21) if x % 2 == 0 and x % 3 == 0]
print(f"Numbers divisible by both 2 and 3: {divisible_by_2_and_3}")

# Example 5: Create a list of the length of each word in a list
words = ["apple", "banana", "cherry"]
word_lengths = [len(word) for word in words]
print(f"Length of each word: {word_lengths}")

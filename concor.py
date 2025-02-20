def create_concordance(text):
    words = text.split()  # Split text into words
    concordance = {}

    for index, word in enumerate(words):
        word = word.lower().strip(".,!?")  # Normalize words (case-insensitive, remove punctuation)
        if word in concordance:
            concordance[word].append(index)  # Append index if word exists
        else:
            concordance[word] = [index]  # Create new entry

    return concordance

# Get input text from user
text = input("Enter a text: ")

# Generate and display concordance
concordance_result = create_concordance(text)

print("\nConcordance (Word : Positions):")
for word, positions in concordance_result.items():
    print(f"{word}: {positions}")

def find_longest_word(input_string):
    words = input_string.split()
    longest_word = ''
    max_length = o
   for word in words:
    cleaned_word = ''.join(char for char in word if char.isalpha())
    if len(cleaned_word)>max_length:
        longest_word = cleaned_word
        max_length = len(cleaned_word)
        return longest_word
    input string = "dummy text of printing and typesetting ind "
    result = find_longest_word(input_string)
    print(" Longest word:",result)
